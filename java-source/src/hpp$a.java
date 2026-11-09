final class hpp$a extends hrk<hni, String> {
   public hpp$a() {
      super(new lij<>());
   }

   @Override
   public int getFieldCount() {
      return 3;
   }

   public String a(hni var1, int var2) {
      switch (var2) {
         case 0:
            return var1.Name;
         case 1:
            return var1.kOv.getName();
         case 2:
            return var1.iNF == null ? "null" : var1.iNF.dPf();
         default:
            assert false;
            return "";
      }
   }
}
