public enum mqm$a {
   Eed,
   Eee,
   Eef,
   Eeg,
   Eeh,
   Eei,
   Eej,
   Eek,
   Eel;

   public static mqm$a getValueByOrdinal(int var0) {
      if (var0 == Eed.ordinal()) {
         return Eed;
      } else if (var0 == Eee.ordinal()) {
         return Eee;
      } else if (var0 == Eei.ordinal()) {
         return Eei;
      } else if (var0 == Eej.ordinal()) {
         return Eej;
      } else if (var0 == Eek.ordinal()) {
         return Eek;
      } else {
         return var0 == Eel.ordinal() ? Eel : null;
      }
   }

   public static mqm$a getValueByName(String var0) {
      if (var0.equals(Eed.name())) {
         return Eed;
      } else if (var0.equals(Eee.name())) {
         return Eee;
      } else if (var0.equals(Eei.name())) {
         return Eei;
      } else if (var0.equals(Eej.name())) {
         return Eej;
      } else if (var0.equals(Eek.name())) {
         return Eek;
      } else {
         return var0.equals(Eel.name()) ? Eel : null;
      }
   }
}
