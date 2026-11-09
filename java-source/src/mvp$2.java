import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvp$2 implements ChangeListener {
   mvp$2(mvp var1) {
      this.ELE = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      Color var2 = mvp.c(this.ELE).getColor();
      mvp.d(this.ELE).s(new lcq(mvp.c(this.ELE).getColor()));
      mvp.e(this.ELE).setColor(mvp.c(this.ELE).getColor());
   }
}
