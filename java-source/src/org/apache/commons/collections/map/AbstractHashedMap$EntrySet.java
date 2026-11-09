package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class AbstractHashedMap$EntrySet extends AbstractSet {
   protected final AbstractHashedMap parent;

   protected AbstractHashedMap$EntrySet(AbstractHashedMap parent) {
      this.parent = parent;
   }

   public int size() {
      return this.parent.size();
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean contains(Object entry) {
      if (!(entry instanceof Entry)) {
         return false;
      }

      Entry e = (Entry)entry;
      Entry match = this.parent.getEntry(e.getKey());
      return match != null && match.equals(e);
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      if (!this.contains(obj)) {
         return false;
      }

      Entry entry = (Entry)obj;
      Object key = entry.getKey();
      this.parent.remove(key);
      return true;
   }

   public Iterator iterator() {
      return this.parent.createEntrySetIterator();
   }
}
