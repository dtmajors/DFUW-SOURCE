import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class mqn$a implements MouseListener {
   private mqn$a(mqn var1) {
      this.Eep = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.Eep.eJw();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
