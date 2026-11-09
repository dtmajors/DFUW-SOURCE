public enum asv$b {
   bWZ,
   bXa,
   bXb,
   bXc,
   bXd,
   bXe,
   bXf,
   bXg,
   bXh;

   public float UQ() {
      switch (this) {
         case bXb:
            return 0.01F;
         case bXh:
            return 0.03F;
         case bXf:
            return 0.1F;
         case bXe:
            return 0.3F;
         case bXd:
            return 0.5F;
         case bWZ:
            return 0.7F;
         case bXc:
            return 1.2F;
         case bXg:
            return 1.5F;
         case bXa:
            return 2.0F;
         default:
            return 0.0F;
      }
   }
}
