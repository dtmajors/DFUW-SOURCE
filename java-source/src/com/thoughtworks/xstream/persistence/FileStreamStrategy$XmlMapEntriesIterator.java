package com.thoughtworks.xstream.persistence;

import java.io.File;
import java.util.Iterator;

class FileStreamStrategy$XmlMapEntriesIterator implements Iterator {
   private File[] files;
   private int position;
   private File current;

   FileStreamStrategy$XmlMapEntriesIterator(FileStreamStrategy var1) {
      this.this$0 = var1;
      this.files = FileStreamStrategy.access$100(this.this$0).listFiles(FileStreamStrategy.access$000(this.this$0));
      this.position = -1;
      this.current = null;
   }

   public boolean hasNext() {
      return this.position + 1 < this.files.length;
   }

   public void remove() {
      if (this.current == null) {
         throw new IllegalStateException();
      }

      this.current.delete();
   }

   public Object next() {
      return new FileStreamStrategy$XmlMapEntriesIterator$1(this);
   }
}
