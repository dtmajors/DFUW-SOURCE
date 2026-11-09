/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import org.w3c.dom.Document;

public class mlf
extends mkx {
    private aux DEC = null;
    private mlm DHW;
    private String[] DHX;
    private Dimension bV = new Dimension(600, 400);
    private mkg DHY;
    private a DHZ;
    private JButton DIa = new JButton("Load Bone Config");
    private JButton DIb = new JButton("Save Bone Config");
    private JButton DIc = new JButton("Reset Bone Config");
    private JButton DId = new JButton("Rebuild Bone list");
    private String jzK;

    public mlf(aux aux2, String string) {
        super(false);
        assert (string != null) : "PSAFile is null!";
        this.DEC = aux2;
        this.jzK = string;
        this.eDQ();
        this.DHZ = new a(this);
        this.setClosable(true);
        this.setPreferredSize(this.bV);
        this.r();
        this.setTitle("Bone Picker Dialog");
        this.pack();
        try {
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getName(), "sendBoneInfoMessage() : Exception. Could not sleep. \n" + exception);
        }
        this.N(null);
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        JPanel jPanel2 = new JPanel(new FlowLayout(2));
        JPanel jPanel3 = new JPanel(new BorderLayout());
        this.b(jPanel3);
        this.a(jPanel3);
        this.DIa.setToolTipText("Loads a previous bone configuration");
        this.DIb.setToolTipText("Saved the bone configuration");
        this.DIc.setToolTipText("Reset the bone configuration");
        this.DId.setToolTipText("Press this button to get Bone List");
        jPanel2.add(this.DIc);
        jPanel2.add(this.DIa);
        jPanel2.add(this.DIb);
        jPanel2.add(this.DId);
        this.DIa.addActionListener(new ActionListener(this){
            final /* synthetic */ mlf DIe;
            {
                this.DIe = mlf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlf.a(this.DIe, actionEvent);
            }
        });
        this.DIb.addActionListener(new ActionListener(this){
            final /* synthetic */ mlf DIe;
            {
                this.DIe = mlf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlf.b(this.DIe, actionEvent);
            }
        });
        this.DIc.addActionListener(new ActionListener(this){
            final /* synthetic */ mlf DIe;
            {
                this.DIe = mlf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlf.c(this.DIe, actionEvent);
            }
        });
        this.DId.addActionListener(new ActionListener(this){
            final /* synthetic */ mlf DIe;
            {
                this.DIe = mlf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlf.d(this.DIe, actionEvent);
            }
        });
        this.DGa.add((Component)jPanel, "North");
        this.DGa.add((Component)jPanel3, "Center");
        this.DGa.add((Component)jPanel2, "South");
    }

    private void a(JPanel jPanel) {
        mlg mlg2 = new mlg(new ArrayList());
        this.DHW = new mlm(mlg2);
        this.DHW.setSelectionMode(2);
        this.DHW.setDropTarget(new DropTarget(this, 1, new myc(), true));
        try {
            this.DHW.setDefaultRenderer(Class.forName("java.lang.Object"), this.DHW.eEh());
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        this.DHW.setShowVerticalLines(true);
        this.DHW.setShowHorizontalLines(true);
        JScrollPane jScrollPane = new JScrollPane(this.DHW);
        jPanel.add((Component)jScrollPane, "Center");
    }

    private void b(JPanel jPanel) {
        Object[] objectArray = new String[]{"lalala", "1", "chop d", "eat bread"};
        this.DHY = new mkg(objectArray, "Animation Sets", true);
        this.DHY.a(this.DHZ);
        jPanel.add((Component)this.DHY, "West");
    }

    private void J(ActionEvent actionEvent) {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "worldbuilder/bone-configs/");
            object = new myr("xml", "Bone cofigurations");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            throw new bs(exception);
        }
        object = mkb2.eDc();
        if (object != null && n == 0) {
            String string = "";
            try {
                string = jry.tk(((File)object).getAbsolutePath());
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            Object object2 = xStream.fromXML(string);
            assert (object2 instanceof lgy[]);
            lgy[] lgyArray = (lgy[])object2;
            for (int i = 0; i < lgyArray.length; ++i) {
                lgy lgy2 = lgyArray[i];
                if (!mje.DBz.containsKey(lgy2.erQ())) {
                    lfn.b(5, this.getClass().getSimpleName(), "receiveResourceResponseForObject() : Cannot load config for non-existing AnimSet [" + lgy2.erQ() + "]. Skipping.");
                    continue;
                }
                List<lbz> list = mje.DBz.get(lgy2.erQ());
                String[] stringArray = lgy2.erR();
                block6: for (int j = 0; j < stringArray.length; ++j) {
                    String string2 = stringArray[j];
                    for (lbz lbz2 : list) {
                        if (!lbz2.emu().equals(string2)) continue;
                        lbz2.yh(false);
                        continue block6;
                    }
                }
            }
        }
    }

    private void K(ActionEvent actionEvent) {
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "worldbuilder/bone-configs/");
            mkb2.addChoosableFileFilter(new myr("xml", "XML Files"));
            mkb2.Ci(".xml");
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            throw new bs(exception);
        }
        jrw jrw2 = mkb2.eDc();
        if (jrw2 != null && n == 0) {
            String string = jrw2.toString();
            String string2 = string.substring(0, lcw.qLb.length());
            string = string.substring(lcw.qLb.length() - 1);
            if (string2.equalsIgnoreCase(lcw.qLb)) {
                lgy[] lgyArray = this.eDT();
                XStream xStream = new XStream(new DomDriver());
                xStream.setClassLoader(r.cr);
                String string3 = xStream.toXML(lgyArray);
                Document document = jsy.tL(string3);
                jsz.a(document, jrw2);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Cannot save outside of Install Directory!", "Error: Wrong save area", 0);
            }
        }
    }

    private void L(ActionEvent actionEvent) {
        this.dispose();
    }

    private void M(ActionEvent actionEvent) {
        int n = JOptionPane.showInternalConfirmDialog(this, "Reset Bone Configuration for all Sets?", "Reset", 0);
        if (n == 0) {
            for (List<lbz> list : mje.DBz.values()) {
                for (lbz lbz2 : list) {
                    lbz2.yh(true);
                }
            }
            this.DHW.revalidate();
            this.DHW.repaint();
        }
    }

    private void N(ActionEvent actionEvent) {
        Map<String, List<lbz>> map = mje.DBz;
        this.DHX = new String[map.size()];
        this.DHX = map.keySet().toArray(this.DHX);
        this.DHY.setListData(this.DHX);
        this.DHY.revalidate();
    }

    private void eDQ() {
        haw haw2 = (haw)this.DEC.d(4114);
        haw2.lT(this.jzK);
        haw2.Lw(1);
        this.DEC.a((dxq)haw2);
    }

    private List X(String[] stringArray) {
        ArrayList<lbz> arrayList = lcn.emv();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            lbz lbz2 = new lbz();
            lbz2.yX(string);
            lbz2.yh(true);
            arrayList.add(lbz2);
        }
        return arrayList;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public aux eDR() {
        return this.DEC;
    }

    public String[] eDS() {
        return this.DHX;
    }

    public lgy[] eDT() {
        lgy[] lgyArray = null;
        ArrayList<lgy> arrayList = lcn.emv();
        int n = 0;
        lgy lgy2 = null;
        boolean bl = false;
        ArrayList<String> arrayList2 = null;
        Iterator<String> iterator = mje.DBz.keySet().iterator();
        while (iterator.hasNext()) {
            bl = false;
            String string = iterator.next();
            List<lbz> list = mje.DBz.get(string);
            arrayList2 = lcn.emv();
            for (lbz lbz2 : list) {
                lgy2 = new lgy();
                lgy2.Ae(string);
                if (lbz2 == null || lbz2.emt()) continue;
                bl = true;
                lfn.b(0, this.getClass().getName(), "buildExcludeList() : Adding Bone [" + lbz2 + "] to List for Set [" + lgy2.erQ() + "]");
                arrayList2.add(lbz2.emu());
            }
            if (bl) {
                String[] stringArray = arrayList2.toArray(new String[arrayList2.size()]);
                assert (lgy2 != null);
                lgy2.T(stringArray);
                arrayList.add(lgy2);
            }
            arrayList2 = null;
            ++n;
        }
        if (!arrayList.isEmpty()) {
            lgyArray = new lgy[arrayList.size()];
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                lgyArray[i] = (lgy)arrayList.get(i);
            }
        }
        return lgyArray;
    }

    static /* synthetic */ void a(mlf mlf2, ActionEvent actionEvent) {
        mlf2.J(actionEvent);
    }

    static /* synthetic */ void b(mlf mlf2, ActionEvent actionEvent) {
        mlf2.K(actionEvent);
    }

    static /* synthetic */ void c(mlf mlf2, ActionEvent actionEvent) {
        mlf2.M(actionEvent);
    }

    static /* synthetic */ void d(mlf mlf2, ActionEvent actionEvent) {
        mlf2.N(actionEvent);
    }

    static /* synthetic */ mkg a(mlf mlf2) {
        return mlf2.DHY;
    }

    static /* synthetic */ mlm b(mlf mlf2) {
        return mlf2.DHW;
    }
}

