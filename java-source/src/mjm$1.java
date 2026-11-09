import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.JTextField;

final class mjm$1 implements ActionListener {
   mjm$1(JTextField var1, float var2, JSlider var3) {
      this.DDz = var1;
      this.DDA = var2;
      this.DDB = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(this.DDz.getText());
      int var3 = (int)(var2 * this.DDA);
      if (var3 < this.DDB.getMinimum()) {
         var3 = this.DDB.getMinimum();
      }

      if (var3 > this.DDB.getMaximum()) {
         var3 = this.DDB.getMaximum();
      }

      mjm.DDy = true;
      this.DDB.setValue(var3);
      mjm.DDy = false;
   }
}
