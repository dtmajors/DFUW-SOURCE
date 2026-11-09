package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections.bidimap.AbstractDualBidiMap.View;

public class AbstractDualBidiMap$KeySet extends View implements Set {
   protected AbstractDualBidiMap$KeySet(AbstractDualBidiMap parent) {
      super(parent.maps[0].keySet(), parent);
   }

   public Iterator iterator() {
      return super.parent.createKeySetIterator(super.iterator());
   }

   public boolean contains(Object key) {
      return super.parent.maps[0].containsKey(key);
   }

   public boolean remove(Object key) {
      if (super.parent.maps[0].containsKey(key)) {
         Object value = super.parent.maps[0].remove(key);
         super.parent.maps[1].remove(value);
         return true;
      } else {
         return false;
      }
   }
}
