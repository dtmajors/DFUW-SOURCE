import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class msi$9 implements ItemListener {
   msi$9(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 2 && msi.d(this.EtH) != null && !msi.ac(this.EtH).getSelectedItem().toString().equals(msi.d(this.EtH).eyU.aOG().toString())) {
         cgi var2 = cgi.getFeatTriggerType(msi.ac(this.EtH).getSelectedItem().toString());
         msi var10000 = this.EtH;
         msi.ad(this.EtH);
         msi.a(var10000, msn.e(var2));
         msi.d(this.EtH).eyU = msi.ae(this.EtH);
         msi.af(this.EtH).removeAll();
         msi.a(this.EtH, msi.ag(this.EtH).b(this.EtH));
         msi.af(this.EtH).add(msi.ah(this.EtH));
         msi.af(this.EtH).revalidate();
         msi.af(this.EtH).repaint();
      }
   }
}
