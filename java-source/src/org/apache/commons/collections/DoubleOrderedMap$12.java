package org.apache.commons.collections;

class DoubleOrderedMap$12 extends DoubleOrderedMap$DoubleOrderedMapIterator {
   DoubleOrderedMap$12(DoubleOrderedMap$11 this$1, int x0) {
      super(DoubleOrderedMap$11.access$2100(this$1), x0);
      this.this$1 = this$1;
   }

   protected Object doGetNext() {
      return super.lastReturnedNode;
   }
}
