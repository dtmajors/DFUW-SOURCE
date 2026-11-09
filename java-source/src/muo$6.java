import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

class muo$6 implements ActionListener {
   muo$6(muo var1, JTextField var2, JPanel var3) {
      this.EHi = var1;
      this.EHl = var2;
      this.EHm = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      for (int var2 = 0; var2 < this.EHi.EGZ.size(); var2++) {
         muy var3 = this.EHi.EGZ.get(var2);
         if (var3.EJh == this.EHl) {
            if (this.EHi.EGZ.remove(var2) != null) {
            }
            break;
         }
      }

      muo.a(this.EHi).remove(this.EHm);
      muo.a(this.EHi).revalidate();
   }
}
