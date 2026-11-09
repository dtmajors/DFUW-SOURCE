package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

public class AbstractDualBidiMap$ValuesIterator extends AbstractIteratorDecorator {
   protected final AbstractDualBidiMap parent;
   protected Object lastValue = null;
   protected boolean canRemove = false;

   protected AbstractDualBidiMap$ValuesIterator(Iterator iterator, AbstractDualBidiMap parent) {
      super(iterator);
      this.parent = parent;
   }

   public Object next() {
      this.lastValue = super.next();
      this.canRemove = true;
      return this.lastValue;
   }

   public void remove() {
      if (!this.canRemove) {
         throw new IllegalStateException("Iterator remove() can only be called once after next()");
      }

      super.remove();
      this.parent.maps[1].remove(this.lastValue);
      this.lastValue = null;
      this.canRemove = false;
   }
}
