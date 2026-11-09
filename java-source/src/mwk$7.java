import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwk$7 implements ActionListener {
   mwk$7(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwk.c(this.EPI).setCursor(mwk.eRy());
      mwk.b(this.EPI).eRp();
      mwk.a(this.EPI);
      mwk.c(this.EPI).setCursor(mwk.eRz());
   }
}
