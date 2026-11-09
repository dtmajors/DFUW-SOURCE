package org.apache.commons.collections.map;

import java.util.ListIterator;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.ResettableIterator;

class ListOrderedMap$ListOrderedMapIterator implements OrderedMapIterator, ResettableIterator {
   private final ListOrderedMap parent;
   private ListIterator iterator;
   private Object last = null;
   private boolean readable = false;

   ListOrderedMap$ListOrderedMapIterator(ListOrderedMap parent) {
      this.parent = parent;
      this.iterator = parent.insertOrder.listIterator();
   }

   public boolean hasNext() {
      return this.iterator.hasNext();
   }

   public Object next() {
      this.last = this.iterator.next();
      this.readable = true;
      return this.last;
   }

   public boolean hasPrevious() {
      return this.iterator.hasPrevious();
   }

   public Object previous() {
      this.last = this.iterator.previous();
      this.readable = true;
      return this.last;
   }

   public void remove() {
      if (!this.readable) {
         throw new IllegalStateException("remove() can only be called once after next()");
      }

      this.iterator.remove();
      this.parent.map.remove(this.last);
      this.readable = false;
   }

   public Object getKey() {
      if (!this.readable) {
         throw new IllegalStateException("getKey() can only be called after next() and before remove()");
      } else {
         return this.last;
      }
   }

   public Object getValue() {
      if (!this.readable) {
         throw new IllegalStateException("getValue() can only be called after next() and before remove()");
      } else {
         return this.parent.get(this.last);
      }
   }

   public Object setValue(Object value) {
      if (!this.readable) {
         throw new IllegalStateException("setValue() can only be called after next() and before remove()");
      } else {
         return this.parent.map.put(this.last, value);
      }
   }

   public void reset() {
      this.iterator = this.parent.insertOrder.listIterator();
      this.last = null;
      this.readable = false;
   }

   public String toString() {
      return this.readable ? "Iterator[" + this.getKey() + "=" + this.getValue() + "]" : "Iterator[]";
   }
}
