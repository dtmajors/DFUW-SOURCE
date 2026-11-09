/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  jzc
 *  lcw
 */
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyw {
    private final String pau = lcw.qLb + "xml-files/object/spawnpoint/";
    private final lju paq = new lju(0, 1);
    private final jzc par = new jzc();
    private final jzc pax = new jzc();

    public boolean a(ari ari2) {
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFSpawnPoint", this.paq);
        document.appendChild(element);
        this.a(document, element, ari2);
        String string = ari2.getName() + ".xml";
        jrw jrw2 = new jrw(this.pau + string);
        return jsz.a(document, jrw2);
    }

    private void a(Document document, Element element, ari ari2) {
        Element element2;
        Object object;
        String string;
        Object object2;
        ldv ldv2 = ari2.Rk();
        if (ldv2 == null) {
            ldv2 = new jxl().vi(ari2.getName());
        }
        Element element3 = this.par.b(document, ldv2, "Guid");
        element.appendChild(element3);
        element3 = document.createElement("SpawnPointName");
        element3.setAttribute("Value", ari2.getName());
        element.appendChild(element3);
        element3 = document.createElement("Radius");
        element3.setAttribute("Value", Float.toString(ari2.getRadius()));
        element.appendChild(element3);
        element3 = document.createElement("SummoningRitual");
        element3.setAttribute("Value", Boolean.toString(ari2.Rg()));
        element.appendChild(element3);
        element3 = document.createElement("EnableSpawnFrenzy");
        element3.setAttribute("Value", Boolean.toString(ari2.Rz()));
        element.appendChild(element3);
        element3 = document.createElement("Event");
        element3.setAttribute("Value", Boolean.toString(ari2.Rh()));
        element.appendChild(element3);
        if (ari2.Rt() != null) {
            element3 = document.createElement("SpawnPointBossMob");
            element3.setAttribute("ResourceName", ari2.Rt());
            element3.setAttribute("MinSpawnTime", Float.toString(ari2.Rv()));
            element3.setAttribute("MaxSpawnTime", Float.toString(ari2.Ru()));
            object2 = ari2.RE();
            element3.setAttribute("SpawnCondition", ((Enum)object2).toString());
            string = null;
            switch (1.bOf[((Enum)object2).ordinal()]) {
                case 1: 
                case 2: {
                    string = String.valueOf(ari2.Ry());
                    break;
                }
                case 3: {
                    string = lea.enW().getName(ari2.Ry());
                }
            }
            element3.setAttribute("SpawnConditionValue", string);
            if (ari2.Rw() != null) {
                object = document.createElement("SpawnPosition");
                element2 = this.pax.a(document, ari2.Rw());
                object.appendChild(element2);
                element3.appendChild((Node)object);
            }
            element.appendChild(element3);
        }
        element3 = document.createElement("SpawnPointMOBSNumber");
        element3.setAttribute("Value", Integer.toString(ari2.Ro()));
        element.appendChild(element3);
        if (ari2.Rp().size() > 0) {
            object2 = ari2.Rp().keySet().iterator();
            element3 = document.createElement("ResourceSpawnList");
            element.appendChild(element3);
            while (object2.hasNext()) {
                string = (String)object2.next();
                object = (Integer)ari2.Rp().get(string);
                element2 = document.createElement("ResourceSpawn");
                element2.setAttribute("ResourceName", string);
                element2.setAttribute("Probability", Integer.toString((Integer)object));
                element3.appendChild(element2);
            }
        }
        element3 = document.createElement("RespawnDelay");
        element3.setAttribute("MinSpawnTime", Float.toString(ari2.Rn()));
        element3.setAttribute("MaxSpawnTime", Float.toString(ari2.Rm()));
        element.appendChild(element3);
        if (ari2.Rq() != null && !ari2.Rq().equals("")) {
            element3 = document.createElement("SFNavMesh");
            element3.setAttribute("Name", ari2.Rq());
            element3.setAttribute("Type", ari2.Rr().name());
            element.appendChild(element3);
        }
    }

    private void b(Document document, Element element, ari ari2) {
        Element element2;
        ldv ldv2 = ari2.Rk();
        if (ldv2 == null) {
            ldv2 = new jxl().vi(ari2.getName());
        }
        Element element3 = this.par.b(document, ldv2, "Guid");
        element.appendChild(element3);
        element3 = this.par.a(document, ari2.getName(), "SpawnPointName");
        element.appendChild(element3);
        element3 = this.par.a(document, ari2.getRadius(), "Radius");
        element.appendChild(element3);
        if (ari2.Rp().size() > 0) {
            Iterator iterator = ari2.Rp().keySet().iterator();
            element2 = document.createElement("ResourceSpawnList");
            element.appendChild(element2);
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                Integer n = (Integer)ari2.Rp().get(string);
                Element element4 = document.createElement("ResourceSpawn");
                element3 = this.par.a(document, string, "SFResourceName");
                element4.appendChild(element3);
                element3 = this.par.a(document, n.intValue(), "SpawnPointResourceSpawnProbability");
                element4.appendChild(element3);
                element2.appendChild(element4);
            }
        }
        element2 = document.createElement("SpawnPointMOBSNumber");
        element.appendChild(element2);
        element3 = this.par.a(document, ari2.Ro(), "SpawnPointMOBSNumberMax");
        element2.appendChild(element3);
        element2 = document.createElement("RespawnIndividualDelay");
        element.appendChild(element2);
        element3 = this.par.a(document, ari2.Rn(), "SpawnPointRespawnIndividualDelayMin");
        element2.appendChild(element3);
        element3 = this.par.a(document, ari2.Rm(), "SpawnPointRespawnIndividualDelayMax");
        element2.appendChild(element3);
        if (ari2.Rq() != null && !ari2.Rq().equals("")) {
            element2 = document.createElement("SFNavMesh");
            element.appendChild(element2);
            element3 = this.par.a(document, ari2.Rq(), "SpawnPointNavMeshName");
            element2.appendChild(element3);
            element3 = this.par.a(document, ari2.Rr().name(), "SpawnPointNavMeshType");
            element2.appendChild(element3);
        }
    }

    private void c(Document document, Element element, ari ari2) {
        Element element2 = document.createElement("SpawnPointMOBSNumber");
        element.appendChild(element2);
        Element element3 = this.par.a(document, ari2.Ro(), "SpawnPointMOBSNumberMax");
        element2.appendChild(element3);
    }
}

