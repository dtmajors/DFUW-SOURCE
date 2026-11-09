package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.Set;

public class AbstractDualBidiMap$Values extends AbstractDualBidiMap$View implements Set {
   protected AbstractDualBidiMap$Values(AbstractDualBidiMap parent) {
      super(parent.maps[0].values(), parent);
   }

   public Iterator iterator() {
      return super.parent.createValuesIterator(super.iterator());
   }

   public boolean contains(Object value) {
      return super.parent.maps[1].containsKey(value);
   }

   public boolean remove(Object value) {
      if (super.parent.maps[1].containsKey(value)) {
         Object key = super.parent.maps[1].remove(value);
         super.parent.maps[0].remove(key);
         return true;
      } else {
         return false;
      }
   }
}
