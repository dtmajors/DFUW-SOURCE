package org.apache.commons.collections.list;

import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

class SetUniqueList$SetListIterator extends AbstractIteratorDecorator {
   protected final Set set;
   protected Object last = null;

   protected SetUniqueList$SetListIterator(Iterator it, Set set) {
      super(it);
      this.set = set;
   }

   public Object next() {
      this.last = super.next();
      return this.last;
   }

   public void remove() {
      super.remove();
      this.set.remove(this.last);
      this.last = null;
   }
}
