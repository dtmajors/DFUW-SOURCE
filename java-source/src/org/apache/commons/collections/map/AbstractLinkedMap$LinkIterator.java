package org.apache.commons.collections.map;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedIterator;
import org.apache.commons.collections.ResettableIterator;

public abstract class AbstractLinkedMap$LinkIterator implements OrderedIterator, ResettableIterator {
   protected final AbstractLinkedMap parent;
   protected AbstractLinkedMap$LinkEntry last;
   protected AbstractLinkedMap$LinkEntry next;
   protected int expectedModCount;

   protected AbstractLinkedMap$LinkIterator(AbstractLinkedMap parent) {
      this.parent = parent;
      this.next = parent.header.after;
      this.expectedModCount = parent.modCount;
   }

   public boolean hasNext() {
      return this.next != this.parent.header;
   }

   public boolean hasPrevious() {
      return this.next.before != this.parent.header;
   }

   protected AbstractLinkedMap$LinkEntry nextEntry() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      if (this.next == this.parent.header) {
         throw new NoSuchElementException("No next() entry in the iteration");
      }

      this.last = this.next;
      this.next = this.next.after;
      return this.last;
   }

   protected AbstractLinkedMap$LinkEntry previousEntry() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      AbstractLinkedMap$LinkEntry previous = this.next.before;
      if (previous == this.parent.header) {
         throw new NoSuchElementException("No previous() entry in the iteration");
      }

      this.next = previous;
      this.last = previous;
      return this.last;
   }

   protected AbstractLinkedMap$LinkEntry currentEntry() {
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

   public void reset() {
      this.last = null;
      this.next = this.parent.header.after;
   }

   public String toString() {
      return this.last != null ? "Iterator[" + this.last.getKey() + "=" + this.last.getValue() + "]" : "Iterator[]";
   }

   public abstract Object previous();

   public abstract Object next();
}
