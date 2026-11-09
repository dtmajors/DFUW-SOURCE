import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class s$1 implements MouseListener {
   s$1(s var1) {
      this.cS = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      s.a(this.cS, var1, true);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      s.a(this.cS, var1, false);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      assert lda.by(var1);
   }
}
