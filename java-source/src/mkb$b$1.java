import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class mkb$b$1 implements ActionListener {
   mkb$b$1(mkb$b var1, mkb var2) {
      this.DFa = var1;
      this.DEZ = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JComboBox var2 = (JComboBox)var1.getSource();
      int var3 = var2.getSelectedIndex();
      int var4 = mkb.d(this.DFa.DEO);
      if (var3 == 0) {
         mkb.a(this.DFa.DEO, 32);
      } else if (var3 == 1) {
         mkb.a(this.DFa.DEO, 64);
      } else if (var3 == 2) {
         mkb.a(this.DFa.DEO, 96);
      } else if (var3 == 3) {
         mkb.a(this.DFa.DEO, 128);
      } else if (var3 == 4) {
         mkb.a(this.DFa.DEO, 256);
      } else if (var3 == 5) {
         this.DFa.DEO.setFileView(null);
         jrw var5 = this.DFa.DEO.eDd();
         this.DFa.updateUI();
      }

      mkb.e(this.DFa.DEO);
      if (var3 != 5) {
         if (this.DFa.DEO.getFileView() == null) {
            this.DFa.DEO.setFileView(mkb.f(this.DFa.DEO));
         }

         this.DFa.updateUI();
      }

      if (mkb.d(this.DFa.DEO) != var4) {
         mkb.f(this.DFa.DEO).eDk();
      }
   }
}
