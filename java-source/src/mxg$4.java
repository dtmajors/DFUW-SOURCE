import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mxg$4 extends MouseAdapter {
   mxg$4(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         if (var2.adk != 0) {
            cjr var3 = mxg.f(this.ETz).aQi().get(var2.adk - 1);
            if (var3 != null) {
               var2.adk--;
               var3.adk++;
               mxg.f(this.ETz).aQi().put(var2.adk, var2);
               mxg.f(this.ETz).aQi().put(var3.adk, var3);
               mxg.e(this.ETz);
               this.ETz.ETf.setSelectedIndex(var2.adk);
            }
         }
      }
   }
}
