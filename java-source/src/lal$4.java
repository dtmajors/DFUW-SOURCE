import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$4 extends AbstractAction {
   lal$4(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = (String)lal.s(this.qsJ).getSelectedItem();
      if (var2 != null && !var2.trim().equals("")) {
         int var3 = aln.cL(var2);
         if (var3 > 0) {
            String var4 = (String)lal.w(this.qsJ).getSelectedItem();
            if (var4 != null && !var4.trim().equals("")) {
               int var5 = aln.cM(var4);
               if (var5 > 0) {
                  switch (var3) {
                     case 1:
                        int var15 = lal.x(this.qsJ).getType(lal.t(this.qsJ).getText());
                        if (var15 <= 0) {
                           return;
                        }

                        int var21 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (var21 <= 0) {
                           return;
                        }

                        float var23 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).fJ(var15);
                        lal.z(this.qsJ).eI(var21);
                        lal.z(this.qsJ).ap(var23);
                        break;
                     case 2:
                        int var14 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (var14 <= 0) {
                           return;
                        }

                        float var20 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).eI(var14);
                        lal.z(this.qsJ).ap(var20);
                        break;
                     case 3:
                        int var13 = lal.c(this.qsJ).getType(lal.u(this.qsJ).getText());
                        if (var13 <= 0) {
                           return;
                        }

                        float var19 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).l(var13);
                        lal.z(this.qsJ).ap(var19);
                        break;
                     case 4:
                        String var12 = (String)lal.A(this.qsJ).getSelectedItem();
                        int var17 = ep.as(var12);
                        if (var17 <= 0) {
                           return;
                        }

                        String var22 = (String)lal.B(this.qsJ).getSelectedItem();
                        int var24 = ep.au(var22);
                        if (var24 < 0) {
                           return;
                        }

                        var17 = ep.k(var17, var24);
                        if (var17 <= 0) {
                           return;
                        }

                        float var25 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).fC(var17);
                        lal.z(this.qsJ).ap(var25);
                        break;
                     case 5:
                        String var11 = (String)lal.A(this.qsJ).getSelectedItem();
                        int var7 = ep.as(var11);
                        if (var7 <= 0) {
                           return;
                        }

                        String var8 = (String)lal.B(this.qsJ).getSelectedItem();
                        int var9 = ep.au(var8);
                        if (var9 < 0) {
                           return;
                        }

                        if (var9 != 0 && !ep.aR(var7)) {
                           return;
                        }

                        var7 = ep.k(var7, var9);
                        if (var7 <= 0) {
                           return;
                        }

                        float var10 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).fC(var7);
                        lal.z(this.qsJ).ap(var10);
                        break;
                     case 6:
                        int var6 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (var6 <= 0) {
                           return;
                        }

                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(var3);
                        lal.z(this.qsJ).fV(var5);
                        lal.z(this.qsJ).eI(var6);
                        break;
                     default:
                        assert false;
                        return;
                  }

                  lal.a(this.qsJ).ekx();
               }
            }
         }
      }
   }
}
