package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class SequencedHashMap$1 extends AbstractSet {
   SequencedHashMap$1(SequencedHashMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new SequencedHashMap$OrderedIterator(this.this$0, 0);
   }

   public boolean remove(Object o) {
      SequencedHashMap$Entry e = SequencedHashMap.access$000(this.this$0, o);
      return e != null;
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
      return this.this$0.containsKey(o);
   }
}
