import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$8 implements ChangeListener {
   mvw$8(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.c(this.EML, new lcq(mvw.h(this.EML).getColor()));
      mvw.i(this.EML).setColor(mvw.h(this.EML).getColor());
   }
}
