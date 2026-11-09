package org.apache.commons.collections.map;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.collections.set.AbstractSetDecorator;

class AbstractInputCheckedMapDecorator$EntrySet extends AbstractSetDecorator {
   private final AbstractInputCheckedMapDecorator parent;

   protected AbstractInputCheckedMapDecorator$EntrySet(Set set, AbstractInputCheckedMapDecorator parent) {
      super(set);
      this.parent = parent;
   }

   public Iterator iterator() {
      return new AbstractInputCheckedMapDecorator$EntrySetIterator(super.collection.iterator(), this.parent);
   }

   public Object[] toArray() {
      Object[] array = super.collection.toArray();

      for (int i = 0; i < array.length; i++) {
         array[i] = new AbstractInputCheckedMapDecorator$MapEntry((Entry)array[i], this.parent);
      }

      return array;
   }

   public Object[] toArray(Object[] array) {
      Object[] result = array;
      if (array.length > 0) {
         result = (Object[])Array.newInstance(array.getClass().getComponentType(), 0);
      }

      result = super.collection.toArray(result);

      for (int i = 0; i < result.length; i++) {
         result[i] = new AbstractInputCheckedMapDecorator$MapEntry((Entry)result[i], this.parent);
      }

      if (result.length > array.length) {
         return result;
      }

      System.arraycopy(result, 0, array, 0, result.length);
      if (array.length > result.length) {
         array[result.length] = null;
      }

      return array;
   }
}
