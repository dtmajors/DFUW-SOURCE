import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class mld$d$2 implements MouseWheelListener {
   mld$d$2(mld$d var1, mld var2) {
      this.DHQ = var1;
      this.DHP = var2;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      float var2 = 1.2F;
      float var3 = var1.getWheelRotation();
      int var4 = Math.abs((int)var3);

      for (int var5 = 0; var5 < var4; var5++) {
         if (var3 > 0.0F) {
            mld.daN /= var2;
         } else {
            mld.daN *= var2;
         }
      }

      this.DHQ.repaint();
   }
}
