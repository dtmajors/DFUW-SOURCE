import java.util.Arrays;
import lmx.a;

public class hdc$a extends a {
   private static final lni.a jKt = new lni.a(0.0, 2000.0);
   public static final hdc$a jKu = new hdc$a();

   public hdc$a() {
      super(
         hdc.class,
         Arrays.asList(
            new lmx.a.a(lne.a.rFu, "CatchExceptions", new lne(false)),
            new lmx.a.a(lne.a.rFu, "FullGuiDebug", new lne(false)),
            new lmx.a.a(lne.a.rFu, "YieldEnabled", new lne(false)),
            new lmx.a.a(jKt, "YieldMillisecs", new lni(20.0)),
            new lmx.a.a(lne.a.rFu, "Dump2DRequests", new lne(false)),
            new lmx.a.a(lne.a.rFu, "DisplayBandwidth", new lne(false)),
            new lmx.a.a(lne.a.rFu, "PrecreateBrowsers", new lne(false))
         )
      );
   }

   @Override
   protected String ccJ() {
      return "Debug Options";
   }
}
