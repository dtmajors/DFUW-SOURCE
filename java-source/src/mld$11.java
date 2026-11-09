import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mld$11 implements ActionListener {
   mld$11(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JCheckBox var2 = (JCheckBox)var1.getSource();
      Integer var3 = (Integer)this.DHD.DGP.get(var2);
      if (var2.isSelected()) {
         this.DHD.DHA = this.DHD.DHA | var3;
      } else {
         this.DHD.DHA = this.DHD.DHA & ~var3;
      }

      this.DHD.repaint();
   }
}
