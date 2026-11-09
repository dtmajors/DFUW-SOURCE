class hpf$27 implements hmj {
   hpf$27(hpf var1) {
      this.kVo = var1;
   }

   @Override
   public lbl<lbn> chx() {
      return hpf.g(this.kVo);
   }

   @Override
   public lbl<lbn> chy() {
      return hpf.h(this.kVo);
   }

   @Override
   public String chz() {
      return hpf.i(this.kVo).getText();
   }

   @Override
   public boolean mN(String var1) {
      if (!hpf.a(this.kVo, var1)) {
         return false;
      }

      this.setCaretPosition(0);
      return true;
   }

   @Override
   public int getCaretPosition() {
      assert hpf.a(this.kVo);
      return hpf.j(this.kVo);
   }

   @Override
   public void setCaretPosition(int var1) {
      this.L(var1, false);
   }

   @Override
   public void L(int var1, boolean var2) {
      assert var1 >= 0 && var1 <= this.chz().length() : var1 + " " + this.chz().length();
      int var3 = var2 ? hpf.k(this.kVo) : var1;
      hpf.a(this.kVo, var1, var3);
   }

   @Override
   public void selectAll() {
      assert hpf.a(this.kVo);
      lgg var1 = this.kVo.cqw();
      hpf.a(this.kVo, hpf.i(this.kVo).getText().length(), 0);
      this.kVo.z(var1);
   }

   @Override
   public String chA() {
      int var1 = hpf.k(this.kVo);
      int var2 = hpf.j(this.kVo);
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
      int var2 = hpf.k(this.kVo);
      int var3 = hpf.j(this.kVo);
      if (var2 > var3) {
         int var4 = var2;
         var2 = var3;
         var3 = var4;
      }

      String var6 = this.chz();
      var6 = var6.substring(0, var2) + var1 + var6.substring(var3);
      this.L(var3, false);
      if (!hpf.a(this.kVo, var6)) {
         return false;
      }

      var6 = this.chz();
      int var5 = var2 + var1.length();
      if (var5 > var6.length()) {
         var5 = var6.length();
      }

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
      this.kVo.kLu.clipboardWrite(var1);
   }

   @Override
   public void chc() {
      String var1 = this.kVo.kLu.clipboardRead();
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
      String var1 = this.kVo.kLu.clipboardRead();
      if (var1 == null) {
         var1 = "";
      }

      var1 = var1 + this.chA();
      this.kVo.kLu.clipboardWrite(var1);
   }

   @Override
   public boolean chD() {
      return hpf.l(this.kVo);
   }

   @Override
   public boolean ns(boolean var1) {
      if (var1 == hpf.l(this.kVo)) {
         return false;
      }

      hpf.b(this.kVo, var1);
      this.kVo.chm();
      return true;
   }

   @Override
   public int chE() {
      return hpf.i(this.kVo).getLineCount();
   }
}
