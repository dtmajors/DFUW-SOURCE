package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class DoubleOrderedMap$3 extends AbstractSet {
   DoubleOrderedMap$3(DoubleOrderedMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new DoubleOrderedMap$4(this, 1);
   }

   public int size() {
      return this.this$0.size();
   }

   public boolean contains(Object o) {
      return this.this$0.containsKey(o);
   }

   public boolean remove(Object o) {
      int oldnodeCount = DoubleOrderedMap.access$500(this.this$0);
      this.this$0.remove(o);
      return DoubleOrderedMap.access$500(this.this$0) != oldnodeCount;
   }

   public void clear() {
      this.this$0.clear();
   }
}
