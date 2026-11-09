public enum mjd$b {
   DzY("static", 1),
   DzZ("liquid", 2),
   DAa("waterfall", 4),
   DAb("river", 8),
   DAc("tombstone", 16),
   DAd("ladder", 32),
   DAe("character", 64),
   DAf("mount", 128),
   DAg("tank", 512),
   DAh("smallboat", 256),
   DAi("largeboat", 1024),
   DAj("elevator", 2048),
   DAk("spawnablestructure", 4096),
   DAl("wildlife", 8192),
   DAm("repulsive", 16384),
   DAn("mediumboat", 32768),
   DAo("targetablenoncollider", 65536),
   DAp("seamonster", 131072),
   DAq("bipedmonster", 262144),
   DAr("quadpedmonster", 524288),
   DAs("flyingmonster", 1048576);

   private String DAt;
   private int PC;

   mjd$b(String var3, int var4) {
      this.DAt = var3;
      this.PC = var4;
   }

   public String ezA() {
      return this.DAt;
   }

   public int getValue() {
      return this.PC;
   }
}
