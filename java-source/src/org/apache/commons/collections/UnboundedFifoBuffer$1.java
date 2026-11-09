package org.apache.commons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

class UnboundedFifoBuffer$1 implements Iterator {
   private int index;
   private int lastReturnedIndex;

   UnboundedFifoBuffer$1(UnboundedFifoBuffer this$0) {
      this.this$0 = this$0;
      this.index = this.this$0.m_head;
      this.lastReturnedIndex = -1;
   }

   public boolean hasNext() {
      return this.index != this.this$0.m_tail;
   }

   public Object next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.lastReturnedIndex = this.index;
      this.index = UnboundedFifoBuffer.access$000(this.this$0, this.index);
      return this.this$0.m_buffer[this.lastReturnedIndex];
   }

   public void remove() {
      if (this.lastReturnedIndex == -1) {
         throw new IllegalStateException();
      }

      if (this.lastReturnedIndex == this.this$0.m_head) {
         this.this$0.remove();
         this.lastReturnedIndex = -1;
      } else {
         int i = this.lastReturnedIndex + 1;

         while (i != this.this$0.m_tail) {
            if (i >= this.this$0.m_buffer.length) {
               this.this$0.m_buffer[i - 1] = this.this$0.m_buffer[0];
               i = 0;
            } else {
               this.this$0.m_buffer[i - 1] = this.this$0.m_buffer[i];
               i++;
            }
         }

         this.lastReturnedIndex = -1;
         this.this$0.m_tail = UnboundedFifoBuffer.access$100(this.this$0, this.this$0.m_tail);
         this.this$0.m_buffer[this.this$0.m_tail] = null;
         this.index = UnboundedFifoBuffer.access$100(this.this$0, this.index);
      }
   }
}
