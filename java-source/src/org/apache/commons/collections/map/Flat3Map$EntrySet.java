package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.iterators.EmptyIterator;

class Flat3Map$EntrySet extends AbstractSet {
   private final Flat3Map parent;

   Flat3Map$EntrySet(Flat3Map parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)obj;
      Object key = entry.getKey();
      boolean result = this.parent.containsKey(key);
      this.parent.remove(key);
      return result;
   }

   public Iterator iterator() {
      if (Flat3Map.access$700(this.parent) != null) {
         return Flat3Map.access$700(this.parent).entrySet().iterator();
      } else {
         return this.parent.size() == 0 ? EmptyIterator.INSTANCE : new Flat3Map$EntrySetIterator(this.parent);
      }
   }
}
