package com.thoughtworks.xstream.converters.reflection;

class CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider extends ReflectionProviderWrapper {
   public CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider(ReflectionProvider reflectionProvider) {
      super(reflectionProvider);
   }

   public void visitSerializableFields(Object object, ReflectionProvider$Visitor visitor) {
      this.wrapped.visitSerializableFields(object, new CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider$1(this, visitor));
   }
}
