package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import java.io.Externalizable;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.util.Map;

class ExternalizableConverter$2 implements StreamCallback {
   ExternalizableConverter$2(ExternalizableConverter var1, HierarchicalStreamReader var2, UnmarshallingContext var3, Externalizable var4) throws NotActiveException {
      this.this$0 = var1;
      this.val$reader = var2;
      this.val$context = var3;
      this.val$externalizable = var4;
   }

   public Object readFromStream() {
      this.val$reader.moveDown();
      Object streamItem = this.val$context
         .convertAnother(this.val$externalizable, ExternalizableConverter.access$000(this.this$0).realClass(this.val$reader.getNodeName()));
      this.val$reader.moveUp();
      return streamItem;
   }

   public Map readFieldsFromStream() {
      throw new UnsupportedOperationException();
   }

   public void defaultReadObject() {
      throw new UnsupportedOperationException();
   }

   public void registerValidation(ObjectInputValidation validation, int priority) throws NotActiveException {
      throw new NotActiveException("stream inactive");
   }

   public void close() {
      throw new UnsupportedOperationException("Objects are not allowed to call ObjectInput.close() from readExternal()");
   }
}
