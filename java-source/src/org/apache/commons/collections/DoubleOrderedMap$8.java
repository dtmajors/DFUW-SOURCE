package org.apache.commons.collections;

class DoubleOrderedMap$8 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$8(DoubleOrderedMap$7 this$1, int x0) {
      super(DoubleOrderedMap$7.access$1900(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return DoubleOrderedMap$Node.access$200(super.lastReturnedNode, 0);
   }
}
