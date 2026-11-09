import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

class mld$d extends JPanel {
   private Map<String, Image> DHK;
   boolean pWT;
   boolean DHL;
   boolean DHM;
   Point DHN;
   float DHO;

   public mld$d(mld var1) {
      this.DHD = var1;
      this.DHK = new HashMap<>();
      this.pWT = false;
      this.DHL = false;
      this.DHM = false;
      this.DHN = new Point(0, 0);
      this.DHO = 0.0F;
      if (mld.DHg == null) {
         try {
            mld.DHg = ImageIO.read(new File("c:/darkfall/data/dev/dfdata/worldbuilder/worldmap1024x1024.bmp"));
         } catch (Exception var3) {
         }
      }

      this.addMouseListener(new mld$d$1(this, var1));
      this.addMouseWheelListener(new mld$d$2(this, var1));
      this.addMouseMotionListener(new mld$d$3(this, var1));
   }

   void eDP() {
      if (this.pWT || this.DHL) {
         ljq var1 = this.a(this.DHN);
         Point var2 = this.eX(var1);
         if (this.b(var2)) {
            if (!this.DHD.DGN.contains(var2)) {
               if (this.pWT) {
                  this.DHD.DGN.add(var2);
                  mld.a(this.DHD);
               }
            } else if (this.DHL) {
               this.DHD.DGN.remove(var2);
               mld.a(this.DHD);
            }
         }
      }
   }

   Point eW(ljq var1) {
      if (var1 == null) {
         return null;
      }

      Dimension var2 = this.getSize();
      int var3 = Math.min(var2.width, var2.height);
      ljq var4 = var1.esF();
      var4.et(mld.Position);
      var4.nm(mld.daN);
      char var5 = '\u8000';
      Point var6 = new Point();
      float var7 = 0.5F + var4.x / var5;
      float var8 = 0.5F + var4.rlV / var5;
      var7 *= var3;
      var8 *= var3;
      var6.x = (int)var7;
      var6.y = var3 - (int)var8;
      var6.x = var6.x + (var2.width - var3) / 2;
      var6.y = var6.y + (var2.height - var3) / 2;
      return var6;
   }

   ljq a(Point var1) {
      Dimension var2 = this.getSize();
      int var3 = Math.min(var2.width, var2.height);
      Point var4 = new Point(var1.x, var1.y);
      var4.x = var4.x - (var2.width - var3) / 2;
      var4.y = var4.y - (var2.height - var3) / 2;
      float var5 = var4.x;
      float var6 = var3 - var4.y;
      char var7 = '\u8000';
      ljq var8 = new ljq();
      var8.x = (var5 / var3 - 0.5F) * var7;
      var8.rlV = (var6 / var3 - 0.5F) * var7;
      var8.y = 0.0F;
      var8.nm(1.0F / mld.daN);
      var8.es(mld.Position);
      return var8;
   }

   private Point eX(ljq var1) {
      return new Point((int)(var1.x / 1024.0F + 16.0F), (int)(var1.rlV / 1024.0F + 16.0F));
   }

   boolean b(Point var1) {
      return var1.x >= 0 && var1.y >= 0 && var1.x < 32 && var1.y < 32;
   }

   private String c(Point var1) {
      return var1.x >= 0 && var1.y >= 0 && var1.x <= 31 && var1.y <= 31 ? lcw.qQy[var1.x] + lcw.qQz[31 - var1.y] : "None";
   }

   private Rectangle d(Point var1) {
      ljq var2 = new ljq((var1.x - 16) * 1024, 0.0F, (var1.y - 15) * 1024);
      ljq var3 = new ljq((var1.x - 15) * 1024, 0.0F, (var1.y - 16) * 1024);
      Point var4 = this.eW(var2);
      Point var5 = this.eW(var3);
      return new Rectangle(var4.x, var4.y, var5.x - var4.x, var5.y - var4.y);
   }

