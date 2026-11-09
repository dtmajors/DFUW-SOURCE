package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;

public class AbstractHashedMap extends AbstractMap implements IterableMap {
   protected static final String NO_NEXT_ENTRY = "No next() entry in the iteration";
   protected static final String NO_PREVIOUS_ENTRY = "No previous() entry in the iteration";
   protected static final String REMOVE_INVALID = "remove() can only be called once after next()";
   protected static final String GETKEY_INVALID = "getKey() can only be called after next() and before remove()";
   protected static final String GETVALUE_INVALID = "getValue() can only be called after next() and before remove()";
   protected static final String SETVALUE_INVALID = "setValue() can only be called after next() and before remove()";
   protected static final int DEFAULT_CAPACITY = 16;
   protected static final int DEFAULT_THRESHOLD = 12;
   protected static final float DEFAULT_LOAD_FACTOR = 0.75F;
   protected static final int MAXIMUM_CAPACITY = 1073741824;
   protected static final Object NULL = new Object();
   protected transient float loadFactor;
   protected transient int size;
   protected transient AbstractHashedMap$HashEntry[] data;
   protected transient int threshold;
   protected transient int modCount;
   protected transient AbstractHashedMap$EntrySet entrySet;
   protected transient AbstractHashedMap$KeySet keySet;
   protected transient AbstractHashedMap$Values values;

   protected AbstractHashedMap() {
   }

   protected AbstractHashedMap(int initialCapacity, float loadFactor, int threshold) {
      this.loadFactor = loadFactor;
      this.data = new AbstractHashedMap$HashEntry[initialCapacity];
      this.threshold = threshold;
      this.init();
   }

   protected AbstractHashedMap(int initialCapacity) {
      this(initialCapacity, 0.75F);
   }

   protected AbstractHashedMap(int initialCapacity, float loadFactor) {
      if (initialCapacity < 1) {
         throw new IllegalArgumentException("Initial capacity must be greater than 0");
      }

      if (!(loadFactor <= 0.0F) && !Float.isNaN(loadFactor)) {
         this.loadFactor = loadFactor;
         this.threshold = this.calculateThreshold(initialCapacity, loadFactor);
         initialCapacity = this.calculateNewCapacity(initialCapacity);
         this.data = new AbstractHashedMap$HashEntry[initialCapacity];
         this.init();
      } else {
         throw new IllegalArgumentException("Load factor must be greater than 0");
      }
   }

   protected AbstractHashedMap(Map map) {
      this(Math.max(2 * map.size(), 16), 0.75F);
      this.putAll(map);
   }

   protected void init() {
   }

   public Object get(Object key) {
      key = this.convertKey(key);
      int hashCode = this.hash(key);

      for (AbstractHashedMap$HashEntry entry = this.data[this.hashIndex(hashCode, this.data.length)]; entry != null; entry = entry.next) {
         if (entry.hashCode == hashCode && this.isEqualKey(key, entry.key)) {
            return entry.getValue();
         }
      }

      return null;
   }

   public int size() {
      return this.size;
   }

   public boolean isEmpty() {
      return this.size == 0;
   }

   public boolean containsKey(Object key) {
      key = this.convertKey(key);
      int hashCode = this.hash(key);

      for (AbstractHashedMap$HashEntry entry = this.data[this.hashIndex(hashCode, this.data.length)]; entry != null; entry = entry.next) {
         if (entry.hashCode == hashCode && this.isEqualKey(key, entry.key)) {
            return true;
         }
      }

      return false;
   }

