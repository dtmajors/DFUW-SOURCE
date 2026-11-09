package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.Iterator;

class MultiHashMap$Values extends AbstractCollection {
   private MultiHashMap$Values(MultiHashMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new MultiHashMap$ValueIterator(this.this$0, null);
   }

   public int size() {
      int compt = 0;

      for (Iterator it = this.iterator(); it.hasNext(); compt++) {
         it.next();
      }

      return compt;
   }

   public void clear() {
      this.this$0.clear();
   }
}
