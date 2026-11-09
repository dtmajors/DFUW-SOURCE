import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class s$4 implements MouseMotionListener {
   s$4(s var1) {
      this.cS = var1;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Insets var2 = s.a(this.cS).getInsets();
      lgg var3 = new lgg(var1.getX() - var2.left, var1.getY() - var2.top);
      s.a(this.cS, var3);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Insets var2 = s.a(this.cS).getInsets();
      lgg var3 = new lgg(var1.getX() - var2.left, var1.getY() - var2.top);
      s.a(this.cS, var3);
   }
}
