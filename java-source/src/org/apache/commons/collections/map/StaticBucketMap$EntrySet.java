package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class StaticBucketMap$EntrySet extends AbstractSet {
   private StaticBucketMap$EntrySet(StaticBucketMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }

   public Iterator iterator() {
      return new StaticBucketMap$EntryIterator(this.this$0, null);
   }

   public boolean contains(Object obj) {
      Entry entry = (Entry)obj;
      int hash = StaticBucketMap.access$800(this.this$0, entry.getKey());
      synchronized (StaticBucketMap.access$600(this.this$0)[hash]) {
         for (StaticBucketMap$Node n = StaticBucketMap.access$500(this.this$0)[hash]; n != null; n = n.next) {
            if (n.equals(entry)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)obj;
      int hash = StaticBucketMap.access$800(this.this$0, entry.getKey());
      synchronized (StaticBucketMap.access$600(this.this$0)[hash]) {
         for (StaticBucketMap$Node n = StaticBucketMap.access$500(this.this$0)[hash]; n != null; n = n.next) {
            if (n.equals(entry)) {
               this.this$0.remove(n.getKey());
               return true;
            }
         }

         return false;
      }
   }
}
