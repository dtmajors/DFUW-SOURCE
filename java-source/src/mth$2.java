import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mth$2 implements ActionListener {
   mth$2(mth var1) {
      this.ExL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mth.a(this.ExL, new msj(mth.c(this.ExL)));
      mth.b(this.ExL).e(mth.c(this.ExL));
   }
}
