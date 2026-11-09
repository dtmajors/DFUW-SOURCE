/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  dqk
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mot
extends mlc
implements ActionListener {
    private static final String DOd = "no frame";
    private a DTq = null;
    private aux DEC = null;
    private amf DNl = null;
    private final String DTr = "Attachpoints defined for Object: ";
    private mkg DTs = null;
    private JButton DTt = new JButton("Get SelectedObject");
    private JButton DKh = new JButton("New");
    private JButton DKi = new JButton("Delete");
    private JButton DKj = new JButton("Save AttachPoints SFFile");
    private JButton DTu = new JButton("Copy From");
    private JButton DTv = new JButton("Copy To");
    private mou DTw;
    private Dimension DJA = new Dimension(750, 600);
    String DTf = null;

    public mot(aux aux2) {
        this.DEC = aux2;
        this.DTq = new a(this);
        this.DTw = new mou(this);
        this.setTitle("Edit Attachpoints");
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        this.eEq();
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public aux eDR() {
        return this.DEC;
    }

    private void eEq() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new BorderLayout());
        JPanel jPanel3 = new JPanel(new FlowLayout(2));
        JPanel jPanel4 = new JPanel(new FlowLayout());
        this.DTs = new mkg(lcn.emv(), "Attachpoints defined for Object: n/a", true);
        this.DTs.setVisibleRowCount(10);
        this.DTs.a(this.DTq);
        this.eHV();
        jPanel2.add(this.DTs);
        this.DTt.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTx.eHV();
            }
        });
        jPanel3.add(this.DTt);
        this.DKh.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTx.eEC();
            }
        });
        jPanel3.add(this.DKh);
        this.DTu.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTx.eHU();
            }
        });
        jPanel3.add(this.DTu);
        this.DTv.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mot.a(this.DTx);
            }
        });
        jPanel3.add(this.DTv);
        this.DKi.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTx.eEz();
            }
        });
        jPanel3.add(this.DKi);
        this.DKj.addActionListener(new ActionListener(this){
            final /* synthetic */ mot DTx;
            {
                this.DTx = mot2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTx.eEA();
            }
        });
        jPanel3.add(this.DKj);
        jPanel.add((Component)jPanel4, "North");
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel3, "South");
        this.addTab("Attach Points", jPanel);
        this.addTab("Mass Copy", new mor());
    }

    private void eHT() {
        if (this.DNl == null) {
            lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : No meshObject selected!");
            return;
        }
        String string = this.w(this.DNl);
        Map<String, eh> map = ei.ao(string);
        if (map == null || map.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mesh [" + string + "] has no attachpoints!", "Error in CopyTo function.", 0);
            lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : Mesh [" + string + "] has no attachpoints!");
            return;
        }
        if (this.DTf == null) {
            this.DTf = lcw.qLb + "xml/";
        }
        this.DTf = jry.tp(this.DTf.toLowerCase());
        mkb mkb2 = new mkb(this.DTf);
        myr myr2 = new myr("xml", "XML Files");
        mkb2.setMultiSelectionEnabled(true);
        mkb2.Ci(".xml");
        mkb2.addChoosableFileFilter(myr2);
        mkb2.setAcceptAllFileFilterUsed(false);
        mkb2.setFileSelectionMode(0);
        int n = mkb2.showDialog(this, "Choose Files");
        if (n != 0) {
            return;
        }
        jrw[] jrwArray = mkb2.eDe();
        if (jrwArray == null || jrwArray.length <= 0) {
            return;
        }
        int n2 = 0;
        for (int i = 0; i < jrwArray.length; ++i) {
            String string2 = jry.tp(jrwArray[i].getAbsolutePath().toLowerCase());
            assert (string2.startsWith(this.DTf));
            string2 = string2.substring(this.DTf.length());
            string2.replace("/", "/");
            lfn.b(0, this.getClass().getSimpleName(), "browseForFiles() : aFile = " + string2);
            Map<String, eh> map2 = ei.ao(string2);
            if (map2 != null) {
                n = JOptionPane.showConfirmDialog(this, "File [" + string2 + "] already has attachpoints. Overwrite?");
                if (n != 0) continue;
                map2.clear();
            } else {
                map2 = lcn.emw();
                ei.a(string2, map2);
            }
            for (eh eh2 : map.values()) {
                block12: {
                    try {
                        eh2 = (eh)eh2.clone();
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : Clone not supported for this object! [" + eh2 + "]");
                        if ($assertionsDisabled) break block12;
                        throw new AssertionError();
                    }
                }
                map2.put(eh2.getName(), eh2);
            }
            ++n2;
        }
        JOptionPane.showMessageDialog(this, "Successfully copied from [" + string + "] to [" + n2 + "] other files.");
    }

    protected void eHU() {
        if (this.DNl == null) {
            lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : No meshObject!");
            return;
        }
        String string = this.w(this.DNl);
        Map<String, eh> map = ei.ao(string);
        if (map != null) {
            int n = JOptionPane.showConfirmDialog(this, "Copying attachpoints from another Mesh will overwrite attachpoints for this mesh. Do you want to continue?");
            if (n != 0) {
                return;
            }
            map.clear();
        } else {
            map = lcn.emw();
            ei.a(string, map);
        }
        ArrayList<String> arrayList = new ArrayList<String>(lea.eor().keySet());
        Collections.sort(arrayList);
        Object[] objectArray = arrayList.toArray(new String[arrayList.size()]);
        int n = 0;
        String string2 = (String)JOptionPane.showInputDialog(this, "Select Mesh for Copy from", "Copy Attachpoints", -1, null, objectArray, objectArray[0]);
        if (string2 == null) {
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : This is teh AttachPoints: ");
        n = 0;
        Map<String, eh> map2 = ei.ao(string2);
        if (map2 != null) {
            for (eh eh2 : map2.values()) {
                try {
                    eh2 = (eh)eh2.clone();
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : Clone not supported for this object! [" + eh2 + "]");
                }
                map.put(eh2.getName(), eh2);
                lfn.b(0, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : AttachPoint[" + n + "]  = " + eh2);
                ++n;
            }
            this.eEr();
        } else {
            JOptionPane.showMessageDialog(this, "Could not get attachpoints from Mesh [" + string2 + "]!", "Error Copying Attachpoints", 0);
        }
    }

    protected void eHV() {
        ldv ldv2 = mje.ezC();
        if (ldv2 == null) {
            return;
        }
        amf amf2 = this.DEC.d(ldv2);
        if (amf2 == null) {
            return;
        }
        if (amf2 instanceof bvd || amf2 instanceof dqk) {
            this.DNl = amf2;
            this.eEr();
        }
    }

    private void eEr() {
        if (this.DNl == null) {
            lfn.b(5, this.getClass().getSimpleName(), "updateListData() : No meshObject!");
            return;
        }
        String string = this.w(this.DNl);
        List<eh> list = lcn.emI();
        Map<String, eh> map = ei.ao(string);
        if (map != null) {
            lfn.b(0, this.getClass().getSimpleName(), "updateListData() : This is teh AttachPoints: ");
            int n = 0;
            for (eh eh2 : map.values()) {
                lfn.b(0, this.getClass().getSimpleName(), "updateListData() : AttachPoint[" + n + "]  = " + eh2);
                ++n;
                list.add(eh2);
            }
        } else {
            lfn.b(4, this.getClass().getSimpleName(), "updateListData() : NO AttachPoints found for Mesh = " + string);
        }
        Collections.sort(list);
        this.DTs.setTitle("Attachpoints defined for Object: " + string);
        this.DTs.getList().setListData((Vector)list);
        this.DTs.revalidate();
    }

    protected void eEz() {
        Map<String, eh> map;
        int n;
        Object[] objectArray = this.DTs.getList().getSelectedValues();
        if (objectArray != null && (n = JOptionPane.showConfirmDialog(this, "Are you sure want to delete all [" + objectArray.length + "] AttachPoint(s) ?")) == 0 && (map = ei.ao(this.w(this.DNl))) != null) {
            for (int i = 0; i < objectArray.length; ++i) {
                eh eh2 = (eh)objectArray[i];
                map.remove(eh2.getName());
            }
            this.eEr();
        }
    }

    protected void eEA() {
        if (!this.eFQ()) {
            return;
        }
        kak kak2 = new kak();
        kak2.X(lea.eor());
        JOptionPane.showMessageDialog(this, "AttachPoints SFFile Saved!");
    }

    private boolean eFQ() {
        String string = this.w(this.DNl);
        Map<String, eh> map = ei.ao(string);
        if (map == null) {
            JOptionPane.showMessageDialog(this, "No attachpoints for Mesh = " + string);
            return false;
        }
        for (eh eh2 : map.values()) {
            if (eh2.getName().contains("Target Back 01")) {
                lfn.b(0, "SFAttachpointDialog", "checkAttachPoints() KKKv");
            }
            if (eh2.fa() != 0 || eh2.getFrameName() != null && !eh2.getFrameName().equals(DOd)) continue;
            JOptionPane.showMessageDialog(this, "Cannot save Attachpoints. Attachpoint [" + eh2.getName() + "] is Anim2Mesh, but has no Anim bone = [" + eh2.getFrameName() + "]", "Error Saving Attachpoints", 0);
            return false;
        }
        return true;
    }

    protected void eEC() {
        String string = this.w(this.DNl);
        mov mov2 = new mov(null, true);
        mov2.setLocationRelativeTo(this);
        mov2.setVisible(true);
        String[] stringArray = mov2.eHY();
        if (stringArray != null) {
            Map<String, eh> map = ei.ao(string);
            if (map == null) {
                lfn.b(4, this.getClass().getSimpleName(), "attachPointNewButton_ActionPerformed() : NO AttachPoints found for Mesh = " + string + ", Creating New AttachPointsMap");
                map = lcn.emw();
                ei.a(string, map);
            }
            for (int i = 0; i < stringArray.length; ++i) {
                String string2 = stringArray[i];
                Object object = map.keySet().iterator();
                while (object.hasNext()) {
                    int n;
                    if (object.next().equals(string2) && (n = JOptionPane.showInternalConfirmDialog(this, "This AttachPoint has already been created. Do you want to override the old attachpoint with this new one?")) == 0) continue;
                }
                object = new eh();
                ((eh)object).setName(string2);
                ((eh)object).setFrameName(DOd);
                ((eh)object).setRotation(new ljq());
                ((eh)object).K(new ljq());
                if (this.x(this.DNl)) {
                    ((eh)object).ac(0);
                } else {
                    ((eh)object).ac(1);
                }
                map.put(((eh)object).getName(), (eh)object);
                this.eEr();
            }
            return;
        }
    }

    protected void b(eh eh2) {
        mos mos2 = new mos((Frame)this.DEC, true);
        mos2.setLocationRelativeTo(this);
        mos2.setVisible(true);
        String string = mos2.getAttachPointName();
        if (string == null) {
            return;
        }
        boolean bl = mos2.eHS();
        ljq ljq2 = mos2.getOffset();
        String string2 = this.w(this.DNl);
        Map<String, eh> map = ei.ao(string2);
        if (map == null) {
            lfn.b(4, this.getClass().getSimpleName(), "attachPointNewButton_ActionPerformed() : NO AttachPoints found for Mesh = " + string2 + ", Creating New AttachPointsMap");
            map = lcn.emw();
            ei.a(string2, map);
        }
        Object object = map.keySet().iterator();
        while (object.hasNext()) {
            if (!object.next().equals(string)) continue;
            int n = JOptionPane.showInternalConfirmDialog(this, "This AttachPoint has already been created. Do you want to override the old attachpoint with this new one?");
            if (n == 0) break;
            return;
        }
        object = new ljq(eh2.fb());
        if (bl) {
            ljq ljq3 = eh2.getRotation();
            ljq3.rlV = 0.0f;
            ljq3.x = 0.0f;
            lgl lgl2 = new lgl(ljq3);
            ljq2 = lgl2.eq(ljq2);
            ((ljq)object).es(ljq2);
        } else {
            ((ljq)object).es(ljq2);
        }
        eh eh3 = new eh();
        eh3.setName(string);
        eh3.setFrameName(eh2.getFrameName());
        eh3.setRotation(new ljq(eh2.getRotation()));
        eh3.K((ljq)object);
        eh3.ac(eh2.fa());
        map.put(eh3.getName(), eh3);
        this.eEr();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Copy Attachpoint")) {
            lfn.b(0, this.getClass().getSimpleName(), "actionPerformed() : Copy Attachpoint!");
            eh eh2 = (eh)this.DTs.getList().getSelectedValue();
            if (eh2 != null) {
                this.b(eh2);
            }
        }
    }

    private boolean x(amf amf2) {
        return amf2 instanceof bvf;
    }

    private String w(amf amf2) {
        String string = null;
        string = amf2 instanceof bvd ? ((bvd)this.DNl).getFileName() : amf2.getObjectDescriptionFilename();
        return string;
    }

    static /* synthetic */ void a(mot mot2) {
        mot2.eHT();
    }

    static /* synthetic */ mkg b(mot mot2) {
        return mot2.DTs;
    }

    static /* synthetic */ mou c(mot mot2) {
        return mot2.DTw;
    }

    static /* synthetic */ amf d(mot mot2) {
        return mot2.DNl;
    }

    static /* synthetic */ boolean a(mot mot2, amf amf2) {
        return mot2.x(amf2);
    }

    static /* synthetic */ aux e(mot mot2) {
        return mot2.DEC;
    }
}

