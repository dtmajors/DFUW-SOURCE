package org.apache.commons.collections;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class ReferenceMap$2 extends AbstractSet {
   ReferenceMap$2(ReferenceMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public Iterator iterator() {
      return new ReferenceMap$KeyIterator(this.this$0, null);
   }

   public boolean contains(Object o) {
      return this.this$0.containsKey(o);
   }

   public boolean remove(Object o) {
      Object r = this.this$0.remove(o);
      return r != null;
   }

   public void clear() {
      this.this$0.clear();
   }

   public Object[] toArray() {
      return this.toArray(new Object[0]);
   }

   public Object[] toArray(Object[] array) {
      Collection c = new ArrayList(this.size());
      Iterator it = this.iterator();

      while (it.hasNext()) {
         c.add(it.next());
      }

      return c.toArray(array);
   }
}
