import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicDirectoryModel;
import javax.swing.plaf.basic.BasicFileChooserUI.DoubleClickListener;
import sun.swing.FilePane.FileChooserUIAccessor;

class mpd$a implements FileChooserUIAccessor {
   private mpd$a(mpd var1) {
      this.DUO = var1;
   }

   @Override
   public JFileChooser getFileChooser() {
      return this.DUO.getFileChooser();
   }

   @Override
   public BasicDirectoryModel getModel() {
      return this.DUO.getModel();
   }

   @Override
   public JPanel createList() {
      return this.DUO.createList(this.getFileChooser());
   }

   @Override
   public JPanel createDetailsView() {
      return this.DUO.createDetailsView(this.getFileChooser());
   }

   @Override
   public boolean isDirectorySelected() {
      return mpd.a(this.DUO);
   }

   public jrw eIq() {
      File var1 = mpd.b(this.DUO);
      return var1 == null ? null : new jrw(var1.getAbsolutePath());
   }

   @Override
   public Action getChangeToParentDirectoryAction() {
      return this.DUO.getChangeToParentDirectoryAction();
   }

   @Override
   public Action getApproveSelectionAction() {
      return this.DUO.getApproveSelectionAction();
   }

   @Override
   public Action getNewFolderAction() {
      return this.DUO.getNewFolderAction();
   }

   @Override
   public MouseListener createDoubleClickListener(JList var1) {
      return new DoubleClickListener(this.DUO, var1);
   }

   @Override
   public ListSelectionListener createListSelectionListener() {
      return this.DUO.createListSelectionListener(this.getFileChooser());
   }

   public boolean usesShellFolder() {
      return false;
   }
}
