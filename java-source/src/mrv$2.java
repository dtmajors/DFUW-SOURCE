import javax.swing.table.DefaultTableModel;

class mrv$2 extends DefaultTableModel {
   Class[] Eoh;

   mrv$2(mrv var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.Eoi = var1;
      this.Eoh = new Class[]{String.class};
   }

   @Override
   public Class getColumnClass(int var1) {
      return this.Eoh[var1];
   }
}
