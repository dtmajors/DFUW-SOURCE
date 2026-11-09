import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

class msi$12 implements ActionListener {
   msi$12(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (msi.g(this.EtH)) {
         cgr var2 = null;
         if (!msi.h(this.EtH).isSelected()) {
            var2 = this.eNO();
         } else {
            var2 = this.eNN();
         }

         msg var3 = msi.a(this.EtH, lea.eps().pT(msi.d(this.EtH).eyL).Name);
         var3.add(new msg(var2));
         msi.i(this.EtH);
         msi.a(this.EtH, msi.j(this.EtH), msi.k(this.EtH), var2.Name);
         this.EtH.eNp();
         msi.a(this.EtH, var2);
         msi.j(this.EtH).updateUI();
      }

      boolean var5 = false;
      if (msi.l(this.EtH) || msi.m(this.EtH) || msi.n(this.EtH)) {
         var5 = true;
      }

      if (!msi.o(this.EtH) && !var5) {
         JOptionPane.showMessageDialog(null, "There have been no changes, not saving.");
      } else {
         if (msi.o(this.EtH)) {
            this.EtH.eNp();
         }

         msi.b(this.EtH, true);
         if (var5) {
            if (msi.l(this.EtH)) {
               msi.p(this.EtH);
            }

            if (msi.m(this.EtH)) {
               msi.q(this.EtH);
            }

            if (msi.n(this.EtH)) {
               msi.r(this.EtH);
            }

            msi.i(this.EtH);
         }
      }
   }

   private cgr eNN() {
      int var1 = jua.dTk();
      cgr var2 = new cgr();
      var2.adk = var1;
      var2.Name = msi.s(this.EtH).getText();
      var2.eyZ = msi.t(this.EtH).getText();
      var2.eyY = msi.u(this.EtH).getText();
      var2.bdP = msi.d(this.EtH).bdP;
      var2.eyL = msi.d(this.EtH).eyL;
      var2.eyG = msi.d(this.EtH).eyG;
      var2.eyU = msn.a(msi.d(this.EtH).eyU);
      var2.eyP = msi.d(this.EtH).eyP;
      var2.eyV = new cgs();
      var2.eyV.ezd = msi.d(this.EtH).eyV.ezd;
      var2.eyV.ezf = msi.d(this.EtH).eyV.ezf;
      var2.eyV.ezc = msi.d(this.EtH).eyV.ezc;
      var2.eyS = msi.d(this.EtH).eyS;
      var2.eyK = new cgt();
      var2.eyK.aCN = lcn.emv();
      var2.eyR = msi.d(this.EtH).eyR;
      var2.eyQ = msi.d(this.EtH).eyQ;
      var2.eyW = msi.d(this.EtH).eyW;
      var2.eyX = msi.d(this.EtH).eyX;
      var2.eyM = msi.d(this.EtH).eyM;
      var2.eyN = Arrays.asList(msi.v(this.EtH).getText().split("\\s*:\\s*"));
      lea.eps().aOa().put(var2.adk, var2);
      lea.eps().aOj().put(var2.Name, var2);
      lea.eps().pT(msi.d(this.EtH).eyL).eyH.put(var2.adk, var2);
      return var2;
   }

   private cgr eNO() {
      int var1 = jua.dTk();
      cgr var2 = new cgr();
      var2.adk = var1;
      var2.Name = msi.s(this.EtH).getText();
      var2.bdP = false;
      var2.eyL = msi.d(this.EtH).eyL;
      var2.eyG = msi.d(this.EtH).eyG;
      var2.eyU = new chr();
      var2.eyP = false;
      var2.bdP = false;
      var2.eyV = new cgs();
      var2.eyV.ezd = false;
      var2.eyV.ezf = "";
      var2.eyV.ezc = 0.0F;
      var2.eyS = false;
      var2.eyK = new cgt();
      var2.eyK.aCN = lcn.emv();
      var2.eyR = false;
      var2.eyQ = false;
      var2.eyW = false;
      var2.eyX = "";
      var2.eyM = cgj.exY;
      String[] var3 = new String[]{"START"};
      var2.eyN = lcn.bx(var3);
      lea.eps().aOa().put(var2.adk, var2);
      lea.eps().aOj().put(var2.Name, var2);
      lea.eps().pT(msi.d(this.EtH).eyL).eyH.put(var2.adk, var2);
      return var2;
   }
}
