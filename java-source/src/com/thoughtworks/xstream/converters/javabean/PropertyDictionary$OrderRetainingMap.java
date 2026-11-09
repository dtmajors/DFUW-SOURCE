package com.thoughtworks.xstream.converters.javabean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class PropertyDictionary$OrderRetainingMap extends HashMap {
   private List valueOrder = new ArrayList();

   private PropertyDictionary$OrderRetainingMap() {
   }

   public Object put(Object key, Object value) {
      this.valueOrder.add(value);
      return super.put(key, value);
   }

   public Collection values() {
      return Collections.unmodifiableList(this.valueOrder);
   }
}
