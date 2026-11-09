package org.apache.commons.collections.map;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class AbstractReferenceMap$WeakRef extends WeakReference {
   private int hash;

   public AbstractReferenceMap$WeakRef(int hash, Object r, ReferenceQueue q) {
      super(r, q);
      this.hash = hash;
   }

   public int hashCode() {
      return this.hash;
   }
}
