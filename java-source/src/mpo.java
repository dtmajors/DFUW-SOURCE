/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class mpo
extends mkx
implements jrz {
    jsq DVJ = new jsq();
    private Dimension bV = new Dimension(450, 650);
    private mkl DVK;
    private mkl DVL;
    private mkl DVM;
    private mkl DVN;
    private mkl DVO;
    private mkl DVP;
    private mkl DVQ;
    private mkl DVR;
    private mkl DVS;
    private mkl DVT;
    private mkl DVU;
    private mkl DVV;
    private mkl DVW;
    private mkl DVX;
    private JButton DVY = new JButton("Do file-dump");
    private jrw[] DVZ = null;
    private String DWa = "C:\\dump\\dfdata\\";
    private String nVD = "engine-files.xml";
    private mkn DWb = new mkn("Target Directory", this.DWa);
    private mkn DWc = new mkn("Engine SFFile list", this.nVD);
    private JProgressBar DWd;
    private mjg DGD;

    public mpo(jrw[] jrwArray) {
        super(false);
        this.DVZ = jrwArray;
        this.setClosable(true);
        this.setTitle("SFFile Dump Config");
        this.r();
        this.setPreferredSize(this.bV);
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.add(this.DWb);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        this.nVD = lcw.qLb + "worldbuilder/dump-lists/" + this.nVD;
        this.DWc = new mkn("Engine SFFile list", this.nVD);
        jPanel.add(this.DWc);
        jPanel.add(jPanel3);
        this.DVK = new mkl("Copy Mesh Files", this.DVJ.dSi(), false);
        this.DVK.setToolTipText("Will copy Mesh files, if checked");
        jPanel.add(this.DVK);
        this.DVL = new mkl("Copy XML Files", this.DVJ.dSk(), false);
        this.DVL.setToolTipText("Will copy XML files, if checked");
        jPanel.add(this.DVL);
        this.DVM = new mkl("Copy Texture Files", this.DVJ.dSj(), false);
        this.DVM.setToolTipText("Will copy Texture files, if checked");
        jPanel.add(this.DVM);
        this.DVN = new mkl("Copy Collision Files", this.DVJ.dSg(), false);
        this.DVN.setToolTipText("Will copy Collision files, if checked");
        jPanel.add(this.DVN);
        this.DVX = new mkl("Copy terrain extra files", this.DVJ.dSt(), false);
        this.DVX.setToolTipText("Copies extra files for terrain meshes (detailtextures & veg), if checked");
        jPanel.add(this.DVX);
        this.DVO = new mkl("Copy Extra Files", this.DVJ.dSh(), false);
        this.DVO.setToolTipText("Will copy Extra files (Planet,Hemisphere,..), if checked");
        jPanel.add(this.DVO);
        this.DVP = new mkl("Copy Shader Files", this.DVJ.dSm(), false);
        this.DVP.setToolTipText("Will copy Shader files, if checked");
        jPanel.add(this.DVP);
        this.DVQ = new mkl("Copy all Shader Files", this.DVJ.dSl(), false);
        this.DVQ.setToolTipText("Will copy ALL the shader files, if checked");
        jPanel.add(this.DVQ);
        this.DVR = new mkl("Copy all GameLogic Files", this.DVJ.dSn(), false);
        this.DVR.setToolTipText("Will copy ALL the GameLogic files, if checked");
        jPanel.add(this.DVR);
        this.DVS = new mkl("Create All data Directories", this.DVJ.dSo(), false);
        this.DVS.setToolTipText("Will all create data directories, if checked");
        jPanel.add(this.DVS);
        this.DVT = new mkl("Copy all GUI Files", this.DVJ.dSp(), false);
        this.DVT.setToolTipText("Will copy ALL the GUI files, if checked");
        jPanel.add(this.DVT);
        this.DVU = new mkl("Copy all Engine Files", this.DVJ.dSq(), false);
        this.DVU.setToolTipText("Will copy ALL the Engine files defined in the \"engine-file.xml\" file, if checked");
        jPanel.add(this.DVU);
        this.DVV = new mkl("Copy all Vegetation Files", this.DVJ.dSs(), false);
        this.DVV.setToolTipText("Will copy ALL the Vegetation files, if checked");
        jPanel.add(this.DVV);
        this.DVW = new mkl("Copy all Shadow Files", this.DVJ.dSr(), false);
        this.DVW.setToolTipText("Will copy ALL the Shadow files, if checked");
        jPanel.add(this.DVW);
        this.DVY.addActionListener(new ActionListener(this){
            final /* synthetic */ mpo DWe;
            {
                this.DWe = mpo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DWe.eIH();
            }
        });
        jPanel.add(this.DVY);
        this.DWd = new JProgressBar(0, 500);
        jPanel2.add(this.DWd);
        this.DGa.add((Component)jPanel, "Center");
        this.DGa.add((Component)jPanel2, "South");
    }

    protected void eIG() {
    }

    @Override
    public void A(int n, int n2, String string) {
        Runnable runnable = new Runnable(this, n2, n){
            final /* synthetic */ int DGn;
            final /* synthetic */ int DWf;
            final /* synthetic */ mpo DWe;
            {
                this.DWe = mpo2;
                this.DGn = n;
                this.DWf = n2;
            }

            public void run() {
                mpo.a(this.DWe).setMaximum(this.DGn);
                mpo.a(this.DWe).setValue(this.DWf);
            }
        };
        SwingUtilities.invokeLater(runnable);
    }

    protected void eIH() {
        int n;
        Serializable serializable;
        int n2;
        if (this.DVK.hasChanged()) {
            this.DVJ.uM(this.DVK.eDr());
        }
        if (this.DVR.hasChanged()) {
            this.DVJ.uR(this.DVR.eDr());
        }
        if (this.DVT.hasChanged()) {
            this.DVJ.uT(this.DVT.eDr());
        }
        if (this.DVQ.hasChanged()) {
            this.DVJ.uP(this.DVQ.eDr());
        }
        if (this.DVN.hasChanged()) {
            this.DVJ.uK(this.DVN.eDr());
        }
        if (this.DVO.hasChanged()) {
            this.DVJ.uL(this.DVO.eDr());
        }
        if (this.DVP.hasChanged()) {
            this.DVJ.uQ(this.DVP.eDr());
        }
        if (this.DVM.hasChanged()) {
            this.DVJ.uN(this.DVM.eDr());
        }
        if (this.DVL.hasChanged()) {
            this.DVJ.uO(this.DVL.eDr());
        }
        if (this.DVS.hasChanged()) {
            this.DVJ.uS(this.DVS.eDr());
        }
        if (this.DVU.hasChanged()) {
            this.DVJ.uU(this.DVU.eDr());
        }
        if (this.DVV.hasChanged()) {
            this.DVJ.uW(this.DVV.eDr());
        }
        if (this.DVW.hasChanged()) {
            this.DVJ.uV(this.DVW.eDr());
        }
        if (this.DVX.hasChanged()) {
            this.DVJ.uX(this.DVX.eDr());
        }
        if ((n2 = JOptionPane.showConfirmDialog(this, "Remove existing files from Target dump Area?")) == 2) {
            return;
        }
        if (n2 == 0 && ((File)(serializable = new jrw(this.DWa))).exists()) {
            jry.a((jrw)serializable, true);
        }
        serializable = lcn.emv();
        for (n = 0; n < this.DVZ.length; ++n) {
            serializable.add(this.DVZ[n]);
        }
        n = serializable.size();
        this.DWd.setString("Copying files..");
        this.DWd.setStringPainted(true);
        this.DWd.setMinimum(0);
        this.DWd.setMaximum(n);
        List list = Collections.unmodifiableList(serializable);
        String string = this.DWa;
        this.DVY.setEnabled(false);
        this.DGD = new mjg(this, list, string){
            final /* synthetic */ List DWg;
            final /* synthetic */ String DWh;
            final /* synthetic */ mpo DWe;
            {
                this.DWe = mpo2;
                this.DWg = list;
                this.DWh = string;
            }

            public Object Hv() {
                return mpo.a(this.DWe, this.DWg, this.DWh);
            }

            public void finished() {
                mpo.b(this.DWe).setEnabled(true);
            }
        };
        this.DGD.start();
    }

    private Object g(List list, String string) {
        jsp jsp2 = new jsp();
        jsp2.a(list, string, this.DVJ, this);
        JOptionPane.showMessageDialog(this, "Files Dumped to: " + string);
        this.dispose();
        return "done";
    }

    static /* synthetic */ JProgressBar a(mpo mpo2) {
        return mpo2.DWd;
    }

    static /* synthetic */ Object a(mpo mpo2, List list, String string) {
        return mpo2.g(list, string);
    }

    static /* synthetic */ JButton b(mpo mpo2) {
        return mpo2.DVY;
    }
}

