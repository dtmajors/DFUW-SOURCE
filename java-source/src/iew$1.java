import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

class iew$1 extends hwv {
   iew$1(iew var1, bsj var2) {
      super(var2);
      this.lPF = var1;
   }

   @Override
   public SFGUIElementDTO cBj() {
      SFGUIElementDTO var1 = super.cBj();
      if (jen.dzL().dzM().dzE() != null && jen.dzL().dzM().dzE().hu(this.liS.getType())) {
         var1.indicators = 32;
      }

      if (lea.epx().qT(this.liS.getType())) {
         var1.text = "<p><font color=\"#f0a015\">" + var1.text + "</font></p>";
      }

      return var1;
   }
}
