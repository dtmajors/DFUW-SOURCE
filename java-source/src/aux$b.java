import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import mje.a;

class aux$b extends KeyAdapter {
   aux$b(aux var1) {
      this.DDk = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      switch (var2) {
         case 9:
            aux.c(this.DDk);
            break;
         case 32:
            if (var1.isControlDown()) {
               aux.e(this.DDk);
            }
            break;
         case 36:
            aux.d(this.DDk);
            break;
         case 66:
            if (var1.isControlDown()) {
               aux.a(this.DDk);
            }
            break;
         case 69:
            if (var1.isControlDown()) {
               aux.g(this.DDk);
            }
            break;
         case 70:
            if (var1.isControlDown() && var1.isShiftDown()) {
               this.DDk.eCx();
            } else if (var1.isControlDown()) {
               this.DDk.eCA();
            }
            break;
         case 76:
            if (var1.isControlDown() && var1.isShiftDown()) {
               aux.i(this.DDk);
            }
            break;
         case 77:
            if (var1.isControlDown()) {
               aux.h(this.DDk);
            }
            break;
         case 83:
            if (var1.isControlDown()) {
               this.DDk.eCt();
            }
            break;
         case 84:
            if (var1.isControlDown()) {
               aux.j(this.DDk);
            }
            break;
         case 85:
            if (var1.isControlDown()) {
               aux.b(this.DDk);
            }
            break;
         case 87:
            if (var1.isControlDown()) {
               this.DDk.eCz();
            }
            break;
         case 89:
            if (var1.isControlDown()) {
               this.DDk.redo();
            }
            break;
         case 90:
            if (var1.isControlDown()) {
               this.DDk.undo();
            }
            break;
         case 123:
            for (Component var6 : aux.f(this.DDk).getComponents()) {
               if (var6 instanceof mrz) {
                  mrz var7 = (mrz)var6;
                  var7.eMR();
               }
            }
      }

      if (mje.DAR == a.DCt) {
         mrj var8 = mrj.eKD();
         if (var2 == 83 && !mje.DCm) {
            var8.afl(2);
         } else if (var2 == 65 && !mje.DCm) {
            var8.afl(0);
         } else if (var2 == 70) {
            var8.afl(1);
         } else if (var2 == 77) {
            var8.afl(3);
         } else if (var2 == 68 && !mje.DCm) {
            var8.afl(4);
         } else if (var2 == 85) {
            var8.afl(5);
         } else if (var2 == 87 && !mje.DCm) {
            var8.eKv();
         } else if (var2 == 9) {
            var8.eKS();
         } else if (var2 == 192) {
            var8.eKT();
         }
      }
   }
}
