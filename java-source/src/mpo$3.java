import java.util.List;

class mpo$3 extends mjg {
   mpo$3(mpo var1, List var2, String var3) {
      this.DWe = var1;
      this.DWg = var2;
      this.DWh = var3;
   }

   @Override
   public Object Hv() {
      return mpo.a(this.DWe, this.DWg, this.DWh);
   }

   @Override
   public void finished() {
      mpo.b(this.DWe).setEnabled(true);
   }
}
