import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class mri$1 implements ActionListener {
   mri$1(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JButton var2 = (JButton)var1.getSource();

      for (int var3 = 0; var3 < mri.a(this.Ejc).size(); var3++) {
         if (mri.a(this.Ejc).get(var3) == var2) {
            this.Ejc.afl(var3);
            return;
         }
      }
   }
}
