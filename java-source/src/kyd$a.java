class kyd$a {
   public int bnM;
   public float Pz;
   public float aXs;

   public kyd$a(kyd var1, int var2, float var3) {
      this.qiQ = var1;
      this.bnM = var2;
      this.Pz = var3;
      this.aXs = 0.0F;
   }

   private kyd$a mT(float var1) {
      return new kyd$a(this.qiQ, this.bnM, this.Pz * var1);
   }
}
