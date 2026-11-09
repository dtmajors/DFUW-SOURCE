package com.thoughtworks.xstream.core.util;

class ObjectIdDictionary$IdWrapper implements ObjectIdDictionary$Wrapper {
   private final Object obj;

   public ObjectIdDictionary$IdWrapper(Object obj) {
      this.obj = obj;
   }

   public int hashCode() {
      return System.identityHashCode(this.obj);
   }

   public boolean equals(Object other) {
      return this.obj == ((ObjectIdDictionary$Wrapper)other).get();
   }

   public String toString() {
      return this.obj.toString();
   }

   public Object get() {
      return this.obj;
   }
}
