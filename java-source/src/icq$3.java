class icq$3 extends iou<ics> {
   icq$3(icq var1) {
      this.lHA = var1;
   }

   public void a(ics var1) {
      icq.e(this.lHA).lHC = var1;
      if (icq.f(this.lHA) != null) {
         for (icq var3 : icq.f(this.lHA)) {
            icq.g(var3).setValue(var1);
         }
      }
   }
}
