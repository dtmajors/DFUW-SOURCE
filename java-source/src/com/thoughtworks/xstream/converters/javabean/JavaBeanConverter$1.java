package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

class JavaBeanConverter$1 implements BeanProvider$Visitor {
   JavaBeanConverter$1(JavaBeanConverter var1, HierarchicalStreamWriter var2, Object var3, MarshallingContext var4) {
      this.this$0 = var1;
      this.val$writer = var2;
      this.val$source = var3;
      this.val$context = var4;
   }

   public void visit(String propertyName, Class fieldType, Object newObj) {
      if (newObj != null) {
         this.writeField(propertyName, fieldType, newObj);
      }
   }

   private void writeField(String propertyName, Class fieldType, Object newObj) {
      ExtendedHierarchicalStreamWriterHelper.startNode(
         this.val$writer, JavaBeanConverter.access$000(this.this$0).serializedMember(this.val$source.getClass(), propertyName), fieldType
      );
      Class actualType = newObj.getClass();
      Class defaultType = JavaBeanConverter.access$000(this.this$0).defaultImplementationOf(fieldType);
      if (!actualType.equals(defaultType)) {
         this.val$writer.addAttribute(JavaBeanConverter.access$100(this.this$0), JavaBeanConverter.access$000(this.this$0).serializedClass(actualType));
      }

      this.val$context.convertAnother(newObj);
      this.val$writer.endNode();
   }
}
