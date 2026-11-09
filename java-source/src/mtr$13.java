import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

class mtr$13 implements ActionListener {
   mtr$13(mtr var1, JPanel var2) {
      this.ECh = var1;
      this.ECi = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtr.z(this.ECh).remove(this.ECi);
      mtr.z(this.ECh).revalidate();
   }
}
