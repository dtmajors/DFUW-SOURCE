class dgw$a {
   public float gqm;
   public float gqn;
   public float gtA;

   private dgw$a(dgw var1) {
      this.gtB = var1;
      this.gqm = 0.0F;
      this.gqn = 0.0F;
      this.gtA = 0.0F;
   }

   float d(float var1, boolean var2) {
      float var3 = var1;
      if (var1 == this.gtA) {
         var3 = this.gqm;
      }

      float var4 = dgw.access$100(this.gtB);
      if (var2) {
         var4 = dgw.access$200(this.gtB);
      }

      var3 = (float)(var3 + (Math.random() - 0.5) * var4);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var2 && var3 > 1.0F) {
         var3 = 1.0F;
      }

      this.gtA = var3;
      return var3;
   }
}
