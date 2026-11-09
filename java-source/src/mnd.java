/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.jgraph.graph.DefaultGraphCell
 */
import com.jgraph.graph.DefaultGraphCell;

public class mnd
extends DefaultGraphCell {
    public mnd() {
        System.out.println("Kalles");
    }

    public mnd(btk btk2) {
        super((Object)btk2);
    }

    public ldv oq() {
        if (this.userObject instanceof btk) {
            return ((btk)this.userObject).getGUID();
        }
        System.out.println("userObject is TYPE [[" + this.userObject.getClass().getName() + "]]");
        return null;
    }

    public btk eFV() {
        if (this.userObject instanceof btk) {
            return (btk)this.userObject;
        }
        System.out.println("userObject is TYPE [[" + this.userObject.getClass().getName() + "]]");
        return null;
    }
}

