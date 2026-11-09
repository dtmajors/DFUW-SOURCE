package com.thoughtworks.xstream;

import com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback;
import com.thoughtworks.xstream.io.StatefulWriter;
import java.io.NotActiveException;
import java.util.Map;

class XStream$2 implements StreamCallback {
   XStream$2(XStream var1, StatefulWriter var2) throws NotActiveException {
      this.this$0 = var1;
      this.val$statefulWriter = var2;
   }

   public void writeToStream(Object object) {
      this.this$0.marshal(object, this.val$statefulWriter);
   }

   public void writeFieldsToStream(Map fields) throws NotActiveException {
      throw new NotActiveException("not in call to writeObject");
   }

   public void defaultWriteObject() throws NotActiveException {
      throw new NotActiveException("not in call to writeObject");
   }

   public void flush() {
      this.val$statefulWriter.flush();
   }

   public void close() {
      if (this.val$statefulWriter.state() != StatefulWriter.STATE_CLOSED) {
         this.val$statefulWriter.endNode();
         this.val$statefulWriter.close();
      }
   }
}
