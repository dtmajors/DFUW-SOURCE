import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

class lai$6 extends AbstractAction {
   lai$6(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = lai.i(this.qrW);
      String var3 = (String)JOptionPane.showInputDialog(this.qrW, "Select PaperdollItemMap", "Select Map", 3, null, var2, lai.h(this.qrW));
      if (var3 != null) {
         Integer var4 = (Integer)lea.eot().get(var3);
         if (var4 == null) {
            lfn.b(5, "SFPaperDollTreeView.SelectPaperdollItemMap", "actionPerformed() No resourcetype was mapped to filename '" + var3 + "'");
         } else {
            int var5 = var4;
            Map var6 = lea.ack(var5);
            if (var6 == null) {
               lfn.b(
                  5,
                  "SFPaperDollTreeView.SelectPaperdollItemMap",
                  "actionPerformed() No PaperdollItemMap was mapped to resourcetype '" + lai.a(this.qrW).getName(var5) + "'"
               );
            } else {
               boolean var7 = lai.a(this.qrW).k(var5, cug.fia, false);
               this.qrW.a(var5, var3, var6, var7);
            }
         }
      }
   }
}
