/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Dimension;
import java.io.File;
import javax.swing.JDesktopPane;
import javax.swing.filechooser.FileFilter;

public class mpn
extends mkx {
    private mkb DVH = null;
    private Dimension bV = new Dimension(550, 350);
    private aux DEC = null;

    public mpn(JDesktopPane jDesktopPane, String string, int n) {
        this(jDesktopPane, string, true, n);
    }

    public mpn(JDesktopPane jDesktopPane, String string) {
        this(jDesktopPane, string, true, 5);
    }

    public mpn(JDesktopPane jDesktopPane, String string, boolean bl, int n) {
        super(false);
        FileFilter[] fileFilterArray = null;
        if (bl) {
            fileFilterArray = new FileFilter[]{new FileFilter(this){
                final /* synthetic */ mpn DVI;
                {
                    this.DVI = mpn2;
                }

                public boolean accept(File file) {
                    if (file.isDirectory()) {
                        return true;
                    }
                    String string = file.getName().toLowerCase();
                    return string.endsWith(".xml") || string.endsWith(".xlk");
                }

                public String getDescription() {
                    return "XML Files or xml link files (*.xml;*.xlk)";
                }
            }};
        }
        if (string == null) {
            string = mje.DBL == null ? System.getProperty("user.dir") : mje.DBL.getAbsolutePath();
            lfn.b(0, this.getClass().getSimpleName(), "SFExplorerDialog() : BasePath was null. Now set to = " + string);
        }
        this.setLayer(-1);
        this.a(jDesktopPane, string, fileFilterArray, false, n);
    }

    public mpn(JDesktopPane jDesktopPane, String string, FileFilter[] fileFilterArray) {
        super(false);
        this.a(jDesktopPane, string, fileFilterArray, false, 5);
    }

    public mpn(JDesktopPane jDesktopPane, String string, FileFilter[] fileFilterArray, boolean bl) {
        super(false);
        this.a(jDesktopPane, string, fileFilterArray, bl, 5);
    }

    private void a(JDesktopPane jDesktopPane, String string, FileFilter[] fileFilterArray, boolean bl, int n) {
        this.setClosable(true);
        try {
            this.DVH = new mkb(string, true, n);
            this.DVH.setFileSelectionMode(0);
            this.DVH.setControlButtonsAreShown(false);
            if (bl) {
                this.DVH.setMultiSelectionEnabled(true);
            }
            if (fileFilterArray != null) {
                for (int i = 0; i < fileFilterArray.length; ++i) {
                    this.DVH.addChoosableFileFilter(fileFilterArray[i]);
                }
            }
            this.setSize(this.bV);
            this.setMinimumSize(this.bV);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            this.dispose();
            return;
        }
        this.setTitle("File Explorer");
        this.DGa.add(this.DVH);
    }

    public void a(mkc mkc2) {
        if (this.DVH != null) {
            this.DVH.a(mkc2);
        } else {
            lfn.b(5, this.getClass().getName(), "setWBDesktop() : myFileDialog is null!");
            assert (false);
        }
    }

    public mkb eIF() {
        return this.DVH;
    }

    public String ejs() {
        return this.DVH.eDd().getAbsolutePath();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        if (this.DVH != null) {
            this.DVH.p(this.DEC);
        }
    }
}

