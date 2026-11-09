import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

class msi$17 implements ActionListener {
   msi$17(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = msi.K(this.EtH).getText();
      String var3 = msi.M(this.EtH).getText();
      boolean var4 = msi.N(this.EtH).isSelected();
      new ArrayList();
      boolean var6 = false;
      Iterator var7 = lea.eps().aOe().keySet().iterator();
      if (!msi.N(this.EtH).isSelected() && msj.afu(msi.G(this.EtH).adk)) {
         JOptionPane.showMessageDialog(null, "Warning: You set this SubGroup's value as 'Unlocked' while it is already a reward. Not saving.");
         msi.N(this.EtH).setSelected(true);
      } else {
         while (var7.hasNext()) {
            Object var8 = var7.next();
            if (var2.equals(((cgu)this.EtH.Etk.get(var8)).Name)) {
               var6 = true;
               System.out.println(var2);
            }
         }

         if (var6) {
            cgu var16 = lea.eps().hl(msi.G(this.EtH).Name);
            boolean var9 = false;
            if (!msi.G(this.EtH).DisplayName.equals(var3)) {
               var9 = true;
               var16.DisplayName = msi.M(this.EtH).getText().trim();
            }

            if (!msi.G(this.EtH).bdP == var4) {
               var9 = true;
               var16.bdP = var4;
            }

            if (var9) {
               msi.i(this.EtH);
               JOptionPane.showMessageDialog(null, "Sub-Group changes saved.");
            } else {
               JOptionPane.showMessageDialog(null, "Sub-Group already exists");
            }
         } else if (var2 != null && !var2.trim().equals("")) {
            int var17 = jua.dTk();
            cgu var18 = new cgu();
            var18.adk = var17;
            var18.Name = this.Di(var2);
            var18.DisplayName = var3;
            var18.bdP = var4;
            var18.eyG = msi.G(this.EtH).eyG;
            cgq var10 = lea.eps().pV(var18.eyG);
            var10.eyF.put(var18.adk, var18);
            int var11 = jua.dTk();
            cgr var12 = new cgr();
            var12.adk = var11;
            var12.Name = JOptionPane.showInputDialog("Please enter the name of the feat:");
            var12.bdP = false;
            var12.eyL = var18.adk;
            var12.eyG = var10.adk;
            var12.eyU = new chr();
            var12.eyP = false;
            var12.bdP = false;
            var12.eyV = new cgs();
            var12.eyV.ezd = false;
            var12.eyV.ezf = "";
            var12.eyV.ezc = 0.0F;
            var12.eyS = false;
            var12.eyK = new cgt();
            var12.eyK.aCN = lcn.emv();
            var12.eyR = false;
            var12.eyQ = false;
            var12.eyW = false;
            var12.eyX = "";
            var12.eyM = cgj.exY;
            String[] var13 = new String[]{"START"};
            var12.eyN = lcn.bx(var13);
            var18.eyH = lcn.abI(1);
            var18.eyH.put(var12.adk, var12);
            lea.eps().b(lea.eps().pV(msi.G(this.EtH).eyG));
            msg var14 = msi.c(this.EtH, lea.eps().pV(var18.eyG).Name);
            msg var15 = new msg(var18);
            var14.add(var15);
            var15.add(new msg(var12));
            msi.i(this.EtH);
            msi.a(this.EtH, msi.j(this.EtH), msi.k(this.EtH), var12.Name);
            this.EtH.eNp();
            msi.j(this.EtH).updateUI();
            JOptionPane.showMessageDialog(null, "Feats Tree Last file saved.");
         }
      }
   }

   private String Di(String var1) {
      for (cgu var4 : lea.eps().aOh().values()) {
         if (var1.equals(var4.Name)) {
            return JOptionPane.showInputDialog("Please enter the name of the subgroup:");
         }
      }

      return var1;
   }
}
