import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mwn$24 extends MouseAdapter {
   mwn$24(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (mwn.a(this.ERI).Type == dud.hdS) {
         ((due)mwn.a(this.ERI)).OverrideTextProgression = mwn.b(this.ERI).isSelected();
      }
   }
}
