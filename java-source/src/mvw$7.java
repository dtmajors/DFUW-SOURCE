import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$7 implements ChangeListener {
   mvw$7(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.c(this.EML, mvw.g(this.EML).getValue());
   }
}
