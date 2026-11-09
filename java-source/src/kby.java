/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kby {
    public dkm ww(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        try {
            NodeList nodeList = document.getElementsByTagName("SFMeshKeyFrameTracks");
            if (nodeList.getLength() != 1) {
                throw new bo("No 'SFMeshKeyFrameTracks' node found.");
            }
            dkm dkm2 = new dkm();
            Node node = nodeList.item(0);
            nodeList = node.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Object object;
                Object object2;
                Node node2;
                NamedNodeMap namedNodeMap;
                Node node3 = nodeList.item(i);
                if (node3.getNodeName().equals("SFString")) {
                    namedNodeMap = node3.getAttributes();
                    node2 = namedNodeMap.getNamedItem("Name");
                    if (node2 == null) {
                        throw new bg("No 'Name' attribute found under node 'SFString'");
                    }
                    object2 = namedNodeMap.getNamedItem("Value");
                    if (object2 == null) {
                        throw new bg("No 'Value' attribute found under node 'SFString'");
                    }
                    object = object2.getNodeValue();
                    String string2 = node2.getNodeValue();
                    if (string2.equals("Name")) {
                        dkm2.setName((String)object);
                        continue;
                    }
                    if (!string2.equals("MeshName")) continue;
                    dkm2.setMeshName((String)object);
                    continue;
                }
                if (node3.getNodeName().equals("SFVector3")) {
                    namedNodeMap = node3.getAttributes();
                    node2 = namedNodeMap.getNamedItem("Name");
                    if (node2 == null) {
                        throw new bg("No 'Name' attribute found under node 'SFVector3'");
                    }
                    object2 = jsy.w(node);
                    object = node2.getNodeValue();
                    if (!((String)object).equals("PivotPoint")) continue;
                    dkm2.bT((ljq)object2);
                    continue;
                }
                if (!node3.getNodeName().equals("SFTCBSpline")) continue;
                namedNodeMap = node3.getAttributes();
                node2 = namedNodeMap.getNamedItem("Type");
                if (node2 == null) {
                    throw new bg("No 'Type' attribute found under node 'SFTCBSpline'");
                }
                object2 = node2.getNodeValue();
                if (((String)object2).equals("SFQuaternion")) {
                    object = this.fe(node3);
                    dkm2.a((dkr)object);
                    continue;
                }
                if (!((String)object2).equals("SFVector3")) continue;
                object = this.ff(node3);
                dkm2.a((dks)object);
            }
            if (dkm2.bno() == null) {
                throw new bo("No SFQuaternion spline node found.");
            }
            if (dkm2.bnn() == null) {
                throw new bo("No SFVector3 spline node found.");
            }
            return dkm2;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private dkr fe(Node node) {
        dkr dkr2 = new dkr();
        this.a(dkr2, node);
        Node node2 = node.getAttributes().getNamedItem("NumKeys");
        if (node2 == null) {
            throw new bg("No 'NumKeys' attribute found.");
        }
        int n = Integer.parseInt(node2.getNodeValue());
        if (n <= 0) {
            throw new bj("Attribute 'NumKeys' has invalid value.");
        }
        NodeList nodeList = node.getChildNodes();
        Node node3 = null;
        dko[] dkoArray = new dko[n];
        for (int i = 0; i < nodeList.getLength(); ++i) {
            node3 = nodeList.item(i);
            if (!node3.getNodeName().equals("SFTCBKey")) continue;
            node2 = node3.getAttributes().getNamedItem("KeyNumber");
            if (node2 == null) {
                throw new bg("No 'KeyNumber' attribute found on node 'SFTCBKey'");
            }
            int n2 = Integer.parseInt(node2.getNodeValue());
            if (n2 < 0 || n2 > n) {
                throw new bj("Attribute 'KeyNumber' has invalid value.");
            }
            if (dkoArray[n2] != null) {
                throw new bj("Duplicate SFTCBKeyQuaternion with KeyNumber=" + n2);
            }
            dkoArray[n2] = this.fg(node3);
        }
        dkr2.a(dkoArray);
        return dkr2;
    }

    private dks ff(Node node) {
        dks dks2 = new dks();
        this.a(dks2, node);
        Node node2 = node.getAttributes().getNamedItem("NumKeys");
        if (node2 == null) {
            throw new bg("No 'NumKeys' attribute found.");
        }
        int n = Integer.parseInt(node2.getNodeValue());
        if (n <= 0) {
            throw new bj("Attribute 'NumKeys' has invalid value.");
        }
        NodeList nodeList = node.getChildNodes();
        Node node3 = null;
        dkp[] dkpArray = new dkp[n];
        for (int i = 0; i < nodeList.getLength(); ++i) {
            node3 = nodeList.item(i);
            if (!node3.getNodeName().equals("SFTCBKey")) continue;
            node2 = node3.getAttributes().getNamedItem("KeyNumber");
            if (node2 == null) {
                throw new bg("No 'KeyNumber' attribute found on node 'SFTCBKey'");
            }
            int n2 = Integer.parseInt(node2.getNodeValue());
            if (n2 < 0 || n2 > n) {
                throw new bj("Attribute 'KeyNumber' has invalid value.");
            }
            if (dkpArray[n2] != null) {
                throw new bj("Duplicate SFTCBKeyVector3 with KeyNumber=" + n2);
            }
            dkpArray[n2] = this.fh(node3);
        }
        dks2.a(dkpArray);
        return dks2;
    }

    private void a(dkq dkq2, Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); ++i) {
            String string;
            Node node2;
            Node node3;
            NamedNodeMap namedNodeMap;
            Node node4 = nodeList.item(i);
            if (node4.getNodeName().equals("SFFloat")) {
                namedNodeMap = node4.getAttributes();
                node3 = namedNodeMap.getNamedItem("Name");
                if (node3 == null) {
                    throw new bg("No 'Name' attribute found under node 'SFFloat'");
                }
                node2 = namedNodeMap.getNamedItem("Value");
                if (node2 == null) {
                    throw new bg("No 'Value' attribute found under node 'SFFloat'");
                }
                float f = Float.parseFloat(node2.getNodeValue());
                string = node3.getNodeValue();
                if (string.equals("Duration")) {
                    dkq2.setDuration(f);
                    continue;
                }
                if (!string.equals("TrackLength")) continue;
                dkq2.gG(f);
                continue;
            }
            if (!node4.getNodeName().equals("SFBool")) continue;
            namedNodeMap = node4.getAttributes();
            node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                throw new bg("No 'Name' attribute found under node 'SFBool'");
            }
            node2 = namedNodeMap.getNamedItem("Value");
            if (node2 == null) {
                throw new bg("No 'Value' attribute found under node 'SFBool'");
            }
            boolean bl = Boolean.parseBoolean(node2.getNodeValue());
            string = node3.getNodeValue();
            if (string.equals("TrackSmoothLoops")) {
                dkq2.hY(bl);
                continue;
            }
            if (string.equals("TrackRepeats")) {
                dkq2.hZ(bl);
                continue;
            }
            if (string.equals("TrackLockX")) {
                dkq2.ia(bl);
                continue;
            }
            if (string.equals("TrackLockY")) {
                dkq2.ib(bl);
                continue;
            }
            if (string.equals("TrackLockZ")) {
                dkq2.ic(bl);
                continue;
            }
            if (string.equals("TrackNoLinkX")) {
                dkq2.id(bl);
                continue;
            }
            if (string.equals("TrackNoLinkY")) {
                dkq2.ie(bl);
                continue;
            }
            if (!string.equals("TrackNoLinkZ")) continue;
            dkq2.if(bl);
        }
    }

    private dko fg(Node node) {
        dko dko2 = new dko();
        this.a(dko2, node);
        lgl lgl2 = jsy.E(node);
        if (lgl2 == null) {
            throw new bg("Failed to get SFQuaternion value from node.");
        }
        dko2.A(lgl2);
        return dko2;
    }

    private dkp fh(Node node) {
        dkp dkp2 = new dkp();
        this.a(dkp2, node);
        ljq ljq2 = jsy.w(node);
        if (ljq2 == null) {
            throw new bg("Failed to get SFVector3 value from node.");
        }
        dkp2.aO(ljq2);
        return dkp2;
    }

    private void a(dkn dkn2, Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node2 = nodeList.item(i);
            if (!node2.getNodeName().equals("SFFloat")) continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                throw new bg("No 'SFName' attribute found under node 'SFFloat'");
            }
            Node node4 = namedNodeMap.getNamedItem("Value");
            if (node4 == null) {
                throw new bg("No 'Value' attribute found under node 'SFFloat'");
            }
            float f = Float.parseFloat(node4.getNodeValue());
            String string = node3.getNodeValue();
            if (string.equals("Tension")) {
                dkn2.gB(f);
                continue;
            }
            if (string.equals("Continuity")) {
                dkn2.gB(f);
                continue;
            }
            if (string.equals("Bias")) {
                dkn2.gB(f);
                continue;
            }
            if (string.equals("EaseFrom")) {
                dkn2.gB(f);
                continue;
            }
            if (!string.equals("EaseTo")) continue;
            dkn2.gB(f);
        }
    }
}

