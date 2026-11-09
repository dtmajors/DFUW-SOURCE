package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;

class ListOrderedMap$KeySetView extends AbstractSet {
   private final ListOrderedMap parent;

   ListOrderedMap$KeySetView(ListOrderedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public boolean contains(Object value) {
      return this.parent.containsKey(value);
   }

   public void clear() {
      this.parent.clear();
   }

   public Iterator iterator() {
      return new ListOrderedMap$2(this, this.parent.entrySet().iterator());
   }
}
