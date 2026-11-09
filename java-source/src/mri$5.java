import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mri$5 implements ActionListener {
   mri$5(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mqy.Ehm != null) {
         if (mqy.Ehm.isVisible()) {
            dsj var2 = mqy.Ehm.eJW();
            kqr var3 = (kqr)mri.c(this.Ejc).ii(4105);
            var3.pWI = var2.bya();
            var3.pWJ = true;
            mri$5$1 var4 = new mri$5$1(this);
            mri.c(this.Ejc).a(var3, var4, null);
         }
      }
   }
}
