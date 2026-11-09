package com.thoughtworks.xstream.core.util;

import java.util.Iterator;

class PrioritizedList$PrioritizedItemIterator implements Iterator {
   private Iterator iterator;

   public PrioritizedList$PrioritizedItemIterator(Iterator iterator) {
      this.iterator = iterator;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      return this.iterator.hasNext();
   }

   public Object next() {
      return ((PrioritizedList$PrioritizedItem)this.iterator.next()).value;
   }
}
