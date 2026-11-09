package org.apache.commons.collections.list;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedIterator;

class TreeList$TreeListIterator implements ListIterator, OrderedIterator {
   protected final TreeList parent;
   protected TreeList$AVLNode next;
   protected int nextIndex;
   protected TreeList$AVLNode current;
   protected int currentIndex;
   protected int expectedModCount;

   protected TreeList$TreeListIterator(TreeList parent, int fromIndex) throws IndexOutOfBoundsException {
      this.parent = parent;
      this.expectedModCount = TreeList.access$301(parent);
      this.next = TreeList.access$400(parent) == null ? null : TreeList.access$400(parent).get(fromIndex);
      this.nextIndex = fromIndex;
   }

   protected void checkModCount() {
      if (TreeList.access$501(this.parent) != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }
   }

   public boolean hasNext() {
      return this.nextIndex < this.parent.size();
   }

   public Object next() {
      this.checkModCount();
      if (!this.hasNext()) {
         throw new NoSuchElementException("No element at index " + this.nextIndex + ".");
      }

      if (this.next == null) {
         this.next = TreeList.access$400(this.parent).get(this.nextIndex);
      }

      Object value = this.next.getValue();
      this.current = this.next;
      this.currentIndex = this.nextIndex++;
      this.next = this.next.next();
      return value;
   }

   public boolean hasPrevious() {
      return this.nextIndex > 0;
   }

   public Object previous() {
      this.checkModCount();
      if (!this.hasPrevious()) {
         throw new NoSuchElementException("Already at start of list.");
      }

      if (this.next == null) {
         this.next = TreeList.access$400(this.parent).get(this.nextIndex - 1);
      } else {
         this.next = this.next.previous();
      }

      Object value = this.next.getValue();
      this.current = this.next;
      this.currentIndex = --this.nextIndex;
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
      if (this.current == null) {
         throw new IllegalStateException();
      }

      this.parent.remove(this.currentIndex);
      this.current = null;
      this.currentIndex = -1;
      this.nextIndex--;
      this.expectedModCount++;
   }

   public void set(Object obj) {
      this.checkModCount();
      if (this.current == null) {
         throw new IllegalStateException();
      }

      this.current.setValue(obj);
   }

   public void add(Object obj) {
      this.checkModCount();
      this.parent.add(this.nextIndex, obj);
      this.current = null;
      this.currentIndex = -1;
      this.nextIndex++;
      this.expectedModCount++;
   }
}
