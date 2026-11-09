/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mxg
extends mxf {
    private aux DCH = null;
    private cju oTP = lea.epr();
    private final String ETt = "xml-files/gamelogicinfo/tasks.xml";
    private final jvt ETu = new jvt();
    private final Vector<String> ETv = new Vector();
    private final String EgY = "Resource";
    private final Vector<String> ETw = new Vector();
    private final Vector<String> ETx = new Vector();
    private cjr ETy = null;

    public mxg() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Options");
        jMenu.setMnemonic('o');
        jMenuBar.add(jMenu);
        JMenuItem jMenuItem = new JMenuItem("Save");
        jMenuItem.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxg.a(this.ETz).uy(lcw.qLb + "xml-files/gamelogicinfo/tasks.xml");
            }
        });
        jMenuItem.setToolTipText("Saves the task file.");
        jMenuItem.setMnemonic('s');
        jMenu.add(jMenuItem);
        this.setJMenuBar(jMenuBar);
        this.eMq();
        this.eMr();
    }

    private void eMq() {
        String string3;
        cjo[] cjoArray;
        this.ESK.setEnabled(false);
        this.ESK.setEditable(false);
        this.ESO.setEditable(false);
        this.ESO.setEnabled(false);
        this.eSJ();
        this.EQz.setRowSelectionAllowed(true);
        for (cjo cjo2 : cjoArray = cjo.values()) {
            if (cjo2 == cjo.BASE) continue;
            this.ETq.addItem(cjo2.name());
        }
        lae lae2 = new lae(16, 0, "Items");
        ler ler2 = lea.enW().eqq();
        this.a(lae2, lea.enW(), ler2);
        Collections.sort(this.ETw);
        for (String string2 : this.ETw) {
            this.ESV.addItem(string2);
        }
        lae lae3 = new lae(16, 0, "Skill");
        ler ler3 = lea.enZ().eqq();
        this.b(lae3, lea.enZ(), ler3);
        Collections.sort(this.ETx);
        for (String string3 : this.ETx) {
            this.ESX.addItem(string3);
        }
        Vector vector = this.eSa();
        this.ESY.setModel(new DefaultComboBoxModel(vector));
        string3 = this.oTP.eEn;
        this.ETk.setText(string3);
    }

    private void eMr() {
        this.ETk.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void focusLost(FocusEvent focusEvent) {
                lea.epr().eEn = this.ETz.ETk.getText();
            }
        });
        this.ETb.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mxg.b(this.ETz) == null) {
                    return;
                }
                mxg.b((mxg)this.ETz).eEi = this.ETz.ETb.getText();
            }
        });
        this.ESY.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (mxg.b(this.ETz) == null) {
                    return;
                }
                mxg.b((mxg)this.ETz).eEj = this.ETz.ESY.getSelectedItem().toString();
            }
        });
        this.ETq.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                cjo cjo2 = cjo.getTriggerType(this.ETz.ETq.getSelectedItem().toString());
                mxg.a(this.ETz, cjo2);
                switch (cjo2) {
                    case EQUIP_UNSHEATH: {
                        cjh cjh2 = new cjh();
                        cjh2.ayN = cjr2.eDE.ayN;
                        cjh2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                        break;
                    }
                    case SKILL: {
                        cjn cjn2 = new cjn();
                        cjn2.ayN = cjr2.eDE.ayN;
                        cjn2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                        cjn2.SkillType = lea.enZ().getType(this.ETz.ESX.getSelectedItem().toString());
                        cjn2.eAg = Boolean.valueOf(this.ETz.ESR.getSelectedItem().toString());
                        break;
                    }
                    case KILL: {
                        cjj cjj2 = new cjj();
                        cjj2.ayN = cjr2.eDE.ayN;
                        cjj2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                    }
                }
            }
        });
        this.ESV.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                switch (cjr2.eDE.aPY()) {
                    case EQUIP_UNSHEATH: {
                        cjh cjh2 = (cjh)cjr2.eDE;
                        cjh2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                        break;
                    }
                    case SKILL: {
                        cjn cjn2 = (cjn)cjr2.eDE;
                        cjn2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                        break;
                    }
                    case KILL: {
                        cjj cjj2 = (cjj)cjr2.eDE;
                        cjj2.ResourceType = lea.enW().getType(this.ETz.ESV.getSelectedItem().toString());
                    }
                }
            }
        });
        this.ESX.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                switch (cjr2.eDE.aPY()) {
                    case SKILL: {
                        cjn cjn2 = (cjn)cjr2.eDE;
                        cjn2.SkillType = lea.enZ().getType(this.ETz.ESX.getSelectedItem().toString());
                    }
                }
            }
        });
        this.ESR.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                switch (cjr2.eDE.aPY()) {
                    case SKILL: {
                        cjn cjn2 = (cjn)cjr2.eDE;
                        cjn2.eAg = Boolean.valueOf(this.ETz.ESR.getSelectedItem().toString());
                    }
                }
            }
        });
        this.ESL.addActionListener(new ActionListener(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                switch (cjr2.eDE.aPY()) {
                    case EQUIP_UNSHEATH: {
                        cjh cjh2 = (cjh)cjr2.eDE;
                        cjh2.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
                        break;
                    }
                    case SKILL: {
                        cjn cjn2 = (cjn)cjr2.eDE;
                        cjn2.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
                        break;
                    }
                    case KILL: {
                        cjj cjj2 = (cjj)cjr2.eDE;
                        cjj2.ayN = Integer.parseInt(this.ETz.ESL.getSelectedItem().toString());
                    }
                }
            }
        });
        this.ETc.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mxg.b(this.ETz) == null) {
                    return;
                }
            }
        });
        this.ETf.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 != null) {
                    Object object;
                    mxg.a(this.ETz, cjr2);
                    if (mouseEvent.getClickCount() == 2) {
                        String string = JOptionPane.showInputDialog((Component)mxg.d(this.ETz), "Edit Task Name", cjr2.Name);
                        if (string != null && !string.isEmpty() && !string.equals(cjr2.Name)) {
                            cjr2.Name = string;
                            mxg.e(this.ETz);
                        }
                        return;
                    }
                    Object object2 = cjr2.eEi;
                    this.ETz.ETb.setText((String)object2);
                    if (cjr2.eEj != null) {
                        this.ETz.ESY.setSelectedItem(cjr2.eEj);
                    }
                    object2 = cjr2.eDE;
                    this.ETz.ETq.setSelectedItem(((cjf)object2).aPY().name());
                    mxg.a(this.ETz, ((cjf)object2).aPY());
                    switch (((cjf)object2).aPY()) {
                        case EQUIP_UNSHEATH: {
                            object = (cjh)object2;
                            this.ETz.ESV.setSelectedItem(lea.enW().getName(((cjh)object).ResourceType));
                            this.ETz.ESL.setSelectedItem(String.valueOf(((cjh)object).ayN));
                            break;
                        }
                        case SKILL: {
                            object = (cjn)object2;
                            this.ETz.ESV.setSelectedItem(lea.enW().getName(((cjn)object).ResourceType));
                            this.ETz.ESX.setSelectedItem(lea.enZ().getName(((cjn)object).SkillType));
                            this.ETz.ESR.setSelectedItem(String.valueOf(((cjn)object).eAg));
                            this.ETz.ESL.setSelectedItem(String.valueOf(((cjn)object).ayN));
                            break;
                        }
                        case KILL: {
                            object = (cjj)object2;
                            this.ETz.ESV.setSelectedItem(lea.enW().getName(((cjj)object).ResourceType));
                            this.ETz.ESL.setSelectedItem(String.valueOf(((cjj)object).ayN));
                            break;
                        }
                    }
                    ((DefaultTableModel)this.ETz.EQz.getModel()).getDataVector().clear();
                    object = cjr2.bhg;
                    if (object != null) {
                        Iterator<E> iterator = object.iterator();
                        while (iterator.hasNext()) {
                            cjs cjs2 = (cjs)iterator.next();
                            String string = cjs2.eEa;
                            List<cjt> list = cjs2.aCN;
                            for (cjt cjt2 : list) {
                                String string2 = lea.enW().getName(cjt2.ResourceType);
                                int n = cjt2.ayN;
                                mxg.a(this.ETz, string2, n, string);
                            }
                        }
                    }
                    this.ETz.EQz.revalidate();
                }
            }
        });
        this.ETr.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                if (cjr2.adk == 0) {
                    return;
                }
                cjr cjr3 = (cjr)mxg.f(this.ETz).aQi().get(cjr2.adk - 1);
                if (cjr3 == null) {
                    return;
                }
                --cjr2.adk;
                ++cjr3.adk;
                mxg.f(this.ETz).aQi().put(cjr2.adk, cjr2);
                mxg.f(this.ETz).aQi().put(cjr3.adk, cjr3);
                mxg.e(this.ETz);
                this.ETz.ETf.setSelectedIndex(cjr2.adk);
            }
        });
        this.ESQ.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                if (cjr2.adk == mxg.f(this.ETz).aQi().size() + 1) {
                    return;
                }
                cjr cjr3 = (cjr)mxg.f(this.ETz).aQi().get(cjr2.adk + 1);
                if (cjr3 == null) {
                    return;
                }
                ++cjr2.adk;
                --cjr3.adk;
                mxg.f(this.ETz).aQi().put(cjr2.adk, cjr2);
                mxg.f(this.ETz).aQi().put(cjr3.adk, cjr3);
                mxg.e(this.ETz);
                this.ETz.ETf.setSelectedIndex(cjr2.adk);
            }
        });
        this.ESN.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                int n = JOptionPane.showConfirmDialog((Component)mxg.d(this.ETz), "WARNING : Do you want to delete permantly task : " + cjr2.Name, "Warning", 2);
                if (n != 0) {
                    return;
                }
                mxg.f(this.ETz).aQi().remove(cjr2.adk);
                SortedMap<Integer, cjr> sortedMap = lcn.emD();
                int n2 = 0;
                for (cjr cjr3 : mxg.f(this.ETz).aQi().values()) {
                    cjr3.adk = n2;
                    sortedMap.put(n2, cjr3);
                    ++n2;
                }
                mxg.f(this.ETz).aQi().clear();
                mxg.f(this.ETz).aQi().putAll(sortedMap);
                mxg.e(this.ETz);
            }
        });
        this.ESM.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                String string = JOptionPane.showInputDialog((Component)mxg.d(this.ETz), (Object)"Task Name");
                if (string != null && !string.trim().isEmpty()) {
                    cjr cjr2 = new cjr();
                    cjr2.adk = mxg.f(this.ETz).aQi().size();
                    cjr2.Name = string;
                    cjr2.eDE = new cjn();
                    mxg.f(this.ETz).aQi().put(cjr2.adk, cjr2);
                    mxg.e(this.ETz);
                }
            }
        });
        this.ESN.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                mxg.f(this.ETz).aQi().remove(cjr2.adk);
                mxg.e(this.ETz);
            }
        });
        this.EgQ.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                mxg.g(this.ETz);
            }
        });
        this.DFV.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                mxg.h(this.ETz);
            }
        });
        AbstractAction abstractAction = new AbstractAction(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                cjr cjr2 = mxg.c(this.ETz);
                if (cjr2 == null) {
                    return;
                }
                mxh mxh2 = (mxh)actionEvent.getSource();
                if (mxh2.getColumn() != 2) {
                    return;
                }
                System.out.println("Row   : " + mxh2.getRow());
                System.out.println("Column: " + mxh2.getColumn());
                System.out.println("Old   : " + mxh2.getOldValue());
                System.out.println("New   : " + mxh2.getNewValue());
                mxg.b(this.ETz, cjr2);
            }
        };
        mxh mxh2 = new mxh(this.EQz, abstractAction);
    }

    private void a(cjo cjo2) {
        switch (cjo2) {
            case EQUIP_UNSHEATH: {
                this.ESV.setEnabled(true);
                this.ESL.setEnabled(true);
                this.ESO.setEnabled(false);
                this.ESX.setEnabled(false);
                this.ESR.setEnabled(false);
                this.ETc.setEnabled(false);
                break;
            }
            case SKILL: {
                this.ESV.setEnabled(true);
                this.ESL.setEnabled(true);
                this.ESX.setEnabled(true);
                this.ESR.setEnabled(true);
                this.ETc.setEnabled(true);
                this.ESO.setEnabled(false);
                break;
            }
            case KILL: {
                this.ESV.setEnabled(true);
                this.ESL.setEnabled(true);
                this.ESX.setEnabled(false);
                this.ESR.setEnabled(false);
                this.ETc.setEnabled(true);
                this.ESO.setEnabled(false);
            }
        }
    }

    private void eSJ() {
        this.ETv.clear();
        SortedMap<Integer, cjr> sortedMap = this.oTP.aQi();
        for (Map.Entry entry : sortedMap.entrySet()) {
            cjr cjr2 = (cjr)entry.getValue();
            this.ETv.add(cjr2.Name);
        }
        this.ETf.setListData(this.ETv);
        this.ETf.revalidate();
    }

    private void eSc() {
        cjr cjr2 = this.eSK();
        if (cjr2 == null) {
            return;
        }
        mqv mqv2 = new mqv((Frame)this.DCH, false, "r_Items", new lgx(this){
            final /* synthetic */ mxg ETz;
            {
                this.ETz = mxg2;
            }

            public void Ad(String string) {
                mxg.a(this.ETz, string, 1, "");
                this.ETz.EQz.revalidate();
            }
        });
        mqv2.setLocationRelativeTo(this);
        mqv2.zM(false);
        mqv2.setVisible(true);
    }

    private void a(cjr cjr2) {
        if (cjr2.bhg == null) {
            cjr2.bhg = lcn.emv();
        }
        cjr2.bhg.clear();
        Vector<Vector> vector = ((DefaultTableModel)this.EQz.getModel()).getDataVector();
        for (Vector vector2 : vector) {
            String string = vector2.get(0).toString();
            int n = Integer.parseInt(vector2.get(1).toString());
            cjt cjt2 = new cjt();
            cjt2.ResourceType = lea.enW().getType(string);
            cjt2.ayN = n;
            String string2 = vector2.get(2).toString();
            if (string2 == null) {
                string2 = "";
            }
            boolean bl = false;
            for (cjs cjs2 : cjr2.bhg) {
                if (!cjs2.eEa.equalsIgnoreCase(string2)) continue;
                List<cjt> list = cjs2.aCN;
                if (list == null) {
                    list = lcn.emv();
                }
                list.add(cjt2);
                bl = true;
                break;
            }
            if (bl) continue;
            cjs cjs3 = new cjs();
            cjs3.eEa = string2;
            cjs3.aCN = lcn.emv();
            cjs3.aCN.add(cjt2);
            cjr2.bhg.add(cjs3);
        }
    }

    private void i(String string, int n, String string2) {
        if (string == null) {
            return;
        }
        Vector<Object> vector = new Vector<Object>();
        vector.add(string);
        vector.add(n);
        vector.add(string2);
        ((DefaultTableModel)this.EQz.getModel()).addRow(vector);
    }

    private void eSb() {
        int n = this.EQz.getSelectedRow();
        if (n < 0) {
            return;
        }
        ((DefaultTableModel)this.EQz.getModel()).removeRow(n);
        this.EQz.revalidate();
    }

    private cjr eSK() {
        int n = this.ETf.getSelectedIndex();
        if (n == -1) {
            return null;
        }
        return (cjr)this.oTP.aQi().get(n);
    }

    private Vector eSa() {
        Map map = lea.eoc();
        Vector<String> vector = new Vector<String>();
        vector.add("NONE");
        Iterator iterator = map.values().iterator();
        Object var4_4 = null;
        String string = null;
        while (iterator.hasNext()) {
            var4_4 = iterator.next();
            if (!(var4_4 instanceof String) || (string = (String)var4_4).contains("test") || string.contains("anim") || string.contains("env")) continue;
            vector.add(string);
        }
        Collections.sort(vector);
        return vector;
    }

    private void a(lae lae2, les les2, ler ler2) {
        int n = les2.getType("Resource");
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                lae lae3;
                if (les2.g(ler3) == null) {
                    lae3 = new lae(15, ler3.getType(), ler3.getName());
                    this.ETw.add(ler3.getName());
                } else {
                    lae3 = new lae(15, ler3.getType(), ler3.getName());
                    this.ETw.add(ler3.getName());
                    this.a(lae3, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
    }

    private void b(lae lae2, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            lae lae3;
            if (les2.g(ler3) == null) {
                lae3 = new lae(15, ler3.getType(), ler3.getName());
                if (ler3.getName().startsWith("s_")) {
                    this.ETx.add(ler3.getName());
                }
            } else {
                lae3 = new lae(15, ler3.getType(), ler3.getName());
                if (ler3.getName().startsWith("s_")) {
                    this.ETx.add(ler3.getName());
                }
                this.b(lae3, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
    }

    public void w(aux aux2) {
        this.DCH = aux2;
    }

    static /* synthetic */ jvt a(mxg mxg2) {
        return mxg2.ETu;
    }

    static /* synthetic */ cjr b(mxg mxg2) {
        return mxg2.ETy;
    }

    static /* synthetic */ cjr c(mxg mxg2) {
        return mxg2.eSK();
    }

    static /* synthetic */ void a(mxg mxg2, cjo cjo2) {
        mxg2.a(cjo2);
    }

    static /* synthetic */ cjr a(mxg mxg2, cjr cjr2) {
        mxg2.ETy = cjr2;
        return mxg2.ETy;
    }

    static /* synthetic */ aux d(mxg mxg2) {
        return mxg2.DCH;
    }

    static /* synthetic */ void e(mxg mxg2) {
        mxg2.eSJ();
    }

    static /* synthetic */ void a(mxg mxg2, String string, int n, String string2) {
        mxg2.i(string, n, string2);
    }

    static /* synthetic */ cju f(mxg mxg2) {
        return mxg2.oTP;
    }

    static /* synthetic */ void g(mxg mxg2) {
        mxg2.eSc();
    }

    static /* synthetic */ void h(mxg mxg2) {
        mxg2.eSb();
    }

    static /* synthetic */ void b(mxg mxg2, cjr cjr2) {
        mxg2.a(cjr2);
    }
}

