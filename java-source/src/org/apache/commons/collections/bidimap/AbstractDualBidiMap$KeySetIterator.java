package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

public class AbstractDualBidiMap$KeySetIterator extends AbstractIteratorDecorator {
   protected final AbstractDualBidiMap parent;
   protected Object lastKey = null;
   protected boolean canRemove = false;

   protected AbstractDualBidiMap$KeySetIterator(Iterator iterator, AbstractDualBidiMap parent) {
      super(iterator);
      this.parent = parent;
   }

   public Object next() {
      this.lastKey = super.next();
      this.canRemove = true;
      return this.lastKey;
   }

   public void remove() {
      if (!this.canRemove) {
         throw new IllegalStateException("Iterator remove() can only be called once after next()");
      }

      Object value = this.parent.maps[0].get(this.lastKey);
      super.remove();
      this.parent.maps[1].remove(value);
      this.lastKey = null;
      this.canRemove = false;
   }
}
