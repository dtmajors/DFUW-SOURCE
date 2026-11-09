package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

public class AbstractDualBidiMap$EntrySetIterator extends AbstractIteratorDecorator {
   protected final AbstractDualBidiMap parent;
   protected Entry last = null;
   protected boolean canRemove = false;

   protected AbstractDualBidiMap$EntrySetIterator(Iterator iterator, AbstractDualBidiMap parent) {
      super(iterator);
      this.parent = parent;
   }

   public Object next() {
      this.last = new AbstractDualBidiMap$MapEntry((Entry)super.next(), this.parent);
      this.canRemove = true;
      return this.last;
   }

   public void remove() {
      if (!this.canRemove) {
         throw new IllegalStateException("Iterator remove() can only be called once after next()");
      }

      Object value = this.last.getValue();
      super.remove();
      this.parent.maps[1].remove(value);
      this.last = null;
      this.canRemove = false;
   }
}
