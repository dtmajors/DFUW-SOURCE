enum prn$a {
   EYy("Mesh"),
   EYz("Spawn point"),
   EYA("Interaction"),
   EYB("Bindstone");

   private String kL;

   prn$a(String var3) {
      this.kL = var3;
   }

   public String getTypeName() {
      return this.kL;
   }
}
