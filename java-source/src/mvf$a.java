import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvf$a implements ActionListener, FocusListener, ChangeListener {
   mvf$a(mvf var1) {
      this.EJW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.EJW.EJU) {
         this.EJW.cN(var1);
      } else if (var1.getSource() == this.EJW.DFV) {
         this.EJW.cO(var1);
      }
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      if (var1.getSource() == this.EJW.EJV) {
         this.EJW.b(var1);
      }
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (var1.getSource() == this.EJW.DGv) {
         this.EJW.j(var1);
      }
   }
}
