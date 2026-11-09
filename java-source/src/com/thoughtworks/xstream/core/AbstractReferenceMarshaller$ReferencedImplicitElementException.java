package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.io.path.Path;

public class AbstractReferenceMarshaller$ReferencedImplicitElementException extends ConversionException {
   /** @deprecated */
   public AbstractReferenceMarshaller$ReferencedImplicitElementException(String msg) {
      super(msg);
   }

   public AbstractReferenceMarshaller$ReferencedImplicitElementException(Object item, Path path) {
      super("Cannot reference implicit element");
      this.add("implicit-element", item.toString());
      this.add("referencing-element", path.toString());
   }
}
