import java.io.Serializable;
import java.util.Hashtable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class mjn$a extends DefaultTreeModel implements Serializable {
   private Document DDI;
   private Hashtable DDJ = new Hashtable();

   public mjn$a() {
      this(null);
   }

   public mjn$a(Document var1) {
      super(new DefaultMutableTreeNode());
      this.setDocument(var1);
   }

   public synchronized void setDocument(Document var1) {
      this.DDI = var1;
      ((DefaultMutableTreeNode)this.getRoot()).removeAllChildren();
      this.DDJ.clear();
      this.eCO();
      this.fireTreeStructureChanged(this, new Object[]{this.getRoot()}, new int[0], new Object[0]);
   }

   public Document getDocument() {
      return this.DDI;
   }

   public Node getNode(Object var1) {
      return (Node)this.DDJ.get(var1);
   }

   private void eCO() {
      if (this.DDI != null) {
         NodeList var1 = this.DDI.getChildNodes();
         int var2 = var1 != null ? var1.getLength() : 0;
         MutableTreeNode var3 = (MutableTreeNode)this.getRoot();

         for (int var4 = 0; var4 < var2; var4++) {
            Node var5 = var1.item(var4);
            switch (var5.getNodeType()) {
               case 1:
                  this.b(var5, var3);
                  break;
               case 9:
                  var3 = this.a(var5, var3);
            }
         }
      }
   }

   private MutableTreeNode a(String var1, MutableTreeNode var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var1);
      this.insertNodeInto(var3, var2, var2.getChildCount());
      return var3;
   }

   private MutableTreeNode a(Node var1, MutableTreeNode var2) {
      MutableTreeNode var3 = this.a("<" + var1.getNodeName() + '>', var2);
      this.DDJ.put(var3, var1);
      return var3;
   }

   public void b(Node var1, DefaultMutableTreeNode var2) {
      lfn.b(0, this.getClass().getName(), "UpdateNode called");
      StringBuilder var3 = new StringBuilder();
      var3.append('<');
      var3.append(var1.getNodeName());
      NamedNodeMap var4 = var1.getAttributes();
      int var5 = var4 != null ? var4.getLength() : 0;

      for (int var6 = 0; var6 < var5; var6++) {
         Node var7 = var4.item(var6);
         var3.append(' ');
         var3.append(var7.getNodeName());
         var3.append("=\"");
         var3.append(var7.getNodeValue());
         var3.append('"');
      }

      var3.append('>');
      var2.setUserObject(var3);
      this.DDJ.put(var2, var1);
   }

   private MutableTreeNode b(Node var1, MutableTreeNode var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append('<');
      var3.append(var1.getNodeName());
      NamedNodeMap var4 = var1.getAttributes();
      int var5 = var4 != null ? var4.getLength() : 0;

      for (int var6 = 0; var6 < var5; var6++) {
         Node var7 = var4.item(var6);
         var3.append(' ');
         var3.append(var7.getNodeName());
         var3.append("=\"");
         var3.append(var7.getNodeValue());
         var3.append('"');
      }

      var3.append('>');
      MutableTreeNode var11 = this.a(var3.toString(), var2);
      this.DDJ.put(var11, var1);
      NodeList var12 = var1.getChildNodes();
      int var8 = var12 != null ? var12.getLength() : 0;

      for (int var9 = 0; var9 < var8; var9++) {
         Node var10 = var12.item(var9);
         switch (var10.getNodeType()) {
            case 1:
               this.b(var10, var11);
            case 2:
            default:
               break;
            case 3:
               this.c(var10, var11);
               break;
            case 4:
               this.d(var10, var11);
         }
      }

      return var11;
   }

   private MutableTreeNode c(Node var1, MutableTreeNode var2) {
      String var3 = var1.getNodeValue().trim();
      if (var3.length() > 0) {
         MutableTreeNode var4 = this.a(var3, var2);
         this.DDJ.put(var4, var1);
         return var4;
      } else {
         return null;
      }
   }

   private MutableTreeNode d(Node var1, MutableTreeNode var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append(var1.getNodeValue());
      if (var3.length() > 0) {
         MutableTreeNode var4 = this.a(var3.toString(), var2);
         this.DDJ.put(var4, var1);
         return var4;
      } else {
         return null;
      }
   }
}
