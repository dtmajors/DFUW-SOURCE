/*
 * Decompiled with CFR.
 */
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class mrw
extends JFrame {
    private JScrollPane ah;
    private JTable Eok;

    public mrw() {
        this.b();
    }

    private void b() {
        this.ah = new JScrollPane();
        this.Eok = new JTable();
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(1);
        this.setTitle("Variables List Reminder");
        Object[][] objectArray = new String[anl.a.Values.size()][];
        for (anl.a a2 : anl.a.Values) {
            objectArray[anl.a.getArrayPositionForParameter((anl.a)a2)] = new String[]{a2.name(), a2.Lj()};
        }
        this.Eok.setModel(new DefaultTableModel(this, objectArray, new String[]{"You want:", "You write:"}){
            Class[] Eoh;
            final /* synthetic */ mrw Eol;
            {
                this.Eol = mrw2;
                super(objectArray, objectArray2);
                this.Eoh = new Class[]{String.class, String.class};
            }

            public Class getColumnClass(int n) {
                return this.Eoh[n];
            }
        });
        this.Eok.setEnabled(false);
        this.Eok.setFocusable(false);
        this.Eok.getTableHeader().setReorderingAllowed(false);
        this.ah.setViewportView(this.Eok);
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ah, -1, 300, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ah, -1, 190, Short.MAX_VALUE));
        this.pack();
    }
}

