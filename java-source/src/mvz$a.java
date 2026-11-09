import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvz$a implements ChangeListener {
   private mjp DFG;

   public mvz$a(mvz var1, mjp var2) {
      this.ENL = var1;
      this.DFG = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      Color var2 = this.DFG.getColor();
   }
}
