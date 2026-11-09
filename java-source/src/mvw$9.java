import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$9 implements ChangeListener {
   mvw$9(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.d(this.EML, mvw.j(this.EML).getValue());
   }
}
