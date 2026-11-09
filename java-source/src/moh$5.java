import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class moh$5 implements TableModelListener {
   moh$5(moh var1) {
      this.DSw = var1;
   }

   @Override
   public void tableChanged(TableModelEvent var1) {
      lfn.b(0, this.getClass().getSimpleName(), "tableChanged() changed!");
      moh.d(this.DSw);
   }
}
