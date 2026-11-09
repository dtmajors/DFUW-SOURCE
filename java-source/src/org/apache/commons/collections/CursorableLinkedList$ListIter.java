package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class CursorableLinkedList$ListIter implements ListIterator {
   CursorableLinkedList$Listable _cur;
   CursorableLinkedList$Listable _lastReturned;
   int _expectedModCount;
   int _nextIndex;

   CursorableLinkedList$ListIter(CursorableLinkedList this$0, int index) {
      this.this$0 = this$0;
      this._cur = null;
      this._lastReturned = null;
      this._expectedModCount = this.this$0._modCount;
      this._nextIndex = 0;
      if (index == 0) {
         this._cur = new CursorableLinkedList$Listable(null, this$0._head.next(), null);
         this._nextIndex = 0;
      } else if (index == this$0._size) {
         this._cur = new CursorableLinkedList$Listable(this$0._head.prev(), null, null);
         this._nextIndex = this$0._size;
      } else {
         CursorableLinkedList$Listable temp = this$0.getListableAt(index);
         this._cur = new CursorableLinkedList$Listable(temp.prev(), temp, null);
         this._nextIndex = index;
      }
   }

   public Object previous() {
      this.checkForComod();
      if (!this.hasPrevious()) {
         throw new NoSuchElementException();
      }

      Object ret = this._cur.prev().value();
      this._lastReturned = this._cur.prev();
      this._cur.setNext(this._cur.prev());
      this._cur.setPrev(this._cur.prev().prev());
      this._nextIndex--;
      return ret;
   }

   public boolean hasNext() {
      this.checkForComod();
      return null != this._cur.next() && this._cur.prev() != this.this$0._head.prev();
   }

   public Object next() {
      this.checkForComod();
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      Object ret = this._cur.next().value();
      this._lastReturned = this._cur.next();
      this._cur.setPrev(this._cur.next());
      this._cur.setNext(this._cur.next().next());
      this._nextIndex++;
      return ret;
   }

   public int previousIndex() {
      this.checkForComod();
      return !this.hasPrevious() ? -1 : this._nextIndex - 1;
   }

   public boolean hasPrevious() {
      this.checkForComod();
      return null != this._cur.prev() && this._cur.next() != this.this$0._head.next();
   }

   public void set(Object o) {
      this.checkForComod();

      try {
         this._lastReturned.setValue(o);
      } catch (NullPointerException var3) {
         throw new IllegalStateException();
      }
   }

   public int nextIndex() {
      this.checkForComod();
      return !this.hasNext() ? this.this$0.size() : this._nextIndex;
   }

   public void remove() {
      this.checkForComod();
      if (null == this._lastReturned) {
         throw new IllegalStateException();
      }

      this._cur.setNext(this._lastReturned == this.this$0._head.prev() ? null : this._lastReturned.next());
      this._cur.setPrev(this._lastReturned == this.this$0._head.next() ? null : this._lastReturned.prev());
      this.this$0.removeListable(this._lastReturned);
      this._lastReturned = null;
      this._nextIndex--;
      this._expectedModCount++;
   }

   public void add(Object o) {
      this.checkForComod();
      this._cur.setPrev(this.this$0.insertListable(this._cur.prev(), this._cur.next(), o));
      this._lastReturned = null;
      this._nextIndex++;
      this._expectedModCount++;
   }

   protected void checkForComod() {
      if (this._expectedModCount != this.this$0._modCount) {
         throw new ConcurrentModificationException();
      }
   }
}
