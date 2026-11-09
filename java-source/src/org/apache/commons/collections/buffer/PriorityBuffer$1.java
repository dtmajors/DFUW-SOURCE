package org.apache.commons.collections.buffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

class PriorityBuffer$1 implements Iterator {
   private int index;
   private int lastReturnedIndex;

   PriorityBuffer$1(PriorityBuffer this$0) {
      this.this$0 = this$0;
      this.index = 1;
      this.lastReturnedIndex = -1;
   }

   public boolean hasNext() {
      return this.index <= this.this$0.size;
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.lastReturnedIndex = this.index++;
      return this.this$0.elements[this.lastReturnedIndex];
   }

   public void remove() {
      if (this.lastReturnedIndex == -1) {
         throw new IllegalStateException();
      }

      this.this$0.elements[this.lastReturnedIndex] = this.this$0.elements[this.this$0.size];
      this.this$0.elements[this.this$0.size] = null;
      this.this$0.size--;
      if (this.this$0.size != 0 && this.lastReturnedIndex <= this.this$0.size) {
         int compareToParent = 0;
         if (this.lastReturnedIndex > 1) {
            compareToParent = this.this$0.compare(this.this$0.elements[this.lastReturnedIndex], this.this$0.elements[this.lastReturnedIndex / 2]);
         }

         if (this.this$0.ascendingOrder) {
            if (this.lastReturnedIndex > 1 && compareToParent < 0) {
               this.this$0.percolateUpMinHeap(this.lastReturnedIndex);
            } else {
               this.this$0.percolateDownMinHeap(this.lastReturnedIndex);
            }
         } else if (this.lastReturnedIndex > 1 && compareToParent > 0) {
            this.this$0.percolateUpMaxHeap(this.lastReturnedIndex);
         } else {
            this.this$0.percolateDownMaxHeap(this.lastReturnedIndex);
         }
      }

      this.index--;
      this.lastReturnedIndex = -1;
   }
}
