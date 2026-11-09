import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mmu$3 implements ActionListener {
   mmu$3(mmu var1) {
      this.DNV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mmu.b(this.DNV, var1);
   }
}
