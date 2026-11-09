package com.thoughtworks.xstream.core.util;

import java.io.ObjectStreamClass;
import java.io.ObjectInputStream.GetField;
import java.util.Map;

class CustomObjectInputStream$CustomGetField extends GetField {
   private Map fields;

   public CustomObjectInputStream$CustomGetField(CustomObjectInputStream var1, Map fields) {
      this.this$0 = var1;
      this.fields = fields;
   }

   public ObjectStreamClass getObjectStreamClass() {
      throw new UnsupportedOperationException();
   }

   private Object get(String name) {
      return this.fields.get(name);
   }

   public boolean defaulted(String name) {
      return !this.fields.containsKey(name);
   }

   public byte get(String name, byte val) {
      return this.defaulted(name) ? val : (Byte)this.get(name);
   }

   public char get(String name, char val) {
      return this.defaulted(name) ? val : (Character)this.get(name);
   }

   public double get(String name, double val) {
      return this.defaulted(name) ? val : (Double)this.get(name);
   }

   public float get(String name, float val) {
      return this.defaulted(name) ? val : (Float)this.get(name);
   }

   public int get(String name, int val) {
      return this.defaulted(name) ? val : (Integer)this.get(name);
   }

   public long get(String name, long val) {
      return this.defaulted(name) ? val : (Long)this.get(name);
   }

   public short get(String name, short val) {
      return this.defaulted(name) ? val : (Short)this.get(name);
   }

   public boolean get(String name, boolean val) {
      return this.defaulted(name) ? val : (Boolean)this.get(name);
   }

   public Object get(String name, Object val) {
      return this.defaulted(name) ? val : this.get(name);
   }
}
