import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class mku$1 extends ComponentAdapter {
   mku$1(mku var1) {
      this.DFT = var1;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      if (mku.a(this.DFT) != null) {
         mku.a(this.DFT).mY = false;
         mku.a(this.DFT, null);
      }
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      if (mku.b(this.DFT)) {
         assert mku.a(this.DFT) == null;
         mku.a(this.DFT, false);
         this.DFT.eDw();
      }
   }
}
