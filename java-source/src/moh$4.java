import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class moh$4 extends KeyAdapter {
   moh$4(moh var1) {
      this.DSw = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = 20;

      try {
         var2 = Integer.parseInt(moh.c(this.DSw).getText());
      } catch (NumberFormatException var4) {
         lfn.b(0, this.getClass().getSimpleName(), "keyReleased() Bad Number = " + moh.c(this.DSw).getText());
         return;
      }

      eb var3 = moh.a(this.DSw).eL();
      if (var3 != null) {
         var3.X(var2);
      }
   }
}