   @Override
   public void paint(Graphics var1) {
      Dimension var2 = this.getSize();
      var1.setColor(new Color(40, 40, 40));
      var1.fillRect(0, 0, var2.width, var2.height);
      Point var3 = this.eW(new ljq(-16384.0F, 0.0F, 16384.0F));
      Point var4 = this.eW(new ljq(16384.0F, 0.0F, -16384.0F));
      int var5 = var4.x - var3.x;
      int var6 = var4.y - var3.y;
      var1.drawImage(mld.DHg, var3.x, var3.y, var5, var6, null);
      if (mld.daN > 10.0F) {
         ljq var7 = this.a(new Point(0, var2.height));
         ljq var8 = this.a(new Point(var2.width, 0));
         Point var9 = this.eX(var7);
         Point var10 = this.eX(var8);

         for (int var11 = var9.y; var11 <= var10.y; var11++) {
            for (int var12 = var9.x; var12 <= var10.x; var12++) {
               this.b(var1, var12, var11);
            }
         }
      }

      for (Point var20 : this.DHD.DGN) {
         Rectangle var22 = this.d(var20);
         var1.setColor(new Color(255, 0, 0, 75));
         var1.fillRect(var22.x, var22.y, var22.width, var22.height);
      }

      var1.setColor(new Color(255, 0, 0));
      var1.drawLine(var2.width / 2 - 40, var2.height / 2, var2.width / 2 + 40, var2.height / 2);
      var1.drawLine(var2.width / 2, var2.height / 2 - 40, var2.width / 2, var2.height / 2 + 40);
      if (this.DHD.DGU.isSelected()) {
         this.b(var1);
      }

      var1.setColor(new Color(255, 255, 0, 40));
      ljq var19 = this.a(this.DHN);
      Point var21 = this.eX(var19);
      if (this.b(var21)) {
         Rectangle var23 = this.d(var21);
         var1.fillRect(var23.x, var23.y, var23.width, var23.height);
      }

      this.DHO += 0.1F;
      int var24 = Math.abs((int)(255.0 * Math.sin(this.DHO)));
      this.DHD.DGM = null;

      for (byte var25 = 1; var25 < 131072; var25 <<= 1) {
         if ((this.DHD.DHA & var25) != 0) {
            Vector var28 = mld.a(this.DHD, var25);
            if (var28 != null) {
               for (int var33 = 0; var33 < var28.size(); var33++) {
                  mld$e var13 = (mld$e)var28.get(var33);
                  Point var14 = this.eW(var13.DHS);
                  if (var14 != null) {
                     if (this.DHN != null && this.DHN.distance(var14) < 12.0) {
                        this.DHD.DGM = new Point(var25, var33);
                     }

                     if (var13.Radius > 0.0F) {
                        ljq var15 = new ljq(var13.DHS.x + var13.Radius, var13.DHS.y, var13.DHS.rlV);
                        Point var16 = this.eW(var15);
                        int var17 = var16.x - var14.x;
                        var1.setColor(new Color(0, 0, 255, 100));
                        var1.fillOval(var14.x - var17, var14.y - var17, var17 * 2, var17 * 2);
                     }

                     if (this.DHD.DGX.containsKey(Integer.valueOf(var25))) {
                        Image var37 = (Image)this.DHD.DGX.get(Integer.valueOf(var25));
                        if (var37 != null) {
                           var1.drawImage(var37, var14.x - 4, var14.y - 8, null);
                        }
                     } else {
                        var1.setColor(new Color(255, var24, var24));
                        var1.fillRect(var14.x - 3, var14.y - 3, 7, 7);
                     }

                     if (var13.DisplayName != null && this.DHD.DGV.isSelected()) {
                        var1.setColor(new Color(0, 0, 0, 255));
                        var1.drawString(var13.DisplayName, var14.x - 8, var14.y - 3);
                        var1.setColor(new Color(255, 255, 255, 255));
                        var1.drawString(var13.DisplayName, var14.x - 10, var14.y - 5);
                     }
                  }
               }
            }
         }
      }

      var1.setColor(new Color(0, 0, 0, 150));
      var1.fillRect(1, 1, 250, 120);
      var1.setColor(new Color(0, 0, 0));
      this.a(var1, 2, 2);
      var1.setColor(new Color(255, 255, 0));
      this.a(var1, 0, 0);
      var1.setColor(new Color(255, 0, 0, 255));

      for (int var26 = 0; var26 < 32; var26++) {
         Point var29 = this.eW(new ljq((var26 - 16) * 1024 + 400, 0.0F, 16384.0F));
         if (var29.y < 0) {
            var29.y = 14;
         }

         var1.drawString(lcw.qQy[var26], var29.x, var29.y);
         var29 = this.eW(new ljq(-16400.0F, 0.0F, (var26 - 16) * 1024 + 400));
         if (var29.x < 0) {
            var29.x = 4;
         }

         var1.drawString(lcw.qQz[31 - var26], var29.x, var29.y);
      }

      if (this.DHD.DGM != null) {
         mld$e var27 = (mld$e)((Vector)this.DHD.nvS.get(this.DHD.DGM.x)).get(this.DHD.DGM.y);
         if (var27.DHU != null && var27.DHU instanceof ari) {
            ari var31 = (ari)var27.DHU;
            if (var31 != this.DHD.DHc) {
               this.DHD.DHc = var31;
               this.DHD.DHb.clear();

               for (Entry var36 : var31.Rp().entrySet()) {
                  this.DHD.DHb.add((String)var36.getKey() + ":" + var36.getValue() + "%");
               }

               this.DHD.DHd.updateUI();
               this.DHD.DHd.clearSelection();
               this.DHD.DHd.setSelectedIndex(0);
            }
         }

         if (var27.DHT != null) {
            var1.setColor(new Color(255, 255, 255, 255));
            Point var32 = this.eW(var27.DHS);

            for (int var35 = 0; var35 < var27.DHT.length; var35++) {
               var1.drawString(var27.DHT[var35], var32.x, var32.y + 18 * var35 + 12);
            }
         }
      }

      if (this.DHD.DGM != null) {
         this.setCursor(Cursor.getPredefinedCursor(1));
      } else {
         this.setCursor(Cursor.getDefaultCursor());
      }
   }

