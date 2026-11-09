package org.apache.commons.collections.bidimap;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.OrderedBidiMap;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.iterators.EmptyOrderedMapIterator;

class TreeBidiMap$Inverse implements OrderedBidiMap {
   private final TreeBidiMap main;
   private Set keySet;
   private Set valuesSet;
   private Set entrySet;

   TreeBidiMap$Inverse(TreeBidiMap main) {
      this.main = main;
   }

   public int size() {
      return this.main.size();
   }

   public boolean isEmpty() {
      return this.main.isEmpty();
   }

   public Object get(Object key) {
      return this.main.getKey(key);
   }

   public Object getKey(Object value) {
      return this.main.get(value);
   }

   public boolean containsKey(Object key) {
      return this.main.containsValue(key);
   }

   public boolean containsValue(Object value) {
      return this.main.containsKey(value);
   }

   public Object firstKey() {
      if (TreeBidiMap.access$2400(this.main) == 0) {
         throw new NoSuchElementException("Map is empty");
      } else {
         return TreeBidiMap.access$1800(TreeBidiMap.access$1700(this.main)[1], 1).getValue();
      }
   }

   public Object lastKey() {
      if (TreeBidiMap.access$2400(this.main) == 0) {
         throw new NoSuchElementException("Map is empty");
      } else {
         return TreeBidiMap.access$2200(TreeBidiMap.access$1700(this.main)[1], 1).getValue();
      }
   }

   public Object nextKey(Object key) {
      TreeBidiMap.access$2500(key);
      TreeBidiMap$Node node = TreeBidiMap.access$1900(this.main, TreeBidiMap.access$1400(this.main, (Comparable)key, 1), 1);
      return node == null ? null : node.getValue();
   }

   public Object previousKey(Object key) {
      TreeBidiMap.access$2500(key);
      TreeBidiMap$Node node = TreeBidiMap.access$2000(this.main, TreeBidiMap.access$1400(this.main, (Comparable)key, 1), 1);
      return node == null ? null : node.getValue();
   }

   public Object put(Object key, Object value) {
      return TreeBidiMap.access$2600(this.main, (Comparable)value, (Comparable)key, 1);
   }

   public void putAll(Map map) {
      for (Entry entry : map.entrySet()) {
         this.put(entry.getKey(), entry.getValue());
      }
   }

   public Object remove(Object key) {
      return this.main.removeValue(key);
   }

   public Object removeValue(Object value) {
      return this.main.remove(value);
   }

   public void clear() {
      this.main.clear();
   }

   public Set keySet() {
      if (this.keySet == null) {
         this.keySet = new TreeBidiMap$View(this.main, 1, 1);
      }

      return this.keySet;
   }

   public Collection values() {
      if (this.valuesSet == null) {
         this.valuesSet = new TreeBidiMap$View(this.main, 1, 0);
      }

      return this.valuesSet;
   }

   public Set entrySet() {
      return this.entrySet == null ? new TreeBidiMap$EntryView(this.main, 1, 3) : this.entrySet;
   }

   public MapIterator mapIterator() {
      return this.isEmpty() ? EmptyOrderedMapIterator.INSTANCE : new TreeBidiMap$ViewMapIterator(this.main, 1);
   }

   public OrderedMapIterator orderedMapIterator() {
      return this.isEmpty() ? EmptyOrderedMapIterator.INSTANCE : new TreeBidiMap$ViewMapIterator(this.main, 1);
   }

   public BidiMap inverseBidiMap() {
      return this.main;
   }

   public OrderedBidiMap inverseOrderedBidiMap() {
      return this.main;
   }

   public boolean equals(Object obj) {
      return TreeBidiMap.access$2700(this.main, obj, 1);
   }

   public int hashCode() {
      return TreeBidiMap.access$2800(this.main, 1);
   }

   public String toString() {
      return TreeBidiMap.access$2900(this.main, 1);
   }
}
