import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class msi$11 implements ActionListener {
   msi$11(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (msi.e(this.EtH).getModel().getSize() > 0) {
         this.eNM();
         msi.a(this.EtH, true);
         msi.c(this.EtH).remove(msi.e(this.EtH).getSelectedValue());
         msi.e(this.EtH).setListData(msi.c(this.EtH));
         msi.e(this.EtH).revalidate();
         msi.e(this.EtH).repaint();
      }
   }

   private void eNM() {
      for (cgw var3 : msi.d(this.EtH).eyK.aCN) {
         if (var3.ezl.equals((String)msi.e(this.EtH).getSelectedValue())) {
            msi.d(this.EtH).eyK.aCN.remove(var3);
            List var4 = lea.eps().aOg().get(msi.d(this.EtH).adk);
            if (var3.ezk == cgl.eyz) {
               for (cgw var6 : var4) {
                  if (var6.ezl.equals(var3.ezl)) {
                     var4.remove(var6);
                     return;
                  }
               }
            }
            break;
         }
      }
   }
}
