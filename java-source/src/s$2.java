import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class s$2 implements MouseWheelListener {
   s$2(s var1) {
      this.cS = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      boolean var2 = (var1.getModifiers() & 128) != 0;
      boolean var3 = (var1.getModifiers() & 64) != 0;
      boolean var4 = (var1.getModifiers() & 512) != 0;
      int var5 = var1.getWheelRotation();
      int var6 = var5 < 0 ? 309 : 308;
      var5 = Math.abs(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         s.a(this.cS, true, var6, var2, var3, var4);
         s.a(this.cS, false, var6, var2, var3, var4);
      }
   }
}
