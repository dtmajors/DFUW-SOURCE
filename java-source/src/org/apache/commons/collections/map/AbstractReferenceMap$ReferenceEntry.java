package org.apache.commons.collections.map;

import java.lang.ref.Reference;
import java.util.Map.Entry;

public class AbstractReferenceMap$ReferenceEntry extends AbstractHashedMap$HashEntry {
   protected final AbstractReferenceMap parent;

   public AbstractReferenceMap$ReferenceEntry(AbstractReferenceMap parent, AbstractHashedMap$HashEntry next, int hashCode, Object key, Object value) {
      super(next, hashCode, null, null);
      this.parent = parent;
      super.key = this.toReference(parent.keyType, key, hashCode);
      super.value = this.toReference(parent.valueType, value, hashCode);
   }

   public Object getKey() {
      return this.parent.keyType > 0 ? ((Reference)super.key).get() : super.key;
   }

   public Object getValue() {
      return this.parent.valueType > 0 ? ((Reference)super.value).get() : super.value;
   }

   public Object setValue(Object obj) {
      Object old = this.getValue();
      if (this.parent.valueType > 0) {
         ((Reference)super.value).clear();
      }

      super.value = this.toReference(this.parent.valueType, obj, super.hashCode);
      return old;
   }

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)obj;
      Object entryKey = entry.getKey();
      Object entryValue = entry.getValue();
      return entryKey != null && entryValue != null
         ? this.parent.isEqualKey(entryKey, super.key) && this.parent.isEqualValue(entryValue, this.getValue())
         : false;
   }

   public int hashCode() {
      return this.parent.hashEntry(this.getKey(), this.getValue());
   }

   protected Object toReference(int type, Object referent, int hash) {
      switch (type) {
         case 0:
            return referent;
         case 1:
            return new AbstractReferenceMap$SoftRef(hash, referent, AbstractReferenceMap.access$000(this.parent));
         case 2:
            return new AbstractReferenceMap$WeakRef(hash, referent, AbstractReferenceMap.access$000(this.parent));
         default:
            throw new Error();
      }
   }

   boolean purge(Reference ref) {
      boolean r = this.parent.keyType > 0 && super.key == ref;
      r = r || this.parent.valueType > 0 && super.value == ref;
      if (r) {
         if (this.parent.keyType > 0) {
            ((Reference)super.key).clear();
         }

         if (this.parent.valueType > 0) {
            ((Reference)super.value).clear();
         } else if (this.parent.purgeValues) {
            super.value = null;
         }
      }

      return r;
   }

   protected AbstractReferenceMap$ReferenceEntry next() {
      return (AbstractReferenceMap$ReferenceEntry)super.next;
   }
}
