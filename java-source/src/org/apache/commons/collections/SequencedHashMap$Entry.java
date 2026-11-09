package org.apache.commons.collections;

import java.util.Map.Entry;

class SequencedHashMap$Entry implements Entry, KeyValue {
   private final Object key;
   private Object value;
   SequencedHashMap$Entry next = null;
   SequencedHashMap$Entry prev = null;

   public SequencedHashMap$Entry(Object key, Object value) {
      this.key = key;
      this.value = value;
   }

   public Object getKey() {
      return this.key;
   }

   public Object getValue() {
      return this.value;
   }

   public Object setValue(Object value) {
      Object oldValue = this.value;
      this.value = value;
      return oldValue;
   }

   public int hashCode() {
      return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
   }

   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

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

   public String toString() {
      return "[" + this.getKey() + "=" + this.getValue() + "]";
   }
}
