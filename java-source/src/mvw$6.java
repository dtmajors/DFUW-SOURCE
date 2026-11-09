import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$6 implements ChangeListener {
   mvw$6(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.b(this.EML, new lcq(mvw.e(this.EML).getColor()));
      mvw.f(this.EML).setColor(mvw.e(this.EML).getColor());
   }
}
