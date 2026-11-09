import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class mqy$1 implements ActionListener {
   mqy$1(mqy var1, mqy$a var2, JTextField var3) {
      this.Ehw = var1;
      this.Ehv = var2;
      this.DDz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mqy.a(this.Ehw);
      if (var2 != null) {
         this.Ehv.setTextureName(var2);
         this.DDz.setText(var2);
         mqy.b(this.Ehw);
      }
   }
}
