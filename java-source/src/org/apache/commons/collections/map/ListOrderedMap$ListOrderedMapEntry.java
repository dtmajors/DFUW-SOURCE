package org.apache.commons.collections.map;

import org.apache.commons.collections.keyvalue.AbstractMapEntry;

class ListOrderedMap$ListOrderedMapEntry extends AbstractMapEntry {
   private final ListOrderedMap parent;

   ListOrderedMap$ListOrderedMapEntry(ListOrderedMap parent, Object key) {
      super(key, null);
      this.parent = parent;
   }

   public Object getValue() {
      return this.parent.get(super.key);
   }

   public Object setValue(Object value) {
      return this.parent.getMap().put(super.key, value);
   }
}
