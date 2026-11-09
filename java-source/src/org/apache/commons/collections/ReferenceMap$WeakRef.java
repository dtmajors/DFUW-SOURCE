package org.apache.commons.collections;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ReferenceMap$WeakRef extends WeakReference {
   private int hash;

   public ReferenceMap$WeakRef(int hash, Object r, ReferenceQueue q) {
      super(r, q);
      this.hash = hash;
   }

   public int hashCode() {
      return this.hash;
   }
}
