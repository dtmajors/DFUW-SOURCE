/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.map.AbstractInputCheckedMapDecorator;
import org.apache.commons.collections.map.AbstractMapDecorator;

abstract class AbstractInputCheckedMapDecorator
extends AbstractMapDecorator {
    protected AbstractInputCheckedMapDecorator() {
    }

    protected AbstractInputCheckedMapDecorator(Map map) {
        super(map);
    }

    protected abstract Object checkSetValue(Object var1);

    protected boolean isSetValueChecking() {
        return true;
    }

    public Set entrySet() {
        if (this.isSetValueChecking()) {
            return new EntrySet(this.map.entrySet(), this);
        }
        return this.map.entrySet();
    }
}

