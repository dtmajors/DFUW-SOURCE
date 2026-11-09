import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class mqk$b extends MouseMotionAdapter {
   private mqk EdO;

   public mqk$b(mqk var1, mqk var2) {
      this.EdN = var1;
      this.EdO = null;
      this.EdO = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Point var2 = var1.getPoint();
      if (mqk.a(this.EdN) != null && !mqk.a(this.EdN).isEmpty()) {
         mqk.a(this.EdN, null);

         for (mqm var4 : mqk.a(this.EdN)) {
            Point var5 = var4.eGU();
            Dimension var6 = var4.getSize();
            int var7 = (int)(var6.width / 2.0);
            int var8 = (int)(var6.height / 2.0);
            Rectangle var9 = new Rectangle(var5.x - var7, var5.y - var8, var6.width, var6.height);
            if (var9.contains(var2)) {
               mqk.a(this.EdN, var4);
               break;
            }
         }

         this.EdO.repaint();
      }
   }

   public void d(mqk var1) {
      this.EdO = var1;
   }
}
