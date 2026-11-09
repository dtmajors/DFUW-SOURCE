import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

class mkb$e$1 implements ImageObserver {
   mkb$e$1(mkb$e var1) {
      this.DFi = var1;
   }

   @Override
   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      BufferedImage var7 = (BufferedImage)mkb$e.a(this.DFi).get(var1);
      if (var7 != null) {
         var7.getGraphics().drawImage(var1, 0, 0, null);
      }

      return true;
   }
}
