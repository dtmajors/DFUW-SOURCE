package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class ReferenceMap$3 extends AbstractCollection {
   ReferenceMap$3(ReferenceMap this$0) {
      this.this$0 = this$0;
   }

   public int size() {
      return this.this$0.size();
   }

   public void clear() {
      this.this$0.clear();
   }

   public Iterator iterator() {
      return new ReferenceMap$ValueIterator(this.this$0, null);
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
