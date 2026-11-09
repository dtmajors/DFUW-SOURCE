import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class amr$a implements ActionListener, ItemListener, MouseListener, MouseMotionListener, ChangeListener {
   amr$a(amr var1) {
      this.bAB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == amr.a(this.bAB)) {
         amr.a(this.bAB, var1);
      } else if (var1.getSource() == amr.b(this.bAB)) {
         amr.b(this.bAB, var1);
      }
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getSource() == amr.c(this.bAB)) {
         amr.a(this.bAB, var1);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getSource() == amr.d(this.bAB)) {
         amr.a(this.bAB, var1);
      } else if (var1.getSource() == amr.e(this.bAB)) {
         amr.b(this.bAB, var1);
      } else if (var1.getSource() == amr.f(this.bAB)) {
         amr.c(this.bAB, var1);
      } else if (var1.getSource() == amr.g(this.bAB)) {
         amr.d(this.bAB, var1);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (var1.getSource() == amr.d(this.bAB)) {
         amr.e(this.bAB, var1);
      } else if (var1.getSource() == amr.e(this.bAB)) {
         amr.f(this.bAB, var1);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if (var1.getSource() == amr.d(this.bAB)) {
         amr.g(this.bAB, var1);
      } else if (var1.getSource() == amr.e(this.bAB)) {
         amr.h(this.bAB, var1);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getSource() == this.bAB) {
         amr.i(this.bAB, var1);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (var1.getSource() == this.bAB) {
         amr.j(this.bAB, var1);
      }
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (var1.getSource() == amr.h(this.bAB)) {
         amr.a(this.bAB, var1);
      } else if (var1.getSource() == amr.i(this.bAB)) {
         amr.b(this.bAB, var1);
      } else if (var1.getSource() == amr.j(this.bAB)) {
         amr.c(this.bAB, var1);
      }
   }
}
