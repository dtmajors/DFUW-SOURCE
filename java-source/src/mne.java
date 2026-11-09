/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.jgraph.graph.DefaultGraphModel
 *  com.jgraph.graph.DefaultPort
 *  com.jgraph.graph.Edge
 */
import com.jgraph.graph.DefaultGraphModel;
import com.jgraph.graph.DefaultPort;
import com.jgraph.graph.Edge;

public class mne
extends DefaultGraphModel {
    private lfn ga = lfn.eqw();

    public boolean acceptsSource(Object object, Object object2) {
        lfn.print("acceptsSource()");
        Edge edge = (Edge)object;
        if (edge.getTarget() == object2) {
            lfn.print("acceptsSource() --> Oops.. SAME");
            return false;
        }
        DefaultPort defaultPort = (DefaultPort)object2;
        if (defaultPort != null) {
            mnd mnd2 = (mnd)((Object)defaultPort.getParent());
            lfn.b(0, "SFGraphModel", "acceptsSource() Source = " + mnd2.getUserObject().toString());
        }
        return true;
    }

    public boolean acceptsTarget(Object object, Object object2) {
        lfn.print("acceptsTarget()");
        Edge edge = (Edge)object;
        if (edge.getSource() == object2) {
            lfn.print("acceptsTarget() --> Oops.. SAME");
            return false;
        }
        DefaultPort defaultPort = (DefaultPort)object2;
        if (defaultPort != null) {
            mnd mnd2 = (mnd)((Object)defaultPort.getParent());
            lfn.b(0, "SFGraphModel", "acceptsTarget() Target = " + mnd2.getUserObject().toString());
        }
        return true;
    }
}

