package org.apache.commons.collections.map;

class StaticBucketMap$ValueIterator extends StaticBucketMap$EntryIterator {
   private StaticBucketMap$ValueIterator(StaticBucketMap this$0) {
      super(this$0, null);
      this.this$0 = this$0;
   }

   public Object next() {
      return this.nextEntry().getValue();
   }
}
