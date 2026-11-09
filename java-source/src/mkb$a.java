import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

class mkb$a extends JComponent {
   private Image DEP;

   public mkb$a(mkb var1, Dimension var2) {
      this.DEO = var1;
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
      if (this.DEP != null) {
         int var2 = this.DEP.getWidth(this);
         int var3 = this.DEP.getHeight(this);
         if (var2 > 0 && var3 > 0) {
            var1.drawImage(this.DEP, 0, 0, var2, var3, this);
         }
      }
   }
}
