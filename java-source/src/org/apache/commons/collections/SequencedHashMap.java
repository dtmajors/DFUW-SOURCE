/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections.SequencedHashMap;
import org.apache.commons.collections.list.UnmodifiableList;

public class SequencedHashMap
implements Map,
Cloneable,
Externalizable {
    private Entry sentinel = SequencedHashMap.createSentinel();
    private HashMap entries;
    private transient long modCount = 0L;
    private static final int KEY = 0;
    private static final int VALUE = 1;
    private static final int ENTRY = 2;
    private static final int REMOVED_MASK = Integer.MIN_VALUE;
    private static final long serialVersionUID = 3380552487888102930L;

    private static final Entry createSentinel() {
        Entry s2;
        s2.prev = s2 = new Entry(null, null);
        s2.next = s2;
        return s2;
    }

    public SequencedHashMap() {
        this.entries = new HashMap();
    }

    public SequencedHashMap(int initialSize) {
        this.entries = new HashMap(initialSize);
    }

    public SequencedHashMap(int initialSize, float loadFactor) {
        this.entries = new HashMap(initialSize, loadFactor);
    }

    public SequencedHashMap(Map m) {
        this();
        this.putAll(m);
    }

    private void removeEntry(Entry entry) {
        entry.next.prev = entry.prev;
        entry.prev.next = entry.next;
    }

    private void insertEntry(Entry entry) {
        entry.next = this.sentinel;
        entry.prev = this.sentinel.prev;
        this.sentinel.prev.next = entry;
        this.sentinel.prev = entry;
    }

    public int size() {
        return this.entries.size();
    }

    public boolean isEmpty() {
        return this.sentinel.next == this.sentinel;
    }

    public boolean containsKey(Object key) {
        return this.entries.containsKey(key);
    }

    public boolean containsValue(Object value) {
        if (value == null) {
            Entry pos = this.sentinel.next;
            while (pos != this.sentinel) {
                if (pos.getValue() == null) {
                    return true;
                }
                pos = pos.next;
            }
        } else {
            Entry pos = this.sentinel.next;
            while (pos != this.sentinel) {
                if (value.equals(pos.getValue())) {
                    return true;
                }
                pos = pos.next;
            }
        }
        return false;
    }

    public Object get(Object o2) {
        Entry entry = (Entry)this.entries.get(o2);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public Map.Entry getFirst() {
        return this.isEmpty() ? null : this.sentinel.next;
    }

    public Object getFirstKey() {
        return this.sentinel.next.getKey();
    }

    public Object getFirstValue() {
        return this.sentinel.next.getValue();
    }

    public Map.Entry getLast() {
        return this.isEmpty() ? null : this.sentinel.prev;
    }

    public Object getLastKey() {
        return this.sentinel.prev.getKey();
    }

    public Object getLastValue() {
        return this.sentinel.prev.getValue();
    }

    public Object put(Object key, Object value) {
        ++this.modCount;
        Object oldValue = null;
        Entry e2 = (Entry)this.entries.get(key);
        if (e2 != null) {
            this.removeEntry(e2);
            oldValue = e2.setValue(value);
        } else {
            e2 = new Entry(key, value);
            this.entries.put(key, e2);
        }
        this.insertEntry(e2);
        return oldValue;
    }

    public Object remove(Object key) {
        Entry e2 = this.removeImpl(key);
        return e2 == null ? null : e2.getValue();
    }

    private Entry removeImpl(Object key) {
        Entry e2 = (Entry)this.entries.remove(key);
        if (e2 == null) {
            return null;
        }
        ++this.modCount;
        this.removeEntry(e2);
        return e2;
    }

    public void putAll(Map t) {
        Iterator iter = t.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = iter.next();
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public void clear() {
        ++this.modCount;
        this.entries.clear();
        this.sentinel.next = this.sentinel;
        this.sentinel.prev = this.sentinel;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return this.entrySet().equals(((Map)obj).entrySet());
    }

    public int hashCode() {
        return this.entrySet().hashCode();
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append('[');
        Entry pos = this.sentinel.next;
        while (pos != this.sentinel) {
            buf.append(pos.getKey());
            buf.append('=');
            buf.append(pos.getValue());
            if (pos.next != this.sentinel) {
                buf.append(',');
            }
            pos = pos.next;
        }
        buf.append(']');
        return buf.toString();
    }

    public Set keySet() {
        return new AbstractSet(this){
            private final /* synthetic */ SequencedHashMap this$0;
            {
                this.this$0 = this$0;
            }

            public Iterator iterator() {
                return new OrderedIterator(this.this$0, 0);
            }

            public boolean remove(Object o2) {
                Entry e2 = SequencedHashMap.access$000(this.this$0, o2);
                return e2 != null;
            }

            public void clear() {
                this.this$0.clear();
            }

            public int size() {
                return this.this$0.size();
            }

            public boolean isEmpty() {
                return this.this$0.isEmpty();
            }

            public boolean contains(Object o2) {
                return this.this$0.containsKey(o2);
            }
        };
    }

    public Collection values() {
        return new AbstractCollection(this){
            private final /* synthetic */ SequencedHashMap this$0;
            {
                this.this$0 = this$0;
            }

            public Iterator iterator() {
                return new OrderedIterator(this.this$0, 1);
            }

            public boolean remove(Object value) {
                if (value == null) {
                    Entry pos = SequencedHashMap.access$100((SequencedHashMap)this.this$0).next;
                    while (pos != SequencedHashMap.access$100(this.this$0)) {
                        if (pos.getValue() == null) {
                            SequencedHashMap.access$000(this.this$0, pos.getKey());
                            return true;
                        }
                        pos = pos.next;
                    }
                } else {
                    Entry pos = SequencedHashMap.access$100((SequencedHashMap)this.this$0).next;
                    while (pos != SequencedHashMap.access$100(this.this$0)) {
                        if (value.equals(pos.getValue())) {
                            SequencedHashMap.access$000(this.this$0, pos.getKey());
                            return true;
                        }
                        pos = pos.next;
                    }
                }
                return false;
            }

            public void clear() {
                this.this$0.clear();
            }

            public int size() {
                return this.this$0.size();
            }

            public boolean isEmpty() {
                return this.this$0.isEmpty();
            }

            public boolean contains(Object o2) {
                return this.this$0.containsValue(o2);
            }
        };
    }

    public Set entrySet() {
        return new AbstractSet(this){
            private final /* synthetic */ SequencedHashMap this$0;
            {
                this.this$0 = this$0;
            }

            private Entry findEntry(Object o2) {
                if (o2 == null) {
                    return null;
                }
                if (!(o2 instanceof Map.Entry)) {
                    return null;
                }
                Map.Entry e2 = (Map.Entry)o2;
                Entry entry = (Entry)SequencedHashMap.access$200(this.this$0).get(e2.getKey());
                if (entry != null && entry.equals(e2)) {
                    return entry;
                }
                return null;
            }

            public Iterator iterator() {
                return new OrderedIterator(this.this$0, 2);
            }

            public boolean remove(Object o2) {
                Entry e2 = this.findEntry(o2);
                if (e2 == null) {
                    return false;
                }
                return SequencedHashMap.access$000(this.this$0, e2.getKey()) != null;
            }

            public void clear() {
                this.this$0.clear();
            }

            public int size() {
                return this.this$0.size();
            }

            public boolean isEmpty() {
                return this.this$0.isEmpty();
            }

            public boolean contains(Object o2) {
                return this.findEntry(o2) != null;
            }
        };
    }

    public Object clone() throws CloneNotSupportedException {
        SequencedHashMap map = (SequencedHashMap)super.clone();
        map.sentinel = SequencedHashMap.createSentinel();
        map.entries = new HashMap();
        map.putAll((Map)this);
        return map;
    }

    private Map.Entry getEntry(int index) {
        Entry pos = this.sentinel;
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }
        int i = -1;
        while (i < index - 1 && pos.next != this.sentinel) {
            ++i;
            pos = pos.next;
        }
        if (pos.next == this.sentinel) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + (i + 1));
        }
        return pos.next;
    }

    public Object get(int index) {
        return this.getEntry(index).getKey();
    }

    public Object getValue(int index) {
        return this.getEntry(index).getValue();
    }

    public int indexOf(Object key) {
        Entry e2 = (Entry)this.entries.get(key);
        if (e2 == null) {
            return -1;
        }
        int pos = 0;
        while (e2.prev != this.sentinel) {
            ++pos;
            e2 = e2.prev;
        }
        return pos;
    }

    public Iterator iterator() {
        return this.keySet().iterator();
    }

    public int lastIndexOf(Object key) {
        return this.indexOf(key);
    }

    public List sequence() {
        ArrayList l = new ArrayList(this.size());
        Iterator iter = this.keySet().iterator();
        while (iter.hasNext()) {
            l.add(iter.next());
        }
        return UnmodifiableList.decorate(l);
    }

    public Object remove(int index) {
        return this.remove(this.get(index));
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int size = in.readInt();
        int i = 0;
        while (i < size) {
            Object key = in.readObject();
            Object value = in.readObject();
            this.put(key, value);
            ++i;
        }
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(this.size());
        Entry pos = this.sentinel.next;
        while (pos != this.sentinel) {
            out.writeObject(pos.getKey());
            out.writeObject(pos.getValue());
            pos = pos.next;
        }
    }

    static /* synthetic */ Entry access$000(SequencedHashMap x0, Object x1) {
        return x0.removeImpl(x1);
    }

    static /* synthetic */ Entry access$100(SequencedHashMap x0) {
        return x0.sentinel;
    }

    static /* synthetic */ HashMap access$200(SequencedHashMap x0) {
        return x0.entries;
    }

    static /* synthetic */ long access$300(SequencedHashMap x0) {
        return x0.modCount;
    }
}

