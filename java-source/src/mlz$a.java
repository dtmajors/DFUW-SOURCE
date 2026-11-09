import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

class mlz$a implements Runnable {
   private String DLV;
   private final DecimalFormat sM;

   public mlz$a(mlz var1) {
      this.DLU = var1;
      this.DLV = "";
      DecimalFormatSymbols var2 = new DecimalFormatSymbols();
      var2.setDecimalSeparator('.');
      this.sM = new DecimalFormat("###.####", var2);
   }

   @Override
   public void run() {
      this.sM.setMinimumIntegerDigits(3);
      this.sM.setMinimumFractionDigits(5);
      double var1 = -1.0;
      mje.DCg = var1;
      if (mlz.i(this.DLU).getModel().getSize() != 0) {
         int var3 = 1;
         int var4 = 0;

         label101:
         for (int var5 = mlz.i(this.DLU).getModel().getSize(); var4 < var5; var4++) {
            String var6 = (String)mlz.i(this.DLU).getModel().getElementAt(var4);
            mlz.a(this.DLU, var6);
            if (mlz.j(this.DLU) == null) {
               return;
            }

            while (!mlz.k(this.DLU).ayZ()) {
            }

            mlz.a(this.DLU, (bvd)mlz.k(this.DLU));

            try {
               Thread.sleep(500L);
            } catch (InterruptedException var19) {
               var19.printStackTrace();
            }

            if (var1 < 0.0) {
               var1 = System.currentTimeMillis() - 16.6666;
               mje.DCg = var1;
            }

            int var7 = 0;

            while (var7 < mlz.j(this.DLU).length) {
               if (!mlz.g(this.DLU)) {
                  break label101;
               }

               String var8 = null;
               synchronized (mlz.j(this.DLU)) {
                  if (mlz.k(this.DLU) == null) {
                     break;
                  }

                  var8 = mlz.j(this.DLU)[var7];
               }

               var7++;
               lfn.b(0, this.getClass().getSimpleName(), "run() playing: " + var8);
               int var9 = lkv.AG(var8);
               if (var9 == -1) {
                  lfn.b(4, "AnimPlayer", "run() Invalid state = " + var8);
               } else {
                  lkr var10 = mlz.k(this.DLU).azA().adk(var9);
                  if (var10 != null) {
                     String var11 = var10.getSetName();
                     float var12 = var10.etP();
                     dzv var13 = (dzv)mlz.d(this.DLU).d(7425);
                     var13.dTs = var9;
                     var13.on(mlz.k(this.DLU).getGUID());
                     mlz.d(this.DLU).a(var13);
                     double var14 = (System.currentTimeMillis() - var1) / 1000.0;
                     this.a(var3, var14, var6 + "-" + var8);
                     var3++;

                     try {
                        int var16 = mlz.f(this.DLU).getValue() * 1000;
                        var16 = (int)(var12 * 1000.0F) + var16;
                        lfn.b(0, this.getClass().getSimpleName(), "run() Sleeping time = " + var16);
                        Thread.sleep(var16);
                     } catch (InterruptedException var18) {
                        var18.printStackTrace();
                     }
                  }
               }
            }

            if (mlz.k(this.DLU) != null) {
               fub var24 = (fub)mlz.d(this.DLU).d(1027);
               var24.Rs = mlz.k(this.DLU).getGUID();
               var24.on(mlz.k(this.DLU).getGUID());
               var24.iWE = fub.iHB;
               mlz.d(this.DLU).a(var24);
               mlz.a(this.DLU, (bvf)null);
            }

            if (this.DLU.eik != null) {
               fub var25 = (fub)mlz.d(this.DLU).d(1027);
               var25.Rs = this.DLU.eik.getGUID();
               var25.on(this.DLU.eik.getGUID());
               var25.iWE = fub.iHB;
               mlz.d(this.DLU).a(var25);
               this.DLU.eik = null;
            }

            try {
               Thread.sleep(3000L);
            } catch (InterruptedException var17) {
               var17.printStackTrace();
            }
         }

         mlz.a(this.DLU, false);
         bvk.dTp = "";
         mje.DCg = -1.0;
         System.out.println("Finished Playing Anims");
         mje.DCg = -1.0;
         String var21 = lcw.qLb + "xml-files/worldbuilder/animation_player_time_markers.txt";
         if (mlz.l(this.DLU) != null) {
            var21 = lcw.qLb + "xml-files/" + "worldbuilder" + "/" + "AnimationTimeStamps_" + mlz.l(this.DLU) + ".txt";
         }

         jrw var22 = new jrw(var21);
         jry.a(var22, this.DLV);
      }
   }

   private void a(int var1, double var2, String var4) {
      String var5 = this.sM.format(var2);
      bvk.dTp = "[ " + var5 + " ] <-- Timestamp";
      String var6 = "" + var1 + " " + var5 + " \"" + var4 + "\"" + " 0 -1.0";
      this.DLV = this.DLV + var6 + "\n";
      System.out.println(var6);
   }

   private boolean Cy(String var1) {
      if (mlz.k(this.DLU) == null) {
         return false;
      }

      for (lkr var4 : mlz.k(this.DLU).azA().eue()) {
         int var5 = var4.etO();
         if (var4.getSetName().toLowerCase() == var1.toLowerCase()) {
            return true;
         }
      }

      return false;
   }
}
