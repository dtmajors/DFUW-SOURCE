package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class SequencedHashMap$OrderedIterator implements Iterator {
   private int returnType;
   private SequencedHashMap$Entry pos;
   private transient long expectedModCount;

   public SequencedHashMap$OrderedIterator(SequencedHashMap this$0, int returnType) {
      this.this$0 = this$0;
      this.pos = SequencedHashMap.access$100(this.this$0);
      this.expectedModCount = SequencedHashMap.access$300(this.this$0);
      this.returnType = returnType | -2147483648;
   }

   public boolean hasNext() {
      return this.pos.next != SequencedHashMap.access$100(this.this$0);
   }

   public Object next() {
      if (SequencedHashMap.access$300(this.this$0) != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      if (this.pos.next == SequencedHashMap.access$100(this.this$0)) {
         throw new NoSuchElementException();
      }

      this.returnType &= Integer.MAX_VALUE;
      this.pos = this.pos.next;
      switch (this.returnType) {
         case 0:
            return this.pos.getKey();
         case 1:
            return this.pos.getValue();
         case 2:
            return this.pos;
         default:
            throw new Error("bad iterator type: " + this.returnType);
      }
   }

   public void remove() {
      if ((this.returnType & -2147483648) != 0) {
         throw new IllegalStateException("remove() must follow next()");
      }

      if (SequencedHashMap.access$300(this.this$0) != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }

      SequencedHashMap.access$000(this.this$0, this.pos.getKey());
      this.expectedModCount++;
      this.returnType |= Integer.MIN_VALUE;
   }
}
