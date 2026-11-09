package org.apache.commons.collections;

import java.util.Iterator;

class BeanMap$11 implements Iterator {
   BeanMap$11(BeanMap this$0, Iterator val$iter) {
      this.this$0 = this$0;
      this.val$iter = val$iter;
   }

   public boolean hasNext() {
      return this.val$iter.hasNext();
   }

   public Object next() {
      Object key = this.val$iter.next();
      Object value = this.this$0.get(key);
      return new BeanMap$MyMapEntry(this.this$0, key, value);
   }

   public void remove() {
      throw new UnsupportedOperationException("remove() not supported for BeanMap");
   }
}
