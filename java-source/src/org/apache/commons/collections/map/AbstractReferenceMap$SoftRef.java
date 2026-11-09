package org.apache.commons.collections.map;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class AbstractReferenceMap$SoftRef extends SoftReference {
   private int hash;

   public AbstractReferenceMap$SoftRef(int hash, Object r, ReferenceQueue q) {
      super(r, q);
      this.hash = hash;
   }

   public int hashCode() {
      return this.hash;
   }
}
