package org.apache.commons.collections.map;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.iterators.UnmodifiableIterator;
import org.apache.commons.collections.iterators.UnmodifiableListIterator;
import org.apache.commons.collections.list.UnmodifiableList;

class LinkedMap$LinkedMapList extends AbstractList {
   final LinkedMap parent;

   LinkedMap$LinkedMapList(LinkedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public Object get(int index) {
      return this.parent.get(index);
   }

   public boolean contains(Object obj) {
      return this.parent.containsKey(obj);
   }

   public int indexOf(Object obj) {
      return this.parent.indexOf(obj);
   }

   public int lastIndexOf(Object obj) {
      return this.parent.indexOf(obj);
   }

   public boolean containsAll(Collection coll) {
      return this.parent.keySet().containsAll(coll);
   }

   public Object remove(int index) {
      throw new UnsupportedOperationException();
   }

   public boolean remove(Object obj) {
      throw new UnsupportedOperationException();
   }

   public boolean removeAll(Collection coll) {
      throw new UnsupportedOperationException();
   }

   public boolean retainAll(Collection coll) {
      throw new UnsupportedOperationException();
   }

   public void clear() {
      throw new UnsupportedOperationException();
   }

   public Object[] toArray() {
      return this.parent.keySet().toArray();
   }

   public Object[] toArray(Object[] array) {
      return this.parent.keySet().toArray(array);
   }

   public Iterator iterator() {
      return UnmodifiableIterator.decorate(this.parent.keySet().iterator());
   }

   public ListIterator listIterator() {
      return UnmodifiableListIterator.decorate(super.listIterator());
   }

   public ListIterator listIterator(int fromIndex) {
      return UnmodifiableListIterator.decorate(super.listIterator(fromIndex));
   }

   public List subList(int fromIndexInclusive, int toIndexExclusive) {
      return UnmodifiableList.decorate(super.subList(fromIndexInclusive, toIndexExclusive));
   }
}
