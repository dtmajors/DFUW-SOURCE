package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Map.Entry;
import org.apache.commons.collections.keyvalue.DefaultMapEntry;

class AbstractReferenceMap$ReferenceEntrySet extends AbstractHashedMap$EntrySet {
   protected AbstractReferenceMap$ReferenceEntrySet(AbstractHashedMap parent) {
      super(parent);
   }

   public Object[] toArray() {
      return this.toArray(new Object[0]);
   }

   public Object[] toArray(Object[] arr) {
      ArrayList list = new ArrayList();

      for (Entry e : this) {
         list.add(new DefaultMapEntry(e.getKey(), e.getValue()));
      }

      return list.toArray(arr);
   }
}
