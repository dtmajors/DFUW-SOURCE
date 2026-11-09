/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.xmlpull.mxp1.MXParser
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.AbstractPullReader;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import org.xmlpull.mxp1.MXParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class XppReader
extends AbstractPullReader {
    private final XmlPullParser parser;
    private final BufferedReader reader;

    public XppReader(Reader reader) {
        this(reader, new XmlFriendlyReplacer());
    }

    public XppReader(Reader reader, XmlFriendlyReplacer replacer) {
        super(replacer);
        try {
            this.parser = this.createParser();
            this.reader = new BufferedReader(reader);
            this.parser.setInput((Reader)this.reader);
            this.moveDown();
        }
        catch (XmlPullParserException e2) {
            throw new StreamException(e2);
        }
    }

    protected XmlPullParser createParser() {
        return new MXParser();
    }

    protected int pullNextEvent() {
        try {
            switch (this.parser.next()) {
                case 0: 
                case 2: {
                    return 1;
                }
                case 1: 
                case 3: {
                    return 2;
                }
                case 4: {
                    return 3;
                }
                case 9: {
                    return 4;
                }
            }
            return 0;
        }
        catch (XmlPullParserException e2) {
            throw new StreamException(e2);
        }
        catch (IOException e3) {
            throw new StreamException(e3);
        }
    }

    protected String pullElementName() {
        return this.parser.getName();
    }

    protected String pullText() {
        return this.parser.getText();
    }

    public String getAttribute(String name) {
        return this.parser.getAttributeValue(null, name);
    }

    public String getAttribute(int index) {
        return this.parser.getAttributeValue(index);
    }

    public int getAttributeCount() {
        return this.parser.getAttributeCount();
    }

    public String getAttributeName(int index) {
        return this.unescapeXmlName(this.parser.getAttributeName(index));
    }

    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("line number", String.valueOf(this.parser.getLineNumber()));
    }

    public void close() {
        try {
            this.reader.close();
        }
        catch (IOException e2) {
            throw new StreamException(e2);
        }
    }
}

