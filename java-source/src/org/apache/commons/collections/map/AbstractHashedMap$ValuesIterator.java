package org.apache.commons.collections.map;

public class AbstractHashedMap$ValuesIterator extends AbstractHashedMap$HashIterator {
   protected AbstractHashedMap$ValuesIterator(AbstractHashedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry().getValue();
   }
}
