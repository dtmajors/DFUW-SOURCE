package org.apache.commons.collections.map;

public class AbstractLinkedMap$ValuesIterator extends AbstractLinkedMap$LinkIterator {
   protected AbstractLinkedMap$ValuesIterator(AbstractLinkedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry().getValue();
   }

   public Object previous() {
      return super.previousEntry().getValue();
   }
}
