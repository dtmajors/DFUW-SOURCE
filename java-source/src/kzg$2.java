import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;

class kzg$2 implements ActionListener {
   kzg$2(kzg var1) {
      this.qnL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Color var2 = JColorChooser.showDialog(this.qnL, "Choose New Color", kzg.b(this.qnL));
      if (var2 != null) {
         kzg.a(this.qnL, var2);
         kzg.a(this.qnL, new lcq(kzg.b(this.qnL)));
         kzg.a(this.qnL).setText(kzg.c(this.qnL).toString());
      }
   }
}
