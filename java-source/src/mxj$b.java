import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

class mxj$b extends MouseAdapter {
   mxj$b(mxj var1) {
      this.ETL = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Point var2 = new Point(var1.getX(), var1.getY());
      int var3 = mxj.a(this.ETL).columnAtPoint(var2);
      int var4 = mxj.a(this.ETL).rowAtPoint(var2);
      if (var1.getModifiers() == 4) {
         mxj.c(this.ETL).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var5 = (Component)var1.getSource();
         if (var5.equals(mxj.a(this.ETL))) {
            int var6 = mxj.a(this.ETL).rowAtPoint(new Point(var1.getX(), var1.getY()));
            if (!mxj.a(this.ETL).isRowSelected(var6)) {
               mxj.a(this.ETL).setRowSelectionInterval(var6, var6);
               mxj.a(this.ETL, true);
            }
         } else {
            lfn.b(4, this.getClass().getName(), "Selected popup area is not over a JTable");
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2 && var3 != 4 && var3 != 5) {
         Component var15 = (Component)var1.getSource();
         if (var15.equals(mxj.a(this.ETL))) {
            int var17 = mxj.a(this.ETL).getSelectedRow();
            dta var7 = ((mxl)mxj.a(this.ETL).getModel()).afS(var17);
            mwg var8 = new mwg(var7.bzr(), var7.getObjectDescriptionFilename(), var7.getGUID());
            var8.p(mxj.d(this.ETL));
            var8.setLocation(0, 438);
            this.ETL.getDesktopPane().add(var8);
            var8.setVisible(true);
         } else {
            lfn.b(4, this.getClass().getName(), "Selected popup area is not over a JTable");
         }
      }

      if (var1.getModifiers() == 16 && (var1.getClickCount() == 1 || var3 == 4 || var3 == 5)) {
         int[] var16 = mxj.a(this.ETL).getSelectedRows();
         Boolean var18 = null;
         Boolean var19 = null;
         if (var4 != -1) {
            dta var20 = ((mxl)mxj.a(this.ETL).getModel()).afS(var4);
            JCheckBox var9 = (JCheckBox)mxj.eSU().get(var20.getGUID());
            if (var9 != null) {
               var18 = !var9.isSelected();
            }

            var9 = (JCheckBox)mxj.cnw().get(var20.getGUID());
            if (var9 != null) {
               var19 = !var9.isSelected();
            }
         }

         for (int var21 = 0; var21 < var16.length; var21++) {
            int var23 = var16[var21];
            if (var3 == 4 && var23 != -1) {
               dta var10 = ((mxl)mxj.a(this.ETL).getModel()).afS(var23);
               JCheckBox var11 = (JCheckBox)mxj.eSU().get(var10.getGUID());
               if (var11 != null) {
                  if (var18 == null) {
                     var18 = !var11.isSelected();
                  }

                  var11.setSelected(var18);

                  for (amf var13 : var10.bzr()) {
                     if (var13 instanceof dqk) {
                        dqk var14 = (dqk)var13;
                        var14.setVisible(var18);
                     }
                  }
               }
            }

            if (var3 == 5 && var23 != -1) {
               dta var24 = ((mxl)mxj.a(this.ETL).getModel()).afS(var23);
               JCheckBox var25 = (JCheckBox)mxj.cnw().get(var24.getGUID());
               if (var25 != null) {
                  if (var19 == null) {
                     var19 = !var25.isSelected();
                  }

                  var25.setSelected(var19);
               }
            }
         }

         mxj.e(this.ETL);
         mxj.a(this.ETL, true);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if ((var1.getModifiers() & 16) == 16 && var1.getClickCount() == 1) {
         mxj.b(this.ETL);
      } else {
         lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Modifies = " + var1.getModifiers());
      }
   }
}
