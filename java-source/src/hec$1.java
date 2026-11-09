import spenefett.util.jni.SFJNIUtils;

class hec$1 implements lbn {
   hec$1(hec var1) {
      this.kdd = var1;
   }

   @Override
   public final void W() {
      assert hec.a(this.kdd);
      if (this.kdd.kcc.ccE().getValue()) {
         int var1 = (int)this.kdd.kcc.ccG().getValue();
         SFJNIUtils.Instance.sleep(var1);
      }

      if (hec.b(this.kdd)) {
         hec.c(this.kdd);
         hec.a(this.kdd, false);
      }
   }
}
