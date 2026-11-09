package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class DoubleOrderedMap$DoubleOrderedMapIterator implements Iterator {
   private int expectedModifications;
   protected DoubleOrderedMap$Node lastReturnedNode;
   private DoubleOrderedMap$Node nextNode;
   private int iteratorType;

   DoubleOrderedMap$DoubleOrderedMapIterator(DoubleOrderedMap this$0, int type) {
      this.this$0 = this$0;
      this.iteratorType = type;
      this.expectedModifications = DoubleOrderedMap.access$2200(this$0);
      this.lastReturnedNode = null;
      this.nextNode = DoubleOrderedMap.access$2400(DoubleOrderedMap.access$2300(this$0)[this.iteratorType], this.iteratorType);
   }

   protected abstract Object doGetNext();

   public final boolean hasNext() {
      return this.nextNode != null;
   }

   public final Object next() throws NoSuchElementException, ConcurrentModificationException {
      if (this.nextNode == null) {
         throw new NoSuchElementException();
      }

      if (DoubleOrderedMap.access$2200(this.this$0) != this.expectedModifications) {
         throw new ConcurrentModificationException();
      }

      this.lastReturnedNode = this.nextNode;
      this.nextNode = DoubleOrderedMap.access$2500(this.this$0, this.nextNode, this.iteratorType);
      return this.doGetNext();
   }

   public final void remove() throws IllegalStateException, ConcurrentModificationException {
      if (this.lastReturnedNode == null) {
         throw new IllegalStateException();
      }

      if (DoubleOrderedMap.access$2200(this.this$0) != this.expectedModifications) {
         throw new ConcurrentModificationException();
      }

      DoubleOrderedMap.access$300(this.this$0, this.lastReturnedNode);
      this.expectedModifications++;
      this.lastReturnedNode = null;
   }
}
