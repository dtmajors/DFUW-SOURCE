import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mxg$8 extends MouseAdapter {
   mxg$8(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         mxg.f(this.ETz).aQi().remove(var2.adk);
         mxg.e(this.ETz);
      }
   }
}
