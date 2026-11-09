package org.apache.commons.collections.list;

import java.util.ListIterator;
import org.apache.commons.collections.iterators.AbstractListIteratorDecorator;

class FixedSizeList$FixedSizeListIterator extends AbstractListIteratorDecorator {
   protected FixedSizeList$FixedSizeListIterator(ListIterator iterator) {
      super(iterator);
   }

   public void remove() {
      throw new UnsupportedOperationException("List is fixed size");
   }

   public void add(Object object) {
      throw new UnsupportedOperationException("List is fixed size");
   }
}
