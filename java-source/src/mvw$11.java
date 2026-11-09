import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$11 implements ChangeListener {
   mvw$11(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.e(this.EML, mvw.m(this.EML).getValue());
   }
}
