import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvu$8 implements ActionListener {
   mvu$8(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvu.b(this.EMm).setValue((int)(0.4F * mvu.b(this.EMm).getMaximum() + 0.5F));
      mvu.d(this.EMm).setValue((int)(0.125F * mvu.d(this.EMm).getMaximum() + 0.5F));
      mvu.f(this.EMm).setValue((int)(0.125F * mvu.f(this.EMm).getMaximum() + 0.5F));
   }
}
