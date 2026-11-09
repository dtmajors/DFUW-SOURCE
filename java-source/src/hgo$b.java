import alc.a;

class hgo$b {
   public final a koH;
   public final lgg kec;
   private final hpa kgb;
   public final float koI;
   public final hdw koJ;
   private hdz koK;

   public hgo$b(hgo var1, a var2, lgg var3) {
      this.koR = var1;
      this.koH = var2;
      this.kec = var3;
      this.kgb = new hpa(var1.kLu, (String)null, var3, hgo.a(var1, this.koH), hgo.b(var1, this.koH));
      var1.j(this.kgb);
      alk var4 = alc.a(this.koH);
      this.koI = var4.brR;
      this.koJ = hdw.LW(var4.brS);
   }

   public final lgg cfx() {
      return new lgs(this.kec, this.kgb.cqv()).cfx();
   }

   public final void l(hdz var1) {
      if (!lin.i(this.koK, var1)) {
         if (this.koK != null) {
            this.koK.dispose();
         }

         this.koK = var1;
      }
   }

   public final hdz cjF() {
      return this.koK;
   }

   public final void dispose() {
      this.kgb.remove();
      if (this.koK != null) {
         this.koK.dispose();
      }
   }

   public final int cjG() {
      return this.kgb.cqw().cg + this.kgb.getHeight();
   }

   public final boolean m(hdz var1) {
      if (this.koH == a.brl) {
         return cug.uy(var1.kaW.Type);
      }

      if (!var1.kaW.b(this.koJ)) {
         return false;
      }

      if (this.koK != null) {
         return false;
      }

      hea var2 = this.koR.cbP().kck.b(hdx.kbI);
      return var2 == null ? false : alc.a(var1.ceF(), this.koH, var2.getLevel());
   }

   @Override
   public String toString() {
      return null;
   }
}
