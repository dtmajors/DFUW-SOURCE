package com.thoughtworks.xstream.mapper;

class AttributeAliasingMapper$AliasInfo {
   private final Class definedIn;
   private final String alias;

   public AttributeAliasingMapper$AliasInfo(AttributeAliasingMapper var1, Class definedIn, String alias) {
      this.this$0 = var1;
      this.definedIn = definedIn;
      this.alias = alias;
   }

   public int hashCode() {
      return this.alias.hashCode() * this.definedIn.hashCode();
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof AttributeAliasingMapper$AliasInfo)) {
         return false;
      }

      AttributeAliasingMapper$AliasInfo info = (AttributeAliasingMapper$AliasInfo)obj;
      return info.alias.equals(this.alias) && this.definedIn.equals(info.definedIn);
   }
}
