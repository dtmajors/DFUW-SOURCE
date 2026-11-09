package org.apache.commons.collections.map;

import java.util.AbstractCollection;
import java.util.Iterator;
import org.apache.commons.collections.iterators.EmptyIterator;

class Flat3Map$Values extends AbstractCollection {
   private final Flat3Map parent;

   Flat3Map$Values(Flat3Map parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean contains(Object value) {
      return this.parent.containsValue(value);
   }

   public Iterator iterator() {
      if (Flat3Map.access$700(this.parent) != null) {
         return Flat3Map.access$700(this.parent).values().iterator();
      } else {
         return this.parent.size() == 0 ? EmptyIterator.INSTANCE : new Flat3Map$ValuesIterator(this.parent);
      }
   }
}
