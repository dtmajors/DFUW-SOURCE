enum msb$a {
   Epu,
   Epv,
   Epw,
   Epx,
   Epy;

   @Override
   public String toString() {
      return this.name().toLowerCase().replace("_", " ");
   }
}
