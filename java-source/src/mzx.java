/*
 * Decompiled with CFR.
 */
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mzx {
    private String EVn = "version.xml";
    private String EVo = "SFWorldbuilderVersionFile";
    lfn ga = lfn.eqw();

    public boolean eTB() {
        lju lju2 = null;
        String string = System.getProperty("user.dir");
        Document document = null;
        try {
            document = jsy.n(new jrw("W:\\worldbuilder\\LatestBuild/" + this.EVn));
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        if (document == null) {
            lfn.b(5, "SFWorldbuilderVersionChecker", "checkVersion() : Cannot find SFFile !");
            return false;
        }
        Node node = null;
        Node node2 = jsy.a(this.EVo, (Node)document);
        if (node2 != null) {
            node = node2;
            lju2 = jsy.c(document);
        } else {
            lfn.b(5, "SFWorldbuilderVersionChecker", "checkVersion : Invalid Version Document");
            System.exit(1);
        }
        if (lju2 != null) {
            if (!lju2.equals(mje.DBx)) {
                JOptionPane.showMessageDialog(null, "Local " + mje.DBx + " is not the same as remote " + lju2 + ".\n You must UPGRADE!", "FATAL Version Error", 0);
                System.exit(1);
            }
        } else {
            lfn.b(5, "SFWorldbuilderVersionChecker", "checkVersion : Could not parser version node");
            System.exit(1);
        }
        return false;
    }
}

