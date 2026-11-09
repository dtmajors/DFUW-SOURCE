/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.persistence;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.persistence.FileStreamStrategy;
import com.thoughtworks.xstream.persistence.StreamStrategy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

public class FileStreamStrategy
implements StreamStrategy {
    private final FilenameFilter filter;
    private final XStream xstream;
    private final File baseDirectory;

    public FileStreamStrategy(File baseDirectory) {
        this(baseDirectory, new XStream());
    }

    public FileStreamStrategy(File baseDirectory, XStream xstream) {
        this.baseDirectory = baseDirectory;
        this.xstream = xstream;
        this.filter = new FilenameFilter(this){
            private final /* synthetic */ FileStreamStrategy this$0;
            {
                this.this$0 = fileStreamStrategy;
            }

            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && this.this$0.isValid(dir, name);
            }
        };
    }

    protected boolean isValid(File dir, String name) {
        return name.endsWith(".xml");
    }

    protected String extractKey(String name) {
        return this.unescape(name.substring(0, name.length() - 4));
    }

    protected String unescape(String name) {
        StringBuffer buffer = new StringBuffer();
        int currentValue = -1;
        char[] array = name.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            char c2 = array[i];
            if (c2 == '_' && currentValue != -1) {
                if (currentValue == 0) {
                    buffer.append('_');
                } else {
                    buffer.append((char)currentValue);
                }
                currentValue = -1;
                continue;
            }
            if (c2 == '_') {
                currentValue = 0;
                continue;
            }
            if (currentValue != -1) {
                currentValue = currentValue * 16 + Integer.parseInt(String.valueOf(c2), 16);
                continue;
            }
            buffer.append(c2);
        }
        return buffer.toString();
    }

    protected String getName(Object key) {
        return this.escape(key.toString()) + ".xml";
    }

    protected String escape(String key) {
        StringBuffer buffer = new StringBuffer();
        char[] array = key.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            char c2 = array[i];
            if (Character.isDigit(c2) || c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z') {
                buffer.append(c2);
                continue;
            }
            if (c2 == '_') {
                buffer.append("__");
                continue;
            }
            buffer.append("_" + Integer.toHexString(c2) + "_");
        }
        return buffer.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void writeFile(File file, Object value) {
        try {
            FileOutputStream os = new FileOutputStream(file);
            try {
                this.xstream.toXML(value, os);
            }
            finally {
                ((OutputStream)os).close();
            }
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    private File getFile(String filename) {
        return new File(this.baseDirectory, filename);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Object readFile(File file) {
        Object object;
        FileInputStream is = new FileInputStream(file);
        try {
            object = this.xstream.fromXML(is);
        }
        catch (Throwable throwable) {
            try {
                ((InputStream)is).close();
                throw throwable;
            }
            catch (FileNotFoundException e2) {
                return null;
            }
            catch (IOException e3) {
                throw new StreamException(e3);
            }
        }
        ((InputStream)is).close();
        return object;
    }

    public Object put(Object key, Object value) {
        Object oldValue = this.get(key);
        String filename = this.getName(key);
        this.writeFile(new File(this.baseDirectory, filename), value);
        return oldValue;
    }

    public Iterator iterator() {
        return new XmlMapEntriesIterator(this);
    }

    public int size() {
        return this.baseDirectory.list(this.filter).length;
    }

    public boolean containsKey(Object key) {
        File file = this.getFile(this.getName(key));
        return file.exists();
    }

    public Object get(Object key) {
        return this.readFile(this.getFile(this.getName(key)));
    }

    public Object remove(Object key) {
        File file = this.getFile(this.getName(key));
        Object value = null;
        if (file.exists()) {
            value = this.readFile(file);
            file.delete();
        }
        return value;
    }

    static /* synthetic */ FilenameFilter access$000(FileStreamStrategy x0) {
        return x0.filter;
    }

    static /* synthetic */ File access$100(FileStreamStrategy x0) {
        return x0.baseDirectory;
    }

    static /* synthetic */ Object access$600(FileStreamStrategy x0, File x1) {
        return x0.readFile(x1);
    }
}

