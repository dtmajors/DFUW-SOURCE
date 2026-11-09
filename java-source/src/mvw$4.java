import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvw$4 implements ChangeListener {
   mvw$4(mvw var1) {
      this.EML = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvw.a(this.EML, new lcq(mvw.b(this.EML).getColor()));
      mvw.c(this.EML).setColor(mvw.b(this.EML).getColor());
   }
}
