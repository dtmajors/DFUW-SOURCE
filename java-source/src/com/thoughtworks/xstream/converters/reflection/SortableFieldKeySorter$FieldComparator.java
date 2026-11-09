package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.io.StreamException;
import java.util.Comparator;

class SortableFieldKeySorter$FieldComparator implements Comparator {
   private final String[] fieldOrder;

   public SortableFieldKeySorter$FieldComparator(SortableFieldKeySorter var1, String[] fields) {
      this.this$0 = var1;
      this.fieldOrder = fields;
   }

   public int compare(String first, String second) {
      int firstPosition = -1;
      int secondPosition = -1;

      for (int i = 0; i < this.fieldOrder.length; i++) {
         if (this.fieldOrder[i].equals(first)) {
            firstPosition = i;
         }

         if (this.fieldOrder[i].equals(second)) {
            secondPosition = i;
         }
      }

      if (firstPosition != -1 && secondPosition != -1) {
         return firstPosition - secondPosition;
      } else {
         throw new StreamException("You have not given XStream a list of all fields to be serialized.");
      }
   }

   public int compare(Object firstObject, Object secondObject) {
      FieldKey first = (FieldKey)firstObject;
      FieldKey second = (FieldKey)secondObject;
      Class definedIn = first.getDeclaringClass();
      return this.compare(first.getFieldName(), second.getFieldName());
   }
}
