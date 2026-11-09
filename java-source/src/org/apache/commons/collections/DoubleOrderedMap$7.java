package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class DoubleOrderedMap$7 extends AbstractSet {
   DoubleOrderedMap$7(DoubleOrderedMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new DoubleOrderedMap$8(this, 0);
   }

   public int size() {
      return this.this$0.size();
   }

   public boolean contains(Object o) {
      return this.this$0.containsKey(o);
   }

   public boolean remove(Object o) {
      int oldNodeCount = DoubleOrderedMap.access$500(this.this$0);
      this.this$0.remove(o);
      return DoubleOrderedMap.access$500(this.this$0) != oldNodeCount;
   }

   public void clear() {
      this.this$0.clear();
   }
}
