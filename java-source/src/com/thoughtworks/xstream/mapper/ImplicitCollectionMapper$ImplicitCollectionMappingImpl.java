package com.thoughtworks.xstream.mapper;

class ImplicitCollectionMapper$ImplicitCollectionMappingImpl implements Mapper$ImplicitCollectionMapping {
   private String fieldName;
   private String itemFieldName;
   private Class itemType;

   ImplicitCollectionMapper$ImplicitCollectionMappingImpl(String fieldName, Class itemType, String itemFieldName) {
      this.fieldName = fieldName;
      this.itemFieldName = itemFieldName;
      this.itemType = itemType;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof ImplicitCollectionMapper$ImplicitCollectionMappingImpl)) {
         return false;
      }

      ImplicitCollectionMapper$ImplicitCollectionMappingImpl b = (ImplicitCollectionMapper$ImplicitCollectionMappingImpl)obj;
      return this.fieldName.equals(b.fieldName) && isEquals(this.itemFieldName, b.itemFieldName);
   }

   public ImplicitCollectionMapper$NamedItemType createNamedItemType() {
      return new ImplicitCollectionMapper$NamedItemType(this.itemType, this.itemFieldName);
   }

   private static boolean isEquals(Object a, Object b) {
      return a == null ? b == null : a.equals(b);
   }

   public int hashCode() {
      int hash = this.fieldName.hashCode();
      if (this.itemFieldName != null) {
         hash += this.itemFieldName.hashCode() << 7;
      }

      return hash;
   }

   public String getFieldName() {
      return this.fieldName;
   }

   public String getItemFieldName() {
      return this.itemFieldName;
   }

   public Class getItemType() {
      return this.itemType;
   }
}
