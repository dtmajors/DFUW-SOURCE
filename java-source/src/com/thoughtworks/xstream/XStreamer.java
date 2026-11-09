/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.xml.XppDriver;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class XStreamer {
    public String toXML(XStream xstream, Object obj) throws ObjectStreamException {
        StringWriter writer = new StringWriter();
        try {
            this.toXML(xstream, obj, writer);
        }
        catch (ObjectStreamException e) {
            throw e;
        }
        catch (IOException e) {
            throw new ConversionException("Unexpeced IO error from a StringWriter", e);
        }
        return ((Object)writer).toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void toXML(XStream xstream, Object obj, Writer out) throws IOException {
        XStream outer = new XStream();
        ObjectOutputStream oos = outer.createObjectOutputStream(out);
        try {
            oos.writeObject(xstream);
            oos.flush();
            xstream.toXML(obj, out);
        }
        finally {
            oos.close();
        }
    }

    public Object fromXML(String xml) throws ClassNotFoundException, ObjectStreamException {
        try {
            return this.fromXML(new StringReader(xml));
        }
        catch (ObjectStreamException e) {
            throw e;
        }
        catch (IOException e) {
            throw new ConversionException("Unexpeced IO error from a StringReader", e);
        }
    }

    public Object fromXML(HierarchicalStreamDriver driver, String xml) throws ClassNotFoundException, ObjectStreamException {
        try {
            return this.fromXML(driver, new StringReader(xml));
        }
        catch (ObjectStreamException e) {
            throw e;
        }
        catch (IOException e) {
            throw new ConversionException("Unexpeced IO error from a StringReader", e);
        }
    }

    public Object fromXML(Reader xml) throws IOException, ClassNotFoundException {
        return this.fromXML((HierarchicalStreamDriver)new XppDriver(), xml);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object fromXML(HierarchicalStreamDriver driver, Reader xml) throws IOException, ClassNotFoundException {
        XStream outer = new XStream(driver);
        HierarchicalStreamReader reader = driver.createReader(xml);
        ObjectInputStream configIn = outer.createObjectInputStream(reader);
        try {
            Object object;
            XStream configured = (XStream)configIn.readObject();
            ObjectInputStream in = configured.createObjectInputStream(reader);
            try {
                object = in.readObject();
            }
            catch (Throwable throwable) {
                in.close();
                throw throwable;
            }
            in.close();
            return object;
        }
        finally {
            configIn.close();
        }
    }
}

