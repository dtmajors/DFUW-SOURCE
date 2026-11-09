package org.apache.commons.collections.map;

class Flat3Map$KeySetIterator extends Flat3Map$EntrySetIterator {
   Flat3Map$KeySetIterator(Flat3Map parent) {
      super(parent);
   }

   public Object next() {
      super.next();
      return this.getKey();
   }
}
