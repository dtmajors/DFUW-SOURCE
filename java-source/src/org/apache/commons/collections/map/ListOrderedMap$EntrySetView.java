package org.apache.commons.collections.map;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

class ListOrderedMap$EntrySetView extends AbstractSet {
   private final ListOrderedMap parent;
   private final List insertOrder;
   private Set entrySet;

   public ListOrderedMap$EntrySetView(ListOrderedMap parent, List insertOrder) {
      this.parent = parent;
      this.insertOrder = insertOrder;
   }

   private Set getEntrySet() {
      if (this.entrySet == null) {
         this.entrySet = this.parent.getMap().entrySet();
      }

      return this.entrySet;
   }

   public int size() {
      return this.parent.size();
   }

   public boolean isEmpty() {
      return this.parent.isEmpty();
   }

   public boolean contains(Object obj) {
      return this.getEntrySet().contains(obj);
   }

   public boolean containsAll(Collection coll) {
      return this.getEntrySet().containsAll(coll);
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      } else if (this.getEntrySet().contains(obj)) {
         Object key = ((Entry)obj).getKey();
         this.parent.remove(key);
         return true;
      } else {
         return false;
      }
   }

   public void clear() {
      this.parent.clear();
   }

   public boolean equals(Object obj) {
      return obj == this ? true : this.getEntrySet().equals(obj);
   }

   public int hashCode() {
      return this.getEntrySet().hashCode();
   }

   public String toString() {
      return this.getEntrySet().toString();
   }

   public Iterator iterator() {
      return new ListOrderedMap$ListOrderedIterator(this.parent, this.insertOrder);
   }
}
