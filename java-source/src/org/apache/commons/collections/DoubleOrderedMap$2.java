package org.apache.commons.collections;

class DoubleOrderedMap$2 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$2(DoubleOrderedMap$1 this$1, int x0) {
      super(DoubleOrderedMap$1.access$000(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return super.lastReturnedNode;
   }
}
