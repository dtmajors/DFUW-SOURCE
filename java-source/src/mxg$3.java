import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class mxg$3 extends MouseAdapter {
   mxg$3(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         mxg.a(this.ETz, var2);
         if (var1.getClickCount() == 2) {
            String var14 = JOptionPane.showInputDialog(mxg.d(this.ETz), "Edit Task Name", var2.Name);
            if (var14 != null && !var14.isEmpty() && !var14.equals(var2.Name)) {
               var2.Name = var14;
               mxg.e(this.ETz);
            }

            return;
         }

         String var3 = var2.eEi;
         this.ETz.ETb.setText(var3);
         if (var2.eEj != null) {
            this.ETz.ESY.setSelectedItem(var2.eEj);
         }

         cjf var13 = var2.eDE;
         this.ETz.ETq.setSelectedItem(var13.aPY().name());
         mxg.a(this.ETz, var13.aPY());
         switch (var13.aPY()) {
            case EQUIP_UNSHEATH:
               cjh var16 = (cjh)var13;
               this.ETz.ESV.setSelectedItem(lea.enW().getName(var16.ResourceType));
               this.ETz.ESL.setSelectedItem(String.valueOf(var16.ayN));
               break;
            case SKILL:
               cjn var15 = (cjn)var13;
               this.ETz.ESV.setSelectedItem(lea.enW().getName(var15.ResourceType));
               this.ETz.ESX.setSelectedItem(lea.enZ().getName(var15.SkillType));
               this.ETz.ESR.setSelectedItem(String.valueOf(var15.eAg));
               this.ETz.ESL.setSelectedItem(String.valueOf(var15.ayN));
               break;
            case KILL:
               cjj var4 = (cjj)var13;
               this.ETz.ESV.setSelectedItem(lea.enW().getName(var4.ResourceType));
               this.ETz.ESL.setSelectedItem(String.valueOf(var4.ayN));
         }

         ((DefaultTableModel)this.ETz.EQz.getModel()).getDataVector().clear();
         List var17 = var2.bhg;
         if (var17 != null) {
            for (cjs var6 : var17) {
               String var7 = var6.eEa;

               for (cjt var10 : var6.aCN) {
                  String var11 = lea.enW().getName(var10.ResourceType);
                  int var12 = var10.ayN;
                  mxg.a(this.ETz, var11, var12, var7);
               }
            }
         }

         this.ETz.EQz.revalidate();
      }
   }
}
