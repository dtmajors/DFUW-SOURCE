package com.thoughtworks.xstream.core.util;

import java.io.IOException;
import java.util.Map;

public interface CustomObjectOutputStream$StreamCallback {
   void writeToStream(Object var1) throws IOException;

   void writeFieldsToStream(Map var1) throws IOException;

   void defaultWriteObject() throws IOException;

   void flush() throws IOException;

   void close() throws IOException;
}
