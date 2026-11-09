import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class mop$a extends JLabel {
   boolean isSelected;
   boolean hasFocus;

   public mop$a(mop var1) {
      this.DSU = var1;
   }

   @Override
   public void setBackground(Color var1) {
      if (var1 instanceof ColorUIResource) {
         var1 = null;
      }

      super.setBackground(var1);
   }

   @Override
   public void paint(Graphics var1) {
      String var2;
      if ((var2 = this.getText()) != null && 0 < var2.length()) {
         if (this.isSelected) {
            var1.setColor(UIManager.getColor("Tree.selectionBackground"));
         } else {
            var1.setColor(UIManager.getColor("Tree.textBackground"));
         }

         Dimension var3 = this.getPreferredSize();
         int var4 = 0;
         Icon var5 = this.getIcon();
         if (var5 != null) {
            var4 = var5.getIconWidth() + Math.max(0, this.getIconTextGap() - 1);
         }

         var1.fillRect(var4, 0, var3.width - 1 - var4, var3.height);
         if (this.hasFocus) {
            var1.setColor(UIManager.getColor("Tree.selectionBorderColor"));
            var1.drawRect(var4, 0, var3.width - 1 - var4, var3.height - 1);
         }
      }

      super.paint(var1);
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      if (var1 != null) {
         var1 = new Dimension(var1.width + 3, var1.height);
      }

      return var1;
   }

   public void setSelected(boolean var1) {
      this.isSelected = var1;
   }

   public void no(boolean var1) {
      this.hasFocus = var1;
   }
}
