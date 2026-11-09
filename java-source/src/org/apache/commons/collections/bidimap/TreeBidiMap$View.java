package org.apache.commons.collections.bidimap;

import java.util.AbstractSet;
import java.util.Iterator;

class TreeBidiMap$View extends AbstractSet {
   protected final TreeBidiMap main;
   protected final int orderType;
   protected final int dataType;

   TreeBidiMap$View(TreeBidiMap main, int orderType, int dataType) {
      this.main = main;
      this.orderType = orderType;
      this.dataType = dataType;
   }

   public Iterator iterator() {
      return new TreeBidiMap$ViewIterator(this.main, this.orderType, this.dataType);
   }

   public int size() {
      return this.main.size();
   }

   public boolean contains(Object obj) {
      TreeBidiMap.access$1300(obj, this.dataType);
      return TreeBidiMap.access$1400(this.main, (Comparable)obj, this.dataType) != null;
   }

   public boolean remove(Object obj) {
      return TreeBidiMap.access$1500(this.main, (Comparable)obj, this.dataType) != null;
   }

   public void clear() {
      this.main.clear();
   }
}
