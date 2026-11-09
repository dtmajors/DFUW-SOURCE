final class hpo$a extends hrk<hms, String> {
   public hpo$a(lij<hms> var1) {
      super(var1);
   }

   @Override
   public int getFieldCount() {
      return 2;
   }

   public String d(hms var1, int var2) {
      switch (var2) {
         case 0:
            return var1.jLK;
         case 1:
            return var1.i(var1.cqE()).toString();
         default:
            assert false;
            return "";
      }
   }
}
