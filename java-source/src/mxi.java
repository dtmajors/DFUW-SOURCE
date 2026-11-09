/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class mxi
extends mkx {
    private aux DEC = null;
    private Dimension bV = new Dimension(500, 350);
    private JButton DIj = new JButton("Convert Vegetation Meshes");
    private JButton ETC = new JButton("Generate Vegetation For Tile(s)");

    public mxi() {
        super(false);
        this.setClosable(true);
        this.setPreferredSize(this.bV);
        this.setTitle("Mesh Vegetation Creation Dialog");
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        JPanel jPanel2 = new JPanel(new FlowLayout(2));
        this.DIj.addActionListener(new ActionListener(this){
            final /* synthetic */ mxi ETD;
            {
                this.ETD = mxi2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxi.a(this.ETD);
            }
        });
        jPanel2.add(this.DIj);
        this.DGa.add((Component)jPanel, "Center");
        this.DGa.add((Component)jPanel2, "South");
    }

    private void eSN() {
        String string = lcw.qLb + "worldbuilder/vegetation/";
        jrw jrw2 = new jrw(string + "vegetation.xml");
        has has2 = (has)this.DEC.d(4116);
        has2.Lt(has.jyV);
        has2.lD("");
        has2.lE("");
        has2.jN(1.0f);
        has2.setXMLFileName("");
        has2.lF("");
        has2.a(new lbx[]{new lbx()});
        has2.lC(jrw2.getPath());
        has2.lG("nature/");
        this.DEC.a((dxq)has2);
    }

    private void eSO() {
        String string = lcw.qLb + "worldbuilder/vegetation/";
        List list = this.aV(string, "Generate Vegetation for Tile");
        for (jrw jrw2 : list) {
            has has2 = (has)this.DEC.d(4116);
            has2.Lt(has.jyW);
            has2.lD("");
            has2.lE("axaxa.sfm");
            has2.jN(1.0f);
            has2.lC(string + "vegetation.xml");
            has2.lG("nature/");
            has2.lH(string + "region_material.xml");
            has2.lF(jrw2.getPath());
            has2.setXMLFileName("terrain/" + jrw2.getName());
            lbx lbx2 = new lbx();
            lbx2.setMeshName("");
            lbx2.yW("");
            has2.a(new lbx[]{lbx2});
            this.DEC.a((dxq)has2);
        }
    }

    private List aV(String string, String string2) {
        myr myr2 = new myr("xml", "XML Files");
        mkb mkb2 = null;
        int n2 = 0;
        try {
            mkb2 = new mkb(string);
            mkb2.addChoosableFileFilter(myr2);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            mkb2.setMultiSelectionEnabled(true);
            n2 = mkb2.showDialog(this, string2);
        }
        catch (Exception exception) {
            lfn.print("FileChooser exception: " + exception);
            return lcn.emv();
        }
        ArrayList<jrw> arrayList = lcn.emv();
        if (n2 == 0) {
            jrw[] jrwArray = mkb2.eDe();
            for (int i = 0; i < jrwArray.length; ++i) {
                arrayList.add(jrwArray[i]);
            }
        }
        return arrayList;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mxi mxi2) {
        mxi2.eSN();
    }
}

