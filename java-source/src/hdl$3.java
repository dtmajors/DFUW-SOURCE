class hdl$3 implements lbi<gpr> {
   hdl$3(hdl var1) {
      this.jXb = var1;
   }

   public void b(gpr var1) {
      assert hdl.a(this.jXb);
      if (var1.alW != null) {
         switch (var1.alW.aFG) {
            case 1:
               hdl.a(this.jXb, var1.alW);
               hdl.b(this.jXb, true);
               break;
            case 2:
            case 4:
               hdl.b(this.jXb, false);
               break;
            case 3:
               hdl.b(this.jXb, false);
               hdl.a(this.jXb, var1.alW);
               hdl.b(this.jXb, true);
         }
      }
   }
}
