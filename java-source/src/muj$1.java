import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class muj$1 implements ChangeListener {
   muj$1(muj var1) {
      this.EGr = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      muj.a(this.EGr, new lcq(muj.a(this.EGr).getColor()));
      muj.b(this.EGr).setColor(muj.a(this.EGr).getColor());
   }
}
