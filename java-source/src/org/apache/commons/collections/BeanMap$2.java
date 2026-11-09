package org.apache.commons.collections;

class BeanMap$2 implements Transformer {
   public Object transform(Object input) {
      return new Character(input.toString().charAt(0));
   }
}
