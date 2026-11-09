package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class BeanMap$9 extends AbstractSet {
   BeanMap$9(BeanMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return this.this$0.entryIterator();
   }

   public int size() {
      return BeanMap.access$000(this.this$0).size();
   }
}
