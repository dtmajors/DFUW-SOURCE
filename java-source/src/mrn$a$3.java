import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class mrn$a$3 implements MouseListener {
   mrn$a$3(mrn$a var1, mrn var2) {
      this.Elu = var1;
      this.Elt = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         mrn$a.b(this.Elu, var1);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.Elu.requestFocus();
      if ((var1.getModifiers() & 16) != 0) {
         mrn$a.a(this.Elu, true);
      }

      if ((var1.getModifiers() & 8) != 0) {
         mrn$a.b(this.Elu, true);
      }

      if ((var1.getModifiers() & 4) != 0) {
         mrn$a.c(this.Elu, true);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if ((var1.getModifiers() & 16) != 0) {
         mrn$a.a(this.Elu, false);
      }

      if ((var1.getModifiers() & 8) != 0) {
         mrn$a.b(this.Elu, false);
      }

      if ((var1.getModifiers() & 4) != 0) {
         mrn$a.c(this.Elu, false);
      }
   }
}
