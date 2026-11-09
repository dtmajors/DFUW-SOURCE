public enum cu$b {
   kX(mad.uaK),
   kY(mad.uaL),
   kZ(mad.uaM),
   la(mad.uaN),
   lb(mad.uaO),
   lc(mad.uaP),
   ld(mad.uaQ),
   le(mad.uaR),
   lf(mad.uaS),
   lg(mad.uaT),
   lh(mad.uaU),
   li(mad.uaV),
   lj(mad.uaW),
   lk(mad.uaX),
   ll(mad.sWD);

   private lox DisplayName = null;
   public static cu$b[] lm = values();

   public String cu() {
      return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
   }

   cu$b(lox var3) {
      this.DisplayName = var3;
   }

   @Override
   public String toString() {
      return !lcw.ena() && !lcw.enb() ? super.toString() : this.DisplayName.bD().exA();
   }
}
