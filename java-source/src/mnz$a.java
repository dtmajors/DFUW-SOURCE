import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mnz$a extends MouseAdapter {
   mnz$a(mnz var1) {
      this.DRw = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Component var2 = (Component)var1.getSource();
      if (var1.getModifiers() == 16) {
         if (var2.equals(mnz.b(this.DRw).getList())) {
            int var3 = mnz.b(this.DRw).eDp();
            lfn.b(0, "SFMouseHandler.mousePressed()", "List Index[" + var3 + "] !");
            moa var4 = (moa)mnz.c(this.DRw).get(var3);
            if (var4 != null) {
               String var5 = var4.getTextureName();
               int var6 = var5.lastIndexOf(".");
               if (var6 == -1) {
                  var5 = var5 + ".dds";
               }

               mje.DAV = var5;
            } else {
               lfn.b(0, "SFMouseHandler.mousePressed()", "RegionMaterial is null.");
            }
         }
      } else {
         lfn.b(0, "SFAnimationConvertDialog", "actionPerformed() : somthing? Comp = " + var2);
      }
   }
}
