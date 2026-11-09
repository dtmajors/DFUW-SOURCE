import java.awt.Component;
import java.util.EventObject;
import java.util.Vector;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;

class moh$f extends JSlider implements TableCellEditor {
   protected transient Vector listeners;
   protected transient int DSB;
   protected transient boolean DSC;

   public moh$f(moh var1) {
      this.DSw = var1;
      this.listeners = new Vector();
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      if (var2 == null) {
         return this;
      }

      if (var2 instanceof Number) {
         int var6 = ((Number)var2).intValue();
         this.setValue(var6);
      } else {
         this.setValue(0);
      }

      var1.setRowSelectionInterval(var4, var4);
      var1.setColumnSelectionInterval(var5, var5);
      this.DSB = this.getValue();
      this.DSC = true;
      return this;
   }

   @Override
   public void cancelCellEditing() {
      this.fireEditingCanceled();
      this.DSC = false;
   }

   @Override
   public Object getCellEditorValue() {
      return new Integer(this.getValue());
   }

   @Override
   public void setValue(int var1) {
      super.setValue(var1);
      int var2 = 0;

      for (int var3 = this.listeners.size(); var2 < var3; var2++) {
         if (this.listeners.get(var2) instanceof mob) {
            mob var4 = (mob)this.listeners.get(var2);
            mof var5 = var4.eHi();
            if (var5 != null) {
               var5.afa(var1);
            }
         }
      }

      moh.d(this.DSw);
      lfn.b(0, this.getClass().getSimpleName(), "setValue() " + var1);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      return true;
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return true;
   }

   @Override
   public boolean stopCellEditing() {
      this.fireEditingStopped();
      this.DSC = false;
      return true;
   }

   @Override
   public void addCellEditorListener(CellEditorListener var1) {
      this.listeners.addElement(var1);
   }

   @Override
   public void removeCellEditorListener(CellEditorListener var1) {
      this.listeners.removeElement(var1);
   }

   protected void fireEditingCanceled() {
      this.setValue(this.DSB);
      ChangeEvent var1 = new ChangeEvent(this);
      int var2 = 0;

      for (int var3 = this.listeners.size(); var2 < var3; var2++) {
         ((CellEditorListener)this.listeners.elementAt(var2)).editingCanceled(var1);
      }
   }

   protected void fireEditingStopped() {
      ChangeEvent var1 = new ChangeEvent(this);
      int var2 = 0;

      for (int var3 = this.listeners.size(); var2 < var3; var2++) {
         ((CellEditorListener)this.listeners.elementAt(var2)).editingStopped(var1);
         moh.d(this.DSw);
      }
   }
}
