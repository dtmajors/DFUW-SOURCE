package org.apache.commons.collections;

import java.util.StringTokenizer;

class ExtendedProperties$PropertiesTokenizer extends StringTokenizer {
   static final String DELIMITER = ",";

   public ExtendedProperties$PropertiesTokenizer(String string) {
      super(string, ",");
   }

   public boolean hasMoreTokens() {
      return super.hasMoreTokens();
   }

   public String nextToken() {
      StringBuffer buffer = new StringBuffer();

      while (this.hasMoreTokens()) {
         String token = super.nextToken();
         if (!ExtendedProperties.access$000(token)) {
            buffer.append(token);
            break;
         }

         buffer.append(token.substring(0, token.length() - 1));
         buffer.append(",");
      }

      return buffer.toString().trim();
   }
}
