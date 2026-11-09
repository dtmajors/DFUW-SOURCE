/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class mru
extends mkx {
    private aux DEC = null;
    Dimension bV = new Dimension(450, 300);
    List Enz = null;
    List EnA = null;
    JButton EnB = new JButton("Convert Meshes");
    JButton EnC = new JButton("Convert X POWAH Meshes");
    mkl EnD = new mkl("Auto-Replace names in XML Files", true);
    JButton EnE = new JButton("Process XML Files");
    private mkt EnF = new mkt("Nr. of LOD Levels: ", "0");
    String[] EnG = new String[]{"-- Choose Type---", "Convert to SFM", "Convert to SFMLOD", "Convert to X"};
    private JList EnH = new JList<String>(this.EnG);

    public mru() {
        this.setTitle("Mesh Convert Dialog");
        this.r();
        this.setPreferredSize(this.bV);
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(jPanel, 1);
        jPanel.add(this.EnH);
        jPanel.add(this.EnF);
        jPanel.add(this.EnD);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        if (mje.DBk) {
            jPanel2.add(this.EnC);
            this.EnC.addActionListener(new ActionListener(this){
                final /* synthetic */ mru EnI;
                {
                    this.EnI = mru2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    this.EnI.eMn();
                }
            });
        }
        jPanel2.add(this.EnB);
        this.EnB.addActionListener(new ActionListener(this){
            final /* synthetic */ mru EnI;
            {
                this.EnI = mru2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EnI.eMo();
            }
        });
        jPanel2.add(this.EnE);
        this.EnE.addActionListener(new ActionListener(this){
            final /* synthetic */ mru EnI;
            {
                this.EnI = mru2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EnI.eMm();
            }
        });
        jPanel.add(jPanel2);
        this.DGa.add(jPanel);
    }

    protected void eMm() {
        this.DEC.eBv();
    }

    protected void eMn() {
        assert (this.DEC != null);
        String string = lcw.qLb + "mesh/";
        this.EnA = this.DEC.aH(string, "Convert");
        Object object = lcn.emv();
        Iterator iterator = this.EnA.iterator();
        while (iterator.hasNext()) {
            jrw jrw2 = (jrw)iterator.next();
            if (jrw2.isDirectory()) {
                iterator.remove();
            }
            jry.a(jrw2, (FileFilter)new jsl(".x"), object, true);
        }
        this.EnA.addAll(object);
        object = lcw.qLb + "mesh/";
        if (this.EnH.getSelectedIndex() != -1 && !this.EnA.isEmpty()) {
            if (this.EnH.getSelectedIndex() == 1) {
                lfn.b(0, this.getClass().getName(), "OkButton_actionPerformed() : Converting to SFM!");
            }
            for (jrw jrw2 : this.EnA) {
                int n = this.EnH.getSelectedIndex();
                String string2 = jrw2.getAbsolutePath();
                String string3 = null;
                if (n == 1) {
                    string3 = (String)object + jry.tu(string2) + ".sfm";
                } else if (n == 2) {
                    string3 = (String)object + jry.tu(string2) + ".sfmlod";
                } else if (n == 3) {
                    string3 = (String)object + jry.tu(string2) + ".x";
                }
                if (string3 == null) {
                    lfn.b(5, this.getClass().getName(), "OkButton_actionPerformed() : Unknown ConverType = " + n);
                    return;
                }
                har har2 = (har)this.DEC.d(4119);
                har2.on(lcr.qAE);
                har2.f(lcr.qzr);
                har2.Ls(n);
                har2.jC(string2);
                har2.ls(string3);
                har2.Lr(Integer.parseInt(this.EnF.eCU()));
                this.DEC.a((dxq)har2);
                lfn.b(0, this.getClass().getName(), "OkButton_actionPerformed() : Sendt message!");
            }
        }
    }

    protected void eMo() {
        Object object;
        Object object2;
        assert (this.DEC != null);
        String string = lcw.qLb + "xml/";
        this.Enz = this.DEC.aG(string, "Convert");
        Object object3 = lcn.emv();
        Object object4 = this.Enz.iterator();
        while (object4.hasNext()) {
            jrw jrw2 = (jrw)object4.next();
            if (jrw2.isDirectory()) {
                object4.remove();
            }
            jry.a(jrw2, (FileFilter)new jsl(".xml"), (List<jrw>)object3, true);
        }
        this.Enz.addAll(object3);
        object3 = new jxa();
        object4 = lcw.qLb + "mesh/";
        this.EnA = lcn.emv();
        for (jrw jrw3 : this.Enz) {
            String string2 = (String)object4 + ((jxa)object3).s(jrw3);
            object2 = new jrw(string2);
            if (((File)object2).exists()) {
                this.EnA.add(object2);
                continue;
            }
            lfn.b(5, this.getClass().getName(), "OkButton_actionPerformed() : MeshFile Does not exist! ->" + object2);
        }
        if (this.EnH.getSelectedIndex() != -1 && !this.EnA.isEmpty()) {
            if (this.EnH.getSelectedIndex() == 1) {
                lfn.b(0, this.getClass().getName(), "OkButton_actionPerformed() : Converting to SFM!");
            }
            for (jrw jrw3 : this.EnA) {
                int n = this.EnH.getSelectedIndex();
                object2 = jrw3.getAbsolutePath();
                String string3 = null;
                if (n == 1) {
                    string3 = (String)object4 + jry.tu((String)object2) + ".sfm";
                } else if (n == 2) {
                    string3 = (String)object4 + jry.tu((String)object2) + ".sfmlod";
                } else if (n == 3) {
                    string3 = (String)object4 + jry.tu((String)object2) + ".x";
                }
                if (string3 == null) {
                    lfn.b(5, this.getClass().getName(), "OkButton_actionPerformed() : Unknown ConverType = " + n);
                    return;
                }
                object = (har)this.DEC.d(4119);
                ((dxq)object).on(lcr.qAE);
                ((dxq)object).f(lcr.qzr);
                ((har)object).Ls(n);
                ((har)object).jC((String)object2);
                ((har)object).ls(string3);
                ((har)object).Lr(Integer.parseInt(this.EnF.eCU()));
                this.DEC.a((dxq)object);
                lfn.b(0, this.getClass().getName(), "OkButton_actionPerformed() : Sendt message!");
            }
        }
        if (this.EnD.eDr()) {
            object4 = lcw.qLb + "mesh/";
            for (jrw jrw3 : this.Enz) {
                String string4 = (String)object4 + ((jxa)object3).s(jrw3);
                object2 = new jrw(string4);
                if (((File)object2).exists()) {
                    int n = this.EnH.getSelectedIndex();
                    object = null;
                    if (n == 1) {
                        object = jry.tu(string4) + ".sfm";
                    } else if (n == 2) {
                        object = jry.tu(string4) + ".sfmlod";
                    } else if (n == 3) {
                        object = jry.tu(string4) + ".x";
                    }
                    if (object == null) {
                        lfn.b(5, this.getClass().getName(), "OkButton_actionPerformed() : Unknown ConverType = " + n);
                        return;
                    }
                    ((jxa)object3).d(jrw3, (String)object);
                    continue;
                }
                lfn.b(5, this.getClass().getName(), "OkButton_actionPerformed() : MeshFile Does not exist! ->" + object2);
            }
        }
    }

    public final void p(aux aux2) {
        this.DEC = aux2;
    }
}

