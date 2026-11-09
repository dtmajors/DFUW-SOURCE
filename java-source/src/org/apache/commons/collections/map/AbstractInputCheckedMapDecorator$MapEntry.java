package org.apache.commons.collections.map;

import java.util.Map.Entry;
import org.apache.commons.collections.keyvalue.AbstractMapEntryDecorator;

class AbstractInputCheckedMapDecorator$MapEntry extends AbstractMapEntryDecorator {
   private final AbstractInputCheckedMapDecorator parent;

   protected AbstractInputCheckedMapDecorator$MapEntry(Entry entry, AbstractInputCheckedMapDecorator parent) {
      super(entry);
      this.parent = parent;
   }

   public Object setValue(Object value) {
      value = this.parent.checkSetValue(value);
      return super.entry.setValue(value);
   }
}
