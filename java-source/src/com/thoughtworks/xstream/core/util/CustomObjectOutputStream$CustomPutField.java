package com.thoughtworks.xstream.core.util;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream.PutField;
import java.util.Map;

class CustomObjectOutputStream$CustomPutField extends PutField {
   private final Map fields;

   private CustomObjectOutputStream$CustomPutField(CustomObjectOutputStream var1) {
      this.this$0 = var1;
      this.fields = new OrderRetainingMap();
   }

   public Map asMap() {
      return this.fields;
   }

   public void write(ObjectOutput out) throws IOException {
      this.this$0.peekCallback().writeToStream(this.asMap());
   }

   public void put(String name, Object val) {
      this.fields.put(name, val);
   }

   public void put(String name, byte val) {
      this.put(name, new Byte(val));
   }

   public void put(String name, char val) {
      this.put(name, new Character(val));
   }

   public void put(String name, double val) {
      this.put(name, new Double(val));
   }

   public void put(String name, float val) {
      this.put(name, new Float(val));
   }

   public void put(String name, int val) {
      this.put(name, new Integer(val));
   }

   public void put(String name, long val) {
      this.put(name, new Long(val));
   }

   public void put(String name, short val) {
      this.put(name, new Short(val));
   }

   public void put(String name, boolean val) {
      this.put(name, val ? Boolean.TRUE : Boolean.FALSE);
   }
}
