package org.apache.commons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

class BinaryHeap$1 implements Iterator {
   private int index;
   private int lastReturnedIndex;

   BinaryHeap$1(BinaryHeap this$0) {
      this.this$0 = this$0;
      this.index = 1;
      this.lastReturnedIndex = -1;
   }

   public boolean hasNext() {
      return this.index <= this.this$0.m_size;
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.lastReturnedIndex = this.index++;
      return this.this$0.m_elements[this.lastReturnedIndex];
   }

   public void remove() {
      if (this.lastReturnedIndex == -1) {
         throw new IllegalStateException();
      }

      this.this$0.m_elements[this.lastReturnedIndex] = this.this$0.m_elements[this.this$0.m_size];
      this.this$0.m_elements[this.this$0.m_size] = null;
      this.this$0.m_size--;
      if (this.this$0.m_size != 0 && this.lastReturnedIndex <= this.this$0.m_size) {
         int compareToParent = 0;
         if (this.lastReturnedIndex > 1) {
            compareToParent = BinaryHeap.access$000(
               this.this$0, this.this$0.m_elements[this.lastReturnedIndex], this.this$0.m_elements[this.lastReturnedIndex / 2]
            );
         }

         if (this.this$0.m_isMinHeap) {
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
