package org.apache.commons.collections.map;

import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

class AbstractInputCheckedMapDecorator$EntrySetIterator extends AbstractIteratorDecorator {
   private final AbstractInputCheckedMapDecorator parent;

   protected AbstractInputCheckedMapDecorator$EntrySetIterator(Iterator iterator, AbstractInputCheckedMapDecorator parent) {
      super(iterator);
      this.parent = parent;
   }

   public Object next() {
      Entry entry = (Entry)super.iterator.next();
      return new AbstractInputCheckedMapDecorator$MapEntry(entry, this.parent);
   }
}
