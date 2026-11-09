import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvx$a implements ChangeListener {
   private mjp DFG;

   public mvx$a(mvx var1, mjp var2) {
      this.EMZ = var1;
      this.DFG = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      Color var2 = this.DFG.getColor();
      lfn.b(3, "Color!", "New Color is:" + var2);
   }
}
