import java.util.List;

class jbo$1 implements hyk {
   jbo$1(jbo var1, List var2) {
      this.mOJ = var1;
      this.lra = var2;
   }

   @Override
   public String[] cDR() {
      return this.lra.toArray(new String[this.lra.size()]);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      jbm var7 = jbm.getValueByName(var2);
      switch (var7) {
         case mOk:
            jbo.a(this.mOJ, var7);
            break;
         case mOj:
            jbo.a(this.mOJ, var7);
            break;
         case mOp:
            jbo.a(this.mOJ, var7);
            break;
         case mOi:
            jbo.a(this.mOJ);
            if (jbo.dwJ() != null) {
               jbo.cOH().czi();
            }

            if (hyn.cyJ() != null) {
               hyn.cyJ().cHy().setVisible(false);
            }
            break;
         case mOn:
            jbo.a(this.mOJ, !jbo.b(this.mOJ));
            this.mOJ.a("toggleModifiers", new Object[]{jbo.b(this.mOJ)});
            if (jbo.cOJ() != null) {
               jbo.cOK().czi();
            }

            if (hyn.cyJ() != null) {
               hyn.cyJ().cHy().setVisible(false);
            }
            break;
         case mOo:
            jbo.a(this.mOJ, 2);
            if (jbo.cOM() != null) {
               jbo.dwK().czi();
            }

            if (hyn.cyJ() != null) {
               hyn.cyJ().cHy().setVisible(false);
            }
      }
   }

   @Override
   public void cDU() {
   }
}
