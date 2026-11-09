import java.awt.event.ActionEvent;
import java.util.StringTokenizer;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

class law$9 extends AbstractAction {
   law$9(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (law.h(this.quD).isSelected()) {
         mkb var2 = new mkb(law.k(this.quD));
         var2.setFileSelectionMode(0);
         int var3 = var2.showDialog(this.quD, "Select");
         if (var3 == 0) {
            jrw var4 = var2.eDc();
            String var5 = var4.getName();
            String var6 = var4.getAbsolutePath();
            String var7 = var6.substring(law.elW().length());
            StringTokenizer var8 = new StringTokenizer(var7, "/", false);
            if (var8.countTokens() != 2) {
               lfn.b(5, "SFXMLVerifierPropertyView", "SelectResourceButton.actionPerformed() Invalid number of tokens found: '" + var7 + "'");
               return;
            }

            law.i(this.quD).setText("xml-files/server/persistence/" + var8.nextToken());
            law.j(this.quD).setText(var5.substring(0, var5.lastIndexOf(46)));
         }
      } else {
         JFileChooser var9 = new JFileChooser(law.g(this.quD));
         var9.setFileSelectionMode(0);
         int var10 = var9.showDialog(this.quD, "Select");
         if (var10 == 0) {
            String var11 = var9.getSelectedFile().getName();
            var11 = var11.substring(0, var11.lastIndexOf(46));
            law.j(this.quD).setText(var11);
         }
      }
   }
}
