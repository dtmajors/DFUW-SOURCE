package com.thoughtworks.xstream.io.binary;

import com.thoughtworks.xstream.io.StreamException;
import java.util.HashMap;
import java.util.Map;

class BinaryStreamReader$IdRegistry {
   private Map map = new HashMap();

   private BinaryStreamReader$IdRegistry() {
   }

   public void put(long id, String value) {
      this.map.put(new Long(id), value);
   }

   public String get(long id) {
      String result = (String)this.map.get(new Long(id));
      if (result == null) {
         throw new StreamException("Unknown ID : " + id);
      } else {
         return result;
      }
   }
}
