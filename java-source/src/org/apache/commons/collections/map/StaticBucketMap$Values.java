package org.apache.commons.collections.map;

import java.util.AbstractCollection;
import java.util.Iterator;

class StaticBucketMap$Values extends AbstractCollection {
   private StaticBucketMap$Values(StaticBucketMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }

   public Iterator iterator() {
      return new StaticBucketMap$ValueIterator(this.this$0, null);
   }
}
