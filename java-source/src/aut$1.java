class aut$1 implements lbi<fok> {
   aut$1(aut var1) {
      this.cfb = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void a(fok var1) {
      String var2 = var1.bsl();
      String[] var3 = var1.iRT;
      switch (var1.iRU) {
         case iRV:
         default:
            for (int var4 = 0; var4 < var3.length; var4++) {
               String var5 = var3[var4].trim();
               if (var5.length() != 0 && var5.charAt(0) != '#') {
                  String var6 = var2 + "(" + (var4 + 1) + ")";
                  this.cfb.q(var5, var6);
               }
            }

            return;
         case iRW:
            this.cfb.h(maf.ExecuteFileFailedFileNotFound.bD(var2));
            return;
         case iRX:
            this.cfb.h(maf.ExecuteFileFailedErrorReadingFile.bD(var2));
      }
   }
}
