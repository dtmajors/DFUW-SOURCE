package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class SequencedHashMap$3 extends AbstractSet {
   SequencedHashMap$3(SequencedHashMap this$0) {
      this.this$0 = this$0;
   }

   private SequencedHashMap$Entry findEntry(Object o) {
      if (o == null) {
         return null;
      }

      if (!(o instanceof Entry)) {
         return null;
      }

      Entry e = (Entry)o;
      SequencedHashMap$Entry entry = (SequencedHashMap$Entry)SequencedHashMap.access$200(this.this$0).get(e.getKey());
      return entry != null && entry.equals(e) ? entry : null;
   }

   public Iterator iterator() {
      return new SequencedHashMap$OrderedIterator(this.this$0, 2);
   }

   public boolean remove(Object o) {
      SequencedHashMap$Entry e = this.findEntry(o);
      return e == null ? false : SequencedHashMap.access$000(this.this$0, e.getKey()) != null;
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
      return this.findEntry(o) != null;
   }
}
