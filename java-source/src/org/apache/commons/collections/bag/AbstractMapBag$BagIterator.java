package org.apache.commons.collections.bag;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;

class AbstractMapBag$BagIterator implements Iterator {
   private AbstractMapBag parent;
   private Iterator entryIterator;
   private Entry current;
   private int itemCount;
   private final int mods;
   private boolean canRemove;

   public AbstractMapBag$BagIterator(AbstractMapBag parent) {
      this.parent = parent;
      this.entryIterator = AbstractMapBag.access$000(parent).entrySet().iterator();
      this.current = null;
      this.mods = AbstractMapBag.access$100(parent);
      this.canRemove = false;
   }

   public boolean hasNext() {
      return this.itemCount > 0 || this.entryIterator.hasNext();
   }

   public Object next() {
      if (AbstractMapBag.access$100(this.parent) != this.mods) {
         throw new ConcurrentModificationException();
      }

      if (this.itemCount == 0) {
         this.current = (Entry)this.entryIterator.next();
         this.itemCount = ((AbstractMapBag$MutableInteger)this.current.getValue()).value;
      }

      this.canRemove = true;
      this.itemCount--;
      return this.current.getKey();
   }

   public void remove() {
      if (AbstractMapBag.access$100(this.parent) != this.mods) {
         throw new ConcurrentModificationException();
      }

      if (!this.canRemove) {
         throw new IllegalStateException();
      }

      AbstractMapBag$MutableInteger mut = (AbstractMapBag$MutableInteger)this.current.getValue();
      if (mut.value > 0) {
         mut.value--;
         AbstractMapBag.access$210(this.parent);
      } else {
         this.entryIterator.remove();
      }

      this.canRemove = false;
   }
}
