import javax.swing.table.DefaultTableModel;

class mus$9 extends DefaultTableModel {
   boolean[] Ego;

   mus$9(mus var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.EHz = var1;
      this.Ego = new boolean[]{false, false, false};
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return this.Ego[var2];
   }
}
