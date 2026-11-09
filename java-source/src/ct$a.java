import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ct$a {
   kz("beard", "Beard", 1025),
   kA("beard braids", "Beard Braids", 1026),
   kB("braids", "Braids ", 1027),
   kC("ear accessory", "Earring", 1028),
   kD("extra accessory", "Extra Accessory", 1029),
   kE("face", "Face", 1030),
   kF("forehead accessory", "Forehead", 1031),
   kG("hair", "Hair", 1032),
   kH("mustache", "Mustache", 1033),
   kI("nose accessory", "Nose Accessory", 1034),
   kJ("sideburns", "Sideburns", 1035),
   kK("tusks", "Tusks", 1036);

   public static final List<ct$a> Values = Collections.unmodifiableList(Arrays.asList(ct$a.class.getEnumConstants()));
   private String Name;
   private String kL;
   private int kM = 0;

   ct$a(String var3, String var4, int var5) {
      this.Name = var3;
      this.kL = var4;
      this.kM = var5;
   }

   public String getName() {
      return this.Name;
   }

   public int getDataType() {
      return this.kM;
   }

   public String cs() {
      return this.kL;
   }

   public static ct$a getValueByName(String var0) {
      for (ct$a var2 : Values) {
         if (var2.getName().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }
}
