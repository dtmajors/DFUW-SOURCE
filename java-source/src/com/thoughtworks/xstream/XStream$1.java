package com.thoughtworks.xstream;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class XStream$1 implements InvocationHandler {
   XStream$1(XStream var1) throws InvocationTargetException, IllegalAccessException {
      this.this$0 = var1;
   }

   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      return method.invoke(XStream.access$000(this.this$0), args);
   }
}
