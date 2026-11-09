/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Map;

public interface BoundedMap
extends Map {
    public boolean isFull();

    public int maxSize();
}

