package org.apache.commons.collections.buffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

class BoundedFifoBuffer$1 implements Iterator {
   private int index;
   private int lastReturnedIndex;
   private boolean isFirst;

   BoundedFifoBuffer$1(BoundedFifoBuffer this$0) {
      this.this$0 = this$0;
      this.index = BoundedFifoBuffer.access$000(this.this$0);
      this.lastReturnedIndex = -1;
      this.isFirst = BoundedFifoBuffer.access$100(this.this$0);
   }

   public boolean hasNext() {
      return this.isFirst || this.index != BoundedFifoBuffer.access$200(this.this$0);
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.isFirst = false;
      this.lastReturnedIndex = this.index;
      this.index = BoundedFifoBuffer.access$300(this.this$0, this.index);
      return BoundedFifoBuffer.access$400(this.this$0)[this.lastReturnedIndex];
   }

   public void remove() {
      if (this.lastReturnedIndex == -1) {
         throw new IllegalStateException();
      }

      if (this.lastReturnedIndex == BoundedFifoBuffer.access$000(this.this$0)) {
         this.this$0.remove();
         this.lastReturnedIndex = -1;
      } else {
         int i = this.lastReturnedIndex + 1;

         while (i != BoundedFifoBuffer.access$200(this.this$0)) {
            if (i >= BoundedFifoBuffer.access$500(this.this$0)) {
               BoundedFifoBuffer.access$400(this.this$0)[i - 1] = BoundedFifoBuffer.access$400(this.this$0)[0];
               i = 0;
            } else {
               BoundedFifoBuffer.access$400(this.this$0)[i - 1] = BoundedFifoBuffer.access$400(this.this$0)[i];
               i++;
            }
         }

         this.lastReturnedIndex = -1;
         BoundedFifoBuffer.access$202(this.this$0, BoundedFifoBuffer.access$600(this.this$0, BoundedFifoBuffer.access$200(this.this$0)));
         BoundedFifoBuffer.access$400(this.this$0)[BoundedFifoBuffer.access$200(this.this$0)] = null;
         BoundedFifoBuffer.access$102(this.this$0, false);
         this.index = BoundedFifoBuffer.access$600(this.this$0, this.index);
      }
   }
}
