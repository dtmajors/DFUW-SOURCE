package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ReferenceMap$EntryIterator implements Iterator {
   int index;
   ReferenceMap$Entry entry;
   ReferenceMap$Entry previous;
   Object nextKey;
   Object nextValue;
   Object currentKey;
   Object currentValue;
   int expectedModCount;

   public ReferenceMap$EntryIterator(ReferenceMap this$0) {
      this.this$0 = this$0;
      this.index = this$0.size() != 0 ? ReferenceMap.access$700(this$0).length : 0;
      this.expectedModCount = ReferenceMap.access$800(this$0);
   }

   public boolean hasNext() {
      this.checkMod();

      while (this.nextNull()) {
         ReferenceMap$Entry e = this.entry;
         int i = this.index;

         while (e == null && i > 0) {
            e = ReferenceMap.access$700(this.this$0)[--i];
         }

         this.entry = e;
         this.index = i;
         if (e == null) {
            this.currentKey = null;
            this.currentValue = null;
            return false;
         }

         this.nextKey = e.getKey();
         this.nextValue = e.getValue();
         if (this.nextNull()) {
            this.entry = this.entry.next;
         }
      }

      return true;
   }

   private void checkMod() {
      if (ReferenceMap.access$800(this.this$0) != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }
   }

   private boolean nextNull() {
      return this.nextKey == null || this.nextValue == null;
   }

   protected ReferenceMap$Entry nextEntry() {
      this.checkMod();
      if (this.nextNull() && !this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.previous = this.entry;
      this.entry = this.entry.next;
      this.currentKey = this.nextKey;
      this.currentValue = this.nextValue;
      this.nextKey = null;
      this.nextValue = null;
      return this.previous;
   }

   public Object next() {
      return this.nextEntry();
   }

   public void remove() {
      this.checkMod();
      if (this.previous == null) {
         throw new IllegalStateException();
      }

      this.this$0.remove(this.currentKey);
      this.previous = null;
      this.currentKey = null;
      this.currentValue = null;
      this.expectedModCount = ReferenceMap.access$800(this.this$0);
   }
}
