import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.AbstractAction;

class lai$5 extends AbstractAction {
   lai$5(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      for (Entry var3 : lea.eot().entrySet()) {
         if (var3.getKey() instanceof Integer) {
            int var4 = (Integer)var3.getKey();
            if (var4 <= 0) {
               lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() ResourceType is invalid.");
            } else {
               String var5 = (String)var3.getValue();
               if (var5 == null) {
                  lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() FileName is null.");
               } else {
                  Map var6 = lea.ack(var4);
                  if (var6 == null) {
                     lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() PaperdollItemMap is null.");
                  } else {
                     boolean var7 = lai.a(this.qrW).isDescendant(var4, cug.fia);
                     lai.a(this.qrW, var5, var6, var7);
                  }
               }
            }
         }
      }
   }
}
