import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class msi$8 implements ListSelectionListener {
   msi$8(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (msi.e(this.EtH).getSelectedIndex() >= 0) {
         this.EtH.EtD = msi.d(this.EtH).eyK.aCN.get(msi.e(this.EtH).getSelectedIndex());
         msi.Z(this.EtH).setSelectedItem(this.EtH.EtD.ezk.name());
         msi.aa(this.EtH).getModel().setValue(this.EtH.EtD.ezm);
         if (this.EtH.EtD.ezk == cgl.eyC) {
            msi.aa(this.EtH).setEnabled(true);
            msi.ab(this.EtH).setEnabled(true);
         } else if (this.EtH.EtD.ezk == cgl.eyD) {
            msi.aa(this.EtH).setEnabled(true);
            msi.ab(this.EtH).setEnabled(false);
         } else {
            msi.aa(this.EtH).setEnabled(false);
            msi.ab(this.EtH).setEnabled(false);
         }

         msi.ab(this.EtH).setSelected(this.EtH.EtD.ezn);
      }
   }
}
