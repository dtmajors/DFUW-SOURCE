package com.thoughtworks.xstream.mapper;

import java.util.HashMap;
import java.util.Map;

class ImplicitCollectionMapper$ImplicitCollectionMapperForClass {
   private Map namedItemTypeToDef = new HashMap();
   private Map itemFieldNameToDef = new HashMap();
   private Map fieldNameToDef = new HashMap();

   private ImplicitCollectionMapper$ImplicitCollectionMapperForClass() {
   }

   public String getFieldNameForItemTypeAndName(Class itemType, String itemFieldName) {
      ImplicitCollectionMapper$ImplicitCollectionMappingImpl unnamed = null;

      for (ImplicitCollectionMapper$NamedItemType itemTypeForFieldName : this.namedItemTypeToDef.keySet()) {
         if (itemTypeForFieldName.itemType.isAssignableFrom(itemType)) {
            ImplicitCollectionMapper$ImplicitCollectionMappingImpl def = (ImplicitCollectionMapper$ImplicitCollectionMappingImpl)this.namedItemTypeToDef
               .get(itemTypeForFieldName);
            if (def.getItemFieldName() != null) {
               if (def.getItemFieldName().equals(itemFieldName)) {
                  return def.getFieldName();
               }
            } else {
               unnamed = def;
               if (itemFieldName == null) {
                  break;
               }
            }
         }
      }

      return unnamed != null ? unnamed.getFieldName() : null;
   }

   public Class getItemTypeForItemFieldName(String itemFieldName) {
      ImplicitCollectionMapper$ImplicitCollectionMappingImpl def = this.getImplicitCollectionDefByItemFieldName(itemFieldName);
      return def != null ? def.getItemType() : null;
   }

   private ImplicitCollectionMapper$ImplicitCollectionMappingImpl getImplicitCollectionDefByItemFieldName(String itemFieldName) {
      return itemFieldName == null ? null : (ImplicitCollectionMapper$ImplicitCollectionMappingImpl)this.itemFieldNameToDef.get(itemFieldName);
   }

   public ImplicitCollectionMapper$ImplicitCollectionMappingImpl getImplicitCollectionDefByFieldName(String fieldName) {
      return (ImplicitCollectionMapper$ImplicitCollectionMappingImpl)this.fieldNameToDef.get(fieldName);
   }

   public Mapper$ImplicitCollectionMapping getImplicitCollectionDefForFieldName(String fieldName) {
      return (Mapper$ImplicitCollectionMapping)this.fieldNameToDef.get(fieldName);
   }

   public void add(ImplicitCollectionMapper$ImplicitCollectionMappingImpl def) {
      this.fieldNameToDef.put(def.getFieldName(), def);
      this.namedItemTypeToDef.put(def.createNamedItemType(), def);
      if (def.getItemFieldName() != null) {
         this.itemFieldNameToDef.put(def.getItemFieldName(), def);
      }
   }
}
