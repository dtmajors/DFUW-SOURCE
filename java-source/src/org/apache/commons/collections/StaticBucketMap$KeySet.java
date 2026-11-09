package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class StaticBucketMap$KeySet extends AbstractSet {
   private StaticBucketMap$KeySet(StaticBucketMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }

   public Iterator iterator() {
      return new StaticBucketMap$KeyIterator(this.this$0, null);
   }

   public boolean contains(Object o) {
      return this.this$0.containsKey(o);
   }

   public boolean remove(Object o) {
      int hash = StaticBucketMap.access$800(this.this$0, o);
      synchronized (StaticBucketMap.access$600(this.this$0)[hash]) {
         for (StaticBucketMap$Node n = StaticBucketMap.access$500(this.this$0)[hash]; n != null; n = n.next) {
            Object k = n.getKey();
            if (k == o || k != null && k.equals(o)) {
               this.this$0.remove(k);
               return true;
            }
         }

         return false;
      }
   }
}
