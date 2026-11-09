import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import javax.swing.JPanel;

class mrn$a extends JPanel {
   private boolean Eln;
   private boolean Elo;
   private boolean Elp;
   private Point Elq;
   private int Elr;
   private int Els;

   public mrn$a(mrn var1) {
      this.Elm = var1;
      this.Eln = false;
      this.Elo = false;
      this.Elp = false;
      this.Elq = new Point(0, 0);
      this.Elr = 10;
      this.Els = -1;
      this.addKeyListener(new mrn$a$1(this, var1));
      this.addMouseMotionListener(new mrn$a$2(this, var1));
      this.addMouseListener(new mrn$a$3(this, var1));
   }

   public boolean Ow() {
      return this.Elq.x != 0 || this.Elq.y != 0;
   }

   private void e(KeyEvent var1) {
      if (var1.getKeyCode() == 27) {
         if (this.Ow()) {
            this.Elq.x = 0;
            this.Elq.y = 0;
         } else {
            mrn.h(this.Elm).clear();
         }

         this.repaint();
      }

      if (var1.getKeyCode() == 10) {
         HashSet var2 = mrn.h(this.Elm);
         mrn.a(this.Elm, new HashSet());
         Point[][] var3 = new Point[21][21];

         for (int var4 = 0; var4 < 21; var4++) {
            for (int var5 = 0; var5 < 21; var5++) {
               if (mrn.i(this.Elm)[var5][var4] != null) {
                  var3[var5][var4] = new Point(mrn.i(this.Elm)[var5][var4].x, mrn.i(this.Elm)[var5][var4].y);
               }
            }
         }

         for (Point var11 : var2) {
            int var6 = var11.x + this.Elq.x;
            int var7 = var11.y + this.Elq.y;
            if (!mrn.a(this.Elm, var6, var7)) {
               mrn.i(this.Elm)[var6][var7] = var3[var11.x][var11.y];
               mrn.h(this.Elm).add(new Point(var6, var7));
            }
         }

         for (Point var12 : var2) {
            if (!mrn.h(this.Elm).contains(var12)) {
               mrn.i(this.Elm)[var12.x][var12.y] = null;
            }
         }

         this.Elq.x = 0;
         this.Elq.y = 0;
         this.repaint();
      }

      if (mrn.h(this.Elm).size() != 0) {
         Point var8 = null;
         if (var1.getKeyCode() == 39) {
            var8 = new Point(1, 0);
         } else if (var1.getKeyCode() == 37) {
            var8 = new Point(-1, 0);
         } else if (var1.getKeyCode() == 40) {
            var8 = new Point(0, 1);
         } else if (var1.getKeyCode() == 38) {
            var8 = new Point(0, -1);
         }

         if (var8 != null) {
            this.Elq.x = this.Elq.x + var8.x;
            this.Elq.y = this.Elq.y + var8.y;
            this.repaint();
         }
      }
   }

   private void s(MouseEvent var1) {
      if (!this.Ow()) {
         if (this.Eln || this.Elp) {
            Point var2 = this.k(var1.getPoint());
            if (mrn.a(this.Elm, var2.x, var2.y)) {
               return;
            }

            int var3 = mrn.h(this.Elm).size();
            if (this.Eln) {
               mrn.h(this.Elm).add(var2);
            } else {
               mrn.h(this.Elm).remove(var2);
            }

            if (mrn.h(this.Elm).size() != var3) {
               this.repaint();
            }
         }

         if (this.Elo) {
            Point var4 = this.k(var1.getPoint());
            if (mrn.a(this.Elm, var4.x, var4.y)) {
               return;
            }

            if (mrn.i(this.Elm)[var4.x][var4.y] != null) {
               mrn.i(this.Elm)[var4.x][var4.y] = null;
               this.repaint();
            }
         }
      }
   }

   private void t(MouseEvent var1) {
      Point var2 = this.k(var1.getPoint());
      mrn.a(this.Elm, var2);
      this.repaint();
   }

