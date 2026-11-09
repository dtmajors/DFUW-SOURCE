package org.apache.commons.collections.map;

public class AbstractLinkedMap$EntrySetIterator extends AbstractLinkedMap$LinkIterator {
   protected AbstractLinkedMap$EntrySetIterator(AbstractLinkedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry();
   }

   public Object previous() {
      return super.previousEntry();
   }
}
