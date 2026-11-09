import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtq$3 implements ActionListener {
   mtq$3(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      switch (mtq.h(this.EBi).getSelectedIndex()) {
         case 0:
            mtq.a(this.EBi, 0);
            break;
         case 1:
            mtq.a(this.EBi, 1);
            break;
         case 2:
            mtq.a(this.EBi, 2);
      }
   }
}
