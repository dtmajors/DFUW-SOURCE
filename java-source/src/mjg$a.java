class mjg$a {
   private Thread thread;

   mjg$a(Thread var1) {
      this.thread = var1;
   }

   synchronized Thread ezE() {
      return this.thread;
   }

   synchronized void clear() {
      this.thread = null;
   }
}
