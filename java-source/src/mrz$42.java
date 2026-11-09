import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class mrz$42 implements ActionListener {
   mrz$42(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mrz.j(this.EoW).size() <= 0
         || JOptionPane.showConfirmDialog(this.EoW, "Changes were made that have not been saved. Are you sure you want to load another file? ", "Warning", 0)
            != 1) {
         String var2 = lcw.qLb + "xml-files/common/specialeffect/";
         JFileChooser var3 = new JFileChooser(var2);
         if (var3.showDialog(null, null) == 0) {
            String var4 = "";

            try {
               kbw var5 = new kbw();
               var4 = var3.getSelectedFile().getAbsolutePath();
               var4 = var4.substring(lcw.qLb.length(), var4.length());
               var5.a(var4, lea.bkO(), true, false);
               mrz.j(this.EoW).clear();
               mrz.k(this.EoW);
               mrz.b(this.EoW, "");
               mrz.l(this.EoW).setEnabled(true);
               this.EoW.setTitle("Effects Dialog Editing : " + var4);
               mrz.Dd(var4);
            } catch (bg var6) {
               lfn.b(5, this.getClass().getName(), "SFEffectDialog() : Exception thrown whil parsing " + var2 + " Msg:" + var6.getMessage());
               JOptionPane.showMessageDialog(null, "Failed to load file " + var4 + " because " + var6.getMessage());
            }
         }
      }
   }
}
