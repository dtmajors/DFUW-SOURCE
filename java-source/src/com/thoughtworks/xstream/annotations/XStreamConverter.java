/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.annotations;

import com.thoughtworks.xstream.converters.Converter;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE, ElementType.FIELD})
@Documented
public @interface XStreamConverter {
    public Class<? extends Converter> value();
}

