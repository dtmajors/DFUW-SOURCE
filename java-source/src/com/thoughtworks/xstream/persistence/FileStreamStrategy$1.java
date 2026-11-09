package com.thoughtworks.xstream.persistence;

import java.io.File;
import java.io.FilenameFilter;

class FileStreamStrategy$1 implements FilenameFilter {
   FileStreamStrategy$1(FileStreamStrategy var1) {
      this.this$0 = var1;
   }

   public boolean accept(File dir, String name) {
      return new File(dir, name).isFile() && this.this$0.isValid(dir, name);
   }
}
