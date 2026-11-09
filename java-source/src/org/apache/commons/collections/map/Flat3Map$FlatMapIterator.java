package org.apache.commons.collections.map;

import java.util.NoSuchElementException;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;

class Flat3Map$FlatMapIterator implements MapIterator, ResettableIterator {
   private final Flat3Map parent;
   private int nextIndex = 0;
   private boolean canRemove = false;

   Flat3Map$FlatMapIterator(Flat3Map parent) {
      this.parent = parent;
   }

   public boolean hasNext() {
      return this.nextIndex < Flat3Map.access$000(this.parent);
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException("No next() entry in the iteration");
      }

      this.canRemove = true;
      this.nextIndex++;
      return this.getKey();
   }

   public void remove() {
      if (!this.canRemove) {
         throw new IllegalStateException("remove() can only be called once after next()");
      }

      this.parent.remove(this.getKey());
      this.nextIndex--;
      this.canRemove = false;
   }

   public Object getKey() {
      if (!this.canRemove) {
         throw new IllegalStateException("getKey() can only be called after next() and before remove()");
      }

      switch (this.nextIndex) {
         case 1:
            return Flat3Map.access$300(this.parent);
         case 2:
            return Flat3Map.access$200(this.parent);
         case 3:
            return Flat3Map.access$100(this.parent);
         default:
            throw new IllegalStateException("Invalid map index");
      }
   }

   public Object getValue() {
      if (!this.canRemove) {
         throw new IllegalStateException("getValue() can only be called after next() and before remove()");
      }

      switch (this.nextIndex) {
         case 1:
            return Flat3Map.access$600(this.parent);
         case 2:
            return Flat3Map.access$500(this.parent);
         case 3:
            return Flat3Map.access$400(this.parent);
         default:
            throw new IllegalStateException("Invalid map index");
      }
   }

   public Object setValue(Object value) {
      if (!this.canRemove) {
         throw new IllegalStateException("setValue() can only be called after next() and before remove()");
      }

      Object old = this.getValue();
      switch (this.nextIndex) {
         case 3:
            Flat3Map.access$402(this.parent, value);
         case 2:
            Flat3Map.access$502(this.parent, value);
         case 1:
            Flat3Map.access$602(this.parent, value);
         default:
            return old;
      }
   }

   public void reset() {
      this.nextIndex = 0;
      this.canRemove = false;
   }

   public String toString() {
      return this.canRemove ? "Iterator[" + this.getKey() + "=" + this.getValue() + "]" : "Iterator[]";
   }
}
