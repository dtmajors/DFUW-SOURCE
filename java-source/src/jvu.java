/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvu {
    public static final String TC = "SFTrainingTasksParser";
    private cju oUv = lea.epr();
    private SortedMap<Integer, cjr> oUw = this.oUv.aQi();

    public void eL(String string) {
        try {
            int n;
            Object object;
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("Tasks", (Node)document);
            if (node == null) {
                throw new bn("Tasks");
            }
            Node node2 = jsy.d("StarterAreaMessage", node);
            String string2 = jsy.i(node2, "Value");
            Node node3 = jsy.d("Barriers", node);
            List<Node> list = jsy.c("Barrier", node3);
            for (Node node4 : list) {
                object = jsy.i(node4, "SpecialEffectName");
                n = Integer.parseInt(jsy.i(node4, "Sensor"));
                int n2 = Integer.parseInt(jsy.i(node4, "Task"));
                this.oUv.b(n2, n, (String)object);
            }
            Node node5 = jsy.d("BackPackEnable", node);
            int n3 = Integer.parseInt(jsy.i(node5, "Index"));
            object = jsy.d("PaperDollEnable", node);
            n = Integer.parseInt(jsy.i((Node)object, "Index"));
            Node node6 = jsy.d("RadialEnable", node);
            int n4 = Integer.parseInt(jsy.i(node6, "Index"));
            Node node7 = jsy.d("MainMenuEnabled", node);
            int n5 = Integer.parseInt(jsy.i(node7, "Index"));
            this.oUv.eEn = string2;
            this.oUv.eEo = n3;
            this.oUv.eEp = n;
            this.oUv.eEq = n4;
            this.oUv.eEr = n5;
            List<Node> list2 = jsy.c("Task", node);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("Task");
            }
            for (Node node8 : list2) {
                cjr cjr2 = this.aE(node8);
                if (cjr2 == null) {
                    lfn.b(5, TC, "parseFile() Task : " + node8 + " is invalid");
                    assert (false);
                    continue;
                }
                if (this.oUw.containsKey(cjr2.adk)) {
                    lfn.b(5, TC, "parseFile() TAsk : " + cjr2.Name + " is invalid. Index : " + cjr2.adk + " already registered.");
                    assert (false);
                    continue;
                }
                this.oUw.put(cjr2.adk, cjr2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private cjr aE(Node node) {
        Object object;
        Node node22;
        String string = jsy.i(node, "Name");
        if (string == null || string.isEmpty()) {
            return null;
        }
        int n = Integer.parseInt(jsy.i(node, "Index"));
        if (n < 0) {
            return null;
        }
        Node node3 = jsy.a("ImageName", node);
        String string2 = node3 != null ? jsy.i(node3, "Value") : "";
        Node node4 = jsy.d("StartMessage", node);
        String string3 = jsy.i(node4, "Value");
        Node node5 = jsy.a("SpecialEffectName", node);
        String string4 = node5 != null ? jsy.i(node5, "Value") : "";
        Node node6 = jsy.a("Sensor", node);
        int n2 = node6 != null ? Integer.parseInt(jsy.i(node6, "Value")) : -1;
        Node node7 = jsy.d("Trigger", node);
        cjf cjf2 = this.aG(node7);
        ArrayList<cjs> arrayList = lcn.emv();
        List<Node> list = jsy.c("Reward", node);
        if (list != null) {
            for (Node node22 : list) {
                object = this.aF(node22);
                if (object == null) continue;
                arrayList.add((cjs)object);
            }
        }
        Object object2 = null;
        node22 = jsy.a("Configuration", node);
        if (node22 != null) {
            cjq.a a2;
            object = jsy.i(node22, "Type");
            assert (object != null);
            cjq.a a3 = a2 = object != null ? cjq.a.getValueByName((String)object) : null;
            assert (a2 != null);
            int n3 = Integer.parseInt(jsy.i(node22, "Index"));
            String string5 = jsy.i(node22, "Item");
            int n4 = -1;
            switch (a2) {
                case eEe: {
                    n4 = lea.enW().getType(string5);
                    break;
                }
                case eEf: {
                    n4 = lea.enZ().getType(string5);
                }
            }
            assert (n4 != -1) : "Invalid ResourceName : " + string5;
            object2 = new cjq();
            ((cjq)object2).eEd = a2;
            ((cjq)object2).adk = n3;
            ((cjq)object2).eDY = n4;
        }
        object = new cjr();
        ((cjr)object).eEh = string2;
        ((cjr)object).eEj = string4;
        ((cjr)object).adk = n;
        ((cjr)object).Name = string;
        ((cjr)object).bhg = arrayList;
        ((cjr)object).eEi = string3;
        ((cjr)object).eDE = cjf2;
        ((cjr)object).eEl = object2;
        ((cjr)object).eEk = n2;
        return object;
    }

    private cjs aF(Node node) {
        String string = jsy.i(node, "ContainerName");
        ArrayList<cjt> arrayList = lcn.emv();
        List<Node> list = jsy.c("Item", node);
        if (list == null) {
            throw new bn("Item");
        }
        for (Node node2 : list) {
            cjt cjt2 = this.aw(node2);
            arrayList.add(cjt2);
        }
        cjs cjs2 = new cjs();
        cjs2.eEa = string;
        cjs2.aCN = arrayList;
        return cjs2;
    }

    private cjt aw(Node node) {
        String string = jsy.i(node, "ResourceName");
        int n = Integer.parseInt(jsy.i(node, "Counter"));
        cjt cjt2 = new cjt();
        cjt2.ResourceType = cug.ih((String)string);
        cjt2.ayN = n;
        return cjt2;
    }

    private cjf aG(Node node) {
        cjo cjo2 = cjo.getTriggerType(jsy.i(node, "Type"));
        switch (cjo2) {
            case DIRECTION: {
                cjg cjg2 = new cjg();
                this.a(cjg2, node);
                return cjg2;
            }
            case SKILL: {
                cjn cjn2 = new cjn();
                this.a(cjn2, node);
                return cjn2;
            }
            case EQUIP_UNSHEATH: {
                cjh cjh2 = new cjh();
                this.a(cjh2, node);
                return cjh2;
            }
            case KILL: {
                cjj cjj2 = new cjj();
                this.a(cjj2, node);
                return cjj2;
            }
            case LOCATION: {
                cjl cjl2 = new cjl();
                this.a(cjl2, node);
                return cjl2;
            }
            case GUI: {
                cji cji2 = new cji();
                this.a(cji2, node);
                return cji2;
            }
            case POSTURE_MODE: {
                cjm cjm2 = new cjm();
                this.a(cjm2, node);
                return cjm2;
            }
            case LAST: {
                cjk cjk2 = new cjk();
                this.a(cjk2, node);
                return cjk2;
            }
        }
        return null;
    }

    private void a(cjg cjg2, Node node) {
        this.a((cjf)cjg2, node);
    }

    private void a(cjh cjh2, Node node) {
        this.a((cjf)cjh2, node);
        Node node2 = jsy.d("ResourceName", node);
        String string = jsy.i(node2, "Value");
        Node node3 = jsy.a("Equip", node);
        String string2 = node3 != null ? jsy.i(node3, "Value") : null;
        cgc cgc2 = new cgc(string2 != null ? Boolean.parseBoolean(string2) : false, string2 == null);
        Node node4 = jsy.a("Unsheath", node);
        String string3 = node4 != null ? jsy.i(node4, "Value") : null;
        cgc cgc3 = new cgc(string3 != null ? Boolean.parseBoolean(string3) : false, string3 == null);
        cjh2.ResourceType = cug.ih((String)string);
        cjh2.eDW = cgc2;
        cjh2.eDV = cgc3;
    }

    private void a(cjn cjn2, Node node) {
        boolean bl;
        this.a((cjf)cjn2, node);
        Node node2 = jsy.a("ResourceName", node);
        String string = node2 != null ? jsy.i(node2, "Value") : null;
        Node node3 = jsy.d("SkillName", node);
        String string2 = jsy.i(node3, "Value");
        Node node4 = jsy.d("Duration", node);
        cjn2.eAg = bl = Boolean.parseBoolean(jsy.i(node4, "Value"));
        cjn2.ResourceType = string != null ? cug.ih((String)string) : -1;
        cjn2.SkillType = cxd.ip((String)string2);
    }

    private void a(cjj cjj2, Node node) {
        this.a((cjf)cjj2, node);
        Node node2 = jsy.d("ResourceName", node);
        String string = jsy.i(node2, "Value");
        Node node3 = jsy.d("Counter", node);
        int n = Integer.parseInt(jsy.i(node3, "Value"));
        cjj2.ResourceType = cug.ih((String)string);
        cjj2.ayN = n;
    }

    private void a(cjl cjl2, Node node) {
        int n;
        this.a((cjf)cjl2, node);
        Node node2 = jsy.d("Sensor", node);
        cjl2.dPu = n = Integer.parseInt(jsy.i(node2, "Value"));
    }

    private void a(cji cji2, Node node) {
        this.a((cjf)cji2, node);
        Node node2 = jsy.d("Action", node);
        String string = jsy.i(node2, "Value");
        cja cja2 = cja.getValueByName(string);
        if (cja2 == null) {
            throw new bj(string);
        }
        Node node3 = jsy.a("ItemName", node);
        String string2 = node3 != null ? jsy.i(node3, "Value") : null;
        int n = -1;
        switch (cja2) {
            case eDu: 
            case eDy: {
                n = string2 != null ? lea.enZ().getType(string2) : -1;
                break;
            }
            case eDA: {
                n = string2 != null ? lea.enW().getType(string2) : -1;
                break;
            }
        }
        Node node4 = jsy.a("SlotIndex", node);
        int n2 = node4 != null ? Integer.valueOf(jsy.i(node4, "Value")) : -1;
        cji2.eAa = cja2;
        cji2.eDY = n;
        cji2.eDX = n2;
    }

    private void a(cjm cjm2, Node node) {
        this.a((cjf)cjm2, node);
        Node node2 = jsy.d("SFPostureModeName", node);
        String string = jsy.i(node2, "Value");
        int n = byw.gO(string);
        if (n == -1) {
            throw new bj("Posture Mode : " + string + " is invalid.");
        }
        cjm2.dRh = n;
    }

    private void a(cjk cjk2, Node node) {
        this.a((cjf)cjk2, node);
    }

    private void a(cjf cjf2, Node node) {
        int n;
        Node node2 = jsy.a("Counter", node);
        cjf2.ayN = n = node2 != null ? Integer.parseInt(jsy.i(node2, "Value")) : 0;
    }
}

