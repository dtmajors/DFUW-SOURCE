package org.apache.commons.collections.bidimap;

import java.util.Map.Entry;

class TreeBidiMap$EntryView extends TreeBidiMap$View {
   private final int oppositeType;

   TreeBidiMap$EntryView(TreeBidiMap main, int orderType, int dataType) {
      super(main, orderType, dataType);
      this.oppositeType = TreeBidiMap.access$2300(orderType);
   }

   public boolean contains(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry entry = (Entry)obj;
      Object value = entry.getValue();
      TreeBidiMap$Node node = TreeBidiMap.access$1400(super.main, (Comparable)entry.getKey(), super.orderType);
      return node != null && TreeBidiMap$Node.access$000(node, this.oppositeType).equals(value);
   }

   public boolean remove(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      } else {
         Entry entry = (Entry)obj;
         Object value = entry.getValue();
         TreeBidiMap$Node node = TreeBidiMap.access$1400(super.main, (Comparable)entry.getKey(), super.orderType);
         if (node != null && TreeBidiMap$Node.access$000(node, this.oppositeType).equals(value)) {
            TreeBidiMap.access$2100(super.main, node);
            return true;
         } else {
            return false;
         }
      }
   }
}
