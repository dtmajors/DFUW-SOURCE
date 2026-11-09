import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class msi$1$1 implements ActionListener {
   msi$1$1(msi$1 var1, JDialog var2) {
      this.EtJ = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtJ.EtH.EtG = "Item";
      this.EtI.dispose();
      msi.a(this.EtJ.EtH, new msj(msi.a(this.EtJ.EtH)));
      msi.a(this.EtJ.EtH).setText("");
      msi.b(this.EtJ.EtH).e(msi.a(this.EtJ.EtH));
      if (msi.a(this.EtJ.EtH).getText() != null && !msi.a(this.EtJ.EtH).getText().equals("") && !msi.c(this.EtJ.EtH).contains(msi.a(this.EtJ.EtH).getText())) {
         cgw var2 = msi$1.a(this.EtJ, cgl.eyC);
         var2.ezl = msi.a(this.EtJ.EtH).getText();
         if (msi.d(this.EtJ.EtH).eyK == null) {
            msi.d(this.EtJ.EtH).eyK = new cgt();
            msi.d(this.EtJ.EtH).eyK.aCN = lcn.emv();
         }

         if (!msi.d(this.EtJ.EtH).eyK.aCN.contains(var2)) {
            msi.d(this.EtJ.EtH).eyK.aCN.add(var2);
            msi.a(this.EtJ.EtH, true);
            msi.c(this.EtJ.EtH).add(msi.a(this.EtJ.EtH).getText());
            msi.e(this.EtJ.EtH).setListData(msi.c(this.EtJ.EtH));
            msi.e(this.EtJ.EtH).revalidate();
            msi.e(this.EtJ.EtH).repaint();
         }
      }
   }
}
