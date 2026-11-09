/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter;

public class TextAttributeConverter
extends AbstractAttributedCharacterIteratorAttributeConverter {
    static /* synthetic */ Class class$java$awt$font$TextAttribute;

    public TextAttributeConverter() {
        super(class$java$awt$font$TextAttribute == null ? (class$java$awt$font$TextAttribute = TextAttributeConverter.class$("java.awt.font.TextAttribute")) : class$java$awt$font$TextAttribute);
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }
}

