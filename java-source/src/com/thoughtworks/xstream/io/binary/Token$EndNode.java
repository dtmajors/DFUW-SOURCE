package com.thoughtworks.xstream.io.binary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$EndNode extends Token {
   public Token$EndNode() {
      super((byte)4);
   }

   public void writeTo(DataOutput out, byte idType) throws IOException {
   }

   public void readFrom(DataInput in, byte idType) throws IOException {
   }
}
