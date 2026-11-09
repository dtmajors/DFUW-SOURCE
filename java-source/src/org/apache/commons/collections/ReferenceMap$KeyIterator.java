package org.apache.commons.collections;

class ReferenceMap$KeyIterator extends ReferenceMap$EntryIterator {
   private ReferenceMap$KeyIterator(ReferenceMap this$0) {
      super(this$0);
      this.this$0 = this$0;
   }

   public Object next() {
      return this.nextEntry().getKey();
   }
}
