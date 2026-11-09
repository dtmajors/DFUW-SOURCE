import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mlr$c extends MouseAdapter {
   mlr$c(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mlr.n(this.DKI))) {
            mlr.o(this.DKI).show(var1.getComponent(), var1.getX(), var1.getY());
            int var3 = mlr.n(this.DKI).rowAtPoint(new Point(var1.getX(), var1.getY()));
            mlr.n(this.DKI).setRowSelectionInterval(var3, var3);
         } else if (var2.equals(mlr.p(this.DKI))) {
            int var7 = mlr.p(this.DKI).rowAtPoint(new Point(var1.getX(), var1.getY()));
            mlr.p(this.DKI).setRowSelectionInterval(var7, var7);
            lkr var4 = mlr.p(this.DKI).eFT();
            if (var4 != null && var4 instanceof lkr) {
               mlr.e(this.DKI);
            } else {
               lfn.b(4, "SFMouseHandler", "mousePressed() : Nothing is selected, or wrong type of object!");
            }
         } else if (!var2.equals(mlr.q(this.DKI)) && !var2.equals(mlr.r(this.DKI).getList()) && !var2.equals(mlr.s(this.DKI).getList())) {
            if (var2.equals(mlr.t(this.DKI)) || var2.equals(mlr.t(this.DKI).getTableHeader())) {
               mlr.u(this.DKI).show(var1.getComponent(), var1.getX(), var1.getY());
               int var9 = mlr.t(this.DKI).rowAtPoint(new Point(var1.getX(), var1.getY()));
               if (var9 != -1) {
                  mlr.t(this.DKI).setRowSelectionInterval(var9, var9);
               }
            } else if (var2.equals(mlr.v(this.DKI))) {
               mlr.w(this.DKI).show(var1.getComponent(), var1.getX(), var1.getY());
               int var8 = mlr.v(this.DKI).rowAtPoint(new Point(var1.getX(), var1.getY()));
               mlr.v(this.DKI).setRowSelectionInterval(var8, var8);
            }
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         Component var6 = (Component)var1.getSource();
         if (var6.equals(mlr.q(this.DKI))) {
            int var10 = mlr.q(this.DKI).getSelectedRow();
            lkl var17 = ((mmd)mlr.q(this.DKI).getModel()).aeN(var10);
            String var5 = null;
            if (var17 != null) {
               var5 = var17.dZF();
               mlr.b(this.DKI, var5);
            }
         } else if (!var6.equals(mlr.s(this.DKI).getList())) {
            if (var6.equals(mlr.n(this.DKI))) {
               lfn.b(0, "SFMouseHandler", "mousePressed() : LALALALLAA");
               int var11 = mlr.n(this.DKI).getSelectedRow();
               lky var18 = ((mmp)mlr.n(this.DKI).getModel()).aeU(var11);
               assert var18 != null;
               mmo var24 = new mmo(mlr.h(this.DKI), "Transition [" + var18.getName() + "]", mlr.c(this.DKI), var18);
               mlr.h(this.DKI).eCu().add(var24);
               var24.setVisible(true);
            } else if (var6.equals(mlr.p(this.DKI))) {
               lkr var12 = null;
               lkr var19 = mlr.p(this.DKI).eFT();
               if (var19 != null && var19 instanceof lkr) {
                  var12 = var19;
                  mmg var25 = new mmg(mlr.h(this.DKI), var12, mlr.c(this.DKI));
                  mlr.h(this.DKI).eCu().add(var25);
                  var25.setVisible(true);
               } else {
                  lfn.b(4, "SFMouseHandler", "mousePressed() : Nothing is selected, or wrong type of object!");
               }
            } else if (var6.equals(mlr.t(this.DKI))) {
               int var14 = mlr.t(this.DKI).getSelectedRow();
               if (var14 != -1) {
                  lkd var20 = ((mlv)mlr.t(this.DKI).getModel()).aeO(var14);
                  mlu var26 = new mlu(var20);
                  mlr.h(this.DKI).eCu().add(var26);
                  var26.setVisible(true);
               }
            } else if (var6.equals(mlr.r(this.DKI).getList())) {
               eh var15 = (eh)mlr.r(this.DKI).getList().getSelectedValue();
               if (var15 != null) {
                  mmr var21 = new mmr(mlr.c(this.DKI), var15);
                  var21.p(mlr.h(this.DKI));
                  mlr.h(this.DKI).eCu().add(var21);
                  var21.setVisible(true);
               }
            } else if (var6.equals(mlr.v(this.DKI))) {
               int var16 = mlr.v(this.DKI).getRowCount();
               lkw[] var22 = new lkw[var16];

               for (int var27 = 0; var27 < var16; var27++) {
                  var22[var27] = ((mmm)mlr.v(this.DKI).getModel()).aeT(var27);
               }

               mlq var28 = new mlq(mlr.h(this.DKI), "Tracks", mlr.c(this.DKI).getGUID(), var22);
               mlr.h(this.DKI).eCu().add(var28);
               var28.setVisible(true);
            }
         }
      }
   }
}
