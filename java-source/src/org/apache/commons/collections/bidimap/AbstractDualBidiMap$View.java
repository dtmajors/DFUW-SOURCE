package org.apache.commons.collections.bidimap;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections.collection.AbstractCollectionDecorator;

public abstract class AbstractDualBidiMap$View extends AbstractCollectionDecorator {
   protected final AbstractDualBidiMap parent;

   protected AbstractDualBidiMap$View(Collection coll, AbstractDualBidiMap parent) {
      super(coll);
      this.parent = parent;
   }

   public boolean removeAll(Collection coll) {
      if (!this.parent.isEmpty() && !coll.isEmpty()) {
         boolean modified = false;
         Iterator it = this.iterator();

         while (it.hasNext()) {
            if (coll.contains(it.next())) {
               it.remove();
               modified = true;
            }
         }

         return modified;
      } else {
         return false;
      }
   }

   public boolean retainAll(Collection coll) {
      if (this.parent.isEmpty()) {
         return false;
      }

      if (coll.isEmpty()) {
         this.parent.clear();
         return true;
      }

      boolean modified = false;
      Iterator it = this.iterator();

      while (it.hasNext()) {
         if (!coll.contains(it.next())) {
            it.remove();
            modified = true;
         }
      }

      return modified;
   }

   public void clear() {
      this.parent.clear();
   }
}
