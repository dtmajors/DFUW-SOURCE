package org.apache.commons.collections.map;

import org.apache.commons.collections.OrderedMapIterator;

public class AbstractLinkedMap$LinkMapIterator extends AbstractLinkedMap$LinkIterator implements OrderedMapIterator {
   protected AbstractLinkedMap$LinkMapIterator(AbstractLinkedMap parent) {
      super(parent);
   }

   public Object next() {
      return super.nextEntry().getKey();
   }

   public Object previous() {
      return super.previousEntry().getKey();
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
