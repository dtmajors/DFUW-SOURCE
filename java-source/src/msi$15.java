import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeNode;

class msi$15 implements TreeSelectionListener {
   private TreeNode EtK;

   msi$15(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      try {
         Object var2 = var1.getSource();
         JTree var3 = (JTree)var2;
         msi.A(this.EtH).add(var3.getSelectionPath());
         if (msi.A(this.EtH).size() > 2) {
            msi.A(this.EtH).removeElementAt(0);
         }

         if (var3.isSelectionEmpty() || var3.getSelectionPath() == null) {
            return;
         }

         this.a(var1);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private void a(TreeSelectionEvent var1) {
      this.EtK = (TreeNode)var1.getNewLeadSelectionPath().getLastPathComponent();
      msi.b(this.EtH, this.EtK.toString());
      Boolean var2 = false;
      if (msi.B(this.EtH) != null) {
         int var3 = this.Dh(msi.B(this.EtH));
         switch (var3) {
            case 1:
               msi.b(this.EtH, false);
               if (msi.d(this.EtH) != null && msi.C(this.EtH).eNY() != null && msi.d(this.EtH).adk == msi.C(this.EtH).eNY().eNZ().adk) {
                  if (!msi.d(this.EtH).eyU.equals(msi.C(this.EtH).eNY().eOa())) {
                     this.EtH.a(msi.C(this.EtH).eNY());
                  }

                  if (msi.C(this.EtH).eNY().eOb() != null) {
                     for (cgw var5 : msi.C(this.EtH).eNY().eOb()) {
                        if (msi.d(this.EtH).eyK != null && !msi.d(this.EtH).eyK.aCN.contains(var5)) {
                           this.EtH.a(msi.C(this.EtH).eNY());
                           break;
                        }
                     }
                  }
               }

               msi.a(this.EtH, msi.w(this.EtH));
               msp var6 = this.EtH.eNE();
               if (msi.C(this.EtH).eNY() == null) {
                  msi.C(this.EtH).b(var6);
               } else if (msi.C(this.EtH).eNY().eNZ().adk != var6.eNZ().adk) {
                  msi.C(this.EtH).b(var6);
               }

               msi.D(this.EtH);
               if (lea.eps().hm(msi.B(this.EtH)).eyK != null) {
                  msi.a(this.EtH, msi.y(this.EtH), msi.z(this.EtH), msi.B(this.EtH));
               }
               break;
            case 2:
               msi.a(this.EtH, msi.E(this.EtH));
               this.eNK();
               break;
            case 3:
               msi.a(this.EtH, msi.F(this.EtH));
               this.eNL();
         }
      }
   }

   private void eNK() {
      if (msi.G(this.EtH) != null) {
         String var1 = Integer.toString(msi.G(this.EtH).adk);
         String var2 = msi.G(this.EtH).Name;
         String var3 = msi.G(this.EtH).DisplayName;
         Boolean var4 = msi.G(this.EtH).bdP;
         msi.H(this.EtH).setExpanded(false);
         msi.I(this.EtH).setExpanded(true);
         msi.J(this.EtH).setExpanded(false);
         msi.K(this.EtH).setText(var2);
         msi.L(this.EtH).setText(var1);
         msi.M(this.EtH).setText(var3);
         msi.N(this.EtH).setSelected(var4);
      }
   }

   private void eNL() {
      if (msi.O(this.EtH) != null) {
         String var1 = Integer.toString(msi.O(this.EtH).adk);
         String var2 = msi.O(this.EtH).Name;
         String var3 = msi.O(this.EtH).DisplayName;
         Boolean var4 = msi.O(this.EtH).bdP;
         msi.H(this.EtH).setExpanded(false);
         msi.J(this.EtH).setExpanded(true);
         msi.I(this.EtH).setExpanded(false);
         msi.P(this.EtH).setText(var2);
         msi.Q(this.EtH).setText(var1);
         msi.R(this.EtH).setText(var3);
         msi.S(this.EtH).setSelected(var4);
      }
   }

   private int Dh(String var1) {
      msi.b(this.EtH, lea.eps().hm(var1));
      msi.b(this.EtH, lea.eps().hl(var1));
      msi.b(this.EtH, lea.eps().ho(var1));
      if (msi.F(this.EtH) != null && !this.EtK.isLeaf()) {
         return 3;
      } else if (msi.E(this.EtH) != null && !this.EtK.isLeaf()) {
         return 2;
      } else {
         return msi.w(this.EtH) != null && this.EtK.isLeaf() ? 1 : 0;
      }
   }
}
