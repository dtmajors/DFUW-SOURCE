import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$1 implements ChangeListener {
   mvw$1(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.a(this.EML, mvw.a(this.EML).getValue());
   }
}
