import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class mkb$b$6 implements ListCellRenderer {
   mkb$b$6(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      String var6 = (String)var2;
      JButton var7 = this.DFa.DEX.get(var6);
      if (var7 == null) {
         var7 = new JButton(var6);
         this.DFa.DEX.put(var6, var7);
      }

      if (var4) {
         var7.setBackground(Color.RED);
      } else {
         var7.setBackground(Color.GRAY);
      }

      return var7;
   }
}
