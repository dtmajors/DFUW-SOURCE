package com.thoughtworks.xstream.mapper;

class ImplicitCollectionMapper$NamedItemType {
   Class itemType;
   String itemFieldName;

   ImplicitCollectionMapper$NamedItemType(Class itemType, String itemFieldName) {
      this.itemType = itemType;
      this.itemFieldName = itemFieldName;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof ImplicitCollectionMapper$NamedItemType)) {
         return false;
      }

      ImplicitCollectionMapper$NamedItemType b = (ImplicitCollectionMapper$NamedItemType)obj;
      return this.itemType.equals(b.itemType) && isEquals(this.itemFieldName, b.itemFieldName);
   }

   private static boolean isEquals(Object a, Object b) {
      return a == null ? b == null : a.equals(b);
   }

   public int hashCode() {
      int hash = this.itemType.hashCode() << 7;
      if (this.itemFieldName != null) {
         hash += this.itemFieldName.hashCode();
      }

      return hash;
   }
}
