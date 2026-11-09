package com.thoughtworks.xstream.converters.javabean;

import java.util.Comparator;

class PropertyDictionary$BeanPropertyComparator implements Comparator {
   private PropertyDictionary$BeanPropertyComparator() {
   }

   public int compare(Object o1, Object o2) {
      return ((BeanProperty)o1).getName().compareTo(((BeanProperty)o2).getName());
   }
}
