package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor;

class SerializableConverter$UnserializableParentsReflectionProvider$1 implements Visitor {
   SerializableConverter$UnserializableParentsReflectionProvider$1(SerializableConverter$UnserializableParentsReflectionProvider var1, Visitor var2) {
      this.this$0 = var1;
      this.val$visitor = var2;
   }

   public void visit(String name, Class type, Class definedIn, Object value) {
      if (!(SerializableConverter.class$java$io$Serializable == null
            ? (SerializableConverter.class$java$io$Serializable = SerializableConverter.class$("java.io.Serializable"))
            : SerializableConverter.class$java$io$Serializable)
         .isAssignableFrom(definedIn)) {
         this.val$visitor.visit(name, type, definedIn, value);
      }
   }
}
