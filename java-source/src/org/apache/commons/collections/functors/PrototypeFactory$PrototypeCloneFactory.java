package org.apache.commons.collections.functors;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;

class PrototypeFactory$PrototypeCloneFactory implements Factory, Serializable {
   static final long serialVersionUID = 5604271422565175555L;
   private final Object iPrototype;
   private transient Method iCloneMethod;

   private PrototypeFactory$PrototypeCloneFactory(Object prototype, Method method) {
      this.iPrototype = prototype;
      this.iCloneMethod = method;
   }

   private void findCloneMethod() {
      try {
         this.iCloneMethod = this.iPrototype.getClass().getMethod("clone", null);
      } catch (NoSuchMethodException var2) {
         throw new IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
      }
   }

   public Object create() {
      if (this.iCloneMethod == null) {
         this.findCloneMethod();
      }

      try {
         return this.iCloneMethod.invoke(this.iPrototype, null);
      } catch (IllegalAccessException var3) {
         throw new FunctorException("PrototypeCloneFactory: Clone method must be public", var3);
      } catch (InvocationTargetException var4) {
         throw new FunctorException("PrototypeCloneFactory: Clone method threw an exception", var4);
      }
   }
}
