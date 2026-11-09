package org.apache.commons.collections.map;

import java.util.Map.Entry;
import org.apache.commons.collections.KeyValue;

public class AbstractHashedMap$HashEntry implements Entry, KeyValue {
   protected AbstractHashedMap$HashEntry next;
   protected int hashCode;
   protected Object key;
   protected Object value;

   protected AbstractHashedMap$HashEntry(AbstractHashedMap$HashEntry next, int hashCode, Object key, Object value) {
      this.next = next;
      this.hashCode = hashCode;
      this.key = key;
      this.value = value;
   }

   public Object getKey() {
      return this.key == AbstractHashedMap.NULL ? null : this.key;
   }

   public Object getValue() {
      return this.value;
   }

   public Object setValue(Object value) {
      Object old = this.value;
      this.value = value;
      return old;
   }

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry other = (Entry)obj;
      return (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
         && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
   }

   public int hashCode() {
      return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
   }

   public String toString() {
      return "" + this.getKey() + '=' + this.getValue();
   }
}
