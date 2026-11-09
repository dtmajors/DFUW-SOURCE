package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public class CursorableLinkedList$Cursor extends CursorableLinkedList$ListIter implements ListIterator {
   boolean _valid;

   CursorableLinkedList$Cursor(CursorableLinkedList this$0, int index) {
      super(this$0, index);
      this.this$0 = this$0;
      this._valid = false;
      this._valid = true;
      this$0.registerCursor(this);
   }

   public int previousIndex() {
      throw new UnsupportedOperationException();
   }

   public int nextIndex() {
      throw new UnsupportedOperationException();
   }

   public void add(Object o) {
      this.checkForComod();
      CursorableLinkedList$Listable elt = this.this$0.insertListable(super._cur.prev(), super._cur.next(), o);
      super._cur.setPrev(elt);
      super._cur.setNext(elt.next());
      super._lastReturned = null;
      super._nextIndex++;
      super._expectedModCount++;
   }

   protected void listableRemoved(CursorableLinkedList$Listable elt) {
      if (null == this.this$0._head.prev()) {
         super._cur.setNext(null);
      } else if (super._cur.next() == elt) {
         super._cur.setNext(elt.next());
      }

      if (null == this.this$0._head.next()) {
         super._cur.setPrev(null);
      } else if (super._cur.prev() == elt) {
         super._cur.setPrev(elt.prev());
      }

      if (super._lastReturned == elt) {
         super._lastReturned = null;
      }
   }

   protected void listableInserted(CursorableLinkedList$Listable elt) {
      if (null == super._cur.next() && null == super._cur.prev()) {
         super._cur.setNext(elt);
      } else if (super._cur.prev() == elt.prev()) {
         super._cur.setNext(elt);
      }

      if (super._cur.next() == elt.next()) {
         super._cur.setPrev(elt);
      }

      if (super._lastReturned == elt) {
         super._lastReturned = null;
      }
   }

   protected void listableChanged(CursorableLinkedList$Listable elt) {
      if (super._lastReturned == elt) {
         super._lastReturned = null;
      }
   }

   protected void checkForComod() {
      if (!this._valid) {
         throw new ConcurrentModificationException();
      }
   }

   protected void invalidate() {
      this._valid = false;
   }

   public void close() {
      if (this._valid) {
         this._valid = false;
         this.this$0.unregisterCursor(this);
      }
   }
}
