package org.apache.commons.collections.list;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedIterator;

public class AbstractLinkedList$LinkedListIterator implements ListIterator, OrderedIterator {
   protected final AbstractLinkedList parent;
   protected AbstractLinkedList$Node next;
   protected int nextIndex;
   protected AbstractLinkedList$Node current;
   protected int expectedModCount;

   protected AbstractLinkedList$LinkedListIterator(AbstractLinkedList parent, int fromIndex) throws IndexOutOfBoundsException {
      this.parent = parent;
      this.expectedModCount = parent.modCount;
      this.next = parent.getNode(fromIndex, true);
      this.nextIndex = fromIndex;
   }

   protected void checkModCount() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }
   }

   protected AbstractLinkedList$Node getLastNodeReturned() throws IllegalStateException {
      if (this.current == null) {
         throw new IllegalStateException();
      } else {
         return this.current;
      }
   }

   public boolean hasNext() {
      return this.next != this.parent.header;
   }

   public Object next() {
      this.checkModCount();
      if (!this.hasNext()) {
         throw new NoSuchElementException("No element at index " + this.nextIndex + ".");
      }

      Object value = this.next.getValue();
      this.current = this.next;
      this.next = this.next.next;
      this.nextIndex++;
      return value;
   }

   public boolean hasPrevious() {
      return this.next.previous != this.parent.header;
   }

   public Object previous() {
      this.checkModCount();
      if (!this.hasPrevious()) {
         throw new NoSuchElementException("Already at start of list.");
      }

      this.next = this.next.previous;
      Object value = this.next.getValue();
      this.current = this.next;
      this.nextIndex--;
      return value;
   }

   public int nextIndex() {
      return this.nextIndex;
   }

   public int previousIndex() {
      return this.nextIndex() - 1;
   }

   public void remove() {
      this.checkModCount();
      this.parent.removeNode(this.getLastNodeReturned());
      this.current = null;
      this.nextIndex--;
      this.expectedModCount++;
   }

   public void set(Object obj) {
      this.checkModCount();
      this.getLastNodeReturned().setValue(obj);
   }

   public void add(Object obj) {
      this.checkModCount();
      this.parent.addNodeBefore(this.next, obj);
      this.current = null;
      this.nextIndex++;
      this.expectedModCount++;
   }
}
