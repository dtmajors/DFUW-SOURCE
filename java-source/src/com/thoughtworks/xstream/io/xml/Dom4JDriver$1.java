package com.thoughtworks.xstream.io.xml;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.io.FilterWriter;
import java.io.Writer;

class Dom4JDriver$1 extends FilterWriter {
   Dom4JDriver$1(Dom4JDriver var1, Writer x0, HierarchicalStreamWriter[] var3) {
      super(x0);
      this.this$0 = var1;
      this.val$writer = var3;
   }

   public void close() {
      this.val$writer[0].close();
   }
}
