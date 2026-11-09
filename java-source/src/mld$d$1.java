import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mld$d$1 extends MouseAdapter {
   mld$d$1(mld$d var1, mld var2) {
      this.DHQ = var1;
      this.DHP = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if ((var1.getModifiers() & 16) != 0) {
         this.DHQ.pWT = true;
         if (var1.getClickCount() == 2) {
            if (this.DHQ.DHD.DGM != null) {
               if (this.DHQ.DHD.DHh == null) {
                  Point var2 = mld$d.a(this.DHQ, this.DHQ.a(this.DHQ.DHN));
                  if (this.DHQ.b(var2)) {
                     this.DHQ.DHD.DGN.clear();
                     this.DHQ.DHD.DGN.add(var2);
                     this.DHQ.DHD.eDL();
                  }

                  ljq var3 = ((mld$e)mld.a(this.DHQ.DHD, this.DHQ.DHD.DGM.x).get(this.DHQ.DHD.DGM.y)).DHS.esF();
                  hac var4 = (hac)this.DHQ.DHD.DEC.d(4097);
                  var4.on(lcr.qAE);
                  var4.f(lcr.qzr);
                  var4.Lb(116);
                  var4.c(var3);
                  this.DHQ.DHD.DEC.a(var4);
               } else {
                  mld$e var5 = (mld$e)mld.a(this.DHQ.DHD, this.DHQ.DHD.DGM.x).get(this.DHQ.DHD.DGM.y);
                  this.DHQ.DHD.DHh.a(this.DHQ.DHD.DGM.x, var5.DHS, var5.DHR);
               }
            } else if (this.DHQ.DHD.DHh != null) {
               ljq var6 = this.DHQ.a(this.DHQ.DHN);
               this.DHQ.DHD.DHh.a(16384, var6, "");
            }
         } else {
            this.DHQ.eDP();
         }

         this.DHQ.repaint();
      }

      if ((var1.getModifiers() & 8) != 0) {
         this.DHQ.DHM = true;
      }

      if ((var1.getModifiers() & 4) != 0) {
         this.DHQ.DHL = true;
         this.DHQ.eDP();
         this.DHQ.repaint();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if ((var1.getModifiers() & 16) != 0) {
         this.DHQ.pWT = false;
      }

      if ((var1.getModifiers() & 8) != 0) {
         this.DHQ.DHM = false;
      }

      if ((var1.getModifiers() & 4) != 0) {
         this.DHQ.DHL = false;
      }
   }
}
