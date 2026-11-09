package org.apache.commons.collections;

class ReferenceMap$ValueIterator extends ReferenceMap$EntryIterator {
   private ReferenceMap$ValueIterator(ReferenceMap this$0) {
      super(this$0);
      this.this$0 = this$0;
   }

   public Object next() {
      return this.nextEntry().getValue();
   }
}
