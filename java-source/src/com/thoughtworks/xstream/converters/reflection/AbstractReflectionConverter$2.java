package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Set;

class AbstractReflectionConverter$2 implements ReflectionProvider$Visitor {
   AbstractReflectionConverter$2(AbstractReflectionConverter var1, Set var2, Object var3, MarshallingContext var4, Set var5, HierarchicalStreamWriter var6) {
      this.this$0 = var1;
      this.val$seenAsAttributes = var2;
      this.val$source = var3;
      this.val$context = var4;
      this.val$seenFields = var5;
      this.val$writer = var6;
   }

   public void visit(String fieldName, Class fieldType, Class definedIn, Object newObj) {
      if (!this.val$seenAsAttributes.contains(fieldName) && newObj != null) {
         ImplicitCollectionMapping mapping = this.this$0.mapper.getImplicitCollectionDefForFieldName(this.val$source.getClass(), fieldName);
         if (mapping != null) {
            if (mapping.getItemFieldName() != null) {
               for (Object obj : (Collection)newObj) {
                  this.writeField(fieldName, mapping.getItemFieldName(), mapping.getItemType(), definedIn, obj);
               }
            } else {
               this.val$context.convertAnother(newObj);
            }
         } else {
            this.writeField(fieldName, fieldName, fieldType, definedIn, newObj);
            this.val$seenFields.add(fieldName);
         }
      }
   }

   private void writeField(String fieldName, String aliasName, Class fieldType, Class definedIn, Object newObj) {
      if (this.this$0.mapper.shouldSerializeMember(definedIn, aliasName)) {
         ExtendedHierarchicalStreamWriterHelper.startNode(this.val$writer, this.this$0.mapper.serializedMember(definedIn, aliasName), fieldType);
         Class actualType = newObj.getClass();
         Class defaultType = this.this$0.mapper.defaultImplementationOf(fieldType);
         if (!actualType.equals(defaultType)) {
            this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute("class"), this.this$0.mapper.serializedClass(actualType));
         }

         if (this.val$seenFields.contains(aliasName)) {
            this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute("defined-in"), this.this$0.mapper.serializedClass(definedIn));
         }

         Field field = this.this$0.reflectionProvider.getField(definedIn, fieldName);
         this.this$0.marshallField(this.val$context, newObj, field);
         this.val$writer.endNode();
      }
   }
}
