package org.apache.commons.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

class FastHashMap$Values extends FastHashMap$CollectionView {
   private FastHashMap$Values(FastHashMap this$0) {
      super(this$0);
      this.this$0 = this$0;
   }

   protected Collection get(Map map) {
      return map.values();
   }

   protected Object iteratorNext(Entry entry) {
      return entry.getValue();
   }
}
