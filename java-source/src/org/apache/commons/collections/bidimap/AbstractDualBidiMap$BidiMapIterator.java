package org.apache.commons.collections.bidimap;

import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;

public class AbstractDualBidiMap$BidiMapIterator implements MapIterator, ResettableIterator {
   protected final AbstractDualBidiMap parent;
   protected Iterator iterator;
   protected Entry last = null;
   protected boolean canRemove = false;

   protected AbstractDualBidiMap$BidiMapIterator(AbstractDualBidiMap parent) {
      this.parent = parent;
      this.iterator = parent.maps[0].entrySet().iterator();
   }

   public boolean hasNext() {
      return this.iterator.hasNext();
   }

   public Object next() {
      this.last = (Entry)this.iterator.next();
      this.canRemove = true;
      return this.last.getKey();
   }

   public void remove() {
      if (!this.canRemove) {
         throw new IllegalStateException("Iterator remove() can only be called once after next()");
      }

      Object value = this.last.getValue();
      this.iterator.remove();
      this.parent.maps[1].remove(value);
      this.last = null;
      this.canRemove = false;
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
      this.iterator = this.parent.maps[0].entrySet().iterator();
      this.last = null;
      this.canRemove = false;
   }

   public String toString() {
      return this.last != null ? "MapIterator[" + this.getKey() + "=" + this.getValue() + "]" : "MapIterator[]";
   }
}
