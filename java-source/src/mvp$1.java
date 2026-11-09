import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvp$1 implements ChangeListener {
   mvp$1(mvp var1) {
      this.ELE = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvp.a(this.ELE, new lcq(mvp.a(this.ELE).getColor()));
      mvp.b(this.ELE).setColor(mvp.a(this.ELE).getColor());
   }
}
