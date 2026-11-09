import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

class mvd$1 implements ActionListener {
   mvd$1(mvd var1) {
      this.EJO = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mvd.a(this.EJO).getText();
      if (var2 != null && var2.trim() == "") {
         var2 = null;
      }

      int var3 = -1;
      String var4 = mvd.b(this.EJO).getText();
      if (var4 != null && var4.trim() != "") {
         try {
            var3 = Integer.parseInt(var4);
         } catch (NumberFormatException var7) {
            var3 = -1;
         }
      }

      mvd.a(this.EJO, mvd.c(this.EJO).an(var2, var3));
      DefaultListModel var5 = new DefaultListModel();

      for (int var6 = 0; var6 < mvd.d(this.EJO).size(); var6++) {
         var5.addElement(mvd.d(this.EJO).get(var6));
      }

      mvd.e(this.EJO).setModel(var5);
      if (mvd.d(this.EJO).size() <= 10) {
         mvd.e(this.EJO).setVisibleRowCount(mvd.d(this.EJO).size());
      } else {
         mvd.e(this.EJO).setVisibleRowCount(10);
      }
   }
}
