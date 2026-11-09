package org.apache.commons.collections.list;

import java.util.ConcurrentModificationException;

public class CursorableLinkedList$Cursor extends AbstractLinkedList$LinkedListIterator {
   boolean valid = true;
   boolean nextIndexValid = true;

   protected CursorableLinkedList$Cursor(CursorableLinkedList parent, int index) {
      super(parent, index);
      this.valid = true;
   }

   public void add(Object obj) {
      super.add(obj);
      super.next = super.next.next;
   }

   public int nextIndex() {
      if (!this.nextIndexValid) {
         if (super.next == super.parent.header) {
            super.nextIndex = super.parent.size();
         } else {
            int pos = 0;

            for (AbstractLinkedList$Node temp = super.parent.header.next; temp != super.next; temp = temp.next) {
               pos++;
            }

            super.nextIndex = pos;
         }

         this.nextIndexValid = true;
      }

      return super.nextIndex;
   }

   protected void nodeChanged(AbstractLinkedList$Node node) {
   }

   protected void nodeRemoved(AbstractLinkedList$Node node) {
      if (node == super.next) {
         super.next = node.next;
      } else if (node == super.current) {
         super.current = null;
         super.nextIndex--;
      } else {
         this.nextIndexValid = false;
      }
   }

   protected void nodeInserted(AbstractLinkedList$Node node) {
      if (node.previous == super.current) {
         super.next = node;
      } else if (super.next.previous == node) {
         super.next = node;
      } else {
         this.nextIndexValid = false;
      }
   }

   protected void checkModCount() {
      if (!this.valid) {
         throw new ConcurrentModificationException("Cursor closed");
      }
   }

   public void close() {
      if (this.valid) {
         ((CursorableLinkedList)super.parent).unregisterCursor(this);
         this.valid = false;
      }
   }
}
