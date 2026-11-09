package org.apache.commons.collections.bag;

import java.util.Set;
import org.apache.commons.collections.set.SynchronizedSet;

class SynchronizedBag$SynchronizedBagSet extends SynchronizedSet {
   SynchronizedBag$SynchronizedBagSet(SynchronizedBag this$0, Set set, Object lock) {
      super(set, lock);
      this.this$0 = this$0;
   }
}
