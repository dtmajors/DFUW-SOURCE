package org.apache.commons.collections.map;

import java.util.Map.Entry;
import org.apache.commons.collections.KeyValue;

final class StaticBucketMap$Node implements Entry, KeyValue {
   protected Object key;
   protected Object value;
   protected StaticBucketMap$Node next;

   private StaticBucketMap$Node() {
   }

   public Object getKey() {
      return this.key;
   }

   public Object getValue() {
      return this.value;
   }

   public int hashCode() {
      return (this.key == null ? 0 : this.key.hashCode()) ^ (this.value == null ? 0 : this.value.hashCode());
   }

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry e2 = (Entry)obj;
      return (this.key == null ? e2.getKey() == null : this.key.equals(e2.getKey()))
         && (this.value == null ? e2.getValue() == null : this.value.equals(e2.getValue()));
   }

   public Object setValue(Object obj) {
      Object retVal = this.value;
      this.value = obj;
      return retVal;
   }
}
