/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.Collection;

public interface BoundedCollection
extends Collection {
    public boolean isFull();

    public int maxSize();
}

