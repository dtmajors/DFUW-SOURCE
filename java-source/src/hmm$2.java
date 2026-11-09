class hmm$2 implements hpf$a {
   hmm$2(hmm var1) {
      this.kLs = var1;
   }

   @Override
   public String mQ(String var1) {
      return var1;
   }

   @Override
   public void chF() {
      String var1 = hmm.a(this.kLs).kiG.chz();
      if (var1.length() == 0) {
         hmm.a(this.kLs).kiG.ns(true);
      } else {
         double var2;
         try {
            var1 = var1.replaceAll(",", ".");
            var2 = hmm.f(this.kLs) > 0 ? Double.parseDouble(var1) : Integer.parseInt(var1);
         } catch (Exception var5) {
            hmm.a(this.kLs).kiG.ns(true);
            return;
         }

         if (!(var2 < hmm.c(this.kLs)) && !(var2 > hmm.d(this.kLs))) {
            hmm.a(this.kLs, var2);
            hmm.a(this.kLs).kiG.ns(false);
         } else {
            hmm.a(this.kLs).kiG.ns(true);
         }
      }
   }

   @Override
   public void chG() {
   }
}
