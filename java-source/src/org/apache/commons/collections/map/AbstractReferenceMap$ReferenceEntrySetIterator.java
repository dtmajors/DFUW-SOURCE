package org.apache.commons.collections.map;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class AbstractReferenceMap$ReferenceEntrySetIterator implements Iterator {
   final AbstractReferenceMap parent;
   int index;
   AbstractReferenceMap$ReferenceEntry entry;
   AbstractReferenceMap$ReferenceEntry previous;
   Object nextKey;
   Object nextValue;
   Object currentKey;
   Object currentValue;
   int expectedModCount;

   public AbstractReferenceMap$ReferenceEntrySetIterator(AbstractReferenceMap parent) {
      this.parent = parent;
      this.index = parent.size() != 0 ? parent.data.length : 0;
      this.expectedModCount = parent.modCount;
   }

   public boolean hasNext() {
      this.checkMod();

      while (this.nextNull()) {
         AbstractReferenceMap$ReferenceEntry e = this.entry;
         int i = this.index;

         while (e == null && i > 0) {
            e = (AbstractReferenceMap$ReferenceEntry)this.parent.data[--i];
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
            this.entry = this.entry.next();
         }
      }

      return true;
   }

   private void checkMod() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }
   }

   private boolean nextNull() {
      return this.nextKey == null || this.nextValue == null;
   }

   protected AbstractReferenceMap$ReferenceEntry nextEntry() {
      this.checkMod();
      if (this.nextNull() && !this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.previous = this.entry;
      this.entry = this.entry.next();
      this.currentKey = this.nextKey;
      this.currentValue = this.nextValue;
      this.nextKey = null;
      this.nextValue = null;
      return this.previous;
   }

   protected AbstractReferenceMap$ReferenceEntry currentEntry() {
      this.checkMod();
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

      this.parent.remove(this.currentKey);
      this.previous = null;
      this.currentKey = null;
      this.currentValue = null;
      this.expectedModCount = this.parent.modCount;
   }
}
