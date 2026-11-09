import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtr$11 implements ActionListener {
   mtr$11(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mtr.c(this.ECh) != null) {
         String var2 = mtr.c(this.ECh).getName();
         int var3 = JOptionPane.showInternalConfirmDialog(mtr.d(this.ECh), "Do you Want To Remove Missile Info [" + var2 + "]");
         if (var3 == 0) {
            mtr.t(this.ECh).remove(var2);
            mtr.x(this.ECh).remove(var2);
            mtr.s(this.ECh).revalidate();
            mtr.y(this.ECh);
         }
      }
   }
}
