/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.xmlpull.mxp1.MXParser
 */
package com.thoughtworks.xstream.io.xml.xppdom;

import com.thoughtworks.xstream.io.xml.xppdom.Xpp3Dom;
import java.io.Reader;
import java.util.ArrayList;
import org.xmlpull.mxp1.MXParser;

public class Xpp3DomBuilder {
    public static Xpp3Dom build(Reader reader) throws Exception {
        ArrayList<Xpp3Dom> elements = new ArrayList<Xpp3Dom>();
        ArrayList<StringBuffer> values = new ArrayList<StringBuffer>();
        Xpp3Dom node = null;
        MXParser parser = new MXParser();
        parser.setInput(reader);
        int eventType = parser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String rawName = parser.getName();
                Xpp3Dom child = new Xpp3Dom(rawName);
                int depth = elements.size();
                if (depth > 0) {
                    Xpp3Dom parent = (Xpp3Dom)elements.get(depth - 1);
                    parent.addChild(child);
                }
                elements.add(child);
                values.add(new StringBuffer());
                int attributesSize = parser.getAttributeCount();
                for (int i = 0; i < attributesSize; ++i) {
                    String name = parser.getAttributeName(i);
                    String value = parser.getAttributeValue(i);
                    child.setAttribute(name, value);
                }
            } else if (eventType == 4) {
                int depth = values.size() - 1;
                StringBuffer valueBuffer = (StringBuffer)values.get(depth);
                valueBuffer.append(parser.getText());
            } else if (eventType == 3) {
                int depth = elements.size() - 1;
                Xpp3Dom finalNode = (Xpp3Dom)elements.remove(depth);
                String accumulatedValue = values.remove(depth).toString();
                String finishedValue = 0 == accumulatedValue.length() ? null : accumulatedValue;
                finalNode.setValue(finishedValue);
                if (0 == depth) {
                    node = finalNode;
                }
            }
            eventType = parser.next();
        }
        reader.close();
        return node;
    }
}

