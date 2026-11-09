package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AbstractReferenceMap$ReferenceValues extends AbstractHashedMap$Values {
   protected AbstractReferenceMap$ReferenceValues(AbstractHashedMap parent) {
      super(parent);
   }

   public Object[] toArray() {
      return this.toArray(new Object[0]);
   }

   public Object[] toArray(Object[] arr) {
      List list = new ArrayList(super.parent.size());
      Iterator it = this.iterator();

      while (it.hasNext()) {
         list.add(it.next());
      }

      return list.toArray(arr);
   }
}
