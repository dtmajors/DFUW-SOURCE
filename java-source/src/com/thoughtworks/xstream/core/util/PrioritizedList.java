/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.PrioritizedList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrioritizedList {
    private final Set set = new TreeSet();
    private int lowestPriority = Integer.MAX_VALUE;
    private int lastId = 0;

    public void add(Object item, int priority) {
        if (this.lowestPriority > priority) {
            this.lowestPriority = priority;
        }
        this.set.add(new PrioritizedItem(item, priority, ++this.lastId));
    }

    public Iterator iterator() {
        return new PrioritizedItemIterator(this.set.iterator());
    }
}

