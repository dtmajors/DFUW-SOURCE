/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileFilter;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mpp
extends mkx {
    private Dimension bV = new Dimension(450, 650);
    JLabel DIL = new JLabel("<HTML><b>Press a button to perform the chosen task</b></HTML>");
    private JButton DWi = new JButton("Remove Backup files");
    private JButton DWj = new JButton("Reposition Objectspaces");
    private JButton DWk = new JButton("Generate Worlddata from Dir");
    private JButton DWl = new JButton("Resolve OS GUID Conflicts");
    private JButton DWm = new JButton("Automatically place re-preprocessed XMLs");
    private JButton DWn = new JButton("Change Global Shader in XML Files");
    private JButton DWo = new JButton("Create a file dump");
    private JButton DWp = new JButton("Create a file dump from a Worlddata file");
    private JButton DWq = new JButton("Scale Meshes");
    private JButton DWr = new JButton("Copy files from SFKuk");
    private JButton DWs = new JButton("Check for duplicate objects");
    private JButton DWt = new JButton("Dump Mal-positioned ObjectSpaces");

    public mpp() {
        super(false);
        this.setTitle("Maintenance Dialog");
        this.setPreferredSize(this.bV);
        this.setMinimumSize(this.bV);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        jPanel.add(this.DIL);
        jPanel2.setLayout(new BoxLayout(jPanel2, 1));
        jPanel2.add(this.DWi);
        jPanel2.add(this.DWj);
        jPanel2.add(this.DWk);
        jPanel2.add(this.DWl);
        jPanel2.add(this.DWm);
        jPanel2.add(this.DWn);
        jPanel2.add(this.DWo);
        jPanel2.add(this.DWp);
        jPanel2.add(this.DWq);
        jPanel2.add(this.DWr);
        jPanel2.add(this.DWs);
        this.DWt.addActionListener(new ActionListener(this){
            final /* synthetic */ mpp DWu;
            {
                this.DWu = mpp2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpp.a(this.DWu);
            }
        });
        jPanel2.add(this.DWt);
        this.DGa.add((Component)jPanel, "North");
        this.DGa.add((Component)jPanel2, "Center");
        this.DGa.add((Component)jPanel3, "South");
    }

    private void eII() {
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : Mal Positioned ObjectSpace Button Pressed");
        String string = lcw.qLb + "xml-files/objectspace/built_tiles/";
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(new jrw(string), (FileFilter)new jsl("xml"), arrayList, true);
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : Nr Of Files = " + arrayList.size());
        myy myy2 = new myy();
        myx[] myxArray = myy2.eTo();
        myx myx2 = null;
        int n = 0;
        int n2 = 0;
        block0: for (int i = 0; i < myxArray.length; ++i) {
            myx2 = myxArray[i];
            for (jrw jrw2 : arrayList) {
                if (!jrw2.getName().equalsIgnoreCase(myx2.getName())) continue;
                jxd jxd2 = new jxd();
                ldv ldv2 = jxd2.A(jrw2);
                if (ldv2 == null) {
                    assert (false) : "Built Tile Position is null for SFFile =" + jrw2;
                    return;
                }
                if (ldv2.enw() == myx2.eTl()) {
                    ++n2;
                }
                ++n;
                continue block0;
            }
        }
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : ** DONE. Found [" + n + "], Correctly Placed Tiles = " + n2);
    }

    private void eIJ() {
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : Mal Positioned ObjectSpace Button Pressed");
        String string = lcw.qLb + "xml-files/objectspace/built_tiles/";
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(new jrw(string), (FileFilter)new jsl("xml"), arrayList, true);
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : Nr Of Files = " + arrayList.size());
        myy myy2 = new myy();
        myx[] myxArray = myy2.eTo();
        myx myx2 = null;
        int n = 0;
        int n2 = 0;
        block0: for (int i = 0; i < myxArray.length; ++i) {
            myx2 = myxArray[i];
            for (jrw jrw2 : arrayList) {
                if (!jrw2.getName().equalsIgnoreCase(myx2.getName())) continue;
                boolean bl = this.a(myx2, jrw2);
                if (bl) {
                    ++n2;
                }
                ++n;
                continue block0;
            }
        }
        lfn.b(0, this.getClass().getName(), "doMalPositionedObjectSpaceDump() : ** DONE. Found [" + n + "], Correctly Placed Tiles = " + n2);
    }

    private boolean a(myx myx2, jrw jrw2) {
        jxd jxd2 = new jxd();
        ljq ljq2 = jxd2.B(jrw2);
        if (ljq2 == null) {
            assert (false) : "Built Tile Position is null for SFFile =" + jrw2;
            return false;
        }
        if (ljq2.B(myx2.av(), 0.002f)) {
            return true;
        }
        ljq2.et(myx2.av());
        lfn.b(4, this.getClass().getName(), "checkTilePosition() : Position not equal for Tile [" + myx2.getName() + "]. Difference is = " + ljq2);
        return false;
    }

    static /* synthetic */ void a(mpp mpp2) {
        mpp2.eIJ();
    }
}

