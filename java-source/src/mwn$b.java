import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class mwn$b implements TableModelListener {
   public mwn$b(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void tableChanged(TableModelEvent var1) {
      int var2 = var1.getFirstRow();
      int var3 = var1.getColumn();
      if (var2 >= 0 && var3 >= 0) {
         TableModel var4 = (TableModel)var1.getSource();
         Object var5 = var4.getValueAt(var2, var3);
         assert var5 instanceof String;
         due var6 = (due)mwn.a(this.ERI);
         if (var6.Markers != null) {
            duc var7 = var6.Markers[var2];
            if (var3 == 1) {
               var7.Caption = var5.toString();
            }

            if (var3 == 2) {
               var7.MarkerIconType = var5.toString();
            }

            if (var3 == 5) {
               var7.setVisible(Boolean.parseBoolean(var5.toString()));
            }

            mwn.j(this.ERI);
         }
      }
   }
}
