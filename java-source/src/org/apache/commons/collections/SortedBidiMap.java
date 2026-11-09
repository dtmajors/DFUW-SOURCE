/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.util.SortedMap;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.OrderedBidiMap;

public interface SortedBidiMap
extends OrderedBidiMap,
SortedMap {
    public BidiMap inverseBidiMap();

    public SortedBidiMap inverseSortedBidiMap();
}

