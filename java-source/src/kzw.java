/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kzx
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class kzw
extends JFrame
implements ActionListener {
    public static final String qoO = "spenefett";
    public static final String qoP = "spenefett.gamelogic.framework.object.specialeffect.atoms";
    public static final String qoQ = "spenefett.gamelogic.framework.object.specialeffect.effects";
    public static final String qoR = "spenefett.request";
    public static final String qoS = "spenefett.gamelogic.framework.object.specialeffect.components";
    public static final String qoT = "atoms.SFSpecialEffectParticleAtom";
    public static final String qoU = "SFSpecialEffectSingleSphericalLight";
    public static final String qoV = "relationrequest.SFTracerToObjectPositionalRelationRequest";
    public static final String qoW = "relationrequest.SFTracerToObjectPositionalRelationRequest";
    public static final String qoX = "spenefett.gamelogic.framework.object.logicobject.SFLogicObject";
    public static final String qoY = "spenefett.gamelogic.framework.object.specialeffect.effects.SFSpecialEffect";
    private kzx qoZ = null;
    private boolean qpa = true;
    private JComboBox qpb = null;
    private JComboBox qpc = null;
    private JTextField qpd = null;
    private JPanel qpe = null;
    private String[] hep = null;
    private String[] heu = null;
    private List<kzl> qpf = lcn.emv();
    private Map pdS = lea.eoo();
    private duf qpg = null;
    private dug qph = null;
    private boolean qpi = false;

    public kzw(kzx kzx2, boolean bl) {
        this.qoZ = kzx2;
        this.qpa = bl;
        JPanel jPanel = (JPanel)this.getContentPane();
        this.qpe = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)this.ekm(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        jPanel.add((Component)new JScrollPane(this.qpe), gridBagConstraints);
        this.setSize(600, 600);
        this.setLocation(100, 100);
        this.setVisible(true);
        this.hep = new String[]{duk.Cs(1), duk.Cs(4)};
        this.heu = duk.bBi();
        this.qpc = new JComboBox<String>(this.hep);
        this.qpc.addActionListener(this);
    }

    public void xY(boolean bl) {
        this.qpa = bl;
        if (this.qpa) {
            this.setTitle("Class Reflector");
            this.qpb.setSelectedItem(qoQ);
            this.qpd.setText(qoU);
            this.qpg = null;
        } else {
            this.setTitle("Enumeration Reflector");
            this.qpb.setSelectedItem(qoR);
            this.qpd.setText("relationrequest.SFTracerToObjectPositionalRelationRequest");
            this.qph = null;
        }
        this.qpe.removeAll();
        this.validate();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        assert (!this.qpa);
        if (this.qph == null) {
            return;
        }
        String string = (String)((JComboBox)actionEvent.getSource()).getSelectedItem();
        int n = duk.jA(string);
        this.qph.Cp(n);
        lfn.b(0, "SFXMLClassReflector", "actionPerformed() ValueType='" + this.qph.bBd() + "'");
    }

    private JPanel ekm() {
        JPanel jPanel = new JPanel();
        String[] stringArray = new String[]{qoO, qoP, qoQ, qoR, qoS};
        JLabel jLabel = new JLabel("PackageName");
        this.qpb = new JComboBox<String>(stringArray);
        JLabel jLabel2 = new JLabel("ClassName");
        this.qpd = new JTextField(null, 25);
        this.qpd.setEditable(true);
        JButton jButton = new JButton("Reflect Class");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kzw.a(this.qpj).removeAll();
                if (kzw.b(this.qpj)) {
                    kzw.a(this.qpj, kzw.c(this.qpj).getText());
                } else {
                    kzw.b(this.qpj, kzw.c(this.qpj).getText());
                }
            }
        });
        JButton jButton2 = new JButton("Reflect All Classes");
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (kzw.b(this.qpj)) {
                    kzw.c(this.qpj, kzw.d(this.qpj).getSelectedItem().toString());
                }
            }
        });
        JButton jButton3 = new JButton("Change");
        jButton3.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (kzw.b(this.qpj)) {
                    kzw.e(this.qpj);
                } else {
                    kzw.f(this.qpj);
                }
            }
        });
        JButton jButton4 = new JButton("Save Files");
        jButton4.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kzw.g(this.qpj).ekK();
                if (kzw.b(this.qpj)) {
                    kzw.g(this.qpj).ekF();
                    int n = JOptionPane.showConfirmDialog(this.qpj, "Do you want to save SpecialEffects as well", "Save specialeffects confirmation", 0);
                    if (n == 0) {
                        kzw.g(this.qpj).aa(lea.bkO());
                    }
                }
            }
        });
        JButton jButton5 = new JButton("Cancel");
        jButton5.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qpj.setVisible(false);
            }
        });
        JButton jButton6 = new JButton("Select All");
        jButton6.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (kzw.h(this.qpj).isEmpty()) {
                    return;
                }
                for (int i2 = 0; i2 < kzw.h(this.qpj).size(); ++i2) {
                    ((kzl)kzw.h(this.qpj).get(i2)).xX(false);
                }
            }
        });
        JButton jButton7 = new JButton("Unselect All");
        jButton7.addActionListener(new ActionListener(this){
            final /* synthetic */ kzw qpj;
            {
                this.qpj = kzw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (kzw.h(this.qpj).isEmpty()) {
                    return;
                }
                for (int i2 = 0; i2 < kzw.h(this.qpj).size(); ++i2) {
                    ((kzl)kzw.h(this.qpj).get(i2)).xX(true);
                }
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.add(jButton);
        jPanel2.add(jButton3);
        jPanel2.add(jButton2);
        jPanel2.add(jButton4);
        jPanel2.add(jButton5);
        JPanel jPanel3 = new JPanel();
        jPanel3.add(jButton6);
        jPanel3.add(jButton7);
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.add((Component)jPanel2, "North");
        jPanel4.add((Component)jPanel3, "South");
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qpb, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qpd, gridBagConstraints);
        gridBagConstraints.anchor = 13;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jPanel4, gridBagConstraints);
        return jPanel;
    }

    private void ekn() {
        assert (this.qpa);
        if (this.qpg == null) {
            return;
        }
        ArrayList<duj> arrayList = lcn.emv();
        int n = this.qpf.size();
        for (int i2 = 0; i2 < n; ++i2) {
            kzk kzk2 = (kzk)this.qpf.get(i2);
            if (kzk2.iNr) continue;
            arrayList.add(kzk2.qoj);
        }
        this.qpg.a(arrayList.toArray(new duj[arrayList.size()]));
        if (this.pdS.containsKey(this.qpg.getName())) {
            lfn.b(0, "SFXMLClassReflector", "changeReflectedClass() Updated class '" + this.qpg.getName() + "'");
        } else {
            lfn.b(0, "SFXMLClassReflector", "changeReflectedClass() Added class '" + this.qpg.getName() + "'");
        }
        this.pdS.put(this.qpg.getName(), this.qpg);
        if (this.qpg.bAZ() != null) {
            this.pdS.put(this.qpg.bAZ(), this.qpg);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void xU(String string) {
        try {
            Class[] classArray;
            this.qpi = true;
            for (Class clazz : classArray = kzw.xY(string)) {
                if (clazz.getSimpleName().equals("SFSpecialEffectFactory") || clazz.getSimpleName().equals("SFSpecialEffectFlags")) continue;
                this.xV(clazz.getSimpleName());
                this.ekn();
            }
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getName(), "reflectClassAll() : failed to find classes in package " + string + " because" + exception);
        }
        finally {
            this.qpi = false;
        }
    }

    private void xV(String string) {
        assert (this.qpe != null);
        if (string == null || string.trim().equals("")) {
            lfn.b(5, "SFXMLClassReflector", "reflectClass() ClassName is null.");
            return;
        }
        String string2 = (String)this.qpb.getSelectedItem() + "." + string;
        try {
            Object object;
            Class<?> clazz = Class.forName(string2);
            ArrayList arrayList = lcn.emv();
            this.a(clazz, arrayList, false);
            this.qpf.clear();
            int n = arrayList.size();
            for (int i2 = 0; i2 < n; ++i2) {
                object = (Field)arrayList.get(i2);
                kzk kzk2 = new kzk();
                kzk2.qoj = this.b((Field)object);
                kzk2.xX(false);
                this.qpf.add(kzk2);
            }
            duf duf2 = (duf)this.pdS.get(string = string.substring(string.lastIndexOf(46) + 1, string.length()));
            if (duf2 != null) {
                lfn.b(0, "SFXMLClassReflector", "reflectClass() Class '" + string + "' already exists.");
                duj[] dujArray = duf2.bBa();
                object = null;
                for (int i3 = 0; i3 < this.qpf.size(); ++i3) {
                    kzk kzk3 = (kzk)this.qpf.get(i3);
                    object = this.a(kzk3.qoj, dujArray);
                    if (object == null) continue;
                    kzk3.qoj.Cq(((duj)object).bBf());
                    kzk3.iNr = false;
                }
            }
            if (!this.qpi) {
                JPanel jPanel = new JPanel();
                jPanel.setBorder(BorderFactory.createTitledBorder(string));
                this.a(jPanel, this.qpf);
                this.qpe.add(jPanel);
                this.validate();
            }
            this.qpg = new duf();
            this.qpg.setName(string);
            this.qpg.setPackageName(string2.substring(0, string2.length() - string.length() - 1));
            this.qpg.jy(this.xW(string2));
            lfn.b(0, "SFXMLClassReflector", "reflectClass() Reflected class '" + string2 + "'");
        }
        catch (ClassNotFoundException classNotFoundException) {
            lfn.b(5, "SFXMLClassReflector", "reflectClass() ClassName '" + string2 + "' is invalid.");
        }
        catch (Exception exception) {
            lfn.b(5, "SFXMLClassReflector", "reflectClass() Reflecting class '" + string2 + "' failed.");
            lfn.log("SFXMLClassReflector", exception);
        }
    }

    private void a(JPanel jPanel, List<kzl> list) {
        assert (jPanel != null);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        int n = 0;
        int n2 = list.size();
        while (n < n2) {
            kzk kzk2 = (kzk)list.get(n);
            JCheckBox jCheckBox = new JCheckBox("", true);
            jCheckBox.addItemListener(kzk2);
            jCheckBox.setSelected(!kzk2.iNr);
            kzk2.qok = jCheckBox;
            JComboBox<String> jComboBox = new JComboBox<String>(this.heu);
            jComboBox.setSelectedItem(kzk2.qoj.bBh());
            jComboBox.addActionListener(kzk2);
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = n++;
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.weighty = 0.0;
            jPanel.add((Component)new JLabel(kzk2.qoj.getName()), gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.fill = 0;
            jPanel.add((Component)jCheckBox, gridBagConstraints);
            gridBagConstraints.gridx = 2;
            jPanel.add(jComboBox, gridBagConstraints);
        }
    }

    private duj a(duj duj2, duj[] dujArray) {
        assert (duj2 != null);
        assert (dujArray != null);
        int n = dujArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (!duj2.getName().equals(dujArray[i2].getName())) continue;
            return dujArray[i2];
        }
        return null;
    }

    private String xW(String string) {
        assert (string != null);
        if (string.startsWith(qoQ)) {
            int n = dhj.iF(string);
            return del.zR(n);
        }
        if (string.startsWith(qoS)) {
            Class<?> clazz = Class.forName(string);
            dgb dgb2 = (dgb)clazz.newInstance();
            return del.c(dgb2.getComponentType());
        }
        return null;
    }

    private void eko() {
        assert (!this.qpa);
        if (this.qph == null) {
            return;
        }
        ArrayList<dui> arrayList = lcn.emv();
        for (int i2 = 0; i2 < this.qpf.size(); ++i2) {
            kzj kzj2 = (kzj)this.qpf.get(i2);
            if (kzj2.iNr) continue;
            arrayList.add(kzj2.qoi);
        }
        this.qph.a(arrayList.toArray(new dui[arrayList.size()]));
        if (this.pdS.containsKey(this.qph.getName())) {
            lfn.b(0, "SFXMLClassReflector", "changeReflectedEnumeration() Updated enumeration '" + this.qph.getName() + "'");
        } else {
            lfn.b(0, "SFXMLClassReflector", "changeReflectedEnumeration() Added enumeration '" + this.qph.getName() + "'");
        }
        this.pdS.put(this.qph.getName(), this.qph);
    }

    private void xX(String string) {
        assert (this.qpe != null);
        if (string == null || string.trim().equals("")) {
            lfn.b(5, "SFXMLClassReflector", "reflectEnumeration() ClassName is null.");
            return;
        }
        String string2 = (String)this.qpb.getSelectedItem() + "." + string;
        try {
            dui[] duiArray;
            Class<?> clazz = Class.forName(string2);
            ArrayList arrayList = lcn.emv();
            this.a(clazz, arrayList, true);
            this.qpf.clear();
            int n = arrayList.size();
            for (int i2 = 0; i2 < n; ++i2) {
                duiArray = (Field)arrayList.get(i2);
                kzj kzj2 = new kzj();
                kzj2.qoi = this.c((Field)duiArray);
                kzj2.iNr = false;
                this.qpf.add(kzj2);
            }
            string = string.substring(string.lastIndexOf(46) + 1, string.length());
            dug dug2 = (dug)this.pdS.get(string);
            n = 4;
            if (dug2 != null) {
                lfn.b(0, "SFXMLClassReflector", "reflectEnumeration() Enumeration '" + dug2.getName() + "' already exists.");
                this.qpc.setSelectedItem(dug2.bBd());
                n = dug2.bBb();
                duiArray = dug2.bBc();
                for (int i3 = 0; i3 < this.qpf.size(); ++i3) {
                    kzj kzj3 = (kzj)this.qpf.get(i3);
                    kzj3.iNr = this.a(kzj3.qoi, duiArray);
                }
            }
            duiArray = new JPanel();
            duiArray.setBorder(BorderFactory.createTitledBorder(string));
            this.b((JPanel)duiArray, this.qpf);
            this.qpe.add((Component)duiArray);
            this.validate();
            this.qph = new dug();
            this.qph.setName(string);
            this.qph.setClassName(string2);
            this.qph.Cp(n);
            lfn.b(0, "SFXMLClassReflector", "reflectEnumeration() Reflected enumeration '" + string2 + "'");
        }
        catch (ClassNotFoundException classNotFoundException) {
            lfn.b(5, "SFXMLClassReflector", "reflectEnumeration() ClassName '" + string2 + "' is invalid.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            lfn.b(5, "SFXMLClassReflector", "reflectEnumeration() Reflecting class '" + string2 + "' failed.");
            lfn.log("SFXMLClassReflector", exception);
        }
    }

    private void b(JPanel jPanel, List list) {
        assert (jPanel != null);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel.add((Component)new JLabel("Enumeration ValueType"), gridBagConstraints);
        gridBagConstraints.fill = 0;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        jPanel.add((Component)this.qpc, gridBagConstraints);
        kzj kzj2 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            kzj2 = (kzj)list.get(i2);
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = i2 + 1;
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.weighty = 0.0;
            jPanel.add((Component)new JLabel(kzj2.qoi.getName()), gridBagConstraints);
            gridBagConstraints.gridx = 1;
            jPanel.add((Component)new JLabel("" + kzj2.qoi.getValue()), gridBagConstraints);
            JCheckBox jCheckBox = new JCheckBox("", true);
            jCheckBox.setSelected(!kzj2.iNr);
            jCheckBox.addItemListener(kzj2);
            kzj2.qok = jCheckBox;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.gridx = 2;
            gridBagConstraints.fill = 0;
            jPanel.add((Component)jCheckBox, gridBagConstraints);
        }
    }

    private boolean a(dui dui2, dui[] duiArray) {
        assert (dui2 != null);
        assert (duiArray != null);
        for (int i2 = 0; i2 < duiArray.length; ++i2) {
            if (!dui2.getName().equals(duiArray[i2].getName())) continue;
            return false;
        }
        return true;
    }

    private void a(Class clazz, List list, boolean bl) {
        Class clazz2;
        Field[] fieldArray = clazz.getDeclaredFields();
        if (fieldArray != null) {
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                int n = fieldArray[i2].getModifiers();
                if (bl) {
                    if (!Modifier.isStatic(n) || !Modifier.isFinal(n) || !fieldArray[i2].getType().getName().equals("int")) continue;
                    list.add(fieldArray[i2]);
                    continue;
                }
                if (Modifier.isStatic(n) && Modifier.isFinal(n) || this.h(clazz.getName(), fieldArray[i2].getName(), fieldArray[i2].getType().getName())) continue;
                if (!this.a(clazz, fieldArray[i2])) {
                    lfn.b(4, "SFXMLClassReflector", "getFields() Field '" + fieldArray[i2].getName() + " does not contain get/set methods.");
                    continue;
                }
                list.add(fieldArray[i2]);
            }
        }
        if ((clazz2 = clazz.getSuperclass()) == null || clazz2.getName().equals(qoX)) {
            return;
        }
        this.a(clazz2, list, bl);
    }

    private boolean h(String string, String string2, String string3) {
        if (string3.equals("java.lang.Class")) {
            return true;
        }
        if (string3.equals("java.util.Set")) {
            return true;
        }
        if (string3.startsWith("spenefett.gamelogic.framework.object")) {
            return true;
        }
        if (string3.equals("spenefett.util.SFGUID")) {
            return true;
        }
        if (string3.equals("spenefett.util.SFTime")) {
            return true;
        }
        if (string.equals(qoY)) {
            if (string2.equals("MainEffect")) {
                return false;
            }
            if (string2.equals("RelationEffect")) {
                return false;
            }
            if (string2.equals("InheritDuration")) {
                return false;
            }
            if (string2.equals("AffectCamera")) {
                return false;
            }
            if (string2.equals("MaxAffectCameraDistance")) {
                return false;
            }
            if (string2.equals("AffectCameraPower")) {
                return false;
            }
            if (string2.equals("Duration")) {
                return false;
            }
            if (string2.equals("OverWriteStartTimeWithCurrentTime")) {
                return false;
            }
            return !string2.equals("EffectDelayTime");
        }
        return false;
    }

    private boolean a(Class clazz, Field field) {
        String string = clazz.getName().substring(clazz.getName().lastIndexOf(46) + 1, clazz.getName().length());
        String string2 = null;
        try {
            string2 = "get" + field.getName();
            if (field.getType().getName().equals("boolean")) {
                string2 = "is" + field.getName();
            }
            clazz.getMethod(string2, new Class[0]);
        }
        catch (Exception exception) {
            lfn.b(4, "SFXMLClassReflector", "containsGetSetMethods() Class '" + string + "' does not contain method '" + string2 + "'");
            return false;
        }
        try {
            string2 = "set" + field.getName();
            int n = this.f(field.getName(), field.getType().getName(), false);
            clazz.getMethod(string2, duj.Cr(n));
        }
        catch (Exception exception) {
            lfn.b(4, "SFXMLClassReflector", "containsGetSetMethods() Class '" + string + "' does not contain method '" + string2 + "'");
            return false;
        }
        return true;
    }

    private duj b(Field field) {
        Object object;
        int n = this.f(field.getName(), field.getType().getName(), false);
        int n2 = 1;
        switch (n) {
            case 1: 
            case 4: {
                object = (dug)this.pdS.get(field.getName());
                if (object == null) break;
                throw new Exception("Enumeration '" + field.getName() + "' was not found.");
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                break;
            }
            default: {
                throw new Exception("ValueType '" + duk.Cs(n) + "' is invalid.");
            }
        }
        object = new duj();
        ((duj)object).setName(field.getName());
        ((duj)object).Cp(n);
        ((duj)object).Cq(n2);
        return object;
    }

    private dui c(Field field) {
        int n = this.f(field.getName(), field.getType().getName(), true);
        int n2 = 0;
        switch (n) {
            case 6: {
                n2 = field.getInt(null);
                break;
            }
            default: {
                throw new Exception("ValueType '" + duk.Cs(n) + "' is invalid.");
            }
        }
        dui dui2 = new dui();
        dui2.setName(field.getName());
        dui2.setValue(n2);
        return dui2;
    }

    private int f(String string, String string2, boolean bl) {
        assert (string != null);
        assert (string2 != null);
        if (string2.equals("boolean")) {
            return 2;
        }
        if (string2.equals("double")) {
            return 3;
        }
        if (string2.equals("float")) {
            return 5;
        }
        if (string2.equals("int")) {
            if (bl) {
                return 6;
            }
            if (this.qpi) {
                return 6;
            }
            Object[] objectArray = new String[]{"Bitmask Multiselection", "Enumeration", "int"};
            Object var5_5 = null;
            String string3 = (String)JOptionPane.showInputDialog(this, "What is the int field '" + string + "'", "Specify property type", 3, null, objectArray, "int");
            if (string3 == null) {
                throw new Exception("ValueType of field '" + string + "' could not be determined.");
            }
            if (string3.equals("Bitmask Multiselection")) {
                return 1;
            }
            if (string3.equals("Enumeration")) {
                return 4;
            }
            return 6;
        }
        if (string2.equals("long")) {
            return 7;
        }
        if (string2.equals(String.class.getName())) {
            return 10;
        }
        if (string2.equals(ljq.class.getName())) {
            return 9;
        }
        if (string2.equals(ljp.class.getName())) {
            return 11;
        }
        if (string2.equals(lcq.class.getName())) {
            return 8;
        }
        throw new Exception("TypeName '" + string2 + "' is invalid.");
    }

    private static Class[] xY(String string) {
        Serializable serializable;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert (classLoader != null);
        String string2 = string.replace('.', '/');
        Enumeration<URL> enumeration = classLoader.getResources(string2);
        ArrayList<File> arrayList = new ArrayList<File>();
        while (enumeration.hasMoreElements()) {
            serializable = enumeration.nextElement();
            arrayList.add(new File(((URL)serializable).getFile()));
        }
        serializable = new ArrayList();
        for (File file : arrayList) {
            ((ArrayList)serializable).addAll(kzw.a(file, string));
        }
        return ((ArrayList)serializable).toArray(new Class[((ArrayList)serializable).size()]);
    }

    private static List<Class> a(File file, String string) {
        File[] fileArray;
        ArrayList<Class> arrayList = new ArrayList<Class>();
        if (!file.exists()) {
            return arrayList;
        }
        for (File file2 : fileArray = file.listFiles()) {
            if (file2.isDirectory()) {
                if (file2.getName().contains(".")) continue;
                arrayList.addAll(kzw.a(file2, string + "." + file2.getName()));
                continue;
            }
            if (!file2.getName().endsWith(".class")) continue;
            arrayList.add(Class.forName(string + '.' + file2.getName().substring(0, file2.getName().length() - 6)));
        }
        return arrayList;
    }

    static /* synthetic */ JPanel a(kzw kzw2) {
        return kzw2.qpe;
    }

    static /* synthetic */ boolean b(kzw kzw2) {
        return kzw2.qpa;
    }

    static /* synthetic */ JTextField c(kzw kzw2) {
        return kzw2.qpd;
    }

    static /* synthetic */ void a(kzw kzw2, String string) {
        kzw2.xV(string);
    }

    static /* synthetic */ void b(kzw kzw2, String string) {
        kzw2.xX(string);
    }

    static /* synthetic */ JComboBox d(kzw kzw2) {
        return kzw2.qpb;
    }

    static /* synthetic */ void c(kzw kzw2, String string) {
        kzw2.xU(string);
    }

    static /* synthetic */ void e(kzw kzw2) {
        kzw2.ekn();
    }

    static /* synthetic */ void f(kzw kzw2) {
        kzw2.eko();
    }

    static /* synthetic */ kzx g(kzw kzw2) {
        return kzw2.qoZ;
    }

    static /* synthetic */ List h(kzw kzw2) {
        return kzw2.qpf;
    }
}

