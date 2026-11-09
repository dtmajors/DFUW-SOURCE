import spenefett.hid.gui.serialization.dto.SFInputOptionsDTO;

class jjd$d {
   public static final String niY = "VO.MouseXSensitivity";
   public static final String niZ = "VO.MouseYSensitivity";
   public static final String nja = "VO.MouseInvertYAxis";
   public static final String njb = "VO.MouseSmoothingEnabled";
   public static final String njc = "VO.MouseSmoothingAmount";

   public jjd$d(jjd var1) {
      this.nij = var1;
      SFInputOptionsDTO var2 = new SFInputOptionsDTO();
      var1.a("VO.MouseXSensitivity", hsu.ldg, var2.mouseXSensitivity);
      var1.a("VO.MouseYSensitivity", hsu.ldg, var2.mouseYSensitivity);
      var1.a("VO.MouseInvertYAxis", hsu.ldg, var2.mouseInvertYAxis);
      var1.a("VO.MouseSmoothingEnabled", hsu.ldg, var2.mouseSmoothingEnabled);
      var1.a("VO.MouseSmoothingAmount", hsu.ldg, var2.mouseSmoothingAmount);
   }

   private SFInputOptionsDTO dIA() {
      SFInputOptionsDTO var1 = new SFInputOptionsDTO();
      var1.mouseXSensitivity = this.nij.ni("VO.MouseXSensitivity");
      var1.mouseYSensitivity = this.nij.ni("VO.MouseYSensitivity");
      var1.mouseInvertYAxis = this.nij.nk("VO.MouseInvertYAxis");
      var1.mouseSmoothingEnabled = this.nij.nk("VO.MouseSmoothingEnabled");
      var1.mouseSmoothingAmount = this.nij.ni("VO.MouseSmoothingAmount");
      return var1;
   }

   private void a(SFInputOptionsDTO var1) {
      this.nij.d("VO.MouseXSensitivity", var1.mouseXSensitivity);
      this.nij.d("VO.MouseYSensitivity", var1.mouseYSensitivity);
      this.nij.q("VO.MouseInvertYAxis", var1.mouseInvertYAxis);
      this.nij.q("VO.MouseSmoothingEnabled", var1.mouseSmoothingEnabled);
      this.nij.d("VO.MouseSmoothingAmount", var1.mouseSmoothingAmount);
   }

   public void fz(int var1, int var2) {
   }

   public void b(SFInputOptionsDTO var1) {
      float var2 = 0.05F;
      float var3 = 0.1F;
      float var4 = 0.0F;
      float var5 = 10.0F;
      float var6 = (var1.mouseSmoothingAmount - var4) / (var5 - var4);
      if (var6 < 0.0F) {
         var6 = 0.0F;
      }

      if (var6 > 1.0F) {
         var6 = 1.0F;
      }

      float var7 = var2 + (var3 - var2) * var6;
      fiy var8 = (fiy)jjd.ao(this.nij).h(2842, jjd.an(this.nij), lcr.qBR);
      var8.iNs = var1.mouseXSensitivity;
      var8.iNt = var1.mouseYSensitivity;
      var8.mouseInvertYAxis = var1.mouseInvertYAxis;
      var8.mouseSmoothingEnabled = var1.mouseSmoothingEnabled;
      var8.mouseSmoothingAmount = var7;
      jjd.ap(this.nij).F(var8);
      this.a(var1);
   }

   public void dIl() {
   }

   private void cBa() {
      SFInputOptionsDTO var1 = this.dIA();
      this.b(var1);
      this.nij.a("InputOptionsDivision_fromDTO", new Object[]{var1});
   }

   public void cEj() {
   }
}
