class hfk$22 implements hmj {
   hfk$22(hfk var1) {
      this.kiH = var1;
   }

   @Override
   public lbl<lbn> chx() {
      return hfk.l(this.kiH);
   }

   @Override
   public lbl<lbn> chy() {
      return hfk.m(this.kiH);
   }

   @Override
   public String chz() {
      return hfk.n(this.kiH);
   }

   @Override
   public boolean mN(String var1) {
      if (!hfk.a(this.kiH, var1)) {
         return false;
      }

      this.setCaretPosition(0);
      return true;
   }

   @Override
   public int getCaretPosition() {
      assert hfk.o(this.kiH);
      return hfk.p(this.kiH);
   }

   @Override
   public void setCaretPosition(int var1) {
      this.L(var1, false);
   }

   @Override
   public void L(int var1, boolean var2) {
      assert var1 >= 0 && var1 <= this.chz().length() : var1 + " " + this.chz().length();
      int var3 = var2 ? hfk.q(this.kiH) : var1;
      hfk.a(this.kiH, var1, var3);
   }

   @Override
   public void selectAll() {
      assert hfk.o(this.kiH);
      hfk.a(this.kiH, hfk.n(this.kiH).length(), 0);
   }

   @Override
   public String chA() {
      int var1 = hfk.q(this.kiH);
      int var2 = hfk.p(this.kiH);
      if (var1 > var2) {
         int var3 = var1;
         var1 = var2;
         var2 = var3;
      }

      String var4 = this.chz();
      return var4.substring(var1, var2);
   }

   @Override
   public boolean mO(String var1) {
      int var2 = hfk.q(this.kiH);
      int var3 = hfk.p(this.kiH);
      if (var2 > var3) {
         int var4 = var2;
         var2 = var3;
         var3 = var4;
      }

      String var6 = this.chz();
      var6 = var6.substring(0, var2) + var1 + var6.substring(var3);
      this.L(var2, false);
      if (!hfk.a(this.kiH, var6)) {
         return false;
      }

      var6 = this.chz();
      int var5 = var2 + var1.length();
      if (var5 > var6.length()) {
         var5 = var6.length();
      }

      hfk.a(this.kiH, -1);
      this.L(var5, false);
      return true;
   }

   @Override
   public void cha() {
      this.chb();
      this.mO("");
   }

   @Override
   public void chb() {
      String var1 = this.chA();
      this.kiH.kLu.clipboardWrite(var1);
   }

   public String mP(String var1) {
      if (var1 != null) {
         boolean var2 = false;
         StringBuilder var3 = new StringBuilder();

         for (int var4 = 0; var4 < var1.length(); var4++) {
            char var5 = var1.charAt(var4);
            if (var2) {
               if (var5 == 'O') {
                  var5 = 'P';
               } else if (var5 == 'S') {
                  var5 = 'T';
               }
            }

            var2 = var5 == '^';
            var3.append(var5);
         }

         var1 = var3.toString();
      }

      return var1;
   }

   @Override
   public void chc() {
      String var1 = this.mP(this.kiH.kLu.csf());
      if (var1 != null) {
         this.mO(var1);
      }
   }

   @Override
   public void chB() {
      this.chC();
      this.mO("");
   }

   @Override
   public void chC() {
      String var1 = this.kiH.kLu.csf();
      if (var1 == null) {
         var1 = "";
      }

      var1 = var1 + this.chA();
      this.kiH.kLu.clipboardWrite(var1);
   }

   @Override
   public boolean chD() {
      return hfk.r(this.kiH);
   }

   @Override
   public boolean ns(boolean var1) {
      if (var1 == hfk.r(this.kiH)) {
         return false;
      }

      hfk.b(this.kiH, var1);
      this.kiH.chm();
      return true;
   }

   @Override
   public int chE() {
      return 1;
   }
}
