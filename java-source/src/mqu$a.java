import java.io.File;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

class mqu$a extends AbstractTableModel {
   private Vector<Integer> Edo;

   private mqu$a(mqu var1) {
      this.EgP = var1;
      this.Edo = new Vector<>();
   }

   public int eJO() {
      return this.Edo.size();
   }

   public int afj(int var1) {
      return this.Edo.get(var1);
   }

   public void CR(String var1) {
      String var2 = var1.toLowerCase();
      String[] var3 = var2.split(" ");
      this.Edo.clear();

      for (int var4 = 0; var4 < mqu.eJN().size(); var4++) {
         String var5 = null;
         if (mqu.a(this.EgP).isSelected()) {
            var5 = ((File)mqu.eJN().get(var4)).getAbsolutePath().toLowerCase();
         } else {
            var5 = ((File)mqu.eJN().get(var4)).getName().toLowerCase();
         }

         boolean var6 = true;

         for (int var7 = 0; var7 < var3.length; var7++) {
            if (!var5.contains(var3[var7])) {
               var6 = false;
            }
         }

         if (var6) {
            this.Edo.add(var4);
         }
      }
   }

   @Override
   public int getColumnCount() {
      return 2;
   }

   @Override
   public int getRowCount() {
      return this.Edo.size();
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      File var3 = (File)mqu.eJN().get(this.Edo.get(var1));
      if (var2 == 0) {
         return var3.getName();
      }

      String var4 = var3.getPath();
      return var4.substring(mqu.b(this.EgP).length(), var4.length() - var3.getName().length());
   }
}
