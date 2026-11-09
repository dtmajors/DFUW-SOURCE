/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;
import org.apache.commons.collections.map.AbstractHashedMap;
import org.apache.commons.collections.map.Flat3Map;
import org.apache.commons.collections.map.HashedMap;

public class Flat3Map
implements IterableMap,
Serializable,
Cloneable {
    private static final long serialVersionUID = -6701087419741928296L;
    private transient int size;
    private transient int hash1;
    private transient int hash2;
    private transient int hash3;
    private transient Object key1;
    private transient Object key2;
    private transient Object key3;
    private transient Object value1;
    private transient Object value2;
    private transient Object value3;
    private transient AbstractHashedMap delegateMap;

    public Flat3Map() {
    }

    public Flat3Map(Map map) {
        this.putAll(map);
    }

    public Object get(Object key) {
        if (this.delegateMap != null) {
            return this.delegateMap.get(key);
        }
        if (key == null) {
            switch (this.size) {
                case 3: {
                    if (this.key3 == null) {
                        return this.value3;
                    }
                }
                case 2: {
                    if (this.key2 == null) {
                        return this.value2;
                    }
                }
                case 1: {
                    if (this.key1 != null) break;
                    return this.value1;
                }
            }
        } else if (this.size > 0) {
            int hashCode = key.hashCode();
            switch (this.size) {
                case 3: {
                    if (this.hash3 == hashCode && key.equals(this.key3)) {
                        return this.value3;
                    }
                }
                case 2: {
                    if (this.hash2 == hashCode && key.equals(this.key2)) {
                        return this.value2;
                    }
                }
                case 1: {
                    if (this.hash1 != hashCode || !key.equals(this.key1)) break;
                    return this.value1;
                }
            }
        }
        return null;
    }

    public int size() {
        if (this.delegateMap != null) {
            return this.delegateMap.size();
        }
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean containsKey(Object key) {
        if (this.delegateMap != null) {
            return this.delegateMap.containsKey(key);
        }
        if (key == null) {
            switch (this.size) {
                case 3: {
                    if (this.key3 == null) {
                        return true;
                    }
                }
                case 2: {
                    if (this.key2 == null) {
                        return true;
                    }
                }
                case 1: {
                    if (this.key1 != null) break;
                    return true;
                }
            }
        } else if (this.size > 0) {
            int hashCode = key.hashCode();
            switch (this.size) {
                case 3: {
                    if (this.hash3 == hashCode && key.equals(this.key3)) {
                        return true;
                    }
                }
                case 2: {
                    if (this.hash2 == hashCode && key.equals(this.key2)) {
                        return true;
                    }
                }
                case 1: {
                    if (this.hash1 != hashCode || !key.equals(this.key1)) break;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsValue(Object value) {
        if (this.delegateMap != null) {
            return this.delegateMap.containsValue(value);
        }
        if (value == null) {
            switch (this.size) {
                case 3: {
                    if (this.value3 == null) {
                        return true;
                    }
                }
                case 2: {
                    if (this.value2 == null) {
                        return true;
                    }
                }
                case 1: {
                    if (this.value1 != null) break;
                    return true;
                }
            }
        } else {
            switch (this.size) {
                case 3: {
                    if (value.equals(this.value3)) {
                        return true;
                    }
                }
                case 2: {
                    if (value.equals(this.value2)) {
                        return true;
                    }
                }
                case 1: {
                    if (!value.equals(this.value1)) break;
                    return true;
                }
            }
        }
        return false;
    }

    public Object put(Object key, Object value) {
        if (this.delegateMap != null) {
            return this.delegateMap.put(key, value);
        }
        if (key == null) {
            switch (this.size) {
                case 3: {
                    if (this.key3 == null) {
                        Object old = this.value3;
                        this.value3 = value;
                        return old;
                    }
                }
                case 2: {
                    if (this.key2 == null) {
                        Object old = this.value2;
                        this.value2 = value;
                        return old;
                    }
                }
                case 1: {
                    if (this.key1 != null) break;
                    Object old = this.value1;
                    this.value1 = value;
                    return old;
                }
            }
        } else if (this.size > 0) {
            int hashCode = key.hashCode();
            switch (this.size) {
                case 3: {
                    if (this.hash3 == hashCode && key.equals(this.key3)) {
                        Object old = this.value3;
                        this.value3 = value;
                        return old;
                    }
                }
                case 2: {
                    if (this.hash2 == hashCode && key.equals(this.key2)) {
                        Object old = this.value2;
                        this.value2 = value;
                        return old;
                    }
                }
                case 1: {
                    if (this.hash1 != hashCode || !key.equals(this.key1)) break;
                    Object old = this.value1;
                    this.value1 = value;
                    return old;
                }
            }
        }
        switch (this.size) {
            default: {
                this.convertToMap();
                this.delegateMap.put(key, value);
                return null;
            }
            case 2: {
                this.hash3 = key == null ? 0 : key.hashCode();
                this.key3 = key;
                this.value3 = value;
                break;
            }
            case 1: {
                this.hash2 = key == null ? 0 : key.hashCode();
                this.key2 = key;
                this.value2 = value;
                break;
            }
            case 0: {
                this.hash1 = key == null ? 0 : key.hashCode();
                this.key1 = key;
                this.value1 = value;
            }
        }
        ++this.size;
        return null;
    }

    public void putAll(Map map) {
        int size = map.size();
        if (size == 0) {
            return;
        }
        if (this.delegateMap != null) {
            this.delegateMap.putAll(map);
            return;
        }
        if (size < 4) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = it.next();
                this.put(entry.getKey(), entry.getValue());
            }
        } else {
            this.convertToMap();
            this.delegateMap.putAll(map);
        }
    }

    private void convertToMap() {
        this.delegateMap = this.createDelegateMap();
        switch (this.size) {
            case 3: {
                this.delegateMap.put(this.key3, this.value3);
            }
            case 2: {
                this.delegateMap.put(this.key2, this.value2);
            }
            case 1: {
                this.delegateMap.put(this.key1, this.value1);
            }
        }
        this.size = 0;
        this.hash3 = 0;
        this.hash2 = 0;
        this.hash1 = 0;
        this.key3 = null;
        this.key2 = null;
        this.key1 = null;
        this.value3 = null;
        this.value2 = null;
        this.value1 = null;
    }

    protected AbstractHashedMap createDelegateMap() {
        return new HashedMap();
    }

    public Object remove(Object key) {
        if (this.delegateMap != null) {
            return this.delegateMap.remove(key);
        }
        if (this.size == 0) {
            return null;
        }
        if (key == null) {
            switch (this.size) {
                case 3: {
                    if (this.key3 == null) {
                        Object old = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    if (this.key2 == null) {
                        Object old = this.value3;
                        this.hash2 = this.hash3;
                        this.key2 = this.key3;
                        this.value2 = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    if (this.key1 == null) {
                        Object old = this.value3;
                        this.hash1 = this.hash3;
                        this.key1 = this.key3;
                        this.value1 = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    return null;
                }
                case 2: {
                    if (this.key2 == null) {
                        Object old = this.value2;
                        this.hash2 = 0;
                        this.key2 = null;
                        this.value2 = null;
                        this.size = 1;
                        return old;
                    }
                    if (this.key1 == null) {
                        Object old = this.value2;
                        this.hash1 = this.hash2;
                        this.key1 = this.key2;
                        this.value1 = this.value2;
                        this.hash2 = 0;
                        this.key2 = null;
                        this.value2 = null;
                        this.size = 1;
                        return old;
                    }
                    return null;
                }
                case 1: {
                    if (this.key1 != null) break;
                    Object old = this.value1;
                    this.hash1 = 0;
                    this.key1 = null;
                    this.value1 = null;
                    this.size = 0;
                    return old;
                }
            }
        } else if (this.size > 0) {
            int hashCode = key.hashCode();
            switch (this.size) {
                case 3: {
                    if (this.hash3 == hashCode && key.equals(this.key3)) {
                        Object old = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    if (this.hash2 == hashCode && key.equals(this.key2)) {
                        Object old = this.value3;
                        this.hash2 = this.hash3;
                        this.key2 = this.key3;
                        this.value2 = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    if (this.hash1 == hashCode && key.equals(this.key1)) {
                        Object old = this.value3;
                        this.hash1 = this.hash3;
                        this.key1 = this.key3;
                        this.value1 = this.value3;
                        this.hash3 = 0;
                        this.key3 = null;
                        this.value3 = null;
                        this.size = 2;
                        return old;
                    }
                    return null;
                }
                case 2: {
                    if (this.hash2 == hashCode && key.equals(this.key2)) {
                        Object old = this.value2;
                        this.hash2 = 0;
                        this.key2 = null;
                        this.value2 = null;
                        this.size = 1;
                        return old;
                    }
                    if (this.hash1 == hashCode && key.equals(this.key1)) {
                        Object old = this.value2;
                        this.hash1 = this.hash2;
                        this.key1 = this.key2;
                        this.value1 = this.value2;
                        this.hash2 = 0;
                        this.key2 = null;
                        this.value2 = null;
                        this.size = 1;
                        return old;
                    }
                    return null;
                }
                case 1: {
                    if (this.hash1 != hashCode || !key.equals(this.key1)) break;
                    Object old = this.value1;
                    this.hash1 = 0;
                    this.key1 = null;
                    this.value1 = null;
                    this.size = 0;
                    return old;
                }
            }
        }
        return null;
    }

    public void clear() {
        if (this.delegateMap != null) {
            this.delegateMap.clear();
            this.delegateMap = null;
        } else {
            this.size = 0;
            this.hash3 = 0;
            this.hash2 = 0;
            this.hash1 = 0;
            this.key3 = null;
            this.key2 = null;
            this.key1 = null;
            this.value3 = null;
            this.value2 = null;
            this.value1 = null;
        }
    }

    public MapIterator mapIterator() {
        if (this.delegateMap != null) {
            return this.delegateMap.mapIterator();
        }
        if (this.size == 0) {
            return EmptyMapIterator.INSTANCE;
        }
        return new FlatMapIterator(this);
    }

    public Set entrySet() {
        if (this.delegateMap != null) {
            return this.delegateMap.entrySet();
        }
        return new EntrySet(this);
    }

    public Set keySet() {
        if (this.delegateMap != null) {
            return this.delegateMap.keySet();
        }
        return new KeySet(this);
    }

    public Collection values() {
        if (this.delegateMap != null) {
            return this.delegateMap.values();
        }
        return new Values(this);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(this.size());
        MapIterator it = this.mapIterator();
        while (it.hasNext()) {
            out.writeObject(it.next());
            out.writeObject(it.getValue());
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        int count = in.readInt();
        if (count > 3) {
            this.delegateMap = this.createDelegateMap();
        }
        int i = count;
        while (i > 0) {
            this.put(in.readObject(), in.readObject());
            --i;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Object clone() {
        try {
            void ex;
            Flat3Map cloned = (Flat3Map)super.clone();
            if (cloned.delegateMap != null) {
                cloned.delegateMap = (HashedMap)cloned.delegateMap.clone();
            }
            return ex;
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (this.delegateMap != null) {
            return this.delegateMap.equals(obj);
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map other = (Map)obj;
        if (this.size != other.size()) {
            return false;
        }
        if (this.size > 0) {
            Object otherValue = null;
            switch (this.size) {
                case 3: {
                    if (!other.containsKey(this.key3)) {
                        otherValue = other.get(this.key3);
                        boolean bl = this.value3 == null ? otherValue != null : !this.value3.equals(otherValue);
                        if (bl) {
                            return false;
                        }
                    }
                }
                case 2: {
                    if (!other.containsKey(this.key2)) {
                        otherValue = other.get(this.key2);
                        boolean bl = this.value2 == null ? otherValue != null : !this.value2.equals(otherValue);
                        if (bl) {
                            return false;
                        }
                    }
                }
                case 1: {
                    if (other.containsKey(this.key1)) break;
                    otherValue = other.get(this.key1);
                    boolean bl = this.value1 == null ? otherValue != null : !this.value1.equals(otherValue);
                    if (!bl) break;
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.delegateMap != null) {
            return this.delegateMap.hashCode();
        }
        int total = 0;
        switch (this.size) {
            case 3: {
                total += this.hash3 ^ (this.value3 == null ? 0 : this.value3.hashCode());
            }
            case 2: {
                total += this.hash2 ^ (this.value2 == null ? 0 : this.value2.hashCode());
            }
            case 1: {
                total += this.hash1 ^ (this.value1 == null ? 0 : this.value1.hashCode());
            }
        }
        return total;
    }

    public String toString() {
        if (this.delegateMap != null) {
            return this.delegateMap.toString();
        }
        if (this.size == 0) {
            return "{}";
        }
        StringBuffer buf = new StringBuffer(128);
        buf.append('{');
        switch (this.size) {
            case 3: {
                buf.append(this.key3 == this ? "(this Map)" : this.key3);
                buf.append('=');
                buf.append(this.value3 == this ? "(this Map)" : this.value3);
                buf.append(',');
            }
            case 2: {
                buf.append(this.key2 == this ? "(this Map)" : this.key2);
                buf.append('=');
                buf.append(this.value2 == this ? "(this Map)" : this.value2);
                buf.append(',');
            }
            case 1: {
                buf.append(this.key1 == this ? "(this Map)" : this.key1);
                buf.append('=');
                buf.append(this.value1 == this ? "(this Map)" : this.value1);
            }
        }
        buf.append('}');
        return buf.toString();
    }

    static /* synthetic */ int access$000(Flat3Map x0) {
        return x0.size;
    }

    static /* synthetic */ Object access$100(Flat3Map x0) {
        return x0.key3;
    }

    static /* synthetic */ Object access$200(Flat3Map x0) {
        return x0.key2;
    }

    static /* synthetic */ Object access$300(Flat3Map x0) {
        return x0.key1;
    }

    static /* synthetic */ Object access$400(Flat3Map x0) {
        return x0.value3;
    }

    static /* synthetic */ Object access$500(Flat3Map x0) {
        return x0.value2;
    }

    static /* synthetic */ Object access$600(Flat3Map x0) {
        return x0.value1;
    }

    static /* synthetic */ Object access$402(Flat3Map x0, Object x1) {
        x0.value3 = x1;
        return x0.value3;
    }

    static /* synthetic */ Object access$502(Flat3Map x0, Object x1) {
        x0.value2 = x1;
        return x0.value2;
    }

    static /* synthetic */ Object access$602(Flat3Map x0, Object x1) {
        x0.value1 = x1;
        return x0.value1;
    }

    static /* synthetic */ AbstractHashedMap access$700(Flat3Map x0) {
        return x0.delegateMap;
    }
}

