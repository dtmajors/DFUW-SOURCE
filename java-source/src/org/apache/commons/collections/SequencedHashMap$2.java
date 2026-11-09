package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.Iterator;

class SequencedHashMap$2 extends AbstractCollection {
   SequencedHashMap$2(SequencedHashMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new SequencedHashMap$OrderedIterator(this.this$0, 1);
   }

   public boolean remove(Object value) {
      if (value == null) {
         for (SequencedHashMap$Entry pos = SequencedHashMap.access$100(this.this$0).next; pos != SequencedHashMap.access$100(this.this$0); pos = pos.next) {
            if (pos.getValue() == null) {
               SequencedHashMap.access$000(this.this$0, pos.getKey());
               return true;
            }
         }
      } else {
         for (SequencedHashMap$Entry pos = SequencedHashMap.access$100(this.this$0).next; pos != SequencedHashMap.access$100(this.this$0); pos = pos.next) {
            if (value.equals(pos.getValue())) {
               SequencedHashMap.access$000(this.this$0, pos.getKey());
               return true;
            }
         }
      }

      return false;
   }

   public void clear() {
      this.this$0.clear();
   }

   public int size() {
      return this.this$0.size();
   }

   public boolean isEmpty() {
      return this.this$0.isEmpty();
   }

   public boolean contains(Object o) {
      return this.this$0.containsValue(o);
   }
}
