import java.util.Arrays;
import lmx.a;

public class atk$a extends a {
   public static final lnu.a bYx = new lnu.a(8, 512, 1);
   public static final lnu.a bYy = new lnu.a(0, 100, 1);
   public static final lnu.a bYz = new lnu.a(0, 100, 1);
   public static final atk$a bYA = new atk$a();

   public atk$a() {
      super(
         atk.class,
         Arrays.asList(
            new lmx.a.a(bYx, "MEMBER_MAX_NUM_3D_SOUNDS", new lnu(45)),
            new lmx.a.a(bYy, "MEMBER_AMBIENCE_VOLUME", new lnu(atm.bYJ)),
            new lmx.a.a(lne.a.rFu, "MEMBER_HITSOUND_ENABLED", new lne(false)),
            new lmx.a.a(bYz, "MEMBER_SOUND_VOLUME", new lnu(100)),
            new lmx.a.a(lne.a.rFu, "MEMBER_PRIVATE_MESSAGE_SOUND_ENABLED", new lne(true))
         )
      );
   }
}
