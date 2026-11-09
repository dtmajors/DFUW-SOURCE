package org.apache.commons.collections.map;

class Flat3Map$ValuesIterator extends Flat3Map$EntrySetIterator {
   Flat3Map$ValuesIterator(Flat3Map parent) {
      super(parent);
   }

   public Object next() {
      super.next();
      return this.getValue();
   }
}
