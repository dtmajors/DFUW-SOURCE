/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class mmw
extends JInternalFrame {
    private JButton DNW;
    private JButton DNX;
    private JPanel DNY;
    private JButton DNZ;
    private JButton bI;
    private JButton bJ;
    private JPanel aa;
    private JPanel bN;
    private JScrollPane ah;
    private amf DNl = null;
    private aux DEC;
    private List<mmt> DOa = lcn.emv();
    private Map<String, eh> DOb = null;
    private Map<String, String> DOc = null;
    private static final String DOd = "no frame";

    public mmw() {
        this.b();
        this.c();
    }

    public mmw(aux aux2, amf amf2) {
        this.b();
        this.DNl = amf2;
        this.DEC = aux2;
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DNY = new JPanel();
        this.bN = new JPanel();
        this.bI = new JButton();
        this.bJ = new JButton();
        this.DNZ = new JButton();
        this.DNX = new JButton();
        this.DNW = new JButton();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Attachpoint Visualization");
        this.addInternalFrameListener(new InternalFrameListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                mmw.a(this.DOe, internalFrameEvent);
            }

            public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
            }
        });
        this.aa.setLayout(new BorderLayout());
        this.DNY.setLayout(new BoxLayout(this.DNY, 1));
        this.ah.setViewportView(this.DNY);
        this.aa.add((Component)this.ah, "Center");
        this.bN.setBorder(BorderFactory.createTitledBorder("Controls"));
        this.bI.setText("Select All");
        this.bI.addActionListener(new ActionListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmw.a(this.DOe, actionEvent);
            }
        });
        this.bJ.setText("Select None");
        this.bJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmw.b(this.DOe, actionEvent);
            }
        });
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmw.c(this.DOe, actionEvent);
            }
        });
        this.DNX.setText("Delete Selected");
        this.DNW.setText("Add New");
        GroupLayout groupLayout = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.bI).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bJ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DNX).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DNW).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE).addComponent(this.DNZ)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bI).addComponent(this.bJ).addComponent(this.DNZ).addComponent(this.DNX).addComponent(this.DNW)).addContainerGap(77, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.bN, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.aa, GroupLayout.Alignment.LEADING, -1, 746, Short.MAX_VALUE)).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, 452, Short.MAX_VALUE).addGap(18, 18, 18).addComponent(this.bN, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void h(ActionEvent actionEvent) {
        this.eFM();
    }

    private void i(ActionEvent actionEvent) {
        this.eFN();
    }

    private void aB(ActionEvent actionEvent) {
        this.eFP();
    }

    private void b(InternalFrameEvent internalFrameEvent) {
        this.eFO();
    }

    private void c() {
        if (this.DNl == null) {
            lfn.b(5, this.getClass().getSimpleName(), "initDialog() : NO MESHOBJECT!");
            return;
        }
        String string = this.w(this.DNl);
        this.DOb = ei.ao(string);
        if (this.DOb == null || this.DOb.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : Mesh [" + string + "] has no attachpoints!");
            return;
        }
        this.DNX.addActionListener(new ActionListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmw.a(this.DOe);
            }
        });
        this.DNW.addActionListener(new ActionListener(this){
            final /* synthetic */ mmw DOe;
            {
                this.DOe = mmw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmw.b(this.DOe);
            }
        });
        this.DOc = this.eFR();
        this.eFJ();
    }

    private void eFJ() {
        ArrayList<eh> arrayList = lcn.emv();
        arrayList.addAll(this.DOb.values());
        Collections.sort(arrayList);
        boolean bl = false;
        for (eh eh2 : arrayList) {
            this.a(eh2);
        }
    }

    private void a(eh eh2) {
        jrw jrw2;
        String string = eh2.getName();
        String string2 = this.DOc.get(string);
        if (string2 == null) {
            string2 = "xml/other/attachpoint_marker.xml";
        }
        if (!(jrw2 = new jrw(lcw.qLb + string2)).exists()) {
            lfn.b(5, this.getClass().getSimpleName(), "initDialog() : Could not find marker file: " + jrw2.getAbsolutePath());
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "initDialog() : Found Hardcoded Value for AP = " + eh2.getName() + ", AttachMarker = " + string2);
        mmt mmt2 = new mmt(this.DNl, eh2, this.DEC);
        mmt2.p(this.DEC);
        mmt2.CC(string2);
        this.DNY.add(mmt2);
        this.DOa.add(mmt2);
        this.DNY.updateUI();
    }

    private void eFK() {
        mov mov2 = new mov(null, true);
        mov2.setLocationRelativeTo(this);
        mov2.setVisible(true);
        String[] stringArray = mov2.eHY();
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; ++i) {
                int n;
                String string = stringArray[i];
                if (this.DOb.containsKey(string) && (n = JOptionPane.showInternalConfirmDialog(this, "This AttachPoint has already been created. Do you want to override the old attachpoint with this new one?")) != 0) continue;
                eh eh2 = new eh();
                eh2.setName(string);
                eh2.setFrameName(DOd);
                eh2.setRotation(new ljq());
                eh2.K(new ljq());
                if (this.DNl instanceof bvf) {
                    eh2.ac(0);
                } else {
                    eh2.ac(1);
                }
                this.DOb.put(eh2.getName(), eh2);
                this.a(eh2);
            }
        }
    }

    private void eFL() {
        ArrayList<mmt> arrayList = lcn.emv();
        for (mmt mmt2 : this.DOa) {
            if (!mmt2.isSelected()) continue;
            arrayList.add(mmt2);
        }
        for (mmt mmt2 : arrayList) {
            mmt2.zn(false);
            this.DOb.remove(mmt2.GP().getName());
            this.DOa.remove(mmt2);
            this.DNY.remove(mmt2);
        }
        this.DNY.updateUI();
    }

    private void eFM() {
        for (mmt mmt2 : this.DOa) {
            mmt2.zn(true);
        }
    }

    private void eFN() {
        for (mmt mmt2 : this.DOa) {
            mmt2.zn(false);
        }
    }

    private void eFO() {
        for (mmt mmt2 : this.DOa) {
            mmt2.eFG();
        }
    }

    private void eFP() {
        if (!this.eFQ()) {
            return;
        }
        kak kak2 = new kak();
        kak2.X(lea.eor());
        JOptionPane.showMessageDialog(this, "AttachPoints file saved");
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

    private String w(amf amf2) {
        String string = null;
        string = amf2 instanceof bvd ? ((bvd)this.DNl).getFileName() : amf2.getObjectDescriptionFilename();
        return string;
    }

    private Map<String, String> eFR() {
        Map<String, String> map = lcn.emw();
        map.put("AttachPoint Player NonBlock SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint Character Chest Center", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint Character Eye Center", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint Character Crouch Chest Center", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint Character Crouch Eye Center", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint_Pelvis Left", "xml/waw/racial_weapons/waw_sword_advanced_mirdain_01.xml");
        map.put("AttachPoint_Pelvis Right", "xml/waw/racial_weapons/waw_dagger_advanced_mirdain_01.xml");
        map.put("AttachPoint_Ribcage Back", "xml/waw/racial_weapons/waw_halberd_dwarf_01.xml");
        map.put("AttachPoint_Ribcage Back Bow", "xml/waw/waw_bow_01.xml");
        map.put("AttachPoint_Ribcage Back Staff", "xml/waw/racial_weapons/waw_staff_mahirim_02.xml");
        map.put("AttachPoint_Shield", "xml/waw/racial_weapons/waw_shield_advanced_mirdain_01.xml");
        map.put("AttachPoint_Weapon", "xml/waw/racial_weapons/waw_sword_advanced_mirdain_01.xml");
        map.put("AttachPoint_Weapon Arrow", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Weapon Bow", "xml/waw/waw_bow_01.xml");
        map.put("AttachPoint_Weapon Grenade", "xml/waw/waw_grenade_03.xml");
        map.put("AttachPoint_Weapon Halberd", "xml/waw/racial_weapons/waw_halberd_dwarf_01.xml");
        map.put("AttachPoint_Weapon Left", "xml/waw/racial_weapons/waw_dagger_intermediate_mirdain_01.xml");
        map.put("AttachPoint_Weapon Staff", "xml/waw/racial_weapons/waw_staff_mahirim_02.xml");
        map.put("AttachPoint_Weapon TwoHanded", "xml/waw/racial_weapons/waw_axe_2handed_advanced_alfar_02.xml");
        map.put("AttachPoints_Char Left Palm SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Right Palm SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Club Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Halberd Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Left Dagger Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Right Dagger Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Sword 2Hand Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoints_Char Sword Tip SFX", "xml/other/attachpoint_marker.xml");
        map.put("AttachPoint_Target Back 01", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 02", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 03", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 04", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 05", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 06", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 07", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 08", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 09", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Back 10", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 01", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 02", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 03", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 04", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 05", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 06", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 07", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 08", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 09", "xml/waw/waw_arrow_01.xml");
        map.put("AttachPoint_Target Front 10", "xml/waw/waw_arrow_01.xml");
        return map;
    }

    static /* synthetic */ void a(mmw mmw2, InternalFrameEvent internalFrameEvent) {
        mmw2.b(internalFrameEvent);
    }

    static /* synthetic */ void a(mmw mmw2, ActionEvent actionEvent) {
        mmw2.h(actionEvent);
    }

    static /* synthetic */ void b(mmw mmw2, ActionEvent actionEvent) {
        mmw2.i(actionEvent);
    }

    static /* synthetic */ void c(mmw mmw2, ActionEvent actionEvent) {
        mmw2.aB(actionEvent);
    }

    static /* synthetic */ void a(mmw mmw2) {
        mmw2.eFL();
    }

    static /* synthetic */ void b(mmw mmw2) {
        mmw2.eFK();
    }
}

