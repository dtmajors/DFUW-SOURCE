package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$MapIdToValue extends Token {
   public Token$MapIdToValue(long id, String value) {
      super((byte)2);
      this.id = id;
      this.value = value;
   }

   public Token$MapIdToValue() {
      super((byte)2);
   }

   public void writeTo(DataOutput out, byte idType) throws IOException {
      this.writeId(out, this.id, idType);
      this.writeString(out, this.value);
   }

   public void readFrom(DataInput in, byte idType) throws IOException {
      this.id = this.readId(in, idType);
      this.value = this.readString(in);
   }
}
