/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.jgraph.JGraph
 *  com.jgraph.graph.CellView
 *  com.jgraph.graph.ConnectionSet
 *  com.jgraph.graph.DefaultEdge
 *  com.jgraph.graph.DefaultGraphCell
 *  com.jgraph.graph.DefaultPort
 *  com.jgraph.graph.GraphConstants
 *  com.jgraph.graph.GraphModel
 *  com.jgraph.graph.GraphUndoManager
 *  com.jgraph.graph.ParentMap
 *  com.jgraph.graph.Port
 *  lcr
 */
import com.jgraph.JGraph;
import com.jgraph.graph.CellView;
import com.jgraph.graph.ConnectionSet;
import com.jgraph.graph.DefaultEdge;
import com.jgraph.graph.DefaultGraphCell;
import com.jgraph.graph.DefaultPort;
import com.jgraph.graph.GraphConstants;
import com.jgraph.graph.GraphModel;
import com.jgraph.graph.GraphUndoManager;
import com.jgraph.graph.ParentMap;
import com.jgraph.graph.Port;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.tree.MutableTreeNode;

public class mnc
extends JGraph
implements KeyListener {
    protected lfn ga = lfn.eqw();
    private aux DEC = null;
    private GraphUndoManager DOi;

    public mnc() {
        this.init();
    }

    public mnc(GraphModel graphModel) {
        super(graphModel);
        this.init();
    }

    private void init() {
        this.setMarqueeHandler(new a(this));
        this.setSelectNewCells(true);
        this.setPortsVisible(true);
        this.setGridEnabled(true);
        this.setGridSize(6);
        this.setTolerance(2);
        this.DOi = new GraphUndoManager(this){
            final /* synthetic */ mnc DOj;
            {
                this.DOj = mnc2;
            }

            public void undoableEditHappened(UndoableEditEvent undoableEditEvent) {
                super.undoableEditHappened(undoableEditEvent);
            }
        };
        this.getModel().addUndoableEditListener((UndoableEditListener)this.DOi);
        ToolTipManager.sharedInstance().registerComponent((JComponent)((Object)this));
        this.addKeyListener(this);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public void e(Point point) {
        mnd mnd2 = new mnd();
        mnd2.add((MutableTreeNode)new DefaultPort());
        point = this.snap(new Point(point));
        Dimension dimension = new Dimension(25, 25);
        Map map = GraphConstants.createMap();
        GraphConstants.setBounds((Map)map, (Rectangle)new Rectangle(point, dimension));
        GraphConstants.setBorderColor((Map)map, (Color)Color.black);
        GraphConstants.setBackground((Map)map, (Color)Color.white);
        GraphConstants.setOpaque((Map)map, (boolean)true);
        Hashtable<mnd, Map> hashtable = new Hashtable<mnd, Map>();
        hashtable.put(mnd2, map);
        this.getGraphLayoutCache().insert(new Object[]{mnd2}, hashtable, null, null, null);
    }

    public void a(Port port, Port port2) {
        this.a(port, port2, null, true);
    }

    public void a(Port port, Port port2, String string, boolean bl) {
        Hashtable<String, Object[]> hashtable;
        Object object;
        String string2;
        String string3;
        boolean bl2 = true;
        mnd mnd2 = (mnd)((Object)((DefaultPort)port).getParent());
        mnd mnd3 = (mnd)((Object)((DefaultPort)port2).getParent());
        lfn.print("<> Connecting Source[" + (Object)((Object)mnd2) + "] and Target[" + (Object)((Object)mnd3) + "]");
        if (bl) {
            string3 = "GUID Relation";
            string2 = "Listener Relation";
            object = new String[]{string3, string2};
            hashtable = JOptionPane.showInputDialog((Component)((Object)this), "Choose type of Relation:", "Choose relation type", 3, null, object, object[0]);
            if (mnd2 != null && mnd3 != null && ((Object)hashtable).equals(string3)) {
                lfn.b(0, this.getClass().getName(), "Sending GUIDRelation Message!");
                geg geg2 = (geg)this.DEC.d(769);
                geg2.on(mnd3.oq().bFk());
                geg2.f(lcr.qzr);
                geg2.blp = mnd3.oq();
                geg2.blo = mnd2.oq();
                geg2.gqN = 1025;
                this.DEC.a((dxq)geg2);
            } else {
                JOptionPane.showInternalMessageDialog((Component)((Object)this), "RelationType not supported!", "Relation Error", 0);
                bl2 = false;
            }
        }
        if (bl2) {
            string3 = new ConnectionSet();
            string2 = null;
            string2 = string != null ? new DefaultEdge((Object)string) : new DefaultEdge();
            string3.connect((Object)string2, (Object)port, (Object)port2);
            object = GraphConstants.createMap();
            GraphConstants.setLineEnd((Map)object, (int)4);
            hashtable = new Hashtable<String, Object[]>();
            hashtable.put(string2, (Object[])object);
            this.getGraphLayoutCache().insert(new Object[]{string2}, hashtable, (ConnectionSet)string3, null, null);
        }
    }

    public void bE(Object[] objectArray) {
        objectArray = this.getGraphLayoutCache().order(objectArray);
        if (objectArray != null && objectArray.length > 0) {
            int n = this.a(this);
            DefaultGraphCell defaultGraphCell = new DefaultGraphCell((Object)new Integer(objectArray.length));
            ParentMap parentMap = new ParentMap();
            int n2 = objectArray.length;
            for (int i = 0; i < n2; ++i) {
                parentMap.addEntry(objectArray[i], (Object)defaultGraphCell);
            }
            this.getGraphLayoutCache().insert(new Object[]{defaultGraphCell}, null, null, parentMap, null);
        }
    }

    protected int a(JGraph jGraph) {
        Object[] objectArray = this.getDescendants(this.getRoots());
        return objectArray.length;
    }

    public void bF(Object[] objectArray) {
        if (objectArray != null && objectArray.length > 0) {
            ArrayList<Object> arrayList = lcn.emv();
            ArrayList<Object> arrayList2 = lcn.emv();
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                if (!this.aH(objectArray[i])) continue;
                arrayList.add(objectArray[i]);
                for (int j = 0; j < this.getModel().getChildCount(objectArray[i]); ++j) {
                    Object object = this.getModel().getChild(objectArray[i], j);
                    if (object instanceof Port) continue;
                    arrayList2.add(object);
                }
            }
            this.getGraphLayoutCache().remove(arrayList.toArray());
            this.setSelectionCells(arrayList2.toArray());
        }
    }

    public boolean aH(Object object) {
        CellView cellView = this.getGraphLayoutCache().getMapping(object, false);
        if (cellView != null) {
            return !cellView.isLeaf();
        }
        return false;
    }

    public void toFront(Object[] objectArray) {
        this.getGraphLayoutCache().toFront(objectArray);
    }

    public void toBack(Object[] objectArray) {
        this.getGraphLayoutCache().toBack(objectArray);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }
}

