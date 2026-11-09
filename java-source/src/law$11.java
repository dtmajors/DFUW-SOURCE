import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class law$11 implements ItemListener {
   law$11(law var1) {
      this.quD = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      lcw.qGY = law.l(this.quD).isSelected();
      lcw.yj(law.l(this.quD).isSelected());
      lfn.b(0, "SFXMLVerifierPropertyView", "S_UseTestSkillsCheckBox.itemStateChanged() DirServerSkill='" + lcw.qMZ + "'");
   }
}
