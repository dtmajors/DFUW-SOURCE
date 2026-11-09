package com.thoughtworks.xstream.persistence;

import java.util.AbstractSet;
import java.util.Iterator;

class XmlMap$XmlMapEntries extends AbstractSet {
   XmlMap$XmlMapEntries(XmlMap var1) {
      this.this$0 = var1;
   }

   public int size() {
      return this.this$0.size();
   }

   public boolean isEmpty() {
      return this.this$0.isEmpty();
   }

   public Iterator iterator() {
      return XmlMap.access$000(this.this$0).iterator();
   }
}
