package org.apache.commons.collections.map;

public class AbstractLinkedMap$KeySetIterator extends AbstractLinkedMap$EntrySetIterator {
   protected AbstractLinkedMap$KeySetIterator(AbstractLinkedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry().getKey();
   }

   public Object previous() {
      return super.previousEntry().getKey();
   }
}
