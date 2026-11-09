package com.thoughtworks.xstream.io.binary;

import com.thoughtworks.xstream.io.StreamException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Token$Formatter {
   public void write(DataOutput out, Token token) throws IOException {
      long id = token.getId();
      byte idType;
      if (id <= 255L) {
         idType = 8;
      } else if (id <= 65535L) {
         idType = 16;
      } else if (id <= 4294967295L) {
         idType = 24;
      } else {
         idType = 32;
      }

      out.write(token.getType() + idType);
      token.writeTo(out, idType);
   }

   public Token read(DataInput in) throws IOException {
      byte nextByte = in.readByte();
      byte type = (byte)(nextByte & 7);
      byte idType = (byte)(nextByte & 56);
      Token token = this.contructToken(type);
      token.readFrom(in, idType);
      return token;
   }

   private Token contructToken(byte type) {
      switch (type) {
         case 2:
            return new Token$MapIdToValue();
         case 3:
            return new Token$StartNode();
         case 4:
            return new Token$EndNode();
         case 5:
            return new Token$Attribute();
         case 6:
            return new Token$Value();
         default:
            throw new StreamException("Unknown token type");
      }
   }
}
