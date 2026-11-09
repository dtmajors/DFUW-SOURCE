package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map.Entry;

class StaticBucketMap$EntryIterator implements Iterator {
   private ArrayList current;
   private int bucket;
   private Entry last;

   private StaticBucketMap$EntryIterator(StaticBucketMap this$0) {
      this.this$0 = this$0;
      this.current = new ArrayList();
   }

   public boolean hasNext() {
      if (this.current.size() > 0) {
         return true;
      }

      while (this.bucket < StaticBucketMap.access$500(this.this$0).length) {
         synchronized (StaticBucketMap.access$600(this.this$0)[this.bucket]) {
            for (StaticBucketMap$Node n = StaticBucketMap.access$500(this.this$0)[this.bucket]; n != null; n = n.next) {
               this.current.add(n);
            }

            this.bucket++;
            if (this.current.size() > 0) {
               return true;
            }
         }
      }

      return false;
   }

   protected Entry nextEntry() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.last = (Entry)this.current.remove(this.current.size() - 1);
      return this.last;
   }

   public Object next() {
      return this.nextEntry();
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      }

      this.this$0.remove(this.last.getKey());
      this.last = null;
   }
}
