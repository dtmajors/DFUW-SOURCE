class hdm$13 implements lbn {
   hdm$13(hdm var1) {
      this.kan = var1;
   }

   @Override
   public final void W() {
      assert hdm.j(this.kan) != null;
      this.kan.jZL.cdc().yP(hdm.j(this.kan).cgi());
      hdm.j(this.kan).remove();
      hdm.a(this.kan, null);
      assert hdm.j(this.kan) == null;
   }
}
