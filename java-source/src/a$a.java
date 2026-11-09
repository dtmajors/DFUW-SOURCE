import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;

class a$a extends JCheckBox implements ListCellRenderer {
   public a$a(a var1) {
      this.aH = var1;
      this.setBackground(UIManager.getColor("List.textBackground"));
      this.setForeground(UIManager.getColor("List.textForeground"));
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      this.setEnabled(var1.isEnabled());
      this.setSelected(((a$b)var2).isSelected());
      this.setFont(var1.getFont());
      this.setText(var2.toString());
      return this;
   }
}
