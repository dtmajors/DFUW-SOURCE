package org.apache.commons.collections.map;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractHashedMap$HashIterator implements Iterator {
   protected final AbstractHashedMap parent;
   protected int hashIndex;
   protected AbstractHashedMap$HashEntry last;
   protected AbstractHashedMap$HashEntry next;
   protected int expectedModCount;

   protected AbstractHashedMap$HashIterator(AbstractHashedMap parent) {
      this.parent = parent;
      AbstractHashedMap$HashEntry[] data = parent.data;
      int i = data.length;
      AbstractHashedMap$HashEntry next = null;

      while (i > 0 && next == null) {
         next = data[--i];
      }

      this.next = next;
      this.hashIndex = i;
      this.expectedModCount = parent.modCount;
   }

   public boolean hasNext() {
      return this.next != null;
   }

   protected AbstractHashedMap$HashEntry nextEntry() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      AbstractHashedMap$HashEntry newCurrent = this.next;
      if (newCurrent == null) {
         throw new NoSuchElementException("No next() entry in the iteration");
      }

      AbstractHashedMap$HashEntry[] data = this.parent.data;
      int i = this.hashIndex;
      AbstractHashedMap$HashEntry n = newCurrent.next;

      while (n == null && i > 0) {
         n = data[--i];
      }

      this.next = n;
      this.hashIndex = i;
      this.last = newCurrent;
      return newCurrent;
   }

   protected AbstractHashedMap$HashEntry currentEntry() {
      return this.last;
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException("remove() can only be called once after next()");
      }

      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      this.parent.remove(this.last.getKey());
      this.last = null;
      this.expectedModCount = this.parent.modCount;
   }

   public String toString() {
      return this.last != null ? "Iterator[" + this.last.getKey() + "=" + this.last.getValue() + "]" : "Iterator[]";
   }

   public abstract Object next();
}
