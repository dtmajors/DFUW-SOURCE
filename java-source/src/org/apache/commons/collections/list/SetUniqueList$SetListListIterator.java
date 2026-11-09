package org.apache.commons.collections.list;

import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections.iterators.AbstractListIteratorDecorator;

class SetUniqueList$SetListListIterator extends AbstractListIteratorDecorator {
   protected final Set set;
   protected Object last = null;

   protected SetUniqueList$SetListListIterator(ListIterator it, Set set) {
      super(it);
      this.set = set;
   }

   public Object next() {
      this.last = super.next();
      return this.last;
   }

   public Object previous() {
      this.last = super.previous();
      return this.last;
   }

   public void remove() {
      super.remove();
      this.set.remove(this.last);
      this.last = null;
   }

   public void add(Object object) {
      if (!this.set.contains(object)) {
         super.add(object);
         this.set.add(object);
      }
   }

   public void set(Object object) {
      throw new UnsupportedOperationException("ListIterator does not support set");
   }
}
