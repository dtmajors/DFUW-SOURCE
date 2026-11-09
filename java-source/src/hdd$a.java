import java.util.Arrays;
import lmx.a;

public class hdd$a extends a {
   public static final lni.a jKR = new lni.a(2.0, 10000.0);
   public static final lnm.a<hdm$a> jKS = new lnm.a<>(hdm$a.class);
   public static final lni.a jKT = new lni.a(0.001, 2.0);
   public static final lni.a jKU = new lni.a(0.0, 2.0);
   public static final lni.a jKV = new lni.a(0.2, 5.0);
   public static final lni.a jKW = new lni.a(0.3, 1.0);
   public static final hdd$a jKX = new hdd$a();

   public hdd$a() {
      super(
         hdd.class,
         Arrays.asList(
            new lmx.a.a(jKR, "AnimationSpeed", new lni(2000.0)),
            new lmx.a.a(jKS, "ClutterizerSelector", new lnm<>(jKS, hdm$a.kaq)),
            new lmx.a.a(jKT, "ClutteringDuration", new lni(0.2F)),
            new lmx.a.a(lne.a.rFu, "ConfirmItemDrops", new lne(true)),
            new lmx.a.a(lne.a.rFu, "ConfirmPurchases", new lne(true)),
            new lmx.a.a(lne.a.rFu, "ConfirmRebindings", new lne(true)),
            new lmx.a.a(jKU, "TooltipSpeed", new lni(0.2)),
            new lmx.a.a(jKV, "AutoTooltipDuration", new lni(2.0)),
            new lmx.a.a(jKW, "ActiveWindowOpacity", new lni(1.0)),
            new lmx.a.a(jKW, "InactiveWindowOpacity", new lni(0.8)),
            new lmx.a.a(jKW, "GamemodeWindowOpacity", new lni(0.8)),
            new lmx.a.a(lne.a.rFu, "IdentifyDistantTargets", new lne(false)),
            new lmx.a.a(lne.a.rFu, "ShowDescriptionWindow", new lne(true)),
            new lmx.a.a(lne.a.rFu, "ShowCompassWindow", new lne(true)),
            new lmx.a.a(hdf$a.jLy, "MinimapOptions", new hdf()),
            new lmx.a.a(hdg$a.jLz, "WorldmapOptions", new hdg()),
            new lmx.a.a(lne.a.rFu, "DisplayFPS", new lne(false)),
            new lmx.a.a(lne.a.rFu, "DisplayPing", new lne(true)),
            new lmx.a.a(lne.a.rFu, "ShowTutorialNextTime", new lne(true)),
            new lmx.a.a(lne.a.rFu, "HotbarAutocollapse", new lne(false)),
            new lmx.a.a(new lnu.a(2, 10, 1), "ItemCounterSize", new lnu(5)),
            new lmx.a.a(lne.a.rFu, "ItemCounterHorizontal", new lne(false))
         )
      );
   }

   @Override
   protected String ccJ() {
      return "Gui Options";
   }
}
