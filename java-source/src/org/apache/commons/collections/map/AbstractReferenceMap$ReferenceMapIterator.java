package org.apache.commons.collections.map;

import org.apache.commons.collections.MapIterator;

class AbstractReferenceMap$ReferenceMapIterator extends AbstractReferenceMap$ReferenceEntrySetIterator implements MapIterator {
   protected AbstractReferenceMap$ReferenceMapIterator(AbstractReferenceMap parent) {
      super(parent);
   }

   public Object next() {
      return this.nextEntry().getKey();
   }

   public Object getKey() {
      AbstractHashedMap$HashEntry current = this.currentEntry();
      if (current == null) {
         throw new IllegalStateException("getKey() can only be called after next() and before remove()");
      } else {
         return current.getKey();
      }
   }

   public Object getValue() {
      AbstractHashedMap$HashEntry current = this.currentEntry();
      if (current == null) {
         throw new IllegalStateException("getValue() can only be called after next() and before remove()");
      } else {
         return current.getValue();
      }
   }

   public Object setValue(Object value) {
      AbstractHashedMap$HashEntry current = this.currentEntry();
      if (current == null) {
         throw new IllegalStateException("setValue() can only be called after next() and before remove()");
      } else {
         return current.setValue(value);
      }
   }
}
