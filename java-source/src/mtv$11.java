import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mtv$11 implements ActionListener {
   mtv$11(mtv var1, String var2, JPanel var3) {
      this.EEq = var1;
      this.EEr = var2;
      this.EEt = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtv.h(this.EEq).remove(this.EEr);
      mtv.i(this.EEq).remove(this.EEt);
      mtv.i(this.EEq).revalidate();

      for (int var2 = 0; var2 < mtv.j(this.EEq).size(); var2++) {
         lil var3 = (lil)mtv.j(this.EEq).get(var2);
         JTextField var4 = (JTextField)var3.getFirst();
         String var5 = var4.getText();
         if (var5.toLowerCase().equals(this.EEr.toLowerCase())) {
            mtv.j(this.EEq).remove(var2);
            break;
         }
      }
   }
}
