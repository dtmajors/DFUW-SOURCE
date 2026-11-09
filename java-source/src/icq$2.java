class icq$2 extends ipx {
   icq$2(icq var1, iqz var2) {
      super(var2);
      this.lHA = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      if (icq.d(this.lHA) != null) {
         icq.d(this.lHA).hX(!icq.d(this.lHA).dir());
         icq.d(this.lHA).pn(icq.d(this.lHA).dir());
         return true;
      } else {
         return false;
      }
   }
}
