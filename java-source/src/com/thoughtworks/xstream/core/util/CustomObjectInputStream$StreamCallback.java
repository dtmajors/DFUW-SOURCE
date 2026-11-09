package com.thoughtworks.xstream.core.util;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.util.Map;

public interface CustomObjectInputStream$StreamCallback {
   Object readFromStream() throws IOException;

   Map readFieldsFromStream() throws IOException;

   void defaultReadObject() throws IOException;

   void registerValidation(ObjectInputValidation var1, int var2) throws NotActiveException, InvalidObjectException;

   void close() throws IOException;
}
