import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class mld$d$3 extends MouseMotionAdapter {
   mld$d$3(mld$d var1, mld var2) {
      this.DHQ = var1;
      this.DHP = var2;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (this.DHQ.DHM) {
         ljq var2 = this.DHQ.a(this.DHQ.DHN);
         ljq var3 = this.DHQ.a(var1.getPoint());
         var3.et(var2);
         mld.Position.et(var3);
      }

      this.DHQ.DHN.x = var1.getX();
      this.DHQ.DHN.y = var1.getY();
      this.DHQ.eDP();
      this.DHQ.repaint();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.DHQ.DHN.x = var1.getX();
      this.DHQ.DHN.y = var1.getY();
      this.DHQ.repaint();
   }
}