   private void a(Graphics var1, int var2, int var3) {
      ljq var4 = this.a(this.DHN);
      String var5 = "none";
      if (this.DHD.DGM != null) {
         mld$e var6 = (mld$e)mld.a(this.DHD, this.DHD.DGM.x).get(this.DHD.DGM.y);
         var5 = var6.DHR;
         if (var6.DHV.length() > 0) {
            var5 = var5 + "(" + var6.DHV + ")";
         }

         var4.x = var6.DHS.x;
         var4.y = var6.DHS.y;
         var4.rlV = var6.DHS.rlV;
      }

      var1.drawString("World Pos:" + var4.x + "," + var4.y + "," + var4.rlV, 10 + var2, 20 + var3);
      var1.drawString("Object:" + var5, 10 + var2, 40 + var3);
      Point var10 = this.eX(this.a(this.DHN));
      String var7 = "none";
      var7 = this.c(var10).toLowerCase();
      String var8 = "";
      Map var9 = lea.eoS();
      if (var9.containsKey(var7)) {
         var8 = (String)var9.get(var7);
      }

      var1.drawString("Tile:" + var7, 10 + var2, 70 + var3);
      var1.drawString(var8, 10 + var2, 90 + var3);
   }

   private void b(Graphics var1, int var2, int var3) {
      if (var2 >= 0 && var2 < 32 && var3 >= 0 && var3 < 32) {
         String var4 = "c:/darkfall/data/dev/dfdata/worldbuilder/minimap-bmps2/" + this.c(new Point(var2, var3)) + ".bmp";
         Image var5 = null;
         if (!this.DHK.containsKey(var4)) {
            if (this.DHK.size() > 300) {
               return;
            }

            try {
               var5 = ImageIO.read(new File(var4));
               this.DHK.put(var4, var5);
            } catch (Exception var10) {
            }
         } else {
            var5 = this.DHK.get(var4);
         }

         Point var6 = this.eW(new ljq((var2 - 16) * 1024, 0.0F, (var3 - 15) * 1024));
         Point var7 = this.eW(new ljq((var2 - 16) * 1024 + 1024, 0.0F, (var3 - 15) * 1024 - 1024));
         int var8 = var7.x - var6.x;
         int var9 = var7.y - var6.y;
         var1.drawImage(var5, var6.x, var6.y, var8, var9, null);
      }
   }

   private void b(Graphics var1) {
      var1.setColor(new Color(0, 255, 0, 128));

      for (int var2 = 0; var2 <= 32; var2++) {
         int var3 = (var2 - 16) * 1024;
         ljq var4 = new ljq(var3, 0.0F, -16384.0F);
         ljq var5 = new ljq(var3, 0.0F, 16384.0F);
         Point var6 = this.eW(var4);
         Point var7 = this.eW(var5);
         var1.drawLine(var6.x, var6.y, var7.x, var7.y);
         var4 = new ljq(-16384.0F, 0.0F, var3);
         var5 = new ljq(16384.0F, 0.0F, var3);
         var6 = this.eW(var4);
         var7 = this.eW(var5);
         var1.drawLine(var6.x, var6.y, var7.x, var7.y);
      }
   }
}
