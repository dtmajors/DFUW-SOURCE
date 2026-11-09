package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$StartNode extends Token {
   public Token$StartNode(long id) {
      super((byte)3);
      this.id = id;
   }

   public Token$StartNode() {
      super((byte)3);
   }

   public void writeTo(DataOutput out, byte idType) throws IOException {
      this.writeId(out, this.id, idType);
   }

   public void readFrom(DataInput in, byte idType) throws IOException {
      this.id = this.readId(in, idType);
   }
}
