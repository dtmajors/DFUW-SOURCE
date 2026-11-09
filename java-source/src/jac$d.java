public class jac$d extends iyq {
   private static final String mFr = "tab_icon_off_disabled.png";
   private static final String mFs = "tab_icon_off_normal.png";
   private static final String mFt = "tab_icon_off_hover.png";
   private static final String mFu = "tab_icon_off_pushing.png";
   private static final String mFv = "tab_icon_on_disabled.png";
   private static final String mFw = "tab_icon_on_normal.png";
   private static final String mFx = "tab_icon_on_hover.png";
   private static final String mFy = "tab_icon_on_pushing.png";

   public jac$d(jac var1) {
      super(
         var1.duk() + "tab_icon_off_disabled.png",
         var1.duk() + "tab_icon_off_normal.png",
         var1.duk() + "tab_icon_off_hover.png",
         var1.duk() + "tab_icon_off_pushing.png",
         var1.duk() + "tab_icon_on_disabled.png",
         var1.duk() + "tab_icon_on_normal.png",
         var1.duk() + "tab_icon_on_hover.png",
         var1.duk() + "tab_icon_on_pushing.png"
      );
      this.mFq = var1;
   }

   @Override
   public hyn dd(int var1, int var2) {
      return iae.oJ(this.mFq.aNA().exA());
   }
}
