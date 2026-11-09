/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.OrderedMap;

public interface OrderedBidiMap
extends BidiMap,
OrderedMap {
    public BidiMap inverseBidiMap();

    public OrderedBidiMap inverseOrderedBidiMap();
}