   private Point k(Point var1) {
      return new Point(var1.x / this.Elr, var1.y / this.Elr);
   }

   private void eLm() {
      HashSet var1 = new HashSet();

      for (Point var3 : mrn.h(this.Elm)) {
         Point var4 = mrn.i(this.Elm)[var3.x][var3.y];
         if (var4 != null) {
            var1.add(new Point(var4.x, mrn.a(this.Elm, var4.y)));
         }
      }

      mld var5 = mrn.j(this.Elm).eCz();
      var5.a(var1);
   }

   @Override
   public void paint(Graphics var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      int var4 = var2 / 21;
      int var5 = var3 / 21;
      this.Elr = Math.min(var4, var5);
      var1.setColor(new Color(70, 70, 70, 255));
      var1.fillRect(0, 0, var2, var3);
      if (this.Ow()) {
         var1.setColor(new Color(0, 255, 0, 50));
      } else {
         var1.setColor(new Color(255, 0, 0, 50));
      }

      for (int var6 = 0; var6 < 21; var6++) {
         for (int var7 = 0; var7 < 21; var7++) {
            Point var8 = mrn.i(this.Elm)[var7][var6];
            int var9 = var7 * this.Elr;
            int var10 = var6 * this.Elr;
            Point var11 = new Point(var7, var6);
            boolean var12 = mrn.h(this.Elm).contains(var11);
            boolean var13 = false;
            if (this.Ow()) {
               for (Point var15 : mrn.h(this.Elm)) {
                  if (var15.x + this.Elq.x == var7 && var15.y + this.Elq.y == var6) {
                     var8 = mrn.i(this.Elm)[var15.x][var15.y];
                     var12 = mrn.h(this.Elm).contains(var15);
                     var13 = true;
                     break;
                  }
               }
            }

            if (!this.Ow() || var13 || !var12) {
               if (var8 != null) {
                  Image var26 = mld.DHg;
                  if (var26 == null) {
                     continue;
                  }

                  int var27 = var8.x * 32;
                  int var16 = var8.y * 32;
                  var1.drawImage(var26, var9, var10, var9 + this.Elr, var10 + this.Elr, var27, var16, var27 + 32, var16 + 32, null);
               }

               if (var12) {
                  var1.fillRect(var9, var10, this.Elr, this.Elr);
               }
            }
         }
      }

      if (mrn.k(this.Elm).isSelected()) {
         var1.setColor(new Color(0, 255, 0, 128));

         for (int var17 = 0; var17 < 22; var17++) {
            var1.drawLine(0, var17 * this.Elr, 21 * this.Elr, var17 * this.Elr);
         }

         for (int var18 = 0; var18 < 22; var18++) {
            var1.drawLine(var18 * this.Elr, 0, var18 * this.Elr, 21 * this.Elr);
         }
      }

      if (mrn.l(this.Elm).isSelected()) {
         var1.setColor(new Color(255, 255, 0));

         for (int var19 = 0; var19 < 21; var19++) {
            for (int var20 = 0; var20 < 21; var20++) {
               Point var21 = mrn.i(this.Elm)[var20][var19];
               boolean var22 = false;
               if (this.Ow()) {
                  for (Point var25 : mrn.h(this.Elm)) {
                     if (var25.x + this.Elq.x == var20 && var25.y + this.Elq.y == var19) {
                        var22 = true;
                        var21 = mrn.i(this.Elm)[var25.x][var25.y];
                        break;
                     }
                  }
               }

               if ((!this.Ow() || var22 || !mrn.h(this.Elm).contains(new Point(var20, var19))) && var21 != null) {
                  String var24 = lcw.f(new lej(var21.x, var21.y));
                  var1.drawString(var24, var20 * this.Elr + 10, var19 * this.Elr + this.Elr / 2 + 5);
               }
            }
         }
      }
   }
}
