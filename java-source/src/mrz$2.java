import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$2 implements ActionListener {
   mrz$2(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lfn.b(5, this.getClass().getName(), "SFEffectDialog() :" + Runtime.getRuntime().freeMemory() / 1048576L + " MB ");
      new kbx().g(lea.bkO(), lcw.qLb + mrz.eMV());
      mrz.j(this.EoW).clear();
      mrz.m(this.EoW).updateUI();
      lfn.b(5, this.getClass().getName(), "SFEffectDialog() :" + Runtime.getRuntime().freeMemory() / 1048576L + " MB ");
   }
}
