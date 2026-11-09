enum mhd$a {
   DwI,
   DwJ,
   DwK;

   public static mhd$a getValueByOrdinal(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : DwI;
   }
}
