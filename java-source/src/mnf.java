/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.jgraph.event.GraphModelEvent
 *  com.jgraph.event.GraphModelListener
 *  com.jgraph.event.GraphSelectionEvent
 *  com.jgraph.event.GraphSelectionListener
 *  com.jgraph.graph.DefaultPort
 *  com.jgraph.graph.Edge
 *  com.jgraph.graph.GraphConstants
 *  com.jgraph.graph.GraphModel
 *  com.jgraph.graph.Port
 *  dqk
 *  dta
 *  lcr
 *  lcw
 */
import com.jgraph.event.GraphModelEvent;
import com.jgraph.event.GraphModelListener;
import com.jgraph.event.GraphSelectionEvent;
import com.jgraph.event.GraphSelectionListener;
import com.jgraph.graph.DefaultPort;
import com.jgraph.graph.Edge;
import com.jgraph.graph.GraphConstants;
import com.jgraph.graph.GraphModel;
import com.jgraph.graph.Port;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.KeyEventDispatcher;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.TransferHandler;
import javax.swing.tree.MutableTreeNode;

public class mnf
extends mkx
implements GraphModelListener,
GraphSelectionListener,
KeyEventDispatcher,
ActionListener,
mxv,
mxx {
    private String DOn = "Game Logic Relation GUI";
    private aux DEC = null;
    private DropTarget DOo = null;
    private myc DOp = null;
    private int DOq = 1;
    Object DOr = null;
    private mng DOs = null;
    private mnc DOt;
    private JToolBar DOu;
    private Action DOv;
    private Action DOw;
    private Action DOx;
    private Action DOy;
    private Action DOz;
    private Action DOA;
    private Action DOB;
    private Action DOC;
    private Action DOD;
    private Action DOE;
    private String pEh = lcw.qLb + "worldbuilder/" + "toolbarButtonGraphics" + "/" + "general" + "/";
    private lfn ga = lfn.eqw();
    private int DOF = 20;
    private int DOG = 20;
    private int DOH = 4;
    private List DOI = lcn.emv();
    private b DOJ = null;

    public mnf() {
        super(false);
        this.init();
    }

    private void init() {
        this.setClosable(true);
        JPanel jPanel = this.DGa;
        ((Component)jPanel).setBackground(new Color(10, 55, 131));
        this.setBackground(new Color(10, 55, 131));
        this.DOt = new mnc((GraphModel)new mne());
        this.DOt.p(this.DEC);
        this.DOt.getSelectionModel().addGraphSelectionListener((GraphSelectionListener)this);
        this.DOt.getModel().addGraphModelListener((GraphModelListener)this);
        this.DOu = this.eFX();
        JScrollPane jScrollPane = new JScrollPane((Component)((Object)this.DOt));
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)this.DOu, "North");
        jPanel.add((Component)jScrollPane, "Center");
        this.DOp = new myc();
        this.DOo = new DropTarget((Component)((Object)this.DOt), this.DOq, this.DOp, true);
        this.setTransferHandler(new myg("[ObjectSpace]"));
        this.setDropTarget(this.DOo);
        this.DOJ = new b(this);
        this.DOt.addMouseListener(this.DOJ);
        this.DOs = new mng(this);
        this.setTitle(this.DOn);
        this.setPreferredSize(new Dimension(600, 600));
        this.setLocation(new Point(100, 100));
        this.setResizable(true);
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DOt.p(this.DEC);
    }

    @Override
    public void a(btk btk2, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropObject called");
        this.b(btk2);
    }

    @Override
    public void a(dta dta2, double d2, double d3) {
        ArrayList arrayList = new ArrayList(dta2.bzr());
        this.cu(arrayList);
        this.ct(dta2.bzq());
        lfn.b(2, this.getClass().getName(), "GOT THE DROP OBJECT! ->" + dta2);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.processKeyEvent(keyEvent);
        return false;
    }

    public void graphChanged(GraphModelEvent graphModelEvent) {
    }

    public void b(btk btk2) {
        if (btk2 == null || btk2.getGUID() == null) {
            lfn.b(5, this.getClass().getName(), "Could not Add Object:" + btk2);
            return;
        }
        if (this.DOI != null) {
            FontMetrics fontMetrics = this.DOt.getFontMetrics(this.DOt.getFont());
            double d2 = (double)this.DOI.size() / (double)this.DOH;
            int n = (int)Math.ceil(d2);
            int n2 = 0;
            n2 = this.DOI.size() % this.DOH;
            lfn.print("Nr GraphObjects=" + this.DOI.size() + "Columns = " + this.DOH + ", Rows=" + n + " Cells of Last Row:" + n2);
            this.DOI.add(btk2);
            Dimension dimension = new Dimension(200, fontMetrics.getHeight() + this.DOG);
            int n3 = 30 + n2 * (dimension.width + 20);
            int n4 = 30 + n * (dimension.height + 20);
            this.a((amf)btk2, new Point(n3, n4), new Dimension(dimension.width, dimension.height));
        } else {
            lfn.b(5, this.getClass().getName(), "Can not add Object to null List!");
        }
    }

    public void ct(List list) {
        lfn.print("addRelations");
        if (list.isEmpty()) {
            lfn.b(4, this.getClass().getName(), "Empty Realtion List!");
        }
        dul dul2 = null;
        for (int i = 0; i < list.size(); ++i) {
            dul2 = (dul)list.get(i);
            mnd mnd2 = this.up(dul2.Bq());
            mnd mnd3 = this.up(dul2.Br());
            if (mnd2 != null && mnd3 != null) {
                lfn.b(0, "SpeneGraphPanel", "addRelations() Connecting relations");
                this.DOt.a((Port)mnd2.getChildAt(0), (Port)mnd3.getChildAt(0), dul2.toString(), false);
                continue;
            }
            lfn.b(5, "SpeneGraphPanel", "addRelations() SourceCell and TargetCell is null!");
        }
    }

    public void cu(List list) {
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                this.b((btk)list.get(i));
            }
        }
    }

    private void eFW() {
        Object[] objectArray = this.DOt.getRoots();
        objectArray = this.DOt.getDescendants(objectArray);
        this.DOt.getModel().remove(objectArray);
        this.DOt.graphDidChange();
    }

    private Dimension cv(List list) {
        btk btk2 = null;
        FontMetrics fontMetrics = this.DOt.getFontMetrics(this.DOt.getFont());
        Dimension dimension = new Dimension(0, 0);
        for (int i = 0; i < list.size(); ++i) {
            btk2 = (btk)list.get(i);
            if (dimension.width >= fontMetrics.stringWidth(btk2.getObjectDescriptionFilename())) continue;
            dimension.setSize(fontMetrics.stringWidth(btk2.getObjectDescriptionFilename()), 0);
        }
        dimension.setSize(dimension.width + this.DOF, fontMetrics.getHeight() + this.DOG);
        return dimension;
    }

    private Dimension CD(String string) {
        FontMetrics fontMetrics = this.DOt.getFontMetrics(this.DOt.getFont());
        return new Dimension(fontMetrics.stringWidth(string) + this.DOF, fontMetrics.getHeight() + this.DOG);
    }

    private mnd up(ldv ldv2) {
        Object[] objectArray = this.DOt.getRoots();
        for (int i = 0; i < objectArray.length; ++i) {
            if (objectArray[i] instanceof mnd) {
                mnd mnd2 = (mnd)((Object)objectArray[i]);
                if (!mnd2.oq().equals(ldv2)) continue;
                lfn.b(0, "SpeneGraphPanel", "getObject() Returning cell  " + mnd2.getUserObject());
                return mnd2;
            }
            lfn.b(5, "SpeneGraphPanel", "getObject() Current cell is not a SFGraphCell; " + objectArray[i].toString());
        }
        lfn.b(0, "SpeneGraphPanel", "getObject() Unable to find cell with ObjectGUID = " + ldv2.toString());
        return null;
    }

    private void a(amf amf2, Point point, Dimension dimension) {
        mnd mnd2 = new mnd((btk)amf2);
        mnd2.add((MutableTreeNode)new DefaultPort());
        Map map = GraphConstants.createMap();
        GraphConstants.setBounds((Map)map, (Rectangle)new Rectangle(point, dimension));
        GraphConstants.setBorderColor((Map)map, (Color)Color.black);
        GraphConstants.setBackground((Map)map, (Color)Color.gray);
        GraphConstants.setOpaque((Map)map, (boolean)true);
        Hashtable<mnd, Map> hashtable = new Hashtable<mnd, Map>();
        hashtable.put(mnd2, map);
        this.DOt.getModel().insert(new Object[]{mnd2}, hashtable, null, null, null);
    }

    public void valueChanged(GraphSelectionEvent graphSelectionEvent) {
        this.DOr = graphSelectionEvent.getCell();
        this.DOy.setEnabled(this.DOt.getSelectionCount() > 1);
        boolean bl = !this.DOt.isSelectionEmpty();
        this.DOx.setEnabled(bl);
        this.DOz.setEnabled(bl);
        this.DOA.setEnabled(bl);
        this.DOB.setEnabled(bl);
        this.DOD.setEnabled(bl);
        this.DOC.setEnabled(bl);
    }

    private JToolBar eFX() {
        JToolBar jToolBar = new JToolBar();
        jToolBar.setFloatable(false);
        ImageIcon imageIcon = null;
        imageIcon = new ImageIcon(this.pEh + "New16.gif");
        Action action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).e(new Point(10, 10));
            }
        };
        jToolBar.add(this.a(action, "New"));
        imageIcon = new ImageIcon(this.pEh + "Refresh16.gif");
        action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.b(this.DOK);
                this.DOK.cu(mnf.c(this.DOK));
            }
        };
        jToolBar.add(this.a(action, "Refresh"));
        imageIcon = new ImageIcon(this.pEh + "ConnectOn.gif");
        action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                ImageIcon imageIcon = null;
                mnf.a(this.DOK).setPortsVisible(!mnf.a(this.DOK).isPortsVisible());
                imageIcon = mnf.a(this.DOK).isPortsVisible() ? new ImageIcon(mnf.d(this.DOK) + "ConnectOn.gif") : new ImageIcon(mnf.d(this.DOK) + "ConnectOff.gif");
                this.putValue("SmallIcon", imageIcon);
            }
        };
        jToolBar.add(this.a(action, "Toggle connect mode"));
        jToolBar.addSeparator();
        imageIcon = new ImageIcon(this.pEh + "Undo16.gif");
        this.DOv = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        };
        this.DOv.setEnabled(false);
        jToolBar.add(this.a(this.DOv, "Undo"));
        imageIcon = new ImageIcon(this.pEh + "Redo16.gif");
        this.DOw = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        };
        this.DOw.setEnabled(false);
        jToolBar.add(this.a(this.DOw, "Redo"));
        jToolBar.addSeparator();
        this.DOt.getTransferHandler();
        action = TransferHandler.getCopyAction();
        imageIcon = new ImageIcon(this.pEh + "Copy16.gif");
        action.putValue("SmallIcon", imageIcon);
        this.DOD = new a(this, action);
        jToolBar.add(this.a(this.DOD, "Copy"));
        this.DOt.getTransferHandler();
        action = TransferHandler.getPasteAction();
        imageIcon = new ImageIcon(this.pEh + "Paste16.gif");
        action.putValue("SmallIcon", imageIcon);
        this.DOE = new a(this, action);
        jToolBar.add(this.a(this.DOE, "Paste"));
        this.DOt.getTransferHandler();
        action = TransferHandler.getCutAction();
        imageIcon = new ImageIcon(this.pEh + "Cut16.gif");
        action.putValue("SmallIcon", imageIcon);
        this.DOC = new a(this, action);
        jToolBar.add(this.a(this.DOC, "Cut"));
        imageIcon = new ImageIcon(this.pEh + "Delete16.gif");
        this.DOx = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (!mnf.a(this.DOK).isSelectionEmpty()) {
                    mnf.e(this.DOK);
                }
            }
        };
        this.DOx.setEnabled(false);
        jToolBar.add(this.a(this.DOx, "Delete"));
        jToolBar.addSeparator();
        imageIcon = new ImageIcon(this.pEh + "Zoom16.gif");
        action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).setScale(1.0);
            }
        };
        jToolBar.add(this.a(action, "Zoom"));
        imageIcon = new ImageIcon(this.pEh + "ZoomIn16.gif");
        action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).setScale(2.0 * mnf.a(this.DOK).getScale());
            }
        };
        jToolBar.add(this.a(action, "Zoom in"));
        imageIcon = new ImageIcon(this.pEh + "ZoomOut16.gif");
        action = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).setScale(mnf.a(this.DOK).getScale() / 2.0);
            }
        };
        jToolBar.add(this.a(action, "Zoom out"));
        jToolBar.addSeparator();
        imageIcon = new ImageIcon(this.pEh + "Group.gif");
        this.DOy = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).bE(mnf.a(this.DOK).getSelectionCells());
            }
        };
        this.DOy.setEnabled(false);
        jToolBar.add(this.a(this.DOy, "Group"));
        imageIcon = new ImageIcon(this.pEh + "UnGroup.gif");
        this.DOz = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnf.a(this.DOK).bF(mnf.a(this.DOK).getSelectionCells());
            }
        };
        this.DOz.setEnabled(false);
        jToolBar.add(this.a(this.DOz, "Ungroup"));
        jToolBar.addSeparator();
        imageIcon = new ImageIcon(this.pEh + "ToFront.gif");
        this.DOA = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (!mnf.a(this.DOK).isSelectionEmpty()) {
                    mnf.a(this.DOK).toFront(mnf.a(this.DOK).getSelectionCells());
                }
            }
        };
        this.DOA.setEnabled(false);
        jToolBar.add(this.a(this.DOA, "To front"));
        imageIcon = new ImageIcon(this.pEh + "ToBack.gif");
        this.DOB = new AbstractAction(this, "", imageIcon){
            final /* synthetic */ mnf DOK;
            {
                this.DOK = mnf2;
                super(string, icon);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (!mnf.a(this.DOK).isSelectionEmpty()) {
                    mnf.a(this.DOK).toBack(mnf.a(this.DOK).getSelectionCells());
                }
            }
        };
        this.DOB.setEnabled(false);
        jToolBar.add(this.a(this.DOB, "To back"));
        return jToolBar;
    }

    private JButton a(Action action, String string) {
        JButton jButton = new JButton(action);
        jButton.setToolTipText(string);
        return jButton;
    }

    private void eFY() {
        Object[] objectArray = this.DOt.getSelectionCells();
        if ((objectArray = this.DOt.getDescendants(objectArray)) != null) {
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                if (!(objectArray[i] instanceof Edge)) continue;
                Edge edge = (Edge)objectArray[i];
                if (!this.DOt.getModel().acceptsSource((Object)edge, null) || !this.DOt.getModel().acceptsTarget((Object)edge, null)) continue;
                mnd mnd2 = (mnd)((Object)((DefaultPort)edge.getSource()).getParent());
                mnd mnd3 = (mnd)((Object)((DefaultPort)edge.getTarget()).getParent());
                lfn.b(2, "@@@@@@@@@@@@", "Removed Edge. Source: " + (Object)((Object)mnd2) + ", Target: " + (Object)((Object)mnd3));
                if (mnd2 == null || mnd3 == null) continue;
                lfn.b(0, this.getClass().getName(), "Sending GUIDRelation Message!");
                gen gen2 = (gen)this.DEC.d(771);
                gen2.on(mnd3.oq().bFk());
                gen2.f(lcr.qzr);
                gen2.blp = mnd3.oq();
                gen2.blo = mnd2.oq();
                gen2.gqN = 1025;
                this.DEC.a((dxq)gen2);
            }
        }
        this.DOt.getModel().remove(objectArray);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Object Properties")) {
            lfn.print("SelectedObject is" + this.DOr);
            this.eFZ();
        }
    }

    private void eFZ() {
        lfn.print("Object:" + this.DOt.getSelectionCell().getClass().getName());
        mnd mnd2 = (mnd)((Object)this.DOt.getSelectionCell());
        lfn.print("SelectedCell:" + mnd2.eFV().getClass().getName());
        btk btk2 = mnd2.eFV();
        int n = btk2.getObjectType();
        lfn.b(0, this.getClass().getName(), "Object Properties for Object GUID: " + btk2.getGUID());
        switch (n) {
            case 5: {
                mvm mvm2 = new mvm((dqk)btk2);
                mvm2.p(this.DEC);
                this.getDesktopPane().add(mvm2);
                mvm2.setVisible(true);
                break;
            }
            case 33: {
                mvp mvp2 = new mvp((drk)btk2);
                mvp2.p(this.DEC);
                this.getDesktopPane().add(mvp2);
                mvp2.setVisible(true);
                break;
            }
            case 8: 
            case 9: 
            case 10: {
                mvx mvx2 = new mvx((drt)btk2);
                mvx2.p(this.DEC);
                this.getDesktopPane().add(mvx2);
                mvx2.setVisible(true);
                break;
            }
            case 36: {
                mvz mvz2 = new mvz((drx)btk2);
                mvz2.p(this.DEC);
                this.getDesktopPane().add(mvz2);
                mvz2.setVisible(true);
                break;
            }
            case 156: {
                mvu mvu2 = new mvu((drl)btk2);
                mvu2.p(this.DEC);
                this.getDesktopPane().add(mvu2);
                mvu2.setVisible(true);
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "Unknown ObjectType: " + n);
            }
        }
    }

    static /* synthetic */ mnc a(mnf mnf2) {
        return mnf2.DOt;
    }

    static /* synthetic */ void b(mnf mnf2) {
        mnf2.eFW();
    }

    static /* synthetic */ List c(mnf mnf2) {
        return mnf2.DOI;
    }

    static /* synthetic */ String d(mnf mnf2) {
        return mnf2.pEh;
    }

    static /* synthetic */ void e(mnf mnf2) {
        mnf2.eFY();
    }

    static /* synthetic */ mng f(mnf mnf2) {
        return mnf2.DOs;
    }
}

