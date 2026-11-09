import javax.swing.table.AbstractTableModel;

class mqn$b extends AbstractTableModel {
   private mqn$b(mqn var1) {
      this.Eep = var1;
   }

   @Override
   public int getColumnCount() {
      return 4;
   }

   @Override
   public int getRowCount() {
      return mqn.b(this.Eep).size();
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      amf var3 = (amf)mqn.b(this.Eep).get(var1);
      synchronized (var3) {
         if (var2 == 0) {
            return var3.getGUID().enx();
         }

         if (var2 == 1) {
            return mqn.y(var3);
         }

         if (var2 == 2) {
            return var3.getGUID().enw();
         }

         if (var2 == 3) {
            if (var3.getObjectType() > amh.bxE.length) {
               lfn.b(4, this.getClass().getSimpleName(), "getValueAt() WrongObjectType [" + var3.getObjectType() + "] for Object [" + var3 + "]");
               return "INVALID TYPE = " + var3.getObjectType();
            } else {
               return amh.bxE[var3.getObjectType()];
            }
         } else {
            return "";
         }
      }
   }
}
