package org.apache.commons.collections.map;

class AbstractReferenceMap$ReferenceKeySetIterator extends AbstractReferenceMap$ReferenceEntrySetIterator {
   AbstractReferenceMap$ReferenceKeySetIterator(AbstractReferenceMap parent) {
      super(parent);
   }

   public Object next() {
      return this.nextEntry().getKey();
   }
}
