import java.util.ArrayList;

class jju$3 extends lie {
   jju$3(jju var1, double var2, boolean var4, ArrayList var5, jjs var6) {
      super(var2, var4);
      this.nrc = var1;
      this.nrf = var5;
      this.nre = var6;
   }

   @Override
   public void dh(double var1) {
      double var3 = this.MessageDelegator.arc().rgz;

      for (ldv var6 : this.nrf) {
         jkk var7 = hso.cxK().cxT().dJc().sp(var6);
         if (var7 != null) {
            String var8 = jju.a(this.nrc, var7, var3);
            this.nre.setText(var6.toString(), var8);
         }
      }
   }
}
