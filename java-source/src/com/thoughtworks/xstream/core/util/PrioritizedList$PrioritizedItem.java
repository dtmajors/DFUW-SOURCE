package com.thoughtworks.xstream.core.util;

class PrioritizedList$PrioritizedItem implements Comparable {
   final Object value;
   final int priority;
   final int id;

   public PrioritizedList$PrioritizedItem(Object value, int Prioritized, int id) {
      this.value = value;
      this.priority = Prioritized;
      this.id = id;
   }

   public int compareTo(Object o) {
      PrioritizedList$PrioritizedItem other = (PrioritizedList$PrioritizedItem)o;
      return this.priority != other.priority ? other.priority - this.priority : other.id - this.id;
   }

   public boolean equals(Object obj) {
      return this.id == ((PrioritizedList$PrioritizedItem)obj).id;
   }
}
