/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class dqz {
    private String Name = "";
    private String jD = "";
    private float gRl = 4.0f;
    private int dPT = 0;
    private double gtH = 0.0;
    private int gPI = -1;
    private boolean gRm = false;
    private float gRn = -1.0f;
    private List<a> gRo = lcn.emv();
    private a gRp = null;

    public String getName() {
        return this.Name;
    }

    public a c(ldz ldz2, boolean bl) {
        ldz.a a2 = ldz2.enQ();
        int n = a2 == ldz.a.rgD || a2 == ldz.a.rgE ? 2 : 1;
        ArrayList<a> arrayList = lcn.emv();
        for (a a3 : this.gRo) {
            if ((a3.gRq & n) == 0 || a3.gRr > 0 && ldz2.rgz < a3.gRs || a3.gRt && !bl) continue;
            if (bl && a3.gRu) {
                arrayList.clear();
                arrayList.add(a3);
                break;
            }
            arrayList.add(a3);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        Object object = null;
        if (arrayList.size() == 1) {
            this.gRp = object = (a)arrayList.get(0);
        } else {
            int n2;
            a a4;
            do {
                if ((n2 = (int)(Math.random() * (double)arrayList.size())) != arrayList.size()) continue;
                n2 = arrayList.size() - 1;
            } while ((a4 = (a)arrayList.get(n2)) == this.gRp);
            this.gRp = a4;
            object = a4;
        }
        if (((a)object).gRr > 0) {
            ((a)object).gRs = ldz2.rgz + (double)((a)object).gRr;
        }
        return object;
    }

    public int c(Node node) {
        Node node2;
        int n = Integer.parseInt(node.getAttributes().getNamedItem("GlobalId").getNodeValue());
        this.Name = node.getAttributes().getNamedItem("Name").getNodeValue();
        this.jD = node.getAttributes().getNamedItem("Description").getNodeValue();
        this.gRl = Float.parseFloat(node.getAttributes().getNamedItem("PauseDuration").getNodeValue());
        this.dPT = Integer.parseInt(node.getAttributes().getNamedItem("Priority").getNodeValue());
        this.gRm = Integer.parseInt(node.getAttributes().getNamedItem("Loop").getNodeValue()) == 1;
        Node node3 = node.getAttributes().getNamedItem("FixedVolume");
        if (node3 != null) {
            this.gRn = Float.parseFloat(node3.getNodeValue());
        }
        if ((node2 = jsy.a("Oggs", node)) != null) {
            List<Node> list = jsy.c("Ogg", node2);
            for (Node node4 : list) {
                Node node5;
                Node node6;
                Node node7;
                Node node8;
                Node node9;
                a a2 = new a(this);
                Node node10 = node4.getAttributes().getNamedItem("FileName");
                if (node10 != null) {
                    a2.FileName = node10.getNodeValue();
                }
                if ((node9 = node4.getAttributes().getNamedItem("Time")) != null) {
                    if (node9.getNodeValue().toLowerCase().equals("day")) {
                        a2.gRq = 1;
                    } else if (node9.getNodeValue().toLowerCase().equals("night")) {
                        a2.gRq = 2;
                    }
                }
                if ((node8 = node4.getAttributes().getNamedItem("TimeLock")) != null) {
                    a2.gRr = Integer.parseInt(node8.getNodeValue());
                }
                if ((node7 = node4.getAttributes().getNamedItem("PlayFirst")) != null) {
                    a2.gRu = node7.getNodeValue().toLowerCase().equals("true");
                }
                if ((node6 = node4.getAttributes().getNamedItem("PlayOnlyOnTransition")) != null) {
                    a2.gRt = node6.getNodeValue().toLowerCase().equals("true");
                }
                if ((node5 = node4.getAttributes().getNamedItem("Volume")) != null) {
                    a2.dKJ = Float.parseFloat(node5.getNodeValue());
                }
                this.gRo.add(a2);
            }
        }
        this.gPI = n;
        return n;
    }

    public boolean buM() {
        return this.gRm;
    }

    public float buN() {
        return this.gRl;
    }

    public double buO() {
        return this.gtH;
    }

    public void bZ(double d2) {
        this.gtH = d2;
    }

    public int getPriority() {
        return this.dPT;
    }

    public int buP() {
        return this.gPI;
    }

    public float buQ() {
        return this.gRn;
    }
}

