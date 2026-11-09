package org.apache.commons.collections.set;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

class ListOrderedSet$OrderedSetIterator extends AbstractIteratorDecorator {
   protected final Collection set;
   protected Object last;

   private ListOrderedSet$OrderedSetIterator(Iterator iterator, Collection set) {
      super(iterator);
      this.set = set;
   }

   public Object next() {
      this.last = super.iterator.next();
      return this.last;
   }

   public void remove() {
      this.set.remove(this.last);
      super.iterator.remove();
      this.last = null;
   }
}
