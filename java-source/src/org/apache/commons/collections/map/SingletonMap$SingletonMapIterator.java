package org.apache.commons.collections.map;

import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.ResettableIterator;

class SingletonMap$SingletonMapIterator implements OrderedMapIterator, ResettableIterator {
   private final SingletonMap parent;
   private boolean hasNext = true;
   private boolean canGetSet = false;

   SingletonMap$SingletonMapIterator(SingletonMap parent) {
      this.parent = parent;
   }

   public boolean hasNext() {
      return this.hasNext;
   }

   public Object next() {
      if (!this.hasNext) {
         throw new NoSuchElementException("No next() entry in the iteration");
      }

      this.hasNext = false;
      this.canGetSet = true;
      return this.parent.getKey();
   }

   public boolean hasPrevious() {
      return !this.hasNext;
   }

   public Object previous() {
      if (this.hasNext) {
         throw new NoSuchElementException("No previous() entry in the iteration");
      }

      this.hasNext = true;
      return this.parent.getKey();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object getKey() {
      if (!this.canGetSet) {
         throw new IllegalStateException("getKey() can only be called after next() and before remove()");
      } else {
         return this.parent.getKey();
      }
   }

   public Object getValue() {
      if (!this.canGetSet) {
         throw new IllegalStateException("getValue() can only be called after next() and before remove()");
      } else {
         return this.parent.getValue();
      }
   }

   public Object setValue(Object value) {
      if (!this.canGetSet) {
         throw new IllegalStateException("setValue() can only be called after next() and before remove()");
      } else {
         return this.parent.setValue(value);
      }
   }

   public void reset() {
      this.hasNext = true;
   }

   public String toString() {
      return this.hasNext ? "Iterator[]" : "Iterator[" + this.getKey() + "=" + this.getValue() + "]";
   }
}
