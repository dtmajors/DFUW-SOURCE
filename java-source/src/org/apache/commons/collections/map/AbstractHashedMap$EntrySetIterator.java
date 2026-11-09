package org.apache.commons.collections.map;

public class AbstractHashedMap$EntrySetIterator extends AbstractHashedMap$HashIterator {
   protected AbstractHashedMap$EntrySetIterator(AbstractHashedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry();
   }
}
