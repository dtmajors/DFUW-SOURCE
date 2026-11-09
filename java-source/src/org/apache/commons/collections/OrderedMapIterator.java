/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.OrderedIterator;

public interface OrderedMapIterator
extends MapIterator,
OrderedIterator {
    public boolean hasPrevious();

    public Object previous();
}

