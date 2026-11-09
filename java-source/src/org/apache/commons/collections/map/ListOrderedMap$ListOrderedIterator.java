package org.apache.commons.collections.map;

import java.util.List;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

class ListOrderedMap$ListOrderedIterator extends AbstractIteratorDecorator {
   private final ListOrderedMap parent;
   private Object last = null;

   ListOrderedMap$ListOrderedIterator(ListOrderedMap parent, List insertOrder) {
      super(insertOrder.iterator());
      this.parent = parent;
   }

   public Object next() {
      this.last = super.next();
      return new ListOrderedMap$ListOrderedMapEntry(this.parent, this.last);
   }

   public void remove() {
      super.remove();
      this.parent.getMap().remove(this.last);
   }
}
