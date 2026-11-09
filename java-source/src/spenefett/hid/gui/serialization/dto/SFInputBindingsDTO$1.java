package spenefett.hid.gui.serialization.dto;

import java.util.Comparator;

final class SFInputBindingsDTO$1 implements Comparator<String> {
   public int compare(String var1, String var2) {
      if (var1.contains("_CTRL") || var1.contains("_ALT") || var1.contains("_SHIFT")) {
         return -1;
      } else {
         return !var2.contains("_CTRL") && !var2.contains("_ALT") && !var2.contains("_SHIFT") ? 0 : 1;
      }
   }
}
