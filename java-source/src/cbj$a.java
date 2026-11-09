import java.util.List;

class cbj$a {
   private int aRB;
   private dxq aiP;
   private List<ldv> ejc;
   private final ljq Position;
   private final float Radius;
   private final float ejd;
   private final ldv eje;

   public cbj$a(cbj var1, fxw var2, int var3) {
      this.ejf = var1;
      this.ejc = lcn.abH(10);
      this.aiP = var2;
      this.aRB = var3;
      this.Position = var2.jaO;
      this.Radius = 75.0F;
      this.ejd = var2.ejd;
      this.eje = null;
      this.ejc.add(var2.cAw);
   }

   public cbj$a(cbj var1, fsv var2, ldv var3) {
      this.ejf = var1;
      this.ejc = lcn.abH(10);
      this.aiP = var2;
      this.aRB = 1;
      this.Position = var2.Position;
      this.Radius = 75.0F;
      this.ejd = 0.0F;
      this.eje = var3;
   }

   public cbj$a(cbj var1, fwq var2, int var3) {
      this.ejf = var1;
      this.ejc = lcn.abH(10);
      this.aiP = var2;
      this.aRB = var3;
      this.Position = var2.bSx();
      this.Radius = var2.bSy();
      this.ejd = 0.0F;
      this.eje = null;
   }

   public void i(ldv var1, ljq var2) {
      this.aRB--;
      assert this.aRB >= 0;
      if (var2 != null) {
         float var3 = this.Position.ez(var2);
         if (var3 <= this.Radius) {
            this.ejc.add(var1);
         }
      }
   }

   public boolean aHy() {
      return this.aRB != 0;
   }

   public float kl(ldv var1) {
      assert !this.aHy();
      return this.ejd / this.ejc.size();
   }

   public List<ldv> aHz() {
      assert !this.aHy();
      return this.ejc;
   }
}
