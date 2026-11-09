import com.jgraph.graph.GraphUndoManager;
import javax.swing.event.UndoableEditEvent;

class mnc$1 extends GraphUndoManager {
   mnc$1(mnc var1) {
      this.DOj = var1;
   }

   public void undoableEditHappened(UndoableEditEvent var1) {
      super.undoableEditHappened(var1);
   }
}
