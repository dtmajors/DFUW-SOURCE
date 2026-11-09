import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

class mrq$b extends MouseAdapter {
   private mrq$b(mrq var1) {
      this.ElR = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      mrq.a(this.ElR, true);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if (!mrq.a(this.ElR)) {
         mrq.a(this.ElR, "");
      }

      mrq.a(this.ElR, false);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (!mrq.a(this.ElR)) {
         if (var1.getButton() == 1) {
            mrq.a(this.ElR, var1.getPoint(), true);
         } else if (var1.getButton() == 3) {
            mrq.a(this.ElR, var1.getPoint(), false);
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1) {
         if (var1.getClickCount() == 1 && mrq.a(this.ElR)) {
            mrq.b(this.ElR, var1.getPoint());
         }
      } else if (var1.getButton() == 3 && mrq.b(this.ElR)) {
         if (mrq.a(this.ElR)) {
            mrq.b(this.ElR, false);
            mrq.b(this.ElR, null);
            mrq.c(this.ElR).clear();
         } else {
            mrq.a(this.ElR, (BufferedImage)null);
            mrq.b(this.ElR, true);
         }
      }
   }
}
