import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

class mwk$3 implements ActionListener {
   mwk$3(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = System.getenv("windir");
      String var3 = var2 + "\\System32\\Notepad.exe ";
      String var4 = mwk.b(this.EPI).eRl();

      try {
         Runtime.getRuntime().exec(var3 + var4);
      } catch (IOException var6) {
         JOptionPane.showMessageDialog(mwk.c(this.EPI), "The document doesn't exist!", "Document not found!", 0);
         var6.printStackTrace();
      }
   }
}
