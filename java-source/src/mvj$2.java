class mvj$2 implements Runnable {
   mvj$2(mvj var1, int var2, int var3, String var4) {
      this.EKV = var1;
      this.DGm = var2;
      this.DGn = var3;
      this.DGo = var4;
   }

   @Override
   public void run() {
      mvj.a(this.EKV).setString("" + this.DGm + "/" + this.DGn);
      if (mvj.a(this.EKV).isIndeterminate() && this.DGn != 0) {
         mvj.a(this.EKV).setIndeterminate(false);
         mvj.a(this.EKV).setString(null);
      }

      mvj.a(this.EKV).setMaximum(this.DGn);
      mvj.a(this.EKV).setValue(this.DGm);
      mvj.b(this.EKV).append(this.DGo + "\n");
   }
}
