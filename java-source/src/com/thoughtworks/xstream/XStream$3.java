package com.thoughtworks.xstream;

import com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.util.Map;

class XStream$3 implements StreamCallback {
   XStream$3(XStream var1, HierarchicalStreamReader var2) throws NotActiveException, EOFException {
      this.this$0 = var1;
      this.val$reader = var2;
   }

   public Object readFromStream() throws EOFException {
      if (!this.val$reader.hasMoreChildren()) {
         throw new EOFException();
      }

      this.val$reader.moveDown();
      Object result = this.this$0.unmarshal(this.val$reader);
      this.val$reader.moveUp();
      return result;
   }

   public Map readFieldsFromStream() throws IOException {
      throw new NotActiveException("not in call to readObject");
   }

   public void defaultReadObject() throws NotActiveException {
      throw new NotActiveException("not in call to readObject");
   }

   public void registerValidation(ObjectInputValidation validation, int priority) throws NotActiveException {
      throw new NotActiveException("stream inactive");
   }

   public void close() {
      this.val$reader.close();
   }
}
