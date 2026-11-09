package com.thoughtworks.xstream.io.binary;

import java.util.HashMap;
import java.util.Map;

class BinaryStreamWriter$IdRegistry {
   private long nextId;
   private Map ids;

   private BinaryStreamWriter$IdRegistry(BinaryStreamWriter var1) {
      this.this$0 = var1;
      this.nextId = 0L;
      this.ids = new HashMap();
   }

   public long getId(String value) {
      Long id = (Long)this.ids.get(value);
      if (id == null) {
         id = new Long(++this.nextId);
         this.ids.put(value, id);
         BinaryStreamWriter.access$100(this.this$0, new Token$MapIdToValue(id, value));
      }

      return id;
   }
}
