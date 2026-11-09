package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.collections.bidimap.AbstractDualBidiMap.View;

public class AbstractDualBidiMap$EntrySet extends View implements Set {
   protected AbstractDualBidiMap$EntrySet(AbstractDualBidiMap parent) {
      super(parent.maps[0].entrySet(), parent);
   }

   public Iterator iterator() {
      return super.parent.createEntrySetIterator(super.iterator());
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)obj;
      Object key = entry.getKey();
      if (super.parent.containsKey(key)) {
         Object value = super.parent.maps[0].get(key);
         if (value == null ? entry.getValue() == null : value.equals(entry.getValue())) {
            super.parent.maps[0].remove(key);
            super.parent.maps[1].remove(value);
            return true;
         }
      }

      return false;
   }
}
