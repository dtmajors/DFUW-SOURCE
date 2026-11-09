package com.thoughtworks.xstream.core.util;

import java.text.SimpleDateFormat;
import java.util.Locale;

class ThreadSafeSimpleDateFormat$1 implements Pool$Factory {
   ThreadSafeSimpleDateFormat$1(ThreadSafeSimpleDateFormat var1) {
      this.this$0 = var1;
   }

   public Object newInstance() {
      return new SimpleDateFormat(ThreadSafeSimpleDateFormat.access$000(this.this$0), Locale.ENGLISH);
   }
}
