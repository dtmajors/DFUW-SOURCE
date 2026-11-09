package org.apache.commons.collections.map;

class AbstractReferenceMap$ReferenceValuesIterator extends AbstractReferenceMap$ReferenceEntrySetIterator {
   AbstractReferenceMap$ReferenceValuesIterator(AbstractReferenceMap parent) {
      super(parent);
   }

   public Object next() {
      return this.nextEntry().getValue();
   }
}
