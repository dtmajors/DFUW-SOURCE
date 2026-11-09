import javax.swing.table.DefaultTableModel;

public class mqj$a extends DefaultTableModel {
   private final String[] Edq;

   public mqj$a(mqj var1) {
      this.Edp = var1;
      this.Edq = new String[]{"Name", "Avg", "Median", "Min", "Max", "TexError"};
   }

   @Override
   public Class getColumnClass(int var1) {
      switch (var1) {
         case 0:
            return String.class;
         case 1:
            return String.class;
         case 2:
            return String.class;
         case 3:
            return String.class;
         case 4:
            return String.class;
         default:
            return String.class;
      }
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      switch (var2) {
         default:
            return false;
      }
   }

   @Override
   public int getRowCount() {
      return mqj.j(this.Edp).size();
   }

   @Override
   public int getColumnCount() {
      return 6;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      int var3 = (Integer)mqj.j(this.Edp).get(var1);
      mqi var4 = this.Edp.Edg.get(var3);
      if (var2 == 0) {
         String var5 = var4.Filename;
         int var6 = var5.lastIndexOf("\\");
         if (var6 != -1) {
            var5 = var5.substring(var6 + 1);
         }

         return var5;
      } else if (var4.EcY == null) {
         return "*";
      } else if (var2 == 1) {
         return var4.EcY.qbe;
      } else if (var2 == 2) {
         return var4.EcY.qbf;
      } else if (var2 == 3) {
         return var4.EcY.qbg;
      } else if (var2 == 4) {
         return var4.EcY.qbh;
      } else {
         return var2 == 5 ? var4.EcY.qbk : "*";
      }
   }

   @Override
   public String getColumnName(int var1) {
      return this.Edq[var1];
   }
}
