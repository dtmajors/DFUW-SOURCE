import java.awt.Component;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import javax.swing.JComponent;

class mxz$a implements DragGestureListener, DragSourceListener {
   private boolean ETZ;

   private mxz$a() {
   }

   @Override
   public void dragGestureRecognized(DragGestureEvent var1) {
      Component var2 = var1.getComponent();
      if (var2 instanceof mxt) {
         mxt var3 = (mxt)var2;

         try {
            dqn var4 = var3.eIU();
            mym var5 = new mym(var4);
            DragSourceListener var6 = var3.eIS();
            if (var6 == null) {
               System.out.println("SFDragGestureListener: DragList or Transferable is null!");
            }

            var1.startDrag(null, var5, var6);
            return;
         } catch (Exception var8) {
            System.out.println("SFDragGestureListener: Exception! " + var8);
         }
      } else if (var2 instanceof mxr) {
         mxr var9 = (mxr)var2;

         try {
            btk var10 = var9.eIT();
            myi var11 = new myi(var10);
            DragSourceListener var12 = var9.eIS();
            if (var12 == null) {
               System.out.println("SFDragGestureListener: DragList or Transferable is null!");
            }

            var1.startDrag(null, var11, var12);
            return;
         } catch (Exception var7) {
            System.out.println("SFDragGestureListener: Exception! " + var7);
         }
      } else {
         System.out.println("SFDragGestureListener: Error: Source does not implement SFObjectDragSource!");
      }
   }

   @Override
   public void dragEnter(DragSourceDragEvent var1) {
   }

   @Override
   public void dragOver(DragSourceDragEvent var1) {
   }

   @Override
   public void dragExit(DragSourceEvent var1) {
   }

   @Override
   public void dragDropEnd(DragSourceDropEvent var1) {
      DragSourceContext var2 = var1.getDragSourceContext();
      JComponent var3 = (JComponent)var2.getComponent();
   }

   @Override
   public void dropActionChanged(DragSourceDragEvent var1) {
   }
}
