import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mxg$17 implements ActionListener {
   mxg$17(mxg var1) {
      this.ETz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      cjr var2 = mxg.c(this.ETz);
      if (var2 != null) {
         cjo var3 = cjo.getTriggerType(this.ETz.ETq.getSelectedItem().toString());
         mxg.a(this.ETz, var3);
         switch (var3) {
            case EQUIP_UNSHEATH:
               cjh var4 = new cjh();
               var4.ayN = var2.eDE.ayN;
               var4.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
               break;
            case SKILL:
               cjn var5 = new cjn();
               var5.ayN = var2.eDE.ayN;
               var5.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
               var5.SkillType = lea.enZ().getType(this.ETz.ESX.getSelectedItem().toString());
               var5.eAg = Boolean.valueOf(this.ETz.ESR.getSelectedItem().toString());
               break;
            case KILL:
               cjj var6 = new cjj();
               var6.ayN = var2.eDE.ayN;
               var6.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
         }
      }
   }
}
