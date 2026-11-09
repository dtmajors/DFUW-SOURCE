/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractAttributedCharacterIteratorAttributeConverter
extends AbstractSingleValueConverter {
    private static final Method getName;
    private final Class type;
    private transient Map attributeMap;
    private transient FieldDictionary fieldDictionary;
    static /* synthetic */ Class class$java$text$AttributedCharacterIterator$Attribute;

    public AbstractAttributedCharacterIteratorAttributeConverter(Class type) {
        this.type = type;
        this.readResolve();
    }

    public boolean canConvert(Class type) {
        return type == this.type;
    }

    public String toString(Object source) {
        AttributedCharacterIterator.Attribute attribute = (AttributedCharacterIterator.Attribute)source;
        try {
            if (!getName.isAccessible()) {
                getName.setAccessible(true);
            }
            return (String)getName.invoke(attribute, null);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot get name of AttributedCharacterIterator.Attribute", e);
        }
        catch (InvocationTargetException e) {
            throw new ObjectAccessException("Cannot get name of AttributedCharacterIterator.Attribute", e.getTargetException());
        }
    }

    public Object fromString(String str) {
        return this.attributeMap.get(str);
    }

    private Object readResolve() {
        this.fieldDictionary = new FieldDictionary();
        this.attributeMap = new HashMap();
        Iterator iterator = this.fieldDictionary.serializableFieldsFor(this.type);
        while (iterator.hasNext()) {
            Field field = (Field)iterator.next();
            if (field.getType() != this.type || !Modifier.isStatic(field.getModifiers())) continue;
            try {
                Object attribute = field.get(null);
                this.attributeMap.put(this.toString(attribute), attribute);
            }
            catch (IllegalAccessException e) {
                throw new ObjectAccessException("Cannot get object of " + field, e);
            }
        }
        return this;
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    static {
        try {
            getName = (class$java$text$AttributedCharacterIterator$Attribute == null ? (class$java$text$AttributedCharacterIterator$Attribute = AbstractAttributedCharacterIteratorAttributeConverter.class$("java.text.AttributedCharacterIterator$Attribute")) : class$java$text$AttributedCharacterIterator$Attribute).getDeclaredMethod("getName", null);
        }
        catch (NoSuchMethodException e) {
            throw new InternalError("Missing AttributedCharacterIterator.Attribute.getName()");
        }
    }
}