   public boolean containsValue(Object value) {
      if (value == null) {
         int i = 0;

         for (int isize = this.data.length; i < isize; i++) {
            for (AbstractHashedMap$HashEntry entry = this.data[i]; entry != null; entry = entry.next) {
               if (entry.getValue() == null) {
                  return true;
               }
            }
         }
      } else {
         int i = 0;

         for (int isize = this.data.length; i < isize; i++) {
            for (AbstractHashedMap$HashEntry entry = this.data[i]; entry != null; entry = entry.next) {
               if (this.isEqualValue(value, entry.getValue())) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public Object put(Object key, Object value) {
      key = this.convertKey(key);
      int hashCode = this.hash(key);
      int index = this.hashIndex(hashCode, this.data.length);

      for (AbstractHashedMap$HashEntry entry = this.data[index]; entry != null; entry = entry.next) {
         if (entry.hashCode == hashCode && this.isEqualKey(key, entry.key)) {
            Object oldValue = entry.getValue();
            this.updateEntry(entry, value);
            return oldValue;
         }
      }

      this.addMapping(index, hashCode, key, value);
      return null;
   }

   public void putAll(Map map) {
      int mapSize = map.size();
      if (mapSize != 0) {
         int newSize = (int)((this.size + mapSize) / this.loadFactor + 1.0F);
         this.ensureCapacity(this.calculateNewCapacity(newSize));

         for (Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
         }
      }
   }

   public Object remove(Object key) {
      key = this.convertKey(key);
      int hashCode = this.hash(key);
      int index = this.hashIndex(hashCode, this.data.length);
      AbstractHashedMap$HashEntry entry = this.data[index];
      AbstractHashedMap$HashEntry previous = null;

      while (entry != null) {
         if (entry.hashCode == hashCode && this.isEqualKey(key, entry.key)) {
            Object oldValue = entry.getValue();
            this.removeMapping(entry, index, previous);
            return oldValue;
         }

         previous = entry;
         entry = entry.next;
      }

      return null;
   }

   public void clear() {
      this.modCount++;
      AbstractHashedMap$HashEntry[] data = this.data;

      for (int i = data.length - 1; i >= 0; i--) {
         data[i] = null;
      }

      this.size = 0;
   }

   protected Object convertKey(Object key) {
      return key == null ? NULL : key;
   }

   protected int hash(Object key) {
      int h = key.hashCode();
      h += ~(h << 9);
      h ^= h >>> 14;
      h += h << 4;
      return h ^ h >>> 10;
   }

   protected boolean isEqualKey(Object key1, Object key2) {
      return key1 == key2 || key1.equals(key2);
   }

   protected boolean isEqualValue(Object value1, Object value2) {
      return value1 == value2 || value1.equals(value2);
   }

   protected int hashIndex(int hashCode, int dataSize) {
      return hashCode & dataSize - 1;
   }

   protected AbstractHashedMap$HashEntry getEntry(Object key) {
      key = this.convertKey(key);
      int hashCode = this.hash(key);

      for (AbstractHashedMap$HashEntry entry = this.data[this.hashIndex(hashCode, this.data.length)]; entry != null; entry = entry.next) {
         if (entry.hashCode == hashCode && this.isEqualKey(key, entry.key)) {
            return entry;
         }
      }

      return null;
   }

   protected void updateEntry(AbstractHashedMap$HashEntry entry, Object newValue) {
      entry.setValue(newValue);
   }

   protected void reuseEntry(AbstractHashedMap$HashEntry entry, int hashIndex, int hashCode, Object key, Object value) {
      entry.next = this.data[hashIndex];
      entry.hashCode = hashCode;
      entry.key = key;
      entry.value = value;
   }

   protected void addMapping(int hashIndex, int hashCode, Object key, Object value) {
      this.modCount++;
      AbstractHashedMap$HashEntry entry = this.createEntry(this.data[hashIndex], hashCode, key, value);
      this.addEntry(entry, hashIndex);
      this.size++;
      this.checkCapacity();
   }

   protected AbstractHashedMap$HashEntry createEntry(AbstractHashedMap$HashEntry next, int hashCode, Object key, Object value) {
      return new AbstractHashedMap$HashEntry(next, hashCode, key, value);
   }

   protected void addEntry(AbstractHashedMap$HashEntry entry, int hashIndex) {
      this.data[hashIndex] = entry;
   }

   protected void removeMapping(AbstractHashedMap$HashEntry entry, int hashIndex, AbstractHashedMap$HashEntry previous) {
      this.modCount++;
      this.removeEntry(entry, hashIndex, previous);
      this.size--;
      this.destroyEntry(entry);
   }

   protected void removeEntry(AbstractHashedMap$HashEntry entry, int hashIndex, AbstractHashedMap$HashEntry previous) {
      if (previous == null) {
         this.data[hashIndex] = entry.next;
      } else {
         previous.next = entry.next;
      }
   }

   protected void destroyEntry(AbstractHashedMap$HashEntry entry) {
      entry.next = null;
      entry.key = null;
      entry.value = null;
   }

   protected void checkCapacity() {
      if (this.size >= this.threshold) {
         int newCapacity = this.data.length * 2;
         if (newCapacity <= 1073741824) {
            this.ensureCapacity(newCapacity);
         }
      }
   }

   protected void ensureCapacity(int newCapacity) {
      int oldCapacity = this.data.length;
      if (newCapacity > oldCapacity) {
         if (this.size == 0) {
            this.threshold = this.calculateThreshold(newCapacity, this.loadFactor);
            this.data = new AbstractHashedMap$HashEntry[newCapacity];
         } else {
            AbstractHashedMap$HashEntry[] oldEntries = this.data;
            AbstractHashedMap$HashEntry[] newEntries = new AbstractHashedMap$HashEntry[newCapacity];
            this.modCount++;

            for (int i = oldCapacity - 1; i >= 0; i--) {
               AbstractHashedMap$HashEntry entry = oldEntries[i];
               if (entry != null) {
                  oldEntries[i] = null;

                  while (true) {
                     AbstractHashedMap$HashEntry next = entry.next;
                     int index = this.hashIndex(entry.hashCode, newCapacity);
                     entry.next = newEntries[index];
                     newEntries[index] = entry;
                     entry = next;
                     if (entry == null) {
                        break;
                     }
                  }
               }
            }

            this.threshold = this.calculateThreshold(newCapacity, this.loadFactor);
            this.data = newEntries;
         }
      }
   }

   protected int calculateNewCapacity(int proposedCapacity) {
      int newCapacity = 1;
      if (proposedCapacity > 1073741824) {
         newCapacity = 1073741824;
      } else {
         while (newCapacity < proposedCapacity) {
            newCapacity <<= 1;
         }

         if (newCapacity > 1073741824) {
            newCapacity = 1073741824;
         }
      }

      return newCapacity;
   }

   protected int calculateThreshold(int newCapacity, float factor) {
      return (int)(newCapacity * factor);
   }

   protected AbstractHashedMap$HashEntry entryNext(AbstractHashedMap$HashEntry entry) {
      return entry.next;
   }

   protected int entryHashCode(AbstractHashedMap$HashEntry entry) {
      return entry.hashCode;
   }

   protected Object entryKey(AbstractHashedMap$HashEntry entry) {
      return entry.key;
   }

   protected Object entryValue(AbstractHashedMap$HashEntry entry) {
      return entry.value;
   }

   public MapIterator mapIterator() {
      return this.size == 0 ? EmptyMapIterator.INSTANCE : new AbstractHashedMap$HashMapIterator(this);
   }

   public Set entrySet() {
      if (this.entrySet == null) {
         this.entrySet = new AbstractHashedMap$EntrySet(this);
      }

      return this.entrySet;
   }

   protected Iterator createEntrySetIterator() {
      return this.size() == 0 ? EmptyIterator.INSTANCE : new AbstractHashedMap$EntrySetIterator(this);
   }

   public Set keySet() {
      if (this.keySet == null) {
         this.keySet = new AbstractHashedMap$KeySet(this);
      }

      return this.keySet;
   }

   protected Iterator createKeySetIterator() {
      return this.size() == 0 ? EmptyIterator.INSTANCE : new AbstractHashedMap$KeySetIterator(this);
   }

   public Collection values() {
      if (this.values == null) {
         this.values = new AbstractHashedMap$Values(this);
      }

      return this.values;
   }

   protected Iterator createValuesIterator() {
      return this.size() == 0 ? EmptyIterator.INSTANCE : new AbstractHashedMap$ValuesIterator(this);
   }

   protected void doWriteObject(ObjectOutputStream out) throws IOException {
      out.writeFloat(this.loadFactor);
      out.writeInt(this.data.length);
      out.writeInt(this.size);
      MapIterator it = this.mapIterator();

      while (it.hasNext()) {
         out.writeObject(it.next());
         out.writeObject(it.getValue());
      }
   }

   protected void doReadObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
      this.loadFactor = in.readFloat();
      int capacity = in.readInt();
      int size = in.readInt();
      this.init();
      this.data = new AbstractHashedMap$HashEntry[capacity];

      for (int i = 0; i < size; i++) {
         Object key = in.readObject();
         Object value = in.readObject();
         this.put(key, value);
      }

      this.threshold = this.calculateThreshold(this.data.length, this.loadFactor);
   }

   protected Object clone() {
      try {
         AbstractHashedMap cloned = (AbstractHashedMap)super.clone();
         cloned.data = new AbstractHashedMap$HashEntry[this.data.length];
         cloned.entrySet = null;
         cloned.keySet = null;
         cloned.values = null;
         cloned.modCount = 0;
         cloned.size = 0;
         cloned.init();
         cloned.putAll(this);
         return cloned;
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Map)) {
         return false;
      }

      Map map = (Map)obj;
      if (map.size() != this.size()) {
         return false;
      }

      MapIterator it = this.mapIterator();

      try {
         while (it.hasNext()) {
            Object key = it.next();
            Object value = it.getValue();
            if (value == null) {
               if (map.get(key) != null || !map.containsKey(key)) {
                  return false;
               }
            } else if (!value.equals(map.get(key))) {
               return false;
            }
         }

         return true;
      } catch (ClassCastException var6) {
         return false;
      } catch (NullPointerException var7) {
         return false;
      }
   }

   public int hashCode() {
      int total = 0;
      Iterator it = this.createEntrySetIterator();

      while (it.hasNext()) {
         total += it.next().hashCode();
      }

      return total;
   }

   public String toString() {
      if (this.size() == 0) {
         return "{}";
      }

      StringBuffer buf = new StringBuffer(32 * this.size());
      buf.append('{');
      MapIterator it = this.mapIterator();
      boolean hasNext = it.hasNext();

      while (hasNext) {
         Object key = it.next();
         Object value = it.getValue();
         buf.append(key == this ? "(this Map)" : key).append('=').append(value == this ? "(this Map)" : value);
         hasNext = it.hasNext();
         if (hasNext) {
            buf.append(',').append(' ');
         }
      }

      buf.append('}');
      return buf.toString();
   }
}
