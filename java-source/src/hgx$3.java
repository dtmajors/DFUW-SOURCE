class hgx$3 implements lbn {
   hgx$3(hgx var1) {
      this.kpw = var1;
   }

   @Override
   public final void W() {
      assert hgx.a(this.kpw);
      if (hgx.b(this.kpw).isStarted()) {
         hgx.b(this.kpw).stop();
      }

      if (hgx.d(this.kpw).isStarted()) {
         hgx.d(this.kpw).stop();
      }

      double var1 = this.kpw.kLu.kAz.emb();
      hgx.a(this.kpw, this.kpw.kpp.Ep() - var1);
      if (hgx.e(this.kpw) > 0.0) {
         hgx.d(this.kpw).ee(hgx.e(this.kpw));
      }
   }
}
