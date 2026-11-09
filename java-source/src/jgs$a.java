public class jgs$a {
   private ldv Ri;
   private String Name;
   private float adf;
   private boolean adc;

   public jgs$a(jgs var1, ldv var2, String var3, float var4, boolean var5) {
      this.nbc = var1;
      this.Ri = null;
      this.Name = null;
      this.adf = 0.0F;
      this.adc = false;
      this.Ri = var2;
      this.Name = var3;
      this.adf = var4;
      this.adc = var5;
   }

   public void a(String var1, float var2, boolean var3) {
      this.Name = var1;
      this.adf = var2;
      this.adc = var3;
   }

   public final String getName() {
      return this.Name;
   }

   public final ldv qd() {
      return this.Ri;
   }

   public final float pN() {
      return this.adf;
   }

   public final boolean qf() {
      return this.adc;
   }
}
