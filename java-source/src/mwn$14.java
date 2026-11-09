import javax.swing.table.DefaultTableModel;

class mwn$14 extends DefaultTableModel {
   boolean[] Ego;

   mwn$14(mwn var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.ERI = var1;
      this.Ego = new boolean[]{false, false};
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return this.Ego[var2];
   }
}
