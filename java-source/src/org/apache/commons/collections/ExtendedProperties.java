/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;
import org.apache.commons.collections.ExtendedProperties;

public class ExtendedProperties
extends Hashtable {
    private ExtendedProperties defaults;
    protected String file;
    protected String basePath;
    protected String fileSeparator = System.getProperty("file.separator");
    protected boolean isInitialized = false;
    protected static String include = "include";
    protected ArrayList keysAsListed = new ArrayList();
    protected static final String START_TOKEN = "${";
    protected static final String END_TOKEN = "}";

    protected String interpolate(String base) {
        return this.interpolateHelper(base, null);
    }

    protected String interpolateHelper(String base, List priorVariables) {
        if (base == null) {
            return null;
        }
        if (priorVariables == null) {
            priorVariables = new ArrayList<String>();
            priorVariables.add(base);
        }
        int begin = -1;
        int end = -1;
        int prec = 0 - END_TOKEN.length();
        String variable = null;
        StringBuffer result = new StringBuffer();
        while ((begin = base.indexOf(START_TOKEN, prec + END_TOKEN.length())) > -1 && (end = base.indexOf(END_TOKEN, begin)) > -1) {
            result.append(base.substring(prec + END_TOKEN.length(), begin));
            variable = base.substring(begin + START_TOKEN.length(), end);
            if (priorVariables.contains(variable)) {
                String initialBase = priorVariables.remove(0).toString();
                priorVariables.add(variable);
                StringBuffer priorVariableSb = new StringBuffer();
                Iterator it = priorVariables.iterator();
                while (it.hasNext()) {
                    priorVariableSb.append(it.next());
                    if (!it.hasNext()) continue;
                    priorVariableSb.append("->");
                }
                throw new IllegalStateException("infinite loop in property interpolation of " + initialBase + ": " + priorVariableSb.toString());
            }
            priorVariables.add(variable);
            Object value = this.getProperty(variable);
            if (value != null) {
                result.append(this.interpolateHelper(value.toString(), priorVariables));
                priorVariables.remove(priorVariables.size() - 1);
            } else if (this.defaults != null && this.defaults.getString(variable, null) != null) {
                result.append(this.defaults.getString(variable));
            } else {
                result.append(START_TOKEN).append(variable).append(END_TOKEN);
            }
            prec = end;
        }
        result.append(base.substring(prec + END_TOKEN.length(), base.length()));
        return result.toString();
    }

    private static String escape(String s2) {
        StringBuffer buf = new StringBuffer(s2);
        int i = 0;
        while (i < buf.length()) {
            char c2 = buf.charAt(i);
            if (c2 == ',' || c2 == '\\') {
                buf.insert(i, '\\');
                ++i;
            }
            ++i;
        }
        return buf.toString();
    }

    private static String unescape(String s2) {
        StringBuffer buf = new StringBuffer(s2);
        int i = 0;
        while (i < buf.length() - 1) {
            char c1 = buf.charAt(i);
            char c2 = buf.charAt(i + 1);
            if (c1 == '\\' && c2 == '\\') {
                buf.deleteCharAt(i);
            }
            ++i;
        }
        return buf.toString();
    }

    private static int countPreceding(String line, int index, char ch) {
        int i = index - 1;
        while (i >= 0) {
            if (line.charAt(i) != ch) break;
            --i;
        }
        return index - 1 - i;
    }

    private static boolean endsWithSlash(String line) {
        if (!line.endsWith("\\")) {
            return false;
        }
        return ExtendedProperties.countPreceding(line, line.length() - 1, '\\') % 2 == 0;
    }

    public ExtendedProperties() {
    }

    public ExtendedProperties(String file) throws IOException {
        this(file, null);
    }

    public ExtendedProperties(String file, String defaultFile) throws IOException {
        this.file = file;
        this.basePath = new File(file).getAbsolutePath();
        this.basePath = this.basePath.substring(0, this.basePath.lastIndexOf(this.fileSeparator) + 1);
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            this.load(in);
            Object var5_4 = null;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            try {
                if (in != null) {
                    in.close();
                }
            }
            catch (IOException ex) {
                // empty catch block
            }
            throw throwable;
        }
        try {
            if (in != null) {
                in.close();
            }
        }
        catch (IOException ex) {}
        if (defaultFile != null) {
            this.defaults = new ExtendedProperties(defaultFile);
        }
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String inc) {
        include = inc;
    }

    public void load(InputStream input) throws IOException {
        this.load(input, null);
    }

    public synchronized void load(InputStream input, String enc) throws IOException {
        PropertiesReader reader = null;
        if (enc != null) {
            try {
                reader = new PropertiesReader(new InputStreamReader(input, enc));
            }
            catch (UnsupportedEncodingException ex) {
                // empty catch block
            }
        }
        if (reader == null) {
            try {
                reader = new PropertiesReader(new InputStreamReader(input, "8859_1"));
            }
            catch (UnsupportedEncodingException ex) {
                reader = new PropertiesReader(new InputStreamReader(input));
            }
        }
        try {
            try {
                while (true) {
                    String line;
                    int equalSign;
                    if ((equalSign = (line = reader.readProperty()).indexOf(61)) <= 0) {
                        continue;
                    }
                    String key = line.substring(0, equalSign).trim();
                    String value = line.substring(equalSign + 1).trim();
                    if ("".equals(value)) continue;
                    if (this.getInclude() != null && key.equalsIgnoreCase(this.getInclude())) {
                        File file = null;
                        if (value.startsWith(this.fileSeparator)) {
                            file = new File(value);
                        } else {
                            if (value.startsWith("." + this.fileSeparator)) {
                                value = value.substring(2);
                            }
                            file = new File(this.basePath + value);
                        }
                        if (file == null || !file.exists() || !file.canRead()) continue;
                        this.load(new FileInputStream(file));
                        continue;
                    }
                    this.addProperty(key, value);
                }
            }
            catch (NullPointerException ex) {
                Object var10_12 = null;
                this.isInitialized = true;
                return;
            }
        }
        catch (Throwable throwable) {
            Object var10_13 = null;
            this.isInitialized = true;
            throw throwable;
        }
    }

    public Object getProperty(String key) {
        Object obj = this.get(key);
        if (obj == null && this.defaults != null) {
            obj = this.defaults.get(key);
        }
        return obj;
    }

    public void addProperty(String key, Object value) {
        if (value instanceof String) {
            String str = (String)value;
            if (str.indexOf(",") > 0) {
                PropertiesTokenizer tokenizer = new PropertiesTokenizer(str);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    this.addPropertyInternal(key, ExtendedProperties.unescape(token));
                }
            } else {
                this.addPropertyInternal(key, ExtendedProperties.unescape(str));
            }
        } else {
            this.addPropertyInternal(key, value);
        }
        this.isInitialized = true;
    }

    private void addPropertyDirect(String key, Object value) {
        if (!this.containsKey(key)) {
            this.keysAsListed.add(key);
        }
        this.put(key, value);
    }

    private void addPropertyInternal(String key, Object value) {
        Object current = this.get(key);
        if (current instanceof String) {
            Vector<Object> v = new Vector<Object>(2);
            v.addElement(current);
            v.addElement(value);
            this.put(key, v);
        } else if (current instanceof Vector) {
            ((Vector)current).addElement(value);
        } else {
            if (!this.containsKey(key)) {
                this.keysAsListed.add(key);
            }
            this.put(key, value);
        }
    }

    public void setProperty(String key, Object value) {
        this.clearProperty(key);
        this.addProperty(key, value);
    }

    public synchronized void save(OutputStream output, String header) throws IOException {
        if (output == null) {
            return;
        }
        PrintWriter theWrtr = new PrintWriter(output);
        if (header != null) {
            theWrtr.println(header);
        }
        Enumeration theKeys = this.keys();
        while (theKeys.hasMoreElements()) {
            String key = (String)theKeys.nextElement();
            Object value = this.get(key);
            if (value != null) {
                if (value instanceof String) {
                    StringBuffer currentOutput = new StringBuffer();
                    currentOutput.append(key);
                    currentOutput.append("=");
                    currentOutput.append(ExtendedProperties.escape((String)value));
                    theWrtr.println(currentOutput.toString());
                } else if (value instanceof Vector) {
                    Vector values = (Vector)value;
                    Enumeration valuesEnum = values.elements();
                    while (valuesEnum.hasMoreElements()) {
                        String currentElement = (String)valuesEnum.nextElement();
                        StringBuffer currentOutput = new StringBuffer();
                        currentOutput.append(key);
                        currentOutput.append("=");
                        currentOutput.append(ExtendedProperties.escape(currentElement));
                        theWrtr.println(currentOutput.toString());
                    }
                }
            }
            theWrtr.println();
            theWrtr.flush();
        }
    }

    public void combine(ExtendedProperties props) {
        Iterator it = props.getKeys();
        while (it.hasNext()) {
            String key = (String)it.next();
            this.setProperty(key, props.get(key));
        }
    }

    public void clearProperty(String key) {
        if (this.containsKey(key)) {
            int i = 0;
            while (i < this.keysAsListed.size()) {
                if (this.keysAsListed.get(i).equals(key)) {
                    this.keysAsListed.remove(i);
                    break;
                }
                ++i;
            }
            this.remove(key);
        }
    }

    public Iterator getKeys() {
        return ((AbstractList)this.keysAsListed).iterator();
    }

    public Iterator getKeys(String prefix) {
        Iterator keys = this.getKeys();
        ArrayList matchingKeys = new ArrayList();
        while (keys.hasNext()) {
            Object key = keys.next();
            if (!(key instanceof String) || !((String)key).startsWith(prefix)) continue;
            matchingKeys.add(key);
        }
        return ((AbstractList)matchingKeys).iterator();
    }

    public ExtendedProperties subset(String prefix) {
        ExtendedProperties c2 = new ExtendedProperties();
        Iterator keys = this.getKeys();
        boolean validSubset = false;
        while (keys.hasNext()) {
            Object key = keys.next();
            if (!(key instanceof String) || !((String)key).startsWith(prefix)) continue;
            if (!validSubset) {
                validSubset = true;
            }
            String newKey = null;
            newKey = ((String)key).length() == prefix.length() ? prefix : ((String)key).substring(prefix.length() + 1);
            c2.addPropertyDirect(newKey, this.get(key));
        }
        if (validSubset) {
            return c2;
        }
        return null;
    }

    public void display() {
        Iterator i = this.getKeys();
        while (i.hasNext()) {
            String key = (String)i.next();
            Object value = this.get(key);
            System.out.println(key + " => " + value);
        }
    }

    public String getString(String key) {
        return this.getString(key, null);
    }

    public String getString(String key, String defaultValue) {
        Object value = this.get(key);
        if (value instanceof String) {
            return this.interpolate((String)value);
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.interpolate(this.defaults.getString(key, defaultValue));
            }
            return this.interpolate(defaultValue);
        }
        if (value instanceof Vector) {
            return this.interpolate((String)((Vector)value).get(0));
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a String object");
    }

    public Properties getProperties(String key) {
        return this.getProperties(key, new Properties());
    }

    public Properties getProperties(String key, Properties defaults) {
        String[] tokens = this.getStringArray(key);
        Properties props = new Properties(defaults);
        int i = 0;
        while (i < tokens.length) {
            String token = tokens[i];
            int equalSign = token.indexOf(61);
            if (equalSign <= 0) {
                throw new IllegalArgumentException('\'' + token + "' does not contain " + "an equals sign");
            }
            String pkey = token.substring(0, equalSign).trim();
            String pvalue = token.substring(equalSign + 1).trim();
            ((Hashtable)props).put(pkey, pvalue);
            ++i;
        }
        return props;
    }

    public String[] getStringArray(String key) {
        Vector vector;
        Object value = this.get(key);
        if (value instanceof String) {
            vector = new Vector(1);
            vector.addElement(value);
        } else if (value instanceof Vector) {
            vector = (Vector)value;
        } else {
            if (value == null) {
                if (this.defaults != null) {
                    return this.defaults.getStringArray(key);
                }
                return new String[0];
            }
            throw new ClassCastException('\'' + key + "' doesn't map to a String/Vector object");
        }
        String[] tokens = new String[vector.size()];
        int i = 0;
        while (i < tokens.length) {
            tokens[i] = (String)vector.elementAt(i);
            ++i;
        }
        return tokens;
    }

    public Vector getVector(String key) {
        return this.getVector(key, null);
    }

    public Vector getVector(String key, Vector defaultValue) {
        Object value = this.get(key);
        if (value instanceof Vector) {
            return (Vector)value;
        }
        if (value instanceof String) {
            Vector v = new Vector(1);
            v.addElement(value);
            this.put(key, v);
            return v;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getVector(key, defaultValue);
            }
            return defaultValue == null ? new Vector() : defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Vector object");
    }

    public boolean getBoolean(String key) {
        Boolean b2 = this.getBoolean(key, null);
        if (b2 != null) {
            return b2;
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return this.getBoolean(key, new Boolean(defaultValue));
    }

    public Boolean getBoolean(String key, Boolean defaultValue) {
        Object value = this.get(key);
        if (value instanceof Boolean) {
            return (Boolean)value;
        }
        if (value instanceof String) {
            String s2 = this.testBoolean((String)value);
            Boolean b2 = new Boolean(s2);
            this.put(key, b2);
            return b2;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getBoolean(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Boolean object");
    }

    public String testBoolean(String value) {
        String s2 = value.toLowerCase();
        if (s2.equals("true") || s2.equals("on") || s2.equals("yes")) {
            return "true";
        }
        if (s2.equals("false") || s2.equals("off") || s2.equals("no")) {
            return "false";
        }
        return null;
    }

    public byte getByte(String key) {
        Byte b2 = this.getByte(key, null);
        if (b2 != null) {
            return b2;
        }
        throw new NoSuchElementException('\'' + key + " doesn't map to an existing object");
    }

    public byte getByte(String key, byte defaultValue) {
        return this.getByte(key, new Byte(defaultValue));
    }

    public Byte getByte(String key, Byte defaultValue) {
        Object value = this.get(key);
        if (value instanceof Byte) {
            return (Byte)value;
        }
        if (value instanceof String) {
            Byte b2 = new Byte((String)value);
            this.put(key, b2);
            return b2;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getByte(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Byte object");
    }

    public short getShort(String key) {
        Short s2 = this.getShort(key, null);
        if (s2 != null) {
            return s2;
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public short getShort(String key, short defaultValue) {
        return this.getShort(key, new Short(defaultValue));
    }

    public Short getShort(String key, Short defaultValue) {
        Object value = this.get(key);
        if (value instanceof Short) {
            return (Short)value;
        }
        if (value instanceof String) {
            Short s2 = new Short((String)value);
            this.put(key, s2);
            return s2;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getShort(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Short object");
    }

    public int getInt(String name) {
        return this.getInteger(name);
    }

    public int getInt(String name, int def) {
        return this.getInteger(name, def);
    }

    public int getInteger(String key) {
        Integer i = this.getInteger(key, null);
        if (i != null) {
            return i;
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public int getInteger(String key, int defaultValue) {
        Integer i = this.getInteger(key, null);
        if (i == null) {
            return defaultValue;
        }
        return i;
    }

    public Integer getInteger(String key, Integer defaultValue) {
        Object value = this.get(key);
        if (value instanceof Integer) {
            return (Integer)value;
        }
        if (value instanceof String) {
            Integer i = new Integer((String)value);
            this.put(key, i);
            return i;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getInteger(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Integer object");
    }

    public long getLong(String key) {
        Long l = this.getLong(key, null);
        if (l != null) {
            return l;
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public long getLong(String key, long defaultValue) {
        return this.getLong(key, new Long(defaultValue));
    }

    public Long getLong(String key, Long defaultValue) {
        Object value = this.get(key);
        if (value instanceof Long) {
            return (Long)value;
        }
        if (value instanceof String) {
            Long l = new Long((String)value);
            this.put(key, l);
            return l;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getLong(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Long object");
    }

    public float getFloat(String key) {
        Float f = this.getFloat(key, null);
        if (f != null) {
            return f.floatValue();
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public float getFloat(String key, float defaultValue) {
        return this.getFloat(key, new Float(defaultValue)).floatValue();
    }

    public Float getFloat(String key, Float defaultValue) {
        Object value = this.get(key);
        if (value instanceof Float) {
            return (Float)value;
        }
        if (value instanceof String) {
            Float f = new Float((String)value);
            this.put(key, f);
            return f;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getFloat(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Float object");
    }

    public double getDouble(String key) {
        Double d2 = this.getDouble(key, null);
        if (d2 != null) {
            return d2;
        }
        throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
    }

    public double getDouble(String key, double defaultValue) {
        return this.getDouble(key, new Double(defaultValue));
    }

    public Double getDouble(String key, Double defaultValue) {
        Object value = this.get(key);
        if (value instanceof Double) {
            return (Double)value;
        }
        if (value instanceof String) {
            Double d2 = new Double((String)value);
            this.put(key, d2);
            return d2;
        }
        if (value == null) {
            if (this.defaults != null) {
                return this.defaults.getDouble(key, defaultValue);
            }
            return defaultValue;
        }
        throw new ClassCastException('\'' + key + "' doesn't map to a Double object");
    }

    public static ExtendedProperties convertProperties(Properties props) {
        ExtendedProperties c2 = new ExtendedProperties();
        Enumeration e2 = ((Hashtable)props).keys();
        while (e2.hasMoreElements()) {
            String s2 = (String)e2.nextElement();
            c2.setProperty(s2, props.getProperty(s2));
        }
        return c2;
    }

    static /* synthetic */ boolean access$000(String x0) {
        return ExtendedProperties.endsWithSlash(x0);
    }
}

