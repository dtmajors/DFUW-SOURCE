package org.apache.commons.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

abstract class FastTreeMap$CollectionView implements Collection {
   public FastTreeMap$CollectionView(FastTreeMap this$0) {
      this.this$0 = this$0;
   }

   protected abstract Collection get(Map var1);

   protected abstract Object iteratorNext(Entry var1);

   public void clear() {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            this.this$0.map = new TreeMap();
         }
      } else {
         synchronized (this.this$0.map) {
            this.get(this.this$0.map).clear();
         }
      }
   }

   public boolean remove(Object o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            TreeMap temp = (TreeMap)this.this$0.map.clone();
            boolean r = this.get(temp).remove(o);
            this.this$0.map = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.map) {
            return this.get(this.this$0.map).remove(o);
         }
      }
   }

   public boolean removeAll(Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            TreeMap temp = (TreeMap)this.this$0.map.clone();
            boolean r = this.get(temp).removeAll(o);
            this.this$0.map = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.map) {
            return this.get(this.this$0.map).removeAll(o);
         }
      }
   }

   public boolean retainAll(Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            TreeMap temp = (TreeMap)this.this$0.map.clone();
            boolean r = this.get(temp).retainAll(o);
            this.this$0.map = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.map) {
            return this.get(this.this$0.map).retainAll(o);
         }
      }
   }

   public int size() {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).size();
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).size();
      }
   }

   public boolean isEmpty() {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).isEmpty();
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).isEmpty();
      }
   }

   public boolean contains(Object o) {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).contains(o);
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).contains(o);
      }
   }

   public boolean containsAll(Collection o) {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).containsAll(o);
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).containsAll(o);
      }
   }

   public Object[] toArray(Object[] o) {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).toArray(o);
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).toArray(o);
      }
   }

   public Object[] toArray() {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).toArray();
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).toArray();
      }
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      }

      if (this.this$0.fast) {
         return this.get(this.this$0.map).equals(o);
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).equals(o);
      }
   }

   public int hashCode() {
      if (this.this$0.fast) {
         return this.get(this.this$0.map).hashCode();
      }

      synchronized (this.this$0.map) {
         return this.get(this.this$0.map).hashCode();
      }
   }

   public boolean add(Object o) {
      throw new UnsupportedOperationException();
   }

   public boolean addAll(Collection c) {
      throw new UnsupportedOperationException();
   }

   public Iterator iterator() {
      return new FastTreeMap$CollectionView$CollectionViewIterator(this);
   }
}
