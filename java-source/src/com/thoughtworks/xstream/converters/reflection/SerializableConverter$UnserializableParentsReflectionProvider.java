package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor;

class SerializableConverter$UnserializableParentsReflectionProvider extends ReflectionProviderWrapper {
   public SerializableConverter$UnserializableParentsReflectionProvider(ReflectionProvider reflectionProvider) {
      super(reflectionProvider);
   }

   public void visitSerializableFields(Object object, Visitor visitor) {
      this.wrapped.visitSerializableFields(object, new SerializableConverter$UnserializableParentsReflectionProvider$1(this, visitor));
   }
}
