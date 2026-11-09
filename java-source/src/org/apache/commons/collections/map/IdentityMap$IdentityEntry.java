package org.apache.commons.collections.map;

import java.util.Map.Entry;

public class IdentityMap$IdentityEntry extends AbstractHashedMap$HashEntry {
   protected IdentityMap$IdentityEntry(AbstractHashedMap$HashEntry next, int hashCode, Object key, Object value) {
      super(next, hashCode, key, value);
   }

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry other = (Entry)obj;
      return this.getKey() == other.getKey() && this.getValue() == other.getValue();
   }

   public int hashCode() {
      return System.identityHashCode(this.getKey()) ^ System.identityHashCode(this.getValue());
   }
}
