/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObjectIdDictionary {
    private final Map map = new HashMap();
    private int invalidCounter;

    public void associateId(Object obj, Object id) {
        this.map.put(new WeakIdWrapper(this, obj), id);
        this.cleanup();
    }

    public Object lookupId(Object obj) {
        Object id = this.map.get(new IdWrapper(obj));
        this.cleanup();
        return id;
    }

    public boolean containsId(Object item) {
        boolean b2 = this.map.containsKey(new IdWrapper(item));
        this.cleanup();
        return b2;
    }

    public void removeId(Object item) {
        this.map.remove(new IdWrapper(item));
        this.cleanup();
    }

    public int size() {
        return this.map.size();
    }

    private void cleanup() {
        if (this.invalidCounter > 100) {
            Iterator iterator = this.map.keySet().iterator();
            while (iterator.hasNext()) {
                WeakIdWrapper key = (WeakIdWrapper)iterator.next();
                if (key.get() != null) continue;
                iterator.remove();
            }
            this.invalidCounter = 0;
        }
    }

    static /* synthetic */ int access$004(ObjectIdDictionary x0) {
        return ++x0.invalidCounter;
    }
}

