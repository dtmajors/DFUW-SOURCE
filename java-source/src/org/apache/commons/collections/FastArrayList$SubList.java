package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class FastArrayList$SubList implements List {
   private int first;
   private int last;
   private List expected;

   public FastArrayList$SubList(FastArrayList this$0, int first, int last) {
      this.this$0 = this$0;
      this.first = first;
      this.last = last;
      this.expected = this$0.list;
   }

   private List get(List l) {
      if (this.this$0.list != this.expected) {
         throw new ConcurrentModificationException();
      } else {
         return l.subList(this.first, this.last);
      }
   }

   public void clear() {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            this.get(temp).clear();
            this.last = this.first;
            this.this$0.list = temp;
            this.expected = temp;
         }
      } else {
         synchronized (this.this$0.list) {
            this.get(this.expected).clear();
         }
      }
   }

   public boolean remove(Object o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            boolean r = this.get(temp).remove(o);
            if (r) {
               this.last--;
            }

            this.this$0.list = temp;
            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).remove(o);
         }
      }
   }

   public boolean removeAll(Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            List sub = this.get(temp);
            boolean r = sub.removeAll(o);
            if (r) {
               this.last = this.first + sub.size();
            }

            this.this$0.list = temp;
            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).removeAll(o);
         }
      }
   }

   public boolean retainAll(Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            List sub = this.get(temp);
            boolean r = sub.retainAll(o);
            if (r) {
               this.last = this.first + sub.size();
            }

            this.this$0.list = temp;
            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).retainAll(o);
         }
      }
   }

   public int size() {
      if (this.this$0.fast) {
         return this.get(this.expected).size();
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).size();
      }
   }

   public boolean isEmpty() {
      if (this.this$0.fast) {
         return this.get(this.expected).isEmpty();
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).isEmpty();
      }
   }

   public boolean contains(Object o) {
      if (this.this$0.fast) {
         return this.get(this.expected).contains(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).contains(o);
      }
   }

   public boolean containsAll(Collection o) {
      if (this.this$0.fast) {
         return this.get(this.expected).containsAll(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).containsAll(o);
      }
   }

   public Object[] toArray(Object[] o) {
      if (this.this$0.fast) {
         return this.get(this.expected).toArray(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).toArray(o);
      }
   }

   public Object[] toArray() {
      if (this.this$0.fast) {
         return this.get(this.expected).toArray();
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).toArray();
      }
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      }

      if (this.this$0.fast) {
         return this.get(this.expected).equals(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).equals(o);
      }
   }

   public int hashCode() {
      if (this.this$0.fast) {
         return this.get(this.expected).hashCode();
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).hashCode();
      }
   }

   public boolean add(Object o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            boolean r = this.get(temp).add(o);
            if (r) {
               this.last++;
            }

            this.this$0.list = temp;
            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).add(o);
         }
      }
   }

   public boolean addAll(Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            boolean r = this.get(temp).addAll(o);
            if (r) {
               this.last = this.last + o.size();
            }

            this.this$0.list = temp;
            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).addAll(o);
         }
      }
   }

   public void add(int i, Object o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            this.get(temp).add(i, o);
            this.last++;
            this.this$0.list = temp;
            this.expected = temp;
         }
      } else {
         synchronized (this.this$0.list) {
            this.get(this.expected).add(i, o);
         }
      }
   }

   public boolean addAll(int i, Collection o) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            boolean r = this.get(temp).addAll(i, o);
            this.this$0.list = temp;
            if (r) {
               this.last = this.last + o.size();
            }

            this.expected = temp;
            return r;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).addAll(i, o);
         }
      }
   }

   public Object remove(int i) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            Object o = this.get(temp).remove(i);
            this.last--;
            this.this$0.list = temp;
            this.expected = temp;
            return o;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).remove(i);
         }
      }
   }

   public Object set(int i, Object a) {
      if (this.this$0.fast) {
         synchronized (this.this$0) {
            ArrayList temp = (ArrayList)this.this$0.list.clone();
            Object o = this.get(temp).set(i, a);
            this.this$0.list = temp;
            this.expected = temp;
            return o;
         }
      } else {
         synchronized (this.this$0.list) {
            return this.get(this.expected).set(i, a);
         }
      }
   }

   public Iterator iterator() {
      return new FastArrayList$SubList$SubListIter(this, 0);
   }

   public ListIterator listIterator() {
      return new FastArrayList$SubList$SubListIter(this, 0);
   }

   public ListIterator listIterator(int i) {
      return new FastArrayList$SubList$SubListIter(this, i);
   }

   public Object get(int i) {
      if (this.this$0.fast) {
         return this.get(this.expected).get(i);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).get(i);
      }
   }

   public int indexOf(Object o) {
      if (this.this$0.fast) {
         return this.get(this.expected).indexOf(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).indexOf(o);
      }
   }

   public int lastIndexOf(Object o) {
      if (this.this$0.fast) {
         return this.get(this.expected).lastIndexOf(o);
      }

      synchronized (this.this$0.list) {
         return this.get(this.expected).lastIndexOf(o);
      }
   }

   public List subList(int f, int l) {
      if (this.this$0.list != this.expected) {
         throw new ConcurrentModificationException();
      } else {
         return new FastArrayList$SubList(this.this$0, this.first + f, f + l);
      }
   }
}
