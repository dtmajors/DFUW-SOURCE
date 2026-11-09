package org.apache.commons.collections;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

class ExtendedProperties$PropertiesReader extends LineNumberReader {
   public ExtendedProperties$PropertiesReader(Reader reader) {
      super(reader);
   }

   public String readProperty() throws IOException {
      StringBuffer buffer = new StringBuffer();

      try {
         while (true) {
            String line = this.readLine().trim();
            if (line.length() != 0 && line.charAt(0) != '#') {
               if (!ExtendedProperties.access$000(line)) {
                  buffer.append(line);
                  return buffer.toString();
               }

               line = line.substring(0, line.length() - 1);
               buffer.append(line);
            }
         }
      } catch (NullPointerException var3) {
         return null;
      }
   }
}
