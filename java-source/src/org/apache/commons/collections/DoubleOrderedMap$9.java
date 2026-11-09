package org.apache.commons.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class DoubleOrderedMap$9 extends AbstractCollection {
   DoubleOrderedMap$9(DoubleOrderedMap this$0) {
      this.this$0 = this$0;
   }

   public Iterator iterator() {
      return new DoubleOrderedMap$10(this, 0);
   }

   public int size() {
      return this.this$0.size();
   }

   public boolean contains(Object o) {
      return this.this$0.containsValue(o);
   }

   public boolean remove(Object o) {
      int oldNodeCount = DoubleOrderedMap.access$500(this.this$0);
      this.this$0.removeValue(o);
      return DoubleOrderedMap.access$500(this.this$0) != oldNodeCount;
   }

   public boolean removeAll(Collection c) {
      boolean modified = false;
      Iterator iter = c.iterator();

      while (iter.hasNext()) {
         if (this.this$0.removeValue(iter.next()) != null) {
            modified = true;
         }
      }

      return modified;
   }

   public void clear() {
      this.this$0.clear();
   }
}
