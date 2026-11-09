import java.util.Hashtable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mju$a extends DefaultTreeModel {
   private Node DEm;
   private Hashtable DDJ = new Hashtable();
   private Hashtable DEn = new Hashtable();

   public mju$a() {
      this(null);
   }

   public mju$a(Node var1) {
      super(new DefaultMutableTreeNode());
      if (var1 != null) {
         this.fo(var1);
      }
   }

   public synchronized void fo(Node var1) {
      this.DEm = var1;
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)this.getRoot();
      var2.removeAllChildren();
      this.DDJ.clear();
      this.DEn.clear();
      this.e(var1, var2);
      this.fireTreeStructureChanged(this, new Object[]{this.getRoot()}, new int[0], new Object[0]);
   }

   public Node getRootNode() {
      return this.DEm;
   }

   public Node getNode(Object var1) {
      return (Node)this.DDJ.get(var1);
   }

   public Hashtable eCT() {
      return this.DDJ;
   }

   public TreeNode aG(Object var1) {
      Object var2 = this.DEn.get(var1);
      return (TreeNode)var2;
   }

   private void e(Node var1, MutableTreeNode var2) {
      if (var1 != null) {
         MutableTreeNode var3 = this.f(var1, var2);
         NodeList var4 = var1.getChildNodes();
         int var5 = var4 != null ? var4.getLength() : 0;

         for (int var6 = 0; var6 < var5; var6++) {
            Node var7 = var4.item(var6);
            this.e(var7, var3);
         }
      }
   }

   private MutableTreeNode a(String var1, MutableTreeNode var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var1);
      this.insertNodeInto(var3, var2, var2.getChildCount());
      return var3;
   }

   public MutableTreeNode f(Node var1, MutableTreeNode var2) {
      MutableTreeNode var3 = this.a(mju.toString(var1), var2);
      this.DDJ.put(var3, var1);
      this.DEn.put(var1, var3);
      return var3;
   }
}
