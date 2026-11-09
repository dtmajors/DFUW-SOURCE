import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class amu$a implements ActionListener, MouseListener {
   amu$a(amu var1) {
      this.bBb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == amu.a(this.bBb)) {
         amu.b(this.bBb);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getSource() == amu.c(this.bBb)) {
         amu.a(this.bBb, var1);
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
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
