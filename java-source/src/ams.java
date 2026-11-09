/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ams
extends JDialog {
    private static les bzw;
    private static final long serialVersionUID = 1L;

    public ams() {
        this.setSize(new Dimension(800, 540));
        this.setTitle("Monster Adjuster 0.1");
        this.setResizable(false);
        JScrollPane jScrollPane = new JScrollPane();
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(jScrollPane, -2, 289, -2).addContainerGap(6, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(6).addComponent(jScrollPane, -2, 439, -2).addContainerGap(6, Short.MAX_VALUE)));
        JTree jTree = new JTree();
        jTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode(this, "r_Monsters"){
            final /* synthetic */ ams bAE;
            {
                this.bAE = ams2;
                super(object);
            }
        }));
        jScrollPane.setViewportView(jTree);
        this.getContentPane().setLayout(groupLayout);
        JMenuBar jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        JMenu jMenu = new JMenu("File");
        jMenuBar.add(jMenu);
        JMenuItem jMenuItem = new JMenuItem("Quit");
        jMenuItem.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ ams bAE;
            {
                this.bAE = ams2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                System.exit(0);
            }
        });
        jMenu.add(jMenuItem);
        this.a((DefaultMutableTreeNode)jTree.getModel().getRoot());
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        Object object;
        bzw = lea.enW();
        if (cug.fgG == 0) {
            object = new juf();
            ((juf)object).a("xml-files/gamelogicinfo/resourcetree.xml", bzw);
            cug.anZ();
        }
        object = bzw.acv(cug.fgG);
        this.a(defaultMutableTreeNode, bzw, (ler)object);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            if (les2.g(ler3) != null) {
                this.a(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
    }

    public static void main(String[] stringArray) {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new ams().setVisible(true);
            }
        });
    }
}

