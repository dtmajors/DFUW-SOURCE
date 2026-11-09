public enum cvq$a {
   fzX(false, lws.tgP),
   fzY(false, lws.tgQ),
   fzZ(false, lws.tgR),
   fAa(false, lws.tgS),
   fAb(true, lws.tgT),
   fAc(false, lws.tgM),
   fAd(false, lws.tgN),
   fAe(false, lws.tgV),
   fAf(false, lws.sZX),
   fAg(false, lws.tgW),
   fAh(false, lws.tgK),
   fAi(false, lws.thg),
   fAj(false, lvm.sWD),
   fAk(false, lvm.sWD),
   fAl(false, lws.tgY),
   fAm(false, lws.tgZ),
   fAn(false, lws.tgU),
   fAo(false, lws.tgX),
   fAp(false, lws.tgL),
   fAq(false, lws.tgO),
   fAr(false, lws.tha),
   fAs(false, lws.thb),
   fAt(false, lws.thc),
   fAu(false, lws.thd),
   fAv(false, lws.the),
   fAw(false, lws.thf),
   fAx(true, lws.thh),
   fAy(false, lws.thi),
   fAz(false, lws.thj),
   fAA(false, lws.thk),
   fAB(false, lws.thl),
   fAC(false, lws.thm),
   fAD(false, lvm.sWD),
   fAE(false, lws.thn),
   fAF(false, lws.tho),
   fAG(false, lws.thp),
   fAH(false, lvm.sWD),
   fAI(false, lvm.sWD),
   fAJ(false, lvm.sWD),
   fAK(false, lvm.sWD),
   fAL(false, lvm.sWD),
   fAM(false, lvm.sWD);

   private boolean fAN = false;
   private lox fAO = null;

   cvq$a(boolean var3, lox var4) {
      this.fAN = var3;
      this.fAO = var4;
   }

   public boolean bcC() {
      return this.fAN;
   }

   public lox bcD() {
      return this.fAO;
   }

   public static cvq$a getContextCommandType(int var0) {
      cvq$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "ContextCommandTypes", "getContextCommandType() Ordinal is invalid.");
      return null;
   }
}
