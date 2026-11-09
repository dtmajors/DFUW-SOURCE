package com.thoughtworks.xstream.persistence;

import java.io.File;
import java.util.Map.Entry;

class FileStreamStrategy$XmlMapEntriesIterator$1 implements Entry {
   private File file;
   private String key;

   FileStreamStrategy$XmlMapEntriesIterator$1(FileStreamStrategy$XmlMapEntriesIterator var1) {
      this.this$1 = var1;
      this.file = FileStreamStrategy$XmlMapEntriesIterator.access$202(
         this.this$1, FileStreamStrategy$XmlMapEntriesIterator.access$300(this.this$1)[FileStreamStrategy$XmlMapEntriesIterator.access$404(this.this$1)]
      );
      this.key = FileStreamStrategy$XmlMapEntriesIterator.access$500(this.this$1).extractKey(this.file.getName());
   }

   public Object getKey() {
      return this.key;
   }

   public Object getValue() {
      return FileStreamStrategy.access$600(FileStreamStrategy$XmlMapEntriesIterator.access$500(this.this$1), this.file);
   }

   public Object setValue(Object value) {
      return FileStreamStrategy$XmlMapEntriesIterator.access$500(this.this$1).put(this.key, value);
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry e2 = (Entry)obj;
      return (this.key == null ? e2.getKey() == null : this.key.equals(e2.getKey()))
         && (this.getValue() == null ? e2.getValue() == null : this.getValue().equals(e2.getValue()));
   }
}
