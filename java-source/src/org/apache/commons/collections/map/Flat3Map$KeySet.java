package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;
import org.apache.commons.collections.iterators.EmptyIterator;

class Flat3Map$KeySet extends AbstractSet {
   private final Flat3Map parent;

   Flat3Map$KeySet(Flat3Map parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean contains(Object key) {
      return this.parent.containsKey(key);
   }

   public boolean remove(Object key) {
      boolean result = this.parent.containsKey(key);
      this.parent.remove(key);
      return result;
   }

   public Iterator iterator() {
      if (Flat3Map.access$700(this.parent) != null) {
         return Flat3Map.access$700(this.parent).keySet().iterator();
      } else {
         return this.parent.size() == 0 ? EmptyIterator.INSTANCE : new Flat3Map$KeySetIterator(this.parent);
      }
   }
}
