import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvz$3 implements ChangeListener {
   mvz$3(mvz var1) {
      this.ENL = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvz.b(this.ENL, new lcq(mvz.c(this.ENL).getColor()));
      mvz.d(this.ENL).setColor(mvz.c(this.ENL).getColor());
   }
}
