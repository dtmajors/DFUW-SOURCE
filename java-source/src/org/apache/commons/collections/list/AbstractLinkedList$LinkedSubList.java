package org.apache.commons.collections.list;

import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractLinkedList$LinkedSubList extends AbstractList {
   private AbstractLinkedList parent;
   private int offset;
   private int size;
   private int expectedModCount;

   protected AbstractLinkedList$LinkedSubList(AbstractLinkedList parent, int fromIndex, int toIndex) {
      if (fromIndex < 0) {
         throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
      }

      if (toIndex > parent.size()) {
         throw new IndexOutOfBoundsException("toIndex = " + toIndex);
      }

      if (fromIndex > toIndex) {
         throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
      }

      this.parent = parent;
      this.offset = fromIndex;
      this.size = toIndex - fromIndex;
      this.expectedModCount = parent.modCount;
   }

   public int size() {
      this.checkModCount();
      return this.size;
   }

   public Object get(int index) {
      this.rangeCheck(index, this.size);
      this.checkModCount();
      return this.parent.get(index + this.offset);
   }

   public void add(int index, Object obj) {
      this.rangeCheck(index, this.size + 1);
      this.checkModCount();
      this.parent.add(index + this.offset, obj);
      this.expectedModCount = this.parent.modCount;
      this.size++;
      super.modCount++;
   }

   public Object remove(int index) {
      this.rangeCheck(index, this.size);
      this.checkModCount();
      Object result = this.parent.remove(index + this.offset);
      this.expectedModCount = this.parent.modCount;
      this.size--;
      super.modCount++;
      return result;
   }

   public boolean addAll(Collection coll) {
      return this.addAll(this.size, coll);
   }

   public boolean addAll(int index, Collection coll) {
      this.rangeCheck(index, this.size + 1);
      int cSize = coll.size();
      if (cSize == 0) {
         return false;
      }

      this.checkModCount();
      this.parent.addAll(this.offset + index, coll);
      this.expectedModCount = this.parent.modCount;
      this.size += cSize;
      super.modCount++;
      return true;
   }

   public Object set(int index, Object obj) {
      this.rangeCheck(index, this.size);
      this.checkModCount();
      return this.parent.set(index + this.offset, obj);
   }

   public void clear() {
      this.checkModCount();
      Iterator it = this.iterator();

      while (it.hasNext()) {
         it.next();
         it.remove();
      }
   }

   public Iterator iterator() {
      this.checkModCount();
      return this.parent.createSubListIterator(this);
   }

   public ListIterator listIterator(int index) {
      this.rangeCheck(index, this.size + 1);
      this.checkModCount();
      return this.parent.createSubListListIterator(this, index);
   }

   public List subList(int fromIndexInclusive, int toIndexExclusive) {
      return new AbstractLinkedList$LinkedSubList(this.parent, fromIndexInclusive + this.offset, toIndexExclusive + this.offset);
   }

   protected void rangeCheck(int index, int beyond) {
      if (index < 0 || index >= beyond) {
         throw new IndexOutOfBoundsException("Index '" + index + "' out of bounds for size '" + this.size + "'");
      }
   }

   protected void checkModCount() {
      if (this.parent.modCount != this.expectedModCount) {
         throw new ConcurrentModificationException();
      }
   }
}
