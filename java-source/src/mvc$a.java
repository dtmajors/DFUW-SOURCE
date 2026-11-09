import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.EventObject;
import java.util.List;
import java.util.Map;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

class mvc$a extends DefaultTreeCellEditor implements CellEditorListener {
   private cc EJF;

   public mvc$a(mvc var1, JTree var2, DefaultTreeCellRenderer var3) {
      super(var2, var3);
      this.EJE = var1;
      this.EJF = null;
      this.addCellEditorListener(this);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      if (var1 instanceof MouseEvent) {
         MouseEvent var2 = (MouseEvent)var1;
         TreePath var3 = mvc.a(this.EJE).getPathForLocation(var2.getX(), var2.getY());
         if (var3 != null) {
            this.EJF = (cc)var3.getLastPathComponent();
            return this.EJF.getNodeType() == 4;
         }
      }

      return false;
   }

   @Override
   public void editingCanceled(ChangeEvent var1) {
   }

   @Override
   public void editingStopped(ChangeEvent var1) {
      if (this.EJF.getNodeType() == 4) {
         String var2 = (String)this.EJF.getUserObject();
         this.a(this.EJF, var2);
      }
   }

   private void a(cc var1, String var2) {
      if (var1.isField()) {
         cc var3 = (cc)var1.getParent();
         Object[] var4 = (Object[])var3.ao();
         Object var5 = var4[0];
         Field var6 = (Field)var4[1];
         mvc.a(this.EJE, var5, var6, var2);
         this.EJE.a((cc)var3.getParent(), var5);
      } else if (var1.aq()) {
         cc var8 = (cc)var1.getParent();
         Object[] var11 = (Object[])var8.ao();
         List var14 = (List)var11[0];
         Integer var17 = (Integer)var11[1];
         String var7 = (String)var11[2];
         mvc.a(this.EJE, var14, var17.intValue(), var7, var2);
         this.EJE.a((cc)var8.getParent(), var14);
      } else if (var1.ar()) {
         cc var9 = (cc)var1.getParent();
         Object[] var12 = (Object[])var9.ao();
         Map var15 = (Map)var12[0];
         String var18 = (String)var12[1];
         Object var20 = var12[4];
         mvc.a(this.EJE, var15, var18, var2, var20);
         this.EJE.a((cc)var9.getParent(), var15);
      } else if (var1.as()) {
         cc var10 = (cc)var1.getParent();
         Object[] var13 = (Object[])var10.ao();
         Map var16 = (Map)var13[0];
         Object var19 = var13[2];
         String var21 = (String)var13[3];
         mvc.a(this.EJE, var16, var19, var21, var2);
         this.EJE.a((cc)var10.getParent(), var16);
      }
   }
}
