/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class laf
extends JFrame
implements KeyListener {
    private lau qrn = null;
    private ler qro = null;
    private les qrp = null;
    private List aLe = lcn.emv();
    private List qrq = lcn.emv();

    public laf(lau lau2, Point point) {
        this.qrn = lau2;
        JPanel jPanel = new JPanel();
        this.setContentPane(jPanel);
        this.setSize(300, 200);
        this.setLocation((int)point.getX() + 100, (int)point.getY() + 100);
        this.setVisible(true);
        this.addKeyListener(this);
    }

    public void a(lae lae2, ler ler2, les les2) {
        if (lae2 == null) {
            lfn.b(5, "SFXMLNodeContentDialog", "showNodeContent() XMLNode is null.");
            return;
        }
        if (ler2 == null) {
            lfn.b(5, "SFXMLNodeContentDialog", "showNodeContent() ListItem is null.");
            return;
        }
        if (les2 == null) {
            lfn.b(5, "SFXMLNodeContentDialog", "showNodeContent() ListItemTree is null.");
            return;
        }
        this.qro = ler2;
        this.qrp = les2;
        JPanel jPanel = null;
        if (ler2.getType() != 2) {
            jPanel = this.d(ler2);
        }
        if (jPanel != null) {
            this.setContentPane(new JScrollPane(jPanel));
            this.setSize(700, 400);
            this.pack();
            this.validate();
        } else {
            this.setContentPane(new JPanel());
        }
    }

    private void a(ler ler2, JPanel jPanel, GridBagConstraints gridBagConstraints) {
        JLabel jLabel = new JLabel("Type");
        JTextField jTextField = new JTextField(10);
        JLabel jLabel2 = new JLabel("Name");
        JTextField jTextField2 = new JTextField(25);
        JLabel jLabel3 = new JLabel("Description");
        JTextField jTextField3 = new JTextField(25);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
    }

    private JPanel d(ler ler2) {
        int n;
        this.aLe.clear();
        this.qrq.clear();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(gridBagLayout);
        Class<?> clazz = ler2.getClass();
        Field[] fieldArray = clazz.getSuperclass().getDeclaredFields();
        int n2 = 0;
        for (n = 0; n < fieldArray.length; ++n) {
            fieldArray[n].setAccessible(true);
            if ((fieldArray[n].getModifiers() & 1) != 0 || (fieldArray[n].getModifiers() & 8) != 0 || (fieldArray[n].getModifiers() & 0x10) != 0 || fieldArray[n].getName().equals("Out")) continue;
            this.a(gridBagConstraints, n2, jPanel, ler2, fieldArray[n]);
            ++n2;
            this.aLe.add(fieldArray[n]);
        }
        fieldArray = clazz.getDeclaredFields();
        for (n = 0; n < fieldArray.length; ++n) {
            fieldArray[n].setAccessible(true);
            if ((fieldArray[n].getModifiers() & 1) != 0 || (fieldArray[n].getModifiers() & 8) != 0 || (fieldArray[n].getModifiers() & 0x10) != 0 || fieldArray[n].getName().equals("Out")) continue;
            this.a(gridBagConstraints, n2, jPanel, ler2, fieldArray[n]);
            ++n2;
            this.aLe.add(fieldArray[n]);
        }
        JButton jButton = new JButton("Update node");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ laf qrr;
            {
                this.qrr = laf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
        gridBagConstraints.anchor = 12;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(15, 5, 5, 5);
        jPanel.add((Component)jButton, gridBagConstraints);
        return jPanel;
    }

    private void a(GridBagConstraints gridBagConstraints, int n, JPanel jPanel, ler ler2, Field field) {
        Object object = null;
        try {
            object = field.get(ler2);
        }
        catch (Exception exception) {
            lfn.b(5, "SFXMLNodeContentDialog", "addComponentsForField() Exception: " + exception);
            object = null;
        }
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = n;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)new JLabel(field.getName()), gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        if (object != null) {
            String string = field.getName();
            String string2 = this.d(string, object);
            JTextField jTextField = new JTextField();
            jTextField.setColumns(20);
            jTextField.setText(string2);
            jPanel.add((Component)jTextField, gridBagConstraints);
            this.qrq.add(jTextField);
        } else {
            Class<?> clazz = field.getType();
            if (clazz.getName().equals("java.lang.String")) {
                JTextField jTextField = new JTextField();
                jTextField.setColumns(20);
                jTextField.setText(null);
                jPanel.add((Component)jTextField, gridBagConstraints);
                this.qrq.add(jTextField);
            } else {
                jPanel.add((Component)new JLabel("null"), gridBagConstraints);
                this.qrq.add(null);
            }
        }
    }

    private String d(String string, Object object) {
        assert (string != null);
        assert (object != null);
        if (string.equals("ResistanceInfos")) {
            dcg[] dcgArray = (dcg[])object;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < dcgArray.length; ++i2) {
                stringBuilder.append(dcgArray[i2].bjp());
                if (i2 >= dcgArray.length - 1) continue;
                stringBuilder.append(", ");
            }
            return stringBuilder.toString();
        }
        if (string.equals("ProtectionType")) {
            int n = (Integer)object;
            return ep.aM((int)n);
        }
        if (string.equals("Type") || string.equals("Name") || string.equals("ChildOrder")) {
            return object.toString();
        }
        lfn.b(2, "SFXMLNodeContentDialog", "getFieldValue() Missing check for property: '" + string + "'");
        return object.toString();
    }

    private void eld() {
        lfn.b(0, "SFXMLNodeContentDialog", "showParentNodeContent() ...");
    }

    private void ele() {
        lfn.b(0, "SFXMLNodeContentDialog", "showPreviousSiblingNodeContent() ...");
    }

    private void elf() {
        lfn.b(0, "SFXMLNodeContentDialog", "showNextSiblingNodeContent() ...");
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 38) {
            this.eld();
        } else if (keyEvent.getKeyCode() == 37) {
            this.ele();
        } else if (keyEvent.getKeyCode() == 39) {
            this.elf();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}

