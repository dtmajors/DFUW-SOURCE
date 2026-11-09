import java.awt.Graphics;
import javax.swing.JLabel;

class mrr$b extends JLabel {
   private mrr$b(mrr var1) {
      this.EmC = var1;
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.drawImage(mrr.j(this.EmC), 0, 0, this);
      if (mrr.k(this.EmC)) {
         for (int var2 = 0; var2 < mrr.l(this.EmC).length; var2++) {
            for (int var3 = 0; var3 < mrr.l(this.EmC).length; var3++) {
               if (mrr.l(this.EmC)[var2][var3] != 0) {
                  int var4 = var2 * 24;
                  int var5 = var3 * 24;
                  var1.setColor(mrr.m(this.EmC));
                  var1.fillRect(var4 + 0, var5 + 0, 24, 24);
               }
            }
         }
      }

      if (mrr.n(this.EmC) && mrr.o(this.EmC) != null) {
         int var6 = mrr.o(this.EmC).x * 24;
         int var7 = mrr.o(this.EmC).y * 24;
         var1.setColor(mrr.p(this.EmC));
         var1.drawRoundRect(var6 + 0, var7 + 0, 24, 24, 2, 2);
      }
   }
}
