import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mmu$2 implements ActionListener {
   mmu$2(mmu var1) {
      this.DNV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mmu.a(this.DNV, var1);
   }
}
