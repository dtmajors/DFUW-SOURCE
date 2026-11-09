package org.apache.commons.collections.map;

import java.util.Map.Entry;
import org.apache.commons.collections.keyvalue.AbstractMapEntryDecorator;

final class UnmodifiableEntrySet$UnmodifiableEntry extends AbstractMapEntryDecorator {
   protected UnmodifiableEntrySet$UnmodifiableEntry(Entry entry) {
      super(entry);
   }

   public Object setValue(Object obj) {
      throw new UnsupportedOperationException();
   }
}
