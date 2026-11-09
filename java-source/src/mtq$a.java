import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;

class mtq$a extends DefaultCellEditor {
   JTextField EBj;

   public mtq$a(mtq var1, JTextField var2) {
      super(var2);
      this.EBi = var1;
      this.EBj = null;
      this.EBj = var2;
   }

   @Override
   public Object getCellEditorValue() {
      return this.EBj.getText();
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      return super.getTableCellEditorComponent(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean stopCellEditing() {
      return super.stopCellEditing();
   }
}
