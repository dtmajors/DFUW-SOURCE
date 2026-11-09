import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class mpd$1 implements PropertyChangeListener {
   mpd$1(mpd var1) {
      this.DUO = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      if ("viewType".equals(var1.getPropertyName())) {
         int var2 = mpd.c(this.DUO).getViewType();
         switch (var2) {
            case 0:
               mpd.d(this.DUO).setSelected(true);
               break;
            case 1:
               mpd.e(this.DUO).setSelected(true);
         }
      }
   }
}
