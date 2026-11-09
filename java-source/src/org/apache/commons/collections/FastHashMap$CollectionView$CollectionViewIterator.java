package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class FastHashMap$CollectionView$CollectionViewIterator implements Iterator {
   private Map expected;
   private Entry lastReturned;
   private Iterator iterator;

   public FastHashMap$CollectionView$CollectionViewIterator(FastHashMap$CollectionView this$1) {
      this.this$1 = this$1;
      this.lastReturned = null;
      this.expected = FastHashMap$CollectionView.access$300(this$1).map;
      this.iterator = this.expected.entrySet().iterator();
   }

   public boolean hasNext() {
      if (this.expected != FastHashMap$CollectionView.access$300(this.this$1).map) {
         throw new ConcurrentModificationException();
      } else {
         return this.iterator.hasNext();
      }
   }

   public Object next() {
      if (this.expected != FastHashMap$CollectionView.access$300(this.this$1).map) {
         throw new ConcurrentModificationException();
      }

      this.lastReturned = (Entry)this.iterator.next();
      return this.this$1.iteratorNext(this.lastReturned);
   }

   public void remove() {
      if (this.lastReturned == null) {
         throw new IllegalStateException();
      }

      if (FastHashMap$CollectionView.access$300(this.this$1).fast) {
         synchronized (FastHashMap$CollectionView.access$300(this.this$1)) {
            if (this.expected != FastHashMap$CollectionView.access$300(this.this$1).map) {
               throw new ConcurrentModificationException();
            }

            FastHashMap$CollectionView.access$300(this.this$1).remove(this.lastReturned.getKey());
            this.lastReturned = null;
            this.expected = FastHashMap$CollectionView.access$300(this.this$1).map;
         }
      } else {
         this.iterator.remove();
         this.lastReturned = null;
      }
   }
}
