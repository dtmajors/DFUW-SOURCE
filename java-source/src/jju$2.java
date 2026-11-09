import java.util.ArrayList;

class jju$2 extends lie {
   jju$2(jju var1, double var2, boolean var4, ArrayList var5, jjs var6) {
      super(var2, var4);
      this.nrc = var1;
      this.nrd = var5;
      this.nre = var6;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void dh(double var1) {
      double var3 = this.MessageDelegator.arc().rgz;

      for (jka var6 : this.nrd) {
         if (var6.dKW().dKZ().dKY()) {
            String var7 = jju.a(this.nrc, var6, var3);
            this.nre.setText(var6.getGUID().toString(), var7);
         }

         if (var6.dKU() == jkd.nsx && var6.dKV() != null) {
            jkf var8 = hso.cxK().cxT().dJb().sj(var6.getGUID());
            if (var8 != null) {
               switch (var8.dLa()) {
                  case nsA:
                     this.nre.setText(var6.getGUID().toString() + "-RequisitionTime", jju.a(this.nrc, var8, var3));
               }
            }
         }
      }
   }
}
