/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class kad {
    private static final lju paM = new lju(0, 1, 0);

    public void a(String string, byx byx2) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, paM);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFStateChangeRule", node);
            if (list.isEmpty()) {
                throw new bg("No 'SFStateChangeRule' nodes found.");
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    bzn bzn2 = this.cZ(list.get(i2));
                    byx2.a(bzn2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("SFStateChangeRule " + i2 + " could not be created.", bg2);
                }
            }
            list = jsy.c("SFOperationRule", node);
            if (list.isEmpty()) {
                throw new bg("No 'SFOperationRule' nodes found.");
            }
            bzo bzo2 = byx2.aEK();
            int n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    bzb bzb2 = this.dh(list.get(n));
                    bzo2.a(bzb2);
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("SFOperationRule " + n + " could not be created.", bg3);
                }
            }
        }
        catch (bg bg4) {
            throw new bg("Parsing of file '" + string + "' failed.", bg4);
        }
    }

    private bzn cZ(Node node) {
        String string = jsy.c(node, "EventName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'EventName' has invalid value.");
        }
        byw.c c2 = byw.c.getEventType(string);
        if (c2 == null) {
            throw new bj("EventName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFRequirement", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFRequirement' nodes was found.");
        }
        bzi[] bziArray = new bzi[list.size()];
        int n = bziArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                bziArray[i2] = this.da(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("SFRequirement " + i2 + " could not be created.", bg2);
            }
        }
        List<Node> list2 = jsy.c("SFStateChange", node);
        if (list2.isEmpty()) {
            throw new bj("No 'SFStateChange' nodes was found.");
        }
        bzm[] bzmArray = new bzm[list2.size()];
        int n2 = bzmArray.length;
        for (int i3 = 0; i3 < n2; ++i3) {
            try {
                bzmArray[i3] = this.dg(list2.get(i3));
                continue;
            }
            catch (bg bg3) {
                throw new bg("SFStateChange " + i3 + " could not be created.", bg3);
            }
        }
        bzn bzn2 = new bzn();
        bzn2.c(c2);
        bzn2.a(bziArray);
        bzn2.a(bzmArray);
        return bzn2;
    }

    private bzi da(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'Name' has invalid value.");
        }
        int n = byw.gR(string);
        bzi bzi2 = null;
        switch (n) {
            case 1: {
                bzi2 = this.dc(node);
                break;
            }
            case 5: {
                bzi2 = this.dd(node);
                break;
            }
            case 2: {
                bzi2 = this.db(node);
                break;
            }
            case 3: {
                bzi2 = this.de(node);
                break;
            }
            case 4: {
                bzi2 = this.df(node);
                break;
            }
            default: {
                throw new bj("RequirementName '" + string + "' is invalid.");
            }
        }
        boolean bl = jsy.f(node, "CheckInverse");
        bzi2.fk(bl);
        return bzi2;
    }

    private byy db(Node node) {
        String string = jsy.c(node, "ModeName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'ModeName' has invalid value.");
        }
        int n = byw.gJ(string);
        if (n <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "ModeValueName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'ModeValueName' has invalid value.");
        }
        int n2 = byw.n(n, string2);
        if (n2 <= 0) {
            throw new bj("ModeValueName '" + string2 + "' is invalid.");
        }
        byy byy2 = new byy();
        byy2.fK(n);
        byy2.fO(n2);
        return byy2;
    }

    private byp dc(Node node) {
        byp byp2 = new byp();
        boolean bl = jsy.f(node, "JumpSkillTriggered");
        byp2.fi(bl);
        return byp2;
    }

    private byh dd(Node node) {
        byh byh2 = new byh();
        boolean bl = jsy.f(node, "EvadeSkillTriggered");
        byh2.fh(bl);
        return byh2;
    }

    private bze de(Node node) {
        bze bze2 = new bze();
        String string = jsy.h(node, "Contact");
        if (string != null) {
            bze2.oi(1);
            boolean bl = Boolean.parseBoolean(string);
            bze2.fn(bl);
            return bze2;
        }
        string = jsy.h(node, "InTheWater");
        if (string != null) {
            bze2.oi(2);
            boolean bl = Boolean.parseBoolean(string);
            bze2.fn(bl);
            return bze2;
        }
        string = jsy.h(node, "LadderContact");
        if (string != null) {
            bze2.oi(3);
            boolean bl = Boolean.parseBoolean(string);
            bze2.fn(bl);
            return bze2;
        }
        string = jsy.h(node, "Rest");
        if (string != null) {
            bze2.oi(4);
            boolean bl = Boolean.parseBoolean(string);
            bze2.fn(bl);
            return bze2;
        }
        string = jsy.h(node, "Stable");
        if (string != null) {
            bze2.oi(5);
            boolean bl = Boolean.parseBoolean(string);
            bze2.fn(bl);
            return bze2;
        }
        throw new bg("No PhysicsStateRequirements was found.");
    }

    private byt df(Node node) {
        byt byt2 = new byt();
        List<Node> list = jsy.c("SFMovementSkillName", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFMovementSkillName' nodes found.");
        }
        int[] nArray = new int[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            Node node2 = list.get(i2);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFMovementSkillName' has invalid value.");
            }
            if (string.equalsIgnoreCase("NULL")) {
                if (list.size() > 1) {
                    throw new bj("NULL should only be used when there is only one 'SFMovementSkillName' node.");
                }
                nArray[i2] = 0;
                continue;
            }
            int n2 = kbi.eM(node2);
            if (n2 <= 0) {
                throw new bj("Node 'SFMovementSkillName' has invalid value.");
            }
            nArray[i2] = n2;
        }
        byt2.w(nArray);
        return byt2;
    }

    private bzm dg(Node node) {
        String string = jsy.c(node, "ModeName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeName' has invalid value.");
        }
        int n = byw.gJ(string);
        if (n <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "ModeValueName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n2 = byw.n(n, string2);
        if (n2 <= 0) {
            throw new bj("ModeValueName '" + string2 + "' is invalid.");
        }
        bzm bzm2 = new bzm();
        bzm2.fK(n);
        bzm2.og(n2);
        return bzm2;
    }

    private bzb dh(Node node) {
        int n;
        Object object;
        bzb bzb2 = new bzb();
        Node node2 = jsy.d("SFModeName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeName' has invalid value.");
        }
        int n2 = byw.gJ(string);
        if (n2 <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        bzb2.fK(n2);
        node2 = jsy.d("SFPreviousModeValueName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFPreviousModeValueName' has invalid value.");
        }
        if (string2.equalsIgnoreCase("Any Value")) {
            bzb2.of(0);
        } else {
            int n3 = byw.n(n2, string2);
            if (n3 <= 0) {
                throw new bj("PreviousModeValueName '" + string2 + "' is invalid.");
            }
            bzb2.of(n3);
        }
        node2 = jsy.d("SFNewModeValueName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFNewModeValueName' has invalid value.");
        }
        if (string3.equalsIgnoreCase("Any Value")) {
            bzb2.og(0);
        } else {
            int n4 = byw.n(n2, string3);
            if (n4 <= 0) {
                throw new bj("NewModeValueName '" + string3 + "' is invalid.");
            }
            bzb2.og(n4);
        }
        List<Node> list = jsy.c("SFOperationRequirement", node);
        if (!list.isEmpty()) {
            object = new bza[list.size()];
            n = ((Object)object).length;
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    object[i2] = this.di(list.get(i2));
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("'SFOperationRequirement' " + i2 + " could not be created.", bg2);
                }
            }
            bzb2.a((bza[])object);
        }
        if ((object = jsy.c("SFOperationName", node)).isEmpty()) {
            throw new bj("No 'SFOperationName' nodes was found.");
        }
        byw.d[] dArray = new byw.d[object.size()];
        int n5 = dArray.length;
        for (n = 0; n < n5; ++n) {
            try {
                String string4 = jsy.m((Node)object.get(n));
                if (string4 == null || string4.trim().equals("")) {
                    throw new bj("'SFOperationName' " + n + " has invalid value.");
                }
                dArray[n] = byw.d.getOperationType(string4);
                if (dArray[n] != null) continue;
                throw new bj("OperationName '" + string4 + "' is invalid.");
            }
            catch (bg bg3) {
                throw new bg("'SFOperationName' " + n + " could not be created.", bg3);
            }
        }
        bzb2.a(dArray);
        List<Node> list2 = jsy.c("SFEventName", node);
        if (!list2.isEmpty()) {
            byw.c[] cArray = new byw.c[list2.size()];
            int n6 = cArray.length;
            for (int i3 = 0; i3 < n6; ++i3) {
                try {
                    String string5 = jsy.m(list2.get(i3));
                    if (string5 == null || string5.trim().equals("")) {
                        throw new bj("'SFEventName' " + i3 + " has invalid value.");
                    }
                    cArray[i3] = byw.c.getEventType(string5);
                    if (cArray[i3] != null) continue;
                    throw new bj("EventName '" + string5 + "' is invalid.");
                }
                catch (bg bg4) {
                    throw new bg("'SFEventName' " + i3 + " could not be created.", bg4);
                }
            }
            bzb2.a(cArray);
        }
        return bzb2;
    }

    private bza di(Node node) {
        Node node2 = jsy.d("SFCheckInverse", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFCheckNewModeValue", node);
        boolean bl2 = jsy.t(node2);
        node2 = jsy.d("SFModeName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeName' has invalid value.");
        }
        int n = byw.gJ(string);
        if (n <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFModeValueName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n2 = byw.n(n, string2);
        if (n2 <= 0) {
            throw new bj("ModeValueName '" + string2 + "' is invalid.");
        }
        bza bza2 = new bza();
        bza2.fk(bl);
        bza2.fl(bl2);
        bza2.fO(n2);
        return bza2;
    }
}

