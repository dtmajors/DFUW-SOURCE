import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

class mqu$b extends JComponent {
   private Image DEP;

   public mqu$b(mqu var1, Dimension var2) {
      this.EgP = var1;
      this.DEP = null;
      this.setPreferredSize(var2);
      this.setSize(var2);
   }

   public Image eDh() {
      return this.DEP;
   }

   public void a(Image var1) {
      this.DEP = var1;
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      if (this.DEP != null) {
         int var2 = this.DEP.getWidth(this);
         int var3 = this.DEP.getHeight(this);
         int var4 = this.getWidth();
         int var5 = this.getHeight();
         int var6 = (var4 - 128) / 2;
         if (var2 > 0 && var3 > 0) {
            var1.drawImage(this.DEP, var6, 4, 120, 120, this);
         }
      }
   }
}
