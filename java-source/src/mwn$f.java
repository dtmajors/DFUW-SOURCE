import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class mwn$f implements TableModelListener {
   public mwn$f(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void tableChanged(TableModelEvent var1) {
      int var2 = var1.getFirstRow();
      int var3 = var1.getColumn();
      if (var2 >= 0 && var3 >= 0) {
         TableModel var4 = (TableModel)var1.getSource();
         Object var5 = var4.getValueAt(var2, var3);
         assert var5 instanceof Float || var5 instanceof Integer;
         due var6 = (due)mwn.a(this.ERI);
         dtz.b var7 = var6.Rewards[var2];
         if (var3 == 1) {
            var7.Amount = (Integer)var5;
         } else if (var3 == 4) {
            var7.Probability = (Float)var5;
         }

         lfn.b(0, this.getClass().getSimpleName(), "tableChanged() : Data is ->" + var5 + ", @row = " + var2);
      }
   }
}
