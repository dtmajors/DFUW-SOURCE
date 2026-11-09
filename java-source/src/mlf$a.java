import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

class mlf$a extends MouseAdapter {
   mlf$a(mlf var1) {
      this.DIe = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Component var2 = (Component)var1.getSource();
      if (var1.getModifiers() == 16 && var2.equals(mlf.a(this.DIe).getList())) {
         String var3 = (String)mlf.a(this.DIe).eDq();
         if (var3 == null) {
            lfn.b(0, this.getClass().getSimpleName(), "mousePressed() : Nothing selected!");
            return;
         }

         List var4 = mje.DBz.get(var3);
         if (var4 != null) {
            mlf.b(this.DIe).cp(var4);
            ((mlg)mlf.b(this.DIe).getModel()).ae(0, (String)mlf.a(this.DIe).eDq());
            ((mlg)mlf.b(this.DIe).getModel()).fireTableDataChanged();
         } else {
            lfn.b(5, "SFMouseHandler.mousePressed()", "SetData is null!");
         }
      }
   }
}
