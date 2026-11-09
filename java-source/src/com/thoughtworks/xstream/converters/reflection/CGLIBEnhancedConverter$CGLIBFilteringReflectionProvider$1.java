package com.thoughtworks.xstream.converters.reflection;

class CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider$1 implements ReflectionProvider$Visitor {
   CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider$1(CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider var1, ReflectionProvider$Visitor var2) {
      this.this$0 = var1;
      this.val$visitor = var2;
   }

   public void visit(String name, Class type, Class definedIn, Object value) {
      if (!name.startsWith("CGLIB$")) {
         this.val$visitor.visit(name, type, definedIn, value);
      }
   }
}
