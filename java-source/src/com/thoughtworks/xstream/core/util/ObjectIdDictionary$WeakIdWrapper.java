package com.thoughtworks.xstream.core.util;

import java.lang.ref.WeakReference;

class ObjectIdDictionary$WeakIdWrapper implements ObjectIdDictionary$Wrapper {
   private final int hashCode;
   private final WeakReference ref;

   public ObjectIdDictionary$WeakIdWrapper(ObjectIdDictionary var1, Object obj) {
      this.this$0 = var1;
      this.hashCode = System.identityHashCode(obj);
      this.ref = new WeakReference<>(obj);
   }

   public int hashCode() {
      return this.hashCode;
   }

   public boolean equals(Object other) {
      return this.get() == ((ObjectIdDictionary$Wrapper)other).get();
   }

   public String toString() {
      Object obj = this.get();
      return obj == null ? "(null)" : obj.toString();
   }

   public Object get() {
      Object obj = this.ref.get();
      if (obj == null) {
         ObjectIdDictionary.access$004(this.this$0);
      }

      return obj;
   }
}
