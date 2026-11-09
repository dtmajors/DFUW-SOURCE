public enum axn$a {
   csr("Select.."),
   css("alfar"),
   cst("dwarf"),
   csu("human"),
   csv("mahirim"),
   csw("mirdain"),
   csx("ork");

   private String Name;

   axn$a(String var3) {
      this.Name = var3;
   }

   @Override
   public String toString() {
      return this.Name;
   }
}
