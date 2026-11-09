import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class amp$a implements ActionListener, MouseListener, ChangeListener {
   amp$a(amp var1) {
      this.bzS = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.bzS.bzN) {
         this.bzS.m(var1);
      } else if (var1.getSource() == this.bzS.bzQ) {
         this.bzS.n(var1);
      } else if (var1.getSource() == this.bzS.bzO) {
         this.bzS.o(var1);
      } else if (var1.getSource() == this.bzS.bzI) {
         this.bzS.p(var1);
      } else if (var1.getSource() == this.bzS.bzH) {
         amp.a(this.bzS, var1);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getSource() == this.bzS.bzK) {
         amp.a(this.bzS, var1);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (var1.getSource() == this.bzS.bzR) {
         amp.a(this.bzS, var1);
      } else if (var1.getSource() == this.bzS.bzL) {
         this.bzS.a(var1);
      } else if (var1.getSource() == this.bzS.bzP) {
         this.bzS.b(var1);
      } else if (var1.getSource() == this.bzS.bzM) {
         this.bzS.c(var1);
      }
   }
}
