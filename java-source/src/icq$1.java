class icq$1 extends iws {
   icq$1(icq var1) {
      this.lHA = var1;
   }

   @Override
   public void pn(boolean var1) {
      icq.a(this.lHA).setVisible(var1);
      icq.b(this.lHA).setVisible(var1);
      if (icq.c(this.lHA) != null) {
         icq.c(this.lHA).pack();
      }
   }
}
