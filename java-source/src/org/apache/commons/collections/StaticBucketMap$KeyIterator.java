package org.apache.commons.collections;

class StaticBucketMap$KeyIterator extends StaticBucketMap$EntryIterator {
   private StaticBucketMap$KeyIterator(StaticBucketMap this$0) {
      super(this$0, null);
      this.this$0 = this$0;
   }

   public Object next() {
      return this.nextEntry().getKey();
   }
}
