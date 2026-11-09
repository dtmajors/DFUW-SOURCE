package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

class FastArrayList$SubList$SubListIter implements ListIterator {
   private List expected;
   private ListIterator iter;
   private int lastReturnedIndex;

   public FastArrayList$SubList$SubListIter(FastArrayList$SubList this$1, int i) {
      this.this$1 = this$1;
      this.lastReturnedIndex = -1;
      this.expected = FastArrayList$SubList.access$000(this$1).list;
      this.iter = FastArrayList$SubList.access$100(this$1, this.expected).listIterator(i);
   }

   private void checkMod() {
      if (FastArrayList$SubList.access$000(this.this$1).list != this.expected) {
         throw new ConcurrentModificationException();
      }
   }

   List get() {
      return FastArrayList$SubList.access$100(this.this$1, this.expected);
   }

   public boolean hasNext() {
      this.checkMod();
      return this.iter.hasNext();
   }

   public Object next() {
      this.checkMod();
      this.lastReturnedIndex = this.iter.nextIndex();
      return this.iter.next();
   }

   public boolean hasPrevious() {
      this.checkMod();
      return this.iter.hasPrevious();
   }

   public Object previous() {
      this.checkMod();
      this.lastReturnedIndex = this.iter.previousIndex();
      return this.iter.previous();
   }

   public int previousIndex() {
      this.checkMod();
      return this.iter.previousIndex();
   }

   public int nextIndex() {
      this.checkMod();
      return this.iter.nextIndex();
   }

   public void remove() {
      this.checkMod();
      if (this.lastReturnedIndex < 0) {
         throw new IllegalStateException();
      }

      this.get().remove(this.lastReturnedIndex);
      FastArrayList$SubList.access$210(this.this$1);
      this.expected = FastArrayList$SubList.access$000(this.this$1).list;
      this.iter = this.get().listIterator(this.previousIndex());
      this.lastReturnedIndex = -1;
   }

   public void set(Object o) {
      this.checkMod();
      if (this.lastReturnedIndex < 0) {
         throw new IllegalStateException();
      }

      this.get().set(this.lastReturnedIndex, o);
      this.expected = FastArrayList$SubList.access$000(this.this$1).list;
      this.iter = this.get().listIterator(this.previousIndex() + 1);
   }

   public void add(Object o) {
      this.checkMod();
      int i = this.nextIndex();
      this.get().add(i, o);
      FastArrayList$SubList.access$208(this.this$1);
      this.iter = this.get().listIterator(i + 1);
      this.lastReturnedIndex = 1;
   }
}
