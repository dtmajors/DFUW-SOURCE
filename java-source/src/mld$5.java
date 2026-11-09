import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mld$5 implements ListSelectionListener {
   mld$5(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.DHD.DHf.clear();
      int var2 = this.DHD.DHd.getSelectedIndex();
      if (var2 != -1) {
         String var3 = (String)this.DHD.DHb.get(var2);
         int var4 = var3.indexOf(58);
         var3 = var3.substring(0, var3.indexOf(":"));
         int var5 = lea.enW().getType(var3);
         if (var5 != -1) {
            ctq var6 = lea.eoJ().get(var5);
            mld.a(this.DHD, var6, new mld$5$1(this));
         }
      }

      this.DHD.DHe.updateUI();
   }
}
