package org.apache.commons.collections.map;

import java.util.AbstractCollection;
import java.util.Iterator;

public class AbstractHashedMap$Values extends AbstractCollection {
   protected final AbstractHashedMap parent;

   protected AbstractHashedMap$Values(AbstractHashedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean contains(Object value) {
      return this.parent.containsValue(value);
   }

   public Iterator iterator() {
      return this.parent.createValuesIterator();
   }
}
