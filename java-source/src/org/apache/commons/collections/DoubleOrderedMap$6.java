package org.apache.commons.collections;

class DoubleOrderedMap$6 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$6(DoubleOrderedMap$5 this$1, int x0) {
      super(DoubleOrderedMap$5.access$600(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return DoubleOrderedMap$Node.access$200(super.lastReturnedNode, 1);
   }
}
