import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$3 implements ChangeListener {
   mvw$3(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.f(this.EML, mvw.p(this.EML).getValue());
   }
}
