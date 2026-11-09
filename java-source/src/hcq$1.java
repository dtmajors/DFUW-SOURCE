class hcq$1 implements lbn {
   hcq$1(hcq var1) {
      this.jIe = var1;
   }

   @Override
   public final void W() {
      assert hcq.a(this.jIe);
      assert hcq.b(this.jIe) != null;
      hie var3 = hcq.c(this.jIe);
      jos var1;
      jox var2;
      if (!var3.isCompleted()) {
         var1 = null;
         var2 = null;
      } else {
         var2 = var3.cmg();
         hcq$a var4 = (hcq$a)var3.ccw();
         var1 = var4.iNw;
      }

      hcq.a(this.jIe, false);
      hcq.a(this.jIe, (hnu)null);
      if (var2 != null) {
         hcq.a(this.jIe, var2);
         hcq.a(this.jIe, var1);
         this.jIe.kLu.kAz.b(hcq.d(this.jIe));
      }
   }
}
