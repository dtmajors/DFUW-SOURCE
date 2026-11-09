import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class mpd$2 implements PropertyChangeListener {
   mpd$2(mpd var1) {
      this.DUO = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var2 = var1.getPropertyName();
      if (var2.equals("SelectedFileChangedProperty")) {
         mpd.a(this.DUO, var1);
      } else if (var2.equals("SelectedFilesChangedProperty")) {
         mpd.b(this.DUO, var1);
      } else if (var2.equals("directoryChanged")) {
         mpd.c(this.DUO, var1);
      } else if (var2.equals("fileFilterChanged")) {
         mpd.d(this.DUO, var1);
      } else if (var2.equals("fileSelectionChanged")) {
         mpd.e(this.DUO, var1);
      } else if (var2 == "FileChooser.useShellFolder") {
         mpd.f(this.DUO);
         mpd.c(this.DUO, var1);
      }
   }
}
