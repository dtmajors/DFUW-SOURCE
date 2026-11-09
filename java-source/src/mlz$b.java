import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

class mlz$b implements Runnable {
   private final DecimalFormat sM;
   private String DLV;

   public mlz$b(mlz var1) {
      this.DLU = var1;
      this.DLV = "";
      DecimalFormatSymbols var2 = new DecimalFormatSymbols();
      var2.setDecimalSeparator('.');
      this.sM = new DecimalFormat("###.####", var2);
      this.sM.setMinimumIntegerDigits(3);
      this.sM.setMinimumFractionDigits(5);
   }

   @Override
   public void run() {
      try {
         Thread.sleep(500L);
      } catch (Exception var21) {
         lfn.b(5, this.getClass().getName(), "playSfxList() :" + var21);
      }

      double var1 = System.currentTimeMillis() - 16.6666;
      mje.DCg = var1;
      int var3 = mlz.c(this.DLU).getSelectedIndex();
      if (var3 < 0) {
         var3 = 0;
      }

      int var4 = 0;

      for (int var5 = var3; var5 < mlz.a(this.DLU).size(); var5++) {
         mmz var6 = (mmz)mlz.a(this.DLU).get(var5);
         Integer var7 = del.dr(var6.DOh);
         if (var7 == -1) {
            lfn.b(5, this.getClass().getName(), "run() : could nor find special effect" + var6.DOh);
         } else {
            dgj var8 = lea.bkO().get(var7);
            float var9 = var6.doT;
            if (var9 == 0.0F) {
               var9 = var8.getDuration();
            }

            if (var9 < 0.0F) {
               var9 = 3.0F;
            }

            hac var10 = (hac)mlz.d(this.DLU).d(4097);
            var10.Lb(116);
            ljq var11 = new ljq(0.0F, 0.0F, -var6.mB);
            var11.es(mlz.e(this.DLU));
            var10.c(var11);
            mlz.d(this.DLU).a(var10);
            bvk var12 = new bvk(var6.toString(), 1.0);
            gzw var13 = (gzw)mlz.d(this.DLU).d(4124);
            var13.on(lcr.qAE);
            var13.jvM = var12;
            mlz.d(this.DLU).a(var13);
            double var14 = (System.currentTimeMillis() - var1) / 1000.0;
            String var16 = this.sM.format(var14);
            bvk.dTp = "[ " + var16 + " ] <-- Timestamp";
            var4++;
            String var17 = "";
            if (var6.DisplayName.length() > 0) {
               var17 = var6.DisplayName + " ";
            }

            var17 = var17 + var6.DOh;
            this.DLV = this.DLV + var4 + " " + var16 + " \"" + var17 + "\" 0 -1.0\n";
            hay var18 = (hay)mlz.d(this.DLU).d(4117);
            var18.on(lcr.qAE);
            var18.f(lcr.qAE);
            if (var8.getDuration() < 0.0F) {
               var18.setDuration(var9);
            } else {
               var18.setDuration(var8.getDuration());
            }

            var18.mS(true);
            var18.mR(false);
            var18.nO(mlz.eFe());
            var18.qQ(mlz.eFf());
            var18.setTargetPosition(mlz.eFg());
            var18.setSourcePosition(mlz.eFh());
            var18.fJ(var7);
            mlz.d(this.DLU).a(var18);

            try {
               int var19 = mlz.f(this.DLU).getValue() * 1000;
               Thread.sleep((long)(var9 * 1000.0F + var19));
            } catch (InterruptedException var20) {
               lfn.b(5, this.getClass().getName(), "run() :" + var20);
            }

            if (!mlz.g(this.DLU)) {
               break;
            }
         }
      }

      mlz.a(this.DLU, false);
      bvk.dTp = "";
      mje.DCg = -1.0;
      String var22 = lcw.qLb + "xml-files/worldbuilder/sfx_player_time_markers.txt";
      if (mlz.h(this.DLU) != null) {
         var22 = lcw.qLb + "xml-files/" + "worldbuilder" + "/" + "SfxTimeStamps_" + mlz.h(this.DLU) + ".txt";
      }

      jrw var23 = new jrw(var22);
      jry.a(var23, this.DLV);
   }
}
