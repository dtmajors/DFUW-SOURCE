package org.apache.commons.collections;

import org.apache.commons.collections.keyvalue.AbstractMapEntry;

public class BeanMap$MyMapEntry extends AbstractMapEntry {
   private BeanMap owner;

   protected BeanMap$MyMapEntry(BeanMap owner, Object key, Object value) {
      super(key, value);
      this.owner = owner;
   }

   public Object setValue(Object value) {
      Object key = this.getKey();
      Object oldValue = this.owner.get(key);
      this.owner.put(key, value);
      Object newValue = this.owner.get(key);
      super.setValue(newValue);
      return oldValue;
   }
}
