package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;

public class AbstractReflectionConverter$DuplicateFieldException extends ConversionException {
   public AbstractReflectionConverter$DuplicateFieldException(String msg) {
      super(msg);
      this.add("duplicate-field", msg);
   }
}
