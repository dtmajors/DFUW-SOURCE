package org.apache.commons.collections.map;

import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;

final class UnmodifiableEntrySet$UnmodifiableEntrySetIterator extends AbstractIteratorDecorator {
   protected UnmodifiableEntrySet$UnmodifiableEntrySetIterator(Iterator iterator) {
      super(iterator);
   }

   public Object next() {
      Entry entry = (Entry)super.iterator.next();
      return new UnmodifiableEntrySet$UnmodifiableEntry(entry);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
