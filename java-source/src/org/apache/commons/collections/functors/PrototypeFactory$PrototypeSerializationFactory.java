package org.apache.commons.collections.functors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;

class PrototypeFactory$PrototypeSerializationFactory implements Factory, Serializable {
   static final long serialVersionUID = -8704966966139178833L;
   private final Serializable iPrototype;

   private PrototypeFactory$PrototypeSerializationFactory(Serializable prototype) {
      this.iPrototype = prototype;
   }

   public Object create() {
      ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
      ByteArrayInputStream bais = null;

      try {
         ObjectOutputStream out = new ObjectOutputStream(baos);
         out.writeObject(this.iPrototype);
         bais = new ByteArrayInputStream(baos.toByteArray());
         ObjectInputStream in = new ObjectInputStream(bais);
         return in.readObject();
      } catch (ClassNotFoundException var18) {
         throw new FunctorException(var18);
      } catch (IOException var19) {
         throw new FunctorException(var19);
      } finally {
         try {
            if (bais != null) {
               bais.close();
            }
         } catch (IOException var17) {
         }

         try {
            if (baos != null) {
               baos.close();
            }
         } catch (IOException var16) {
         }
      }
   }
}
