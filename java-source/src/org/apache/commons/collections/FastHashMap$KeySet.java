package org.apache.commons.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class FastHashMap$KeySet extends FastHashMap$CollectionView implements Set {
   private FastHashMap$KeySet(FastHashMap this$0) {
      super(this$0);
      this.this$0 = this$0;
   }

   protected Collection get(Map map) {
      return map.keySet();
   }

   protected Object iteratorNext(Entry entry) {
      return entry.getKey();
   }
}
