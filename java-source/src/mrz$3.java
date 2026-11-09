import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map.Entry;
import javax.swing.JOptionPane;

class mrz$3 implements ActionListener {
   mrz$3(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ArrayList var2 = new ArrayList();

      for (Entry var4 : lea.bkO().entrySet()) {
         String var5 = del.zU((Integer)var4.getKey()).toLowerCase();
         String[] var6 = new String[]{"se_air_", "se_arc_", "se_em_", "se_fm_", "se_gm_", "se_lm_", "se_nm_", "se_sc_", "se_wat_", "se_wc_"};
         boolean var7 = false;

         for (String var11 : var6) {
            if (var5.contains(var11)) {
               var7 = true;
            }
         }

         if (var7) {
            var2.add(var4.getKey());
         }
      }

      for (Integer var13 : var2) {
         dgj var14 = lea.bkO().get(var13);
         lea.bkO().remove(var13);
         del.n(del.zU(var13), var13);
      }

      mrz.k(this.EoW);
      mrz.b(this.EoW, "");
      JOptionPane.showMessageDialog(this.EoW, "removed  " + var2.size() + " special effects!");
   }
}
