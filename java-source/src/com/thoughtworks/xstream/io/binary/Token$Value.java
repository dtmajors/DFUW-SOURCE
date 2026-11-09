package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$Value extends Token {
   public Token$Value(String value) {
      super((byte)6);
      this.value = value;
   }

   public Token$Value() {
      super((byte)6);
   }

   public void writeTo(DataOutput out, byte idType) throws IOException {
      this.writeString(out, this.value);
   }

   public void readFrom(DataInput in, byte idType) throws IOException {
      this.value = this.readString(in);
   }
}
