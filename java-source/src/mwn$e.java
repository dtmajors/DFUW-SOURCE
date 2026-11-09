import dtz.a;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class mwn$e implements TableModelListener {
   public mwn$e(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void tableChanged(TableModelEvent var1) {
      int var2 = var1.getFirstRow();
      int var3 = var1.getColumn();
      if (var2 >= 0 && var3 >= 0) {
         TableModel var4 = (TableModel)var1.getSource();
         Object var5 = var4.getValueAt(var2, var3);
         assert var5 instanceof Integer;
         due var6 = (due)mwn.a(this.ERI);
         a var7 = var6.TargetedResources[var2];
         if (var3 == 1) {
            var7.Amount = (Integer)var5;
         } else if (var3 == 2) {
            var7.LeastTargets = (Integer)var5;
         }

         lfn.b(0, this.getClass().getSimpleName(), "tableChanged() : Data is ->" + var5 + ", @row = " + var2);
      }
   }
}
