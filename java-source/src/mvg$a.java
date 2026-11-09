import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvg$a implements ActionListener, ItemListener, MouseListener, ChangeListener {
   mvg$a(mvg var1) {
      this.EKs = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == mvg.a(this.EKs)) {
         mvg.a(this.EKs, var1);
      } else if (var1.getSource() == mvg.b(this.EKs)) {
         mvg.b(this.EKs, var1);
      } else if (var1.getSource() == mvg.c(this.EKs)) {
         mvg.c(this.EKs, var1);
      } else if (var1.getSource() == mvg.d(this.EKs)) {
         mvg.d(this.EKs, var1);
      } else if (var1.getSource() == mvg.e(this.EKs)) {
         mvg.e(this.EKs, var1);
      } else if (var1.getSource() == mvg.f(this.EKs)) {
         mvg.f(this.EKs, var1);
      }
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getSource() == mvg.g(this.EKs)) {
         mvg.a(this.EKs, var1);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getSource() == mvg.h(this.EKs)) {
         mvg.a(this.EKs, var1);
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

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (var1.getSource() == mvg.i(this.EKs)) {
         mvg.a(this.EKs, var1);
      }
   }
}
