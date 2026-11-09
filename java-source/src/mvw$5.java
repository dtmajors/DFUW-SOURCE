import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$5 implements ChangeListener {
   mvw$5(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.b(this.EML, mvw.d(this.EML).getValue());
   }
}
