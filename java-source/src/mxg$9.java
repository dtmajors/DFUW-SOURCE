import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mxg$9 extends MouseAdapter {
   mxg$9(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         mxg.g(this.ETz);
      }
   }
}
