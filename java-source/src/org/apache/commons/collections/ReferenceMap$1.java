package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

class ReferenceMap$1 extends AbstractSet {
   ReferenceMap$1(ReferenceMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }

   public boolean contains(Object o) {
      if (o == null) {
         return false;
      }

      if (!(o instanceof Entry)) {
         return false;
      }

      Entry e = (Entry)o;
      ReferenceMap$Entry e2 = ReferenceMap.access$000(this.this$0, e.getKey());
      return e2 != null && e.equals(e2);
   }

   public boolean remove(Object o) {
      boolean r = this.contains(o);
      if (r) {
         Entry e = (Entry)o;
         this.this$0.remove(e.getKey());
      }

      return r;
   }

   public Iterator iterator() {
      return new ReferenceMap$EntryIterator(this.this$0);
   }

   public Object[] toArray() {
      return this.toArray(new Object[0]);
   }

   public Object[] toArray(Object[] arr) {
      ArrayList list = new ArrayList();

      for (ReferenceMap$Entry e : this) {
         list.add(new org.apache.commons.collections.keyvalue.DefaultMapEntry(e.getKey(), e.getValue()));
      }

      return list.toArray(arr);
   }
}
