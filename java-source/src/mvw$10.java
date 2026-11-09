import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$10 implements ChangeListener {
   mvw$10(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.d(this.EML, new lcq(mvw.k(this.EML).getColor()));
      mvw.l(this.EML).setColor(mvw.k(this.EML).getColor());
   }
}
