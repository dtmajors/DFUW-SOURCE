package org.apache.commons.collections.map;

public class AbstractHashedMap$KeySetIterator extends AbstractHashedMap$EntrySetIterator {
   protected AbstractHashedMap$KeySetIterator(AbstractHashedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry().getKey();
   }
}
