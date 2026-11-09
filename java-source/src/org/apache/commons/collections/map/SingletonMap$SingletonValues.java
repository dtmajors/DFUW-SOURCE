package org.apache.commons.collections.map;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import org.apache.commons.collections.iterators.SingletonIterator;

class SingletonMap$SingletonValues extends AbstractSet implements Serializable {
   private static final long serialVersionUID = -3689524741863047872L;
   private final SingletonMap parent;

   SingletonMap$SingletonValues(SingletonMap parent) {
      this.parent = parent;
   }

   public int size() {
      return 1;
   }

   public boolean isEmpty() {
      return false;
   }

   public boolean contains(Object object) {
      return this.parent.containsValue(object);
   }

   public void clear() {
      throw new UnsupportedOperationException();
   }

   public Iterator iterator() {
      return new SingletonIterator(this.parent.getValue(), false);
   }
}
