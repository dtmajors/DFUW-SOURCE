package org.apache.commons.collections;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class ReferenceMap$SoftRef extends SoftReference {
   private int hash;

   public ReferenceMap$SoftRef(int hash, Object r, ReferenceQueue q) {
      super(r, q);
      this.hash = hash;
   }

   public int hashCode() {
      return this.hash;
   }
}
