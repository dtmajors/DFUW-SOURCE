import javax.swing.table.DefaultTableModel;

class mrw$1 extends DefaultTableModel {
   Class[] Eoh;

   mrw$1(mrw var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.Eol = var1;
      this.Eoh = new Class[]{String.class, String.class};
   }

   @Override
   public Class getColumnClass(int var1) {
      return this.Eoh[var1];
   }
}
