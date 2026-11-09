package org.apache.commons.collections;

class DoubleOrderedMap$10 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$10(DoubleOrderedMap$9 this$1, int x0) {
      super(DoubleOrderedMap$9.access$2000(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return DoubleOrderedMap$Node.access$200(super.lastReturnedNode, 1);
   }
}
