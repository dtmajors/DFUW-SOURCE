import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicFileChooserUI.DoubleClickListener;
import javax.swing.plaf.metal.MetalFileChooserUI.SingleClickListener;

public class mkb$d$a extends DoubleClickListener {
   JList list;

   public mkb$d$a(mkb$d var1, JList var2) {
      super(var1, var2);
      this.DFg = var1;
      this.list = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      MouseListener[] var2 = this.list.getMouseListeners();

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3] instanceof SingleClickListener) {
         }
      }

      super.mouseEntered(var1);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      super.mouseClicked(var1);
      jrw var2 = this.DFg.DEO.eDc();
      if (SwingUtilities.isLeftMouseButton(var1) && var1.getClickCount() == 2) {
         if (mkb.a(this.DFg.DEO) != null) {
            mkb.a(this.DFg.DEO).a(this.DFg.DEO, var2);
         } else if (mkb.b(this.DFg.DEO) != null) {
            if (var2 != null && var2.isFile()) {
               jrw var3 = var2;
               if (myz.an(var3)) {
                  lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Object [" + var3.getName() + "] is blacklisted!");
                  int var4 = JOptionPane.showConfirmDialog(
                     mkb.b(this.DFg.DEO), "Are you sure you want to load this blacklisted file (" + var3.getName() + ")", "Blacklisted file", 0
                  );
                  if (var4 == 1) {
                     return;
                  }
               }

               hac var5 = (hac)mkb.b(this.DFg.DEO).d(4097);
               var5.on(lcr.qAE);
               var5.f(lcr.qzr);
               var5.Lb(1);
               var5.setFileName(var3.getAbsolutePath().toLowerCase());
               mkb.b(this.DFg.DEO).a(var5);
               mje.DBL = this.DFg.DEO.eDd();
            }
         } else {
            lfn.b(0, this.getClass().getName(), "mouseClicked() : WBDESKTOP IS NULL!");
         }
      }

      if (SwingUtilities.isRightMouseButton(var1) && var1.getClickCount() == 1 && var2 != null) {
         mkb.c(this.DFg.DEO).show(var1.getComponent(), var1.getX(), var1.getY());
      }
   }
}
