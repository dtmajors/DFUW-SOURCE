package org.apache.commons.collections;

import java.util.Iterator;

class BeanMap$10 implements Iterator {
   BeanMap$10(BeanMap this$0, Iterator val$iter) {
      this.this$0 = this$0;
      this.val$iter = val$iter;
   }

   public boolean hasNext() {
      return this.val$iter.hasNext();
   }

   public Object next() {
      Object key = this.val$iter.next();
      return this.this$0.get(key);
   }

   public void remove() {
      throw new UnsupportedOperationException("remove() not supported for BeanMap");
   }
}
