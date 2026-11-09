package org.apache.commons.collections.bidimap;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.collections.OrderedIterator;
import org.apache.commons.collections.keyvalue.UnmodifiableMapEntry;

class TreeBidiMap$ViewIterator implements OrderedIterator {
   protected final TreeBidiMap main;
   protected final int orderType;
   protected final int dataType;
   protected TreeBidiMap$Node lastReturnedNode;
   protected TreeBidiMap$Node nextNode;
   protected TreeBidiMap$Node previousNode;
   private int expectedModifications;

   TreeBidiMap$ViewIterator(TreeBidiMap main, int orderType, int dataType) {
      this.main = main;
      this.orderType = orderType;
      this.dataType = dataType;
      this.expectedModifications = TreeBidiMap.access$1600(main);
      this.nextNode = TreeBidiMap.access$1800(TreeBidiMap.access$1700(main)[orderType], orderType);
      this.lastReturnedNode = null;
      this.previousNode = null;
   }

   public final boolean hasNext() {
      return this.nextNode != null;
   }

   public final Object next() {
      if (this.nextNode == null) {
         throw new NoSuchElementException();
      }

      if (TreeBidiMap.access$1600(this.main) != this.expectedModifications) {
         throw new ConcurrentModificationException();
      }

      this.lastReturnedNode = this.nextNode;
      this.previousNode = this.nextNode;
      this.nextNode = TreeBidiMap.access$1900(this.main, this.nextNode, this.orderType);
      return this.doGetData();
   }

   public boolean hasPrevious() {
      return this.previousNode != null;
   }

   public Object previous() {
      if (this.previousNode == null) {
         throw new NoSuchElementException();
      }

      if (TreeBidiMap.access$1600(this.main) != this.expectedModifications) {
         throw new ConcurrentModificationException();
      }

      this.nextNode = this.lastReturnedNode;
      if (this.nextNode == null) {
         this.nextNode = TreeBidiMap.access$1900(this.main, this.previousNode, this.orderType);
      }

      this.lastReturnedNode = this.previousNode;
      this.previousNode = TreeBidiMap.access$2000(this.main, this.previousNode, this.orderType);
      return this.doGetData();
   }

   protected Object doGetData() {
      switch (this.dataType) {
         case 0:
            return this.lastReturnedNode.getKey();
         case 1:
            return this.lastReturnedNode.getValue();
         case 2:
            return this.lastReturnedNode;
         case 3:
            return new UnmodifiableMapEntry(this.lastReturnedNode.getValue(), this.lastReturnedNode.getKey());
         default:
            return null;
      }
   }

   public final void remove() {
      if (this.lastReturnedNode == null) {
         throw new IllegalStateException();
      }

      if (TreeBidiMap.access$1600(this.main) != this.expectedModifications) {
         throw new ConcurrentModificationException();
      }

      TreeBidiMap.access$2100(this.main, this.lastReturnedNode);
      this.expectedModifications++;
      this.lastReturnedNode = null;
      if (this.nextNode == null) {
         this.previousNode = TreeBidiMap.access$2200(TreeBidiMap.access$1700(this.main)[this.orderType], this.orderType);
      } else {
         this.previousNode = TreeBidiMap.access$2000(this.main, this.nextNode, this.orderType);
      }
   }
}
