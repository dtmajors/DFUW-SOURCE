import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mog$2 implements ChangeListener {
   mog$2(mog var1) {
      this.DRX = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mog.b(this.DRX).g(mog.a(this.DRX).getColor());
      mog.c(this.DRX).setColor(mog.a(this.DRX).getColor());
      mog.d(this.DRX).setBackground(mog.a(this.DRX).getColor());
   }
}
