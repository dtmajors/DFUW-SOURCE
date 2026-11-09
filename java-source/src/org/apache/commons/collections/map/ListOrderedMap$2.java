package org.apache.commons.collections.map;

import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

class ListOrderedMap$2 extends AbstractIteratorDecorator {
   ListOrderedMap$2(ListOrderedMap$KeySetView this$0, Iterator x0) {
      super(x0);
      this.this$0 = this$0;
   }

   public Object next() {
      return ((Entry)super.next()).getKey();
   }
}
