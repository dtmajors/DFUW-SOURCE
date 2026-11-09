import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;

class mkb$e extends FileView {
   private Map<Image, BufferedImage> DFh;

   mkb$e(mkb var1) {
      this.DEO = var1;
      this.DFh = lcn.emw();
   }

   public void eDk() {
      mkb.eDf().clear();
      this.DEO.DEL.clear();
      this.DFh.clear();
      this.DEO.updateUI();
      mkb.e(this.DEO);
   }

   @Override
   public Icon getIcon(File var1) {
      String var2 = this.DEO.eDd().getAbsolutePath();
      if (!var1.getParent().equals(var2)) {
         return null;
      }

      ImageIcon var3 = (ImageIcon)mkb.eDf().get(var1.getName());
      if (var3 == null) {
         String var4 = lcw.qLb + "worldbuilder/thumbnails/";
         String var5 = var1.getName();
         var5 = var5.replace(".xlk", ".jpg");
         var5 = var5.replace(".xml", ".jpg");
         var5 = var4 + var5;
         File var6 = new File(var5);
         boolean var7 = false;
         if (var1.isDirectory()) {
            var5 = lcw.qLb + "worldbuilder/icons/open.gif";
         } else if (!var6.exists()) {
            var5 = lcw.qLb + "worldbuilder/icons/silk/brick.gif";
         }

         String var8 = var1.getName();
         int var9 = var8.lastIndexOf(".");
         if (var9 != -1) {
            var8 = var8.substring(0, var9);
         }

         var3 = new ImageIcon(var5, "desc");
         mkb.eDf().put(var1.getName(), var3);
         Image var10 = var3.getImage();
         Graphics2D var11 = (Graphics2D)this.DEO.getGraphics();
         FontRenderContext var12 = var11.getFontRenderContext();
         Rectangle2D var13 = mkb.eDg().getStringBounds(var8, var12);
         if (!var7) {
            Image var14 = var10;
            var10 = var14.getScaledInstance(mkb.d(this.DEO), mkb.d(this.DEO), 2);
            var14.flush();
         }

         int var23 = Math.max((int)var13.getWidth(), mkb.d(this.DEO));
         var23 = mkb.d(this.DEO);
         int var15 = mkb.d(this.DEO) + (int)var13.getHeight();
         if (var7) {
            var15 = (int)var13.getHeight();
         }

         BufferedImage var16 = new BufferedImage(var23, var15, 6);
         var11 = (Graphics2D)var16.getGraphics();
         if (!var7) {
         }

         boolean var17 = var11.drawImage(var10, 0, 0, new mkb$e$1(this));
         if (!var17) {
            this.DFh.put(var10, var16);
         }

         var3.setImage(var16);
         var11.setColor(Color.black);
         var11.setFont(mkb.eDg());
         byte var18 = 0;
         if (var7) {
            var18 = 17;
         }

         var11.drawString(var8, var18, var15 - 2);
      }

      return var3;
   }

   @Override
   public String getDescription(File var1) {
      return "";
   }

   @Override
   public String getName(File var1) {
      String var2 = this.DEO.eDd().getAbsolutePath();
      if (!var1.getParent().equals(var2)) {
         return null;
      }

      String var3 = var1.getName();
      if (var3.length() > 1) {
         var3 = var3.substring(0, 2);
      }

      return var3;
   }
}
