/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  nul
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class mjl
extends JMenu {
    private mji DCA;
    private JMenuItem DCL = new JMenuItem("Cascade");
    private JMenuItem DCM = new JMenuItem("Tile");
    private JMenuItem DCN = new JMenuItem("Restore Workspace");
    private JMenuItem DCO = new JMenuItem("Save Workspace");

    public mjl(mji mji2) {
        this.DCA = mji2;
        this.setText("Window");
        this.DCL.addActionListener(new ActionListener(this){
            final /* synthetic */ mjl DCP;
            {
                this.DCP = mjl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mjl.a(this.DCP).ezI();
            }
        });
        this.DCM.addActionListener(new ActionListener(this){
            final /* synthetic */ mjl DCP;
            {
                this.DCP = mjl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mjl.a(this.DCP).ezJ();
            }
        });
        this.DCN.addActionListener(new ActionListener(this){
            final /* synthetic */ mjl DCP;
            {
                this.DCP = mjl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                nul.m((aux)((aux)mjl.a(this.DCP).getParent().getParent().getParent().getParent().getParent().getParent()));
            }
        });
        this.DCO.addActionListener(new ActionListener(this){
            final /* synthetic */ mjl DCP;
            {
                this.DCP = mjl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                nul.l((aux)((aux)mjl.a(this.DCP).getParent().getParent().getParent().getParent().getParent().getParent()));
            }
        });
        this.addMenuListener(new MenuListener(this){
            final /* synthetic */ mjl DCP;
            {
                this.DCP = mjl2;
            }

            public void menuCanceled(MenuEvent menuEvent) {
            }

            public void menuDeselected(MenuEvent menuEvent) {
                this.DCP.removeAll();
            }

            public void menuSelected(MenuEvent menuEvent) {
                mjl.b(this.DCP);
            }
        });
    }

    private void ezM() {
        JInternalFrame[] jInternalFrameArray = this.DCA.getAllFrames();
        this.add(this.DCL);
        this.add(this.DCM);
        this.add(this.DCN);
        this.add(this.DCO);
        if (jInternalFrameArray.length > 0) {
            this.addSeparator();
        }
        this.DCL.setEnabled(jInternalFrameArray.length > 0);
        this.DCM.setEnabled(jInternalFrameArray.length > 0);
        for (int i = 0; i < jInternalFrameArray.length; ++i) {
            a a2 = new a(this, jInternalFrameArray[i]);
            a2.setState(i == 0);
            a2.addActionListener(new ActionListener(this){
                final /* synthetic */ mjl DCP;
                {
                    this.DCP = mjl2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    JInternalFrame jInternalFrame = ((a)actionEvent.getSource()).ezN();
                    if (jInternalFrame.isIcon()) {
                        try {
                            jInternalFrame.setIcon(false);
                        }
                        catch (PropertyVetoException propertyVetoException) {
                            propertyVetoException.printStackTrace();
                        }
                    }
                    jInternalFrame.moveToFront();
                    try {
                        jInternalFrame.setSelected(true);
                    }
                    catch (PropertyVetoException propertyVetoException) {
                        propertyVetoException.printStackTrace();
                    }
                }
            });
            a2.setIcon(jInternalFrameArray[i].getFrameIcon());
            this.add(a2);
        }
    }

    static /* synthetic */ mji a(mjl mjl2) {
        return mjl2.DCA;
    }

    static /* synthetic */ void b(mjl mjl2) {
        mjl2.ezM();
    }
}

