package org.apache.commons.collections.bidimap;

import java.util.Map.Entry;
import org.apache.commons.collections.keyvalue.AbstractMapEntryDecorator;

public class AbstractDualBidiMap$MapEntry extends AbstractMapEntryDecorator {
   protected final AbstractDualBidiMap parent;

   protected AbstractDualBidiMap$MapEntry(Entry entry, AbstractDualBidiMap parent) {
      super(entry);
      this.parent = parent;
   }

   public Object setValue(Object value) {
      Object key = this.getKey();
      if (this.parent.maps[1].containsKey(value) && this.parent.maps[1].get(value) != key) {
         throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
      }

      this.parent.put(key, value);
      return super.setValue(value);
   }
}
