package org.apache.commons.collections;

import java.io.Serializable;

class CursorableLinkedList$Listable implements Serializable {
   private CursorableLinkedList$Listable _prev = null;
   private CursorableLinkedList$Listable _next = null;
   private Object _val = null;

   CursorableLinkedList$Listable(CursorableLinkedList$Listable prev, CursorableLinkedList$Listable next, Object val) {
      this._prev = prev;
      this._next = next;
      this._val = val;
   }

   CursorableLinkedList$Listable next() {
      return this._next;
   }

   CursorableLinkedList$Listable prev() {
      return this._prev;
   }

   Object value() {
      return this._val;
   }

   void setNext(CursorableLinkedList$Listable next) {
      this._next = next;
   }

   void setPrev(CursorableLinkedList$Listable prev) {
      this._prev = prev;
   }

   Object setValue(Object val) {
      Object temp = this._val;
      this._val = val;
      return temp;
   }
}
