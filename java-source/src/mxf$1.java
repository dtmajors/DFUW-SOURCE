import javax.swing.table.DefaultTableModel;

class mxf$1 extends DefaultTableModel {
   Class[] Eoh;
   boolean[] Ego;

   mxf$1(mxf var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.ETs = var1;
      this.Eoh = new Class[]{String.class, Integer.class, String.class};
      this.Ego = new boolean[]{false, true, true};
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
