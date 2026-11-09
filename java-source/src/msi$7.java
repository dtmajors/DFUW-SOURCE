import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class msi$7 implements ActionListener {
   msi$7(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = msi.j(this.EtH).getSelectionPaths()[0];
      msg var3 = (msg)var2.getLastPathComponent();
      if (!var3.isLeaf()) {
         JOptionPane.showMessageDialog(null, "Please only remove feats, one by one.");
      } else {
         if (msi.d(this.EtH) != null && msi.d(this.EtH).Name.equals(msi.B(this.EtH))) {
            String var4 = msi.d(this.EtH).Name;
            int var5 = JOptionPane.showInternalConfirmDialog(msi.X(this.EtH), "Do you want to remove the feat [" + var4 + "]?");
            if (var5 != 0) {
               return;
            }

            if (lea.eps().aOg().get(var3.getIndex()) != null && !lea.eps().aOg().get(var3.getIndex()).isEmpty()) {
               JOptionPane.showMessageDialog(null, "Feat unlocks other feats. Can not remove.");
               return;
            }

            if (var3.getParent() != null && var3.isLeaf() && var3.getParent().getChildCount() == 1) {
               var5 = JOptionPane.showInternalConfirmDialog(
                  msi.X(this.EtH), "Removing the last feat will remove the SubGroup also. Do you still want to remove the feat [" + var4 + "]?"
               );
               if (var5 != 0) {
                  return;
               }

               if (var3.getParent().getParent().getChildCount() == 1) {
                  var5 = JOptionPane.showInternalConfirmDialog(
                     msi.X(this.EtH), "Removing the last subGroup will remove the Group also. Do you still want to remove the feat [" + var4 + "]?"
                  );
                  if (var5 != 0) {
                     return;
                  }
               }
            }

            for (Integer var7 : lea.eps().aOg().keySet()) {
               for (cgw var9 : lea.eps().aOg().get(var7)) {
                  if (var9.ezl.equals(var3.toString())) {
                     lea.eps().aOg().get(var7).remove(var9);
                     lea.eps().pU(var7).eyK.aCN.remove(var9);
                     break;
                  }
               }
            }

            for (Integer var15 : lea.eps().aOa().keySet()) {
               if (lea.eps().pU(var15).eyU.aOG() == cgi.FEAT) {
                  chk var17 = (chk)lea.eps().pU(var15).eyU;
                  if (var17.ezZ != null) {
                     for (String var10 : var17.ezZ) {
                        if (var10.equals(var3.toString())) {
                           var17.ezZ.remove(var10);
                           break;
                        }
                     }
                  }
               }
            }

            lea.eps().aOa().remove(var3.getIndex());
            lea.eps().aOj().remove(var3.toString());
            msg var14 = (msg)var3.getParent().getParent();
            msg var16 = (msg)var3.getParent();
            DefaultMutableTreeNode var19 = var3.getPreviousSibling();
            msi.Y(this.EtH).removeNodeFromParent(var3);
            if (var16.isLeaf()) {
               msi.Y(this.EtH).removeNodeFromParent(var16);
               lea.eps().pV(lea.eps().pT(var16.getIndex()).eyG).eyF.remove(lea.eps().pT(var16.getIndex()).adk);
               lea.eps().aOe().remove(var16.getIndex());
               lea.eps().aOh().remove(var16.toString());
            }

            if (var14.isLeaf()) {
               msi.Y(this.EtH).removeNodeFromParent(var14);
               lea.eps().aOd().remove(lea.eps().pV(var14.getIndex()).adk);
               lea.eps().aOd().remove(var14.getIndex());
               lea.eps().aOi().remove(var14.toString());
            }

            msi.a(this.EtH, null);
            if (var19 == null) {
               var19 = msi.k(this.EtH).getFirstLeaf();
            }

            msi.a(this.EtH, msi.j(this.EtH), msi.k(this.EtH), var19.toString());
         } else {
            JOptionPane.showMessageDialog(msi.X(this.EtH), "There is no feat currently selected.");
         }

         msi.i(this.EtH);
      }
   }
}
