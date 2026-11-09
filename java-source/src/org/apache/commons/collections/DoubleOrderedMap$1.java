package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class DoubleOrderedMap$1 extends AbstractSet {
   DoubleOrderedMap$1(DoubleOrderedMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new DoubleOrderedMap$2(this, 1);
   }

   public boolean contains(Object o) {
      if (!(o instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)o;
      Object key = entry.getKey();
      DoubleOrderedMap$Node node = DoubleOrderedMap.access$100(this.this$0, (Comparable)entry.getValue(), 1);
      return node != null && DoubleOrderedMap$Node.access$200(node, 0).equals(key);
   }

   public boolean remove(Object o) {
      if (!(o instanceof Entry)) {
         return false;
      } else {
         Entry entry = (Entry)o;
         Object key = entry.getKey();
         DoubleOrderedMap$Node node = DoubleOrderedMap.access$100(this.this$0, (Comparable)entry.getValue(), 1);
         if (node != null && DoubleOrderedMap$Node.access$200(node, 0).equals(key)) {
            DoubleOrderedMap.access$300(this.this$0, node);
            return true;
         } else {
            return false;
         }
      }
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }
}
