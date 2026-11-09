import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class msi$18 implements ActionListener {
   msi$18(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = msi.P(this.EtH).getText();
      String var3 = msi.R(this.EtH).getText();
      boolean var4 = msi.S(this.EtH).isSelected();
      new ArrayList();
      boolean var6 = false;

      for (Object var8 : lea.eps().aOd().keySet()) {
         if (var2.equals(lea.eps().aOd().get(var8).Name)) {
            var6 = true;
         }
      }

      if (var6) {
         cgq var17 = lea.eps().ho(msi.O(this.EtH).Name);
         boolean var9 = false;
         if (!msi.O(this.EtH).DisplayName.equals(var3)) {
            var9 = true;
            var17.DisplayName = msi.R(this.EtH).getText().trim();
         }

         if (!msi.O(this.EtH).bdP == var4) {
            var9 = true;
            var17.bdP = var4;
         }

         if (var9) {
            msi.i(this.EtH);
            JOptionPane.showMessageDialog(null, "Group changes saved.");
         } else {
            JOptionPane.showMessageDialog(null, "Group already exists");
         }
      } else if (var2 != null && !var2.trim().equals("")) {
         int var18 = jua.dTk();
         cgq var19 = new cgq();
         var19.Name = var2;
         var19.DisplayName = var3;
         var19.bdP = var4;
         var19.adk = var18;
         int var10 = jua.dTk();
         cgu var11 = new cgu();
         var11.adk = var10;
         var11.Name = "";

         while (var11.Name == null || var11.Name.isEmpty()) {
            var11.Name = JOptionPane.showInputDialog("Please enter the name of the subgroup:");
         }

         var11.DisplayName = "SubGroup" + Integer.toString(var11.adk);
         var11.bdP = false;
         var11.eyG = var19.adk;
         var19.eyF = lcn.abI(1);
         var19.eyF.put(var11.adk, var11);
         int var12 = jua.dTk();
         cgr var13 = new cgr();
         var13.adk = var12;
         var13.Name = "";

         while (var13.Name == null || var13.Name.isEmpty()) {
            var13.Name = JOptionPane.showInputDialog("Please enter the name of the feat:");
         }

         var13.bdP = false;
         var13.eyL = var11.adk;
         var13.eyG = var19.adk;
         var13.eyU = new chr();
         var13.eyP = false;
         var13.bdP = false;
         var13.eyV = new cgs();
         var13.eyV.ezd = false;
         var13.eyV.ezf = "";
         var13.eyV.ezc = 0.0F;
         var13.eyS = false;
         var13.eyK = new cgt();
         var13.eyK.aCN = lcn.emv();
         var13.eyR = false;
         var13.eyQ = false;
         var13.eyW = false;
         var13.eyX = "";
         var13.eyM = cgj.exY;
         String[] var14 = new String[]{"START"};
         var13.eyN = lcn.bx(var14);
         var11.eyH = lcn.abI(1);
         var11.eyH.put(var13.adk, var13);
         lea.eps().a(var19);
         msg var15 = new msg(var19);
         msg var16 = new msg(var11);
         var15.add(var16);
         var16.add(new msg(var13));
         msi.k(this.EtH).add(var15);
         msi.i(this.EtH);
         msi.a(this.EtH, msi.j(this.EtH), msi.k(this.EtH), var13.Name);
         this.EtH.eNp();
         msi.j(this.EtH).updateUI();
         JOptionPane.showMessageDialog(null, "Feats Tree Last file saved.");
      }
   }
}
