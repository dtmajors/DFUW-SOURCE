import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

class moh$b extends JPanel {
   private Image DEP;

   public moh$b(moh var1, Dimension var2) {
      this.DSw = var1;
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
         if (var2 > 0 && var3 > 0) {
            var1.drawImage(this.DEP, 0, 0, var2, var3, this);
         }
      }
   }
}
