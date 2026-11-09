package org.apache.commons.collections.map;

import java.util.AbstractCollection;
import java.util.Iterator;

class ListOrderedMap$ValuesView extends AbstractCollection {
   private final ListOrderedMap parent;

   ListOrderedMap$ValuesView(ListOrderedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public boolean contains(Object value) {
      return this.parent.containsValue(value);
   }

   public void clear() {
      this.parent.clear();
   }

   public Iterator iterator() {
      return new ListOrderedMap$1(this, this.parent.entrySet().iterator());
   }
}
