import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

class s$6 implements ComponentListener {
   s$6(s var1) {
      this.cS = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      assert lda.by(var1);
      if (s.d(this.cS) != null) {
         int var2 = var1.getComponent().getWidth();
         int var3 = var1.getComponent().getHeight();
         Insets var4 = s.a(this.cS).getInsets();
         s.d(this.cS).resize(var2 - var4.left - var4.right + 2, var3 - var4.top - var4.bottom + 2);
      }

      s.e(this.cS);
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      assert lda.by(var1);
      s.e(this.cS);
      mje.PositionRenderWindow = new Point(s.a(this.cS).getLocation());
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      assert lda.by(var1);
      assert false;
      assert s.a(this.cS).isShowing();
      assert s.a(this.cS).isVisible();
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      assert lda.by(var1);
      assert !s.a(this.cS).isShowing();
      assert !s.a(this.cS).isVisible();
   }
}
