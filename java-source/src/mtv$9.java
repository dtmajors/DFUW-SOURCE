import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mtv$9 implements ActionListener {
   mtv$9(mtv var1, String var2, JPanel var3) {
      this.EEq = var1;
      this.EEr = var2;
      this.EEs = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtv.d(this.EEq).remove(this.EEr);
      mtv.e(this.EEq).remove(this.EEs);
      mtv.e(this.EEq).revalidate();

      for (int var2 = 0; var2 < mtv.f(this.EEq).size(); var2++) {
         lil var3 = (lil)mtv.f(this.EEq).get(var2);
         JTextField var4 = (JTextField)var3.getFirst();
         String var5 = var4.getText();
         if (var5.toLowerCase().equals(this.EEr.toLowerCase())) {
            mtv.f(this.EEq).remove(var2);
            break;
         }
      }
   }
}
