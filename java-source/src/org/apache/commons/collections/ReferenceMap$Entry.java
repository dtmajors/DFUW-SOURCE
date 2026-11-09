package org.apache.commons.collections;

import java.lang.ref.Reference;
import java.util.Map.Entry;

class ReferenceMap$Entry implements Entry, KeyValue {
   Object key;
   Object value;
   int hash;
   ReferenceMap$Entry next;

   public ReferenceMap$Entry(ReferenceMap this$0, Object key, int hash, Object value, ReferenceMap$Entry next) {
      this.this$0 = this$0;
      this.key = key;
      this.hash = hash;
      this.value = value;
      this.next = next;
   }

   public Object getKey() {
      return ReferenceMap.access$300(this.this$0) > 0 ? ((Reference)this.key).get() : this.key;
   }

   public Object getValue() {
      return ReferenceMap.access$400(this.this$0) > 0 ? ((Reference)this.value).get() : this.value;
   }

   public Object setValue(Object object) {
      Object old = this.getValue();
      if (ReferenceMap.access$400(this.this$0) > 0) {
         ((Reference)this.value).clear();
      }

      this.value = ReferenceMap.access$500(this.this$0, ReferenceMap.access$400(this.this$0), object, this.hash);
      return old;
   }

   public boolean equals(Object o) {
      if (o == null) {
         return false;
      }

      if (o == this) {
         return true;
      }

      if (!(o instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)o;
      Object key = entry.getKey();
      Object value = entry.getValue();
      return key != null && value != null ? key.equals(this.getKey()) && value.equals(this.getValue()) : false;
   }

   public int hashCode() {
      Object v = this.getValue();
      return this.hash ^ (v == null ? 0 : v.hashCode());
   }

   public String toString() {
      return this.getKey() + "=" + this.getValue();
   }

   boolean purge(Reference ref) {
      boolean r = ReferenceMap.access$300(this.this$0) > 0 && this.key == ref;
      r = r || ReferenceMap.access$400(this.this$0) > 0 && this.value == ref;
      if (r) {
         if (ReferenceMap.access$300(this.this$0) > 0) {
            ((Reference)this.key).clear();
         }

         if (ReferenceMap.access$400(this.this$0) > 0) {
            ((Reference)this.value).clear();
         } else if (ReferenceMap.access$600(this.this$0)) {
            this.value = null;
         }
      }

      return r;
   }
}
