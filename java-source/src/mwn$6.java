import javax.swing.table.DefaultTableModel;

class mwn$6 extends DefaultTableModel {
   Class[] Eoh;
   boolean[] Ego;

   mwn$6(mwn var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.ERI = var1;
      this.Eoh = new Class[]{Object.class, Integer.class, Object.class, Object.class, Float.class};
      this.Ego = new boolean[]{false, true, false, false, true};
   }

   @Override
   public Class getColumnClass(int var1) {
      return this.Eoh[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return this.Ego[var2];
   }
}
