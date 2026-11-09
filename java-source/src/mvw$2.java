import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$2 implements ChangeListener {
   mvw$2(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.e(this.EML, new lcq(mvw.n(this.EML).getColor()));
      mvw.o(this.EML).setColor(mvw.n(this.EML).getColor());
   }
}
