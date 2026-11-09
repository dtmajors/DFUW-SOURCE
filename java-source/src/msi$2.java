import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class msi$2 implements TreeSelectionListener {
   msi$2(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      try {
         Object var2 = var1.getSource();
         JTree var3 = (JTree)var2;
         if (var3.isSelectionEmpty() || var3.getSelectionPath() == null) {
            return;
         }

         this.a(var1);
      } catch (Exception var4) {
      }
   }

   private void a(TreeSelectionEvent var1) {
      msg var2 = (msg)var1.getNewLeadSelectionPath().getLastPathComponent();
      String var3 = var2.getType();
      Object var4 = var2.eNr();
      if (var2 != null) {
         if (var3.equals("Feat")) {
            msi.a(this.EtH, (cgr)var4);
            msi.a(this.EtH, null);
            msi.a(this.EtH, null);
         } else if (var3.equals("Group")) {
            msi.a(this.EtH, (cgq)var4);
            msi.a(this.EtH, null);
            msi.a(this.EtH, null);
         } else if (var3.equals("SubGroup")) {
            msi.a(this.EtH, (cgu)var4);
            msi.a(this.EtH, null);
            msi.a(this.EtH, null);
         }
      }
   }

   private void eNK() {
      if (msi.G(this.EtH) != null) {
         String var1 = Integer.toString(msi.G(this.EtH).adk);
         String var2 = msi.G(this.EtH).Name;
         String var3 = msi.G(this.EtH).DisplayName;
         Boolean var4 = msi.G(this.EtH).bdP;
         msi.H(this.EtH).setExpanded(false);
         msi.I(this.EtH).setExpanded(true);
         msi.J(this.EtH).setExpanded(false);
         msi.K(this.EtH).setText(var2);
         msi.L(this.EtH).setText(var1);
         msi.M(this.EtH).setText(var3);
         msi.N(this.EtH).setSelected(var4);
      }
   }

   private void eNL() {
      if (msi.O(this.EtH) != null) {
         String var1 = Integer.toString(msi.O(this.EtH).adk);
         String var2 = msi.O(this.EtH).Name;
         String var3 = msi.O(this.EtH).DisplayName;
         Boolean var4 = msi.O(this.EtH).bdP;
         msi.H(this.EtH).setExpanded(false);
         msi.J(this.EtH).setExpanded(true);
         msi.I(this.EtH).setExpanded(false);
         msi.P(this.EtH).setText(var2);
         msi.Q(this.EtH).setText(var1);
         msi.R(this.EtH).setText(var3);
         msi.S(this.EtH).setSelected(var4);
      }
   }
}
