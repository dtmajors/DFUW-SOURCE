package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.util.Set;

class AbstractReflectionConverter$1 implements ReflectionProvider$Visitor {
   AbstractReflectionConverter$1(AbstractReflectionConverter var1, HierarchicalStreamWriter var2, Set var3) {
      this.this$0 = var1;
      this.val$writer = var2;
      this.val$seenAsAttributes = var3;
   }

   public void visit(String fieldName, Class type, Class definedIn, Object value) {
      SingleValueConverter converter = this.this$0.mapper.getConverterFromItemType(fieldName, type, definedIn);
      if (converter == null) {
         converter = this.this$0.mapper.getConverterFromItemType(fieldName, type);
      }

      if (converter == null) {
         converter = this.this$0.mapper.getConverterFromItemType(type);
      }

      if (converter != null) {
         if (value != null) {
            String str = converter.toString(value);
            if (str != null) {
               this.val$writer.addAttribute(this.this$0.mapper.aliasForAttribute(definedIn, fieldName), str);
            }
         }

         this.val$seenAsAttributes.add(fieldName);
      }
   }
}
