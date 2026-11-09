package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$Attribute extends Token {
   public Token$Attribute(long id, String value) {
      super((byte)5);
      this.id = id;
      this.value = value;
   }

   public Token$Attribute() {
      super((byte)5);
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
