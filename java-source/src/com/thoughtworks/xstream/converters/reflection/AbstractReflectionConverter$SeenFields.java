package com.thoughtworks.xstream.converters.reflection;

import java.util.HashSet;
import java.util.Set;

class AbstractReflectionConverter$SeenFields {
   private Set seen = new HashSet();

   private AbstractReflectionConverter$SeenFields() {
   }

   public void add(Class definedInCls, String fieldName) {
      String uniqueKey = fieldName;
      if (definedInCls != null) {
         uniqueKey = uniqueKey + " [" + definedInCls.getName() + "]";
      }

      if (this.seen.contains(uniqueKey)) {
         throw new AbstractReflectionConverter$DuplicateFieldException(uniqueKey);
      }

      this.seen.add(uniqueKey);
   }
}
