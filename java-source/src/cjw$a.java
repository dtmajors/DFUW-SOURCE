enum cjw$a {
   eEG(
      "RC0",
      new mhr(
         "Primary;7;-1;-1;-1;-1;0;1;3;2;3;0;2;1;-1;5;-1;-1;-1;-1;680197032;5;-1;-1;-1;-1;423394073;5;-1;-1;-1;-1;343336022;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;671702167;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1;-1;5;-1;-1;-1;-1"
      )
   ),
   eEH("PC", new mhr("Primary")),
   eEI("ACN", new mhr("Primary")),
   eEJ("ST9", new mho(cxd.fLf)),
   eEK("ST1", new mho(cxd.fLi)),
   eEL("ST2", new mho(cxd.fLk)),
   eEM("ST3", new mho(cxd.fLl));

   private final String aDa = "RolesWindow";
   private String Name;
   private mhk byr;

   cjw$a(String var3, mhk var4) {
      this.Name = var3;
      this.byr = var4;
   }
}
