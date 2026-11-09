package org.apache.commons.collections.bidimap;

import org.apache.commons.collections.OrderedMapIterator;

class TreeBidiMap$ViewMapIterator extends TreeBidiMap$ViewIterator implements OrderedMapIterator {
   private final int oppositeType = TreeBidiMap.access$2300(this.dataType);

   TreeBidiMap$ViewMapIterator(TreeBidiMap main, int orderType) {
      super(main, orderType, orderType);
   }

   public Object getKey() {
      if (super.lastReturnedNode == null) {
         throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
      } else {
         return TreeBidiMap$Node.access$000(super.lastReturnedNode, super.dataType);
      }
   }

   public Object getValue() {
      if (super.lastReturnedNode == null) {
         throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
      } else {
         return TreeBidiMap$Node.access$000(super.lastReturnedNode, this.oppositeType);
      }
   }

   public Object setValue(Object obj) {
      throw new UnsupportedOperationException();
   }
}
