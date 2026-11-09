package org.apache.commons.collections.buffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

class UnboundedFifoBuffer$1 implements Iterator {
   private int index;
   private int lastReturnedIndex;

   UnboundedFifoBuffer$1(UnboundedFifoBuffer this$0) {
      this.this$0 = this$0;
      this.index = this.this$0.head;
      this.lastReturnedIndex = -1;
   }

   public boolean hasNext() {
      return this.index != this.this$0.tail;
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.lastReturnedIndex = this.index;
      this.index = UnboundedFifoBuffer.access$000(this.this$0, this.index);
      return this.this$0.buffer[this.lastReturnedIndex];
   }

   public void remove() {
      if (this.lastReturnedIndex == -1) {
         throw new IllegalStateException();
      }

      if (this.lastReturnedIndex == this.this$0.head) {
         this.this$0.remove();
         this.lastReturnedIndex = -1;
      } else {
         int i = this.lastReturnedIndex + 1;

         while (i != this.this$0.tail) {
            if (i >= this.this$0.buffer.length) {
               this.this$0.buffer[i - 1] = this.this$0.buffer[0];
               i = 0;
            } else {
               this.this$0.buffer[i - 1] = this.this$0.buffer[i];
               i++;
            }
         }

         this.lastReturnedIndex = -1;
         this.this$0.tail = UnboundedFifoBuffer.access$100(this.this$0, this.this$0.tail);
         this.this$0.buffer[this.this$0.tail] = null;
         this.index = UnboundedFifoBuffer.access$100(this.this$0, this.index);
      }
   }
}
