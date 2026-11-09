import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvz$2 implements ChangeListener {
   mvz$2(mvz var1) {
      this.ENL = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvz.a(this.ENL, new lcq(mvz.a(this.ENL).getColor()));
      mvz.b(this.ENL).setColor(mvz.a(this.ENL).getColor());
   }
}
