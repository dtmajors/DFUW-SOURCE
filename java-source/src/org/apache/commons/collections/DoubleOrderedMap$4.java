package org.apache.commons.collections;

class DoubleOrderedMap$4 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$4(DoubleOrderedMap$3 this$1, int x0) {
      super(DoubleOrderedMap$3.access$400(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return DoubleOrderedMap$Node.access$200(super.lastReturnedNode, 0);
   }
}
