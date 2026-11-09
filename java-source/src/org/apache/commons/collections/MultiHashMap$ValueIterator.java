package org.apache.commons.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

class MultiHashMap$ValueIterator implements Iterator {
   private Iterator backedIterator;
   private Iterator tempIterator;

   private MultiHashMap$ValueIterator(MultiHashMap this$0) {
      this.this$0 = this$0;
      this.backedIterator = MultiHashMap.access$201(this$0).iterator();
   }

   private boolean searchNextIterator() {
      while (this.tempIterator == null || !this.tempIterator.hasNext()) {
         if (!this.backedIterator.hasNext()) {
            return false;
         }

         this.tempIterator = ((Collection)this.backedIterator.next()).iterator();
      }

      return true;
   }

   public boolean hasNext() {
      return this.searchNextIterator();
   }

   public Object next() {
      if (!this.searchNextIterator()) {
         throw new NoSuchElementException();
      } else {
         return this.tempIterator.next();
      }
   }

   public void remove() {
      if (this.tempIterator == null) {
         throw new IllegalStateException();
      }

      this.tempIterator.remove();
   }
}
