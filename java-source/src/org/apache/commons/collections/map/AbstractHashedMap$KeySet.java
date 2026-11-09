package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;

public class AbstractHashedMap$KeySet extends AbstractSet {
   protected final AbstractHashedMap parent;

   protected AbstractHashedMap$KeySet(AbstractHashedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean contains(Object key) {
      return this.parent.containsKey(key);
   }

   public boolean remove(Object key) {
      boolean result = this.parent.containsKey(key);
      this.parent.remove(key);
      return result;
   }

   public Iterator iterator() {
      return this.parent.createKeySetIterator();
   }
}
