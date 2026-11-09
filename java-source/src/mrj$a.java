import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;

class mrj$a extends JButton {
   private int pXd;

   private mrj$a(mrj var1) {
      this.EkK = var1;
      this.pXd = 0;
   }

   public int eKC() {
      return this.pXd;
   }

   public void afm(int var1) {
      this.pXd = var1;
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      Dimension var2 = this.getSize();
      var1.setColor(new Color(255, 255, 255));
      var1.fillRoundRect(0, 0, (int)var2.getWidth() - 2, (int)var2.getHeight() - 2, 8, 8);
      var1.setColor(new Color(55, 55, 55));
      var1.drawRoundRect(0, 0, (int)var2.getWidth() - 2, (int)var2.getHeight() - 2, 8, 8);
      int var3 = 0;
      int var4 = 0;
      float var5 = 6.0F;
      var1.setColor(new Color(0, 0, 0));

      for (float var6 = 0.0F; var6 <= 1.0F; var6 += 0.05F) {
         int var7 = (int)(var6 * ((float)var2.getWidth() - var5) + var5 / 2.0F);
         int var8 = (int)(this.oC(var6) * ((float)var2.getHeight() - var5) + var5 / 2.0F);
         if (var6 > 0.0F) {
            var1.drawLine(var3, var4, var7, var8);
         }

         var3 = var7;
         var4 = var8;
      }
   }

   float oC(float var1) {
      var1 = 1.0F - var1;
      float var2 = 1.0F;
      if (this.pXd == 0) {
         var2 = var1;
      } else if (this.pXd == 1) {
         var2 = var1 * var1;
      } else if (this.pXd == 2) {
         var2 = 1.0F - (1.0F - var1) * (1.0F - var1);
      } else if (this.pXd == 3) {
         var2 = 1.0F;
      }

      return 1.0F - var2;
   }
}
