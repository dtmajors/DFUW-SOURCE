package org.apache.commons.collections.bag;

public class AbstractMapBag$MutableInteger {
   protected int value;

   AbstractMapBag$MutableInteger(int value) {
      this.value = value;
   }

   public boolean equals(Object obj) {
      return !(obj instanceof AbstractMapBag$MutableInteger) ? false : ((AbstractMapBag$MutableInteger)obj).value == this.value;
   }

   public int hashCode() {
      return this.value;
   }
}
