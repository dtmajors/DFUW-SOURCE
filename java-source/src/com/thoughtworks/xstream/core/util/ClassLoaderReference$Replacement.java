package com.thoughtworks.xstream.core.util;

class ClassLoaderReference$Replacement {
   private Object readResolve() {
      return new ClassLoaderReference(new CompositeClassLoader());
   }
}
