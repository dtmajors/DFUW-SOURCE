/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class bmz
extends btk {
    Map<Integer, bmy> dvL = lcn.emw();
    Set<ldv> dvM = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
        this.arO();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 2582) {
            this.a((ffa)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    public void o(int n, int n2) {
        ldv ldv2 = new ldv(n2, n, 0);
        this.dvM.add(ldv2);
        if (this.dvL.size() > 0) {
            ffa ffa2 = (ffa)this.MessageDelegator.h(2582, this.GUID, this.hX(ldv2));
            bmy[] bmyArray = new bmy[this.dvL.size()];
            this.dvL.values().toArray(bmyArray);
            ffa2.a(bmyArray);
            ffa2.Eh(0);
            this.MessageDelegator.E(ffa2);
        }
    }

    public void al(int n, int n2) {
        this.dvM.remove(new ldv(n2, n, 0));
    }

    private void a(ffa ffa2) {
        if (ffa2.bHc() == 0) {
            for (bmy object : ffa2.bOR()) {
                if (this.dvL.containsKey(object.getID())) {
                    return;
                }
                this.dvL.put(object.getID(), object);
            }
        }
        if (ffa2.bHc() == 2) {
            for (bmy bmy2 : ffa2.bOR()) {
                this.dvL.put(bmy2.getID(), bmy2);
            }
        }
        if (ffa2.bHc() == 1) {
            for (bmy bmy3 : ffa2.bOR()) {
                if (!this.dvL.containsKey(bmy3.getID())) {
                    return;
                }
                this.dvL.remove(bmy3.getID());
            }
        }
        for (ldv ldv2 : this.dvM) {
            ffa ffa3 = (ffa)this.MessageDelegator.h(2582, this.GUID, this.hX(ldv2));
            ffa3.a(ffa2.bOR());
            ffa3.Eh(ffa2.bHc());
            this.MessageDelegator.E(ffa3);
        }
    }

    private ldv hX(ldv ldv2) {
        return lcr.ak((ldv)lcr.acL, (int)ldv2.ib());
    }

    private void arO() {
        Document document = jsy.tK("xml-files/server/globalevents/global_map_markers.xml");
        if (document == null) {
            return;
        }
        Node node = jsy.a("XML", (Node)document);
        List<Node> list = jsy.c("Marker", node);
        for (Node node2 : list) {
            int n = Integer.valueOf(node2.getAttributes().getNamedItem("ID").getNodeValue());
            String string = node2.getAttributes().getNamedItem("Type").getNodeValue();
            int n2 = Integer.valueOf(node2.getAttributes().getNamedItem("X").getNodeValue());
            int n3 = Integer.valueOf(node2.getAttributes().getNamedItem("Y").getNodeValue());
            jjm jjm2 = null;
            try {
                jjm2 = jjm.valueOf(string.toUpperCase());
            }
            catch (Exception exception) {
                lfn.b(5, "SFGlobalMarkerManager", "parseMarkers() unknown global marker type " + string);
                continue;
            }
            bmy bmy2 = new bmy();
            bmy2.hG(n);
            bmy2.li(jjm2.ordinal());
            bmy2.c(new ljq(n2, 0.0f, n3));
            this.dvL.put(bmy2.getID(), bmy2);
        }
    }
}

