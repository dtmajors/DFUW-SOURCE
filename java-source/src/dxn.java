/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class dxn
extends btk
implements bto {
    private static final int hsk = 0;
    private final dxp hsl = new dxp();
    public static final Map<String, Document> hsm = lcn.emw();
    private double hsn = 0.0;
    private double hso = 0.0;
    private static final boolean hsp = true;
    private double QM = 0.0;
    private double hsq = 0.1;
    private static final Map<String, ldz> hsr = lcn.emw();
    private boolean UK = false;

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 261: {
                this.a((kdv)kcz2);
                break;
            }
            case 260: {
                this.i((kdk)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kdv kdv2) {
        if (this.MessageDelegator.bzx().bzt().dVA() != kdw.a.phY) {
            lfn.b(5, "SFWebGateModule", "handleXMLDataMessage(): Ignoring xml message - module state is not == running");
            return;
        }
        String string = kdv2.dVs();
        if (string == null) {
            assert (false);
            return;
        }
        ldv ldv2 = kdv2.aO();
        if (ldv2 == null) {
            assert (false);
            return;
        }
        Map<String, String> map = lcn.emw();
        Document document = jsy.tL(string);
        if (document == null) {
            assert (false);
            return;
        }
        Node node = jsy.a("HTTPRequest", (Node)document);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("RemoteHost", node);
        if (node2 == null) {
            assert (false);
            return;
        }
        this.a(map, node2);
        if (hsr.containsKey(map.get(dxn.jJ("RemoteHost")))) {
            lfn.b(5, "SFWebGateModule", "handleXMLDataMessage() You can not make a request before  " + this.hsq + " ms from your last request");
            return;
        }
        hsr.put(map.get(dxn.jJ("RemoteHost")), this.MessageDelegator.arc());
        Node node3 = jsy.a("RequestID", node);
        if (node3 == null) {
            assert (false);
            return;
        }
        this.a(map, node3);
        Node node4 = jsy.a("RequestURI", node);
        if (node4 == null) {
            assert (false);
            return;
        }
        this.a(map, node4);
        Node node5 = jsy.a("Parameters", node);
        if (node5 == null) {
            assert (false);
            return;
        }
        List<Node> list = jsy.c("Parameter", node5);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Node node6 = list.get(i2);
            this.a(map, node6);
        }
    }

    private void a(Map<String, String> map, Node node) {
        assert (node != null);
        String string = node.getNodeName();
        String string2 = null;
        Node node2 = null;
        Node node3 = null;
        NamedNodeMap namedNodeMap = node.getAttributes();
        node3 = namedNodeMap.getNamedItem("Value");
        string2 = node3.getNodeValue();
        node2 = namedNodeMap.getNamedItem("Name");
        if (node2 != null) {
            String string3 = node2.getNodeValue();
            map.put(string3, string2);
        } else {
            map.put(string, string2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8713: {
                this.a((exg)dxq2);
                break;
            }
            case 11053: {
                this.a((gpc)dxq2);
                break;
            }
            case 11054: {
                this.a((gpd)dxq2);
                break;
            }
            case 11119: {
                this.UK = true;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gpc gpc2) {
        String string = gpc2.SP;
        ldv ldv2 = gpc2.Ri;
        this.hsl.t(ldv2, string);
    }

    private void a(gpd gpd2) {
        ldv ldv2 = gpd2.Ri;
        this.hsl.oy(ldv2);
    }

    private void a(exg exg2) {
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.UK) {
            this.UK = false;
            throw new RuntimeException("requested by external command");
        }
        this.av(ldz2);
        this.au(ldz2);
        this.at(ldz2);
    }

    private void at(ldz ldz2) {
        if (ldz2.rgz - this.hso < 15.0) {
            return;
        }
        this.hsl.bEu();
        this.hsl.bEt();
        this.hso = ldz2.rgz;
    }

    private void au(ldz ldz2) {
        if (ldz2.rgz - this.hsn < 30.0) {
            return;
        }
        this.hsn = ldz2.rgz;
        List<Integer> list = this.hsl.bEx();
        if (list == null || list.isEmpty()) {
            return;
        }
        ldv ldv2 = null;
        Collection<dxo> collection = null;
        ArrayList<Integer> arrayList = lcn.abH(list.size());
        for (int i2 = 0; i2 < list.size(); ++i2) {
            ldv2 = lcr.abW((int)list.get(i2));
            collection = this.hsl.oz(ldv2);
            if (collection == null || collection.isEmpty()) continue;
            arrayList.add(list.get(i2));
        }
        if (!arrayList.isEmpty()) {
            list.removeAll(arrayList);
        }
        if (!list.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i3 = 0; i3 < list.size(); ++i3) {
                if (stringBuffer.length() == 0) {
                    stringBuffer.append(list.get(i3));
                    continue;
                }
                stringBuffer.append("," + list.get(i3));
            }
            stringBuffer = null;
        }
        list = null;
        arrayList = null;
        collection = null;
        ldv2 = null;
    }

    private void av(ldz ldz2) {
        if (ldz2.rgz - this.QM < this.hsq) {
            return;
        }
        this.QM = ldz2.rgz;
        ArrayList<String> arrayList = lcn.emv();
        if (!hsr.isEmpty()) {
            for (String string : hsr.keySet()) {
                ldz ldz3 = hsr.get(string);
                if (!(ldz2.rgz - ldz3.rgz >= this.hsq)) continue;
                arrayList.add(string);
            }
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                hsr.remove(arrayList.get(i2));
            }
        }
    }

    public static void jI(String string) {
        if (string == null) {
            return;
        }
        hsr.remove(string);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
        }
    }

    private void i(kdk kdk2) {
        int n2 = kdk2.getContext();
        int n3 = kdk2.dVr().getErrorCode();
        String string = "Unknown";
        switch (n2) {
            case 0: {
                string = "Update Player Game State query";
            }
        }
        if (n3 != 0) {
            lfn.b(5, "SFWebGateModule", "handleMiddlewareSqlResultMessage() Query " + string + " failed!!!");
            assert (false);
        }
    }

    public static String jJ(String string) {
        return string;
    }
}

