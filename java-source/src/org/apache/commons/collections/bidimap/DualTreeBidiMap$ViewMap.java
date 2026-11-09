package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.SortedMap;
import org.apache.commons.collections.map.AbstractSortedMapDecorator;

public class DualTreeBidiMap$ViewMap extends AbstractSortedMapDecorator {
   final DualTreeBidiMap bidi = (DualTreeBidiMap)this.map;

   protected DualTreeBidiMap$ViewMap(DualTreeBidiMap bidi, SortedMap sm) {
      super((SortedMap)bidi.createBidiMap(sm, bidi.maps[1], bidi.inverseBidiMap));
   }

   public boolean containsValue(Object value) {
      return this.bidi.maps[0].containsValue(value);
   }

   public void clear() {
      Iterator it = this.keySet().iterator();

      while (it.hasNext()) {
         it.next();
         it.remove();
      }
   }

   public SortedMap headMap(Object toKey) {
      return new DualTreeBidiMap$ViewMap(this.bidi, super.headMap(toKey));
   }

   public SortedMap tailMap(Object fromKey) {
      return new DualTreeBidiMap$ViewMap(this.bidi, super.tailMap(fromKey));
   }

   public SortedMap subMap(Object fromKey, Object toKey) {
      return new DualTreeBidiMap$ViewMap(this.bidi, super.subMap(fromKey, toKey));
   }
}
