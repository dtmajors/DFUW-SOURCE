package org.apache.commons.collections.bidimap;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map.Entry;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.ResettableIterator;

public class DualTreeBidiMap$BidiOrderedMapIterator implements OrderedMapIterator, ResettableIterator {
   protected final AbstractDualBidiMap parent;
   protected ListIterator iterator;
   private Entry last = null;

   protected DualTreeBidiMap$BidiOrderedMapIterator(AbstractDualBidiMap parent) {
      this.parent = parent;
      this.iterator = new ArrayList(parent.entrySet()).listIterator();
   }

   public boolean hasNext() {
      return this.iterator.hasNext();
   }

   public Object next() {
      this.last = (Entry)this.iterator.next();
      return this.last.getKey();
   }

   public boolean hasPrevious() {
      return this.iterator.hasPrevious();
   }

   public Object previous() {
      this.last = (Entry)this.iterator.previous();
      return this.last.getKey();
   }

   public void remove() {
      this.iterator.remove();
      this.parent.remove(this.last.getKey());
      this.last = null;
   }

   public Object getKey() {
      if (this.last == null) {
         throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
      } else {
         return this.last.getKey();
      }
   }

   public Object getValue() {
      if (this.last == null) {
         throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
      } else {
         return this.last.getValue();
      }
   }

   public Object setValue(Object value) {
      if (this.last == null) {
         throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
      } else if (this.parent.maps[1].containsKey(value) && this.parent.maps[1].get(value) != this.last.getKey()) {
         throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
      } else {
         return this.parent.put(this.last.getKey(), value);
      }
   }

   public void reset() {
      this.iterator = new ArrayList(this.parent.entrySet()).listIterator();
      this.last = null;
   }

   public String toString() {
      return this.last != null ? "MapIterator[" + this.getKey() + "=" + this.getValue() + "]" : "MapIterator[]";
   }
}
