/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;

public class myy {
    private jrw EUP = new jrw(lcw.qLb + "xml-files/objectspace/" + "terr" + "/");
    private int EUQ = 32;
    myx[] EUR;

    public void eTn() {
        this.eTp();
    }

    public myx[] eTo() {
        Object object;
        boolean bl;
        myx[] myxArray = null;
        if (!this.EUP.exists() && !(bl = this.EUP.mkdir())) {
            object = "Destination Dir [" + this.EUP + "] does not exist!";
            assert (false) : object;
            System.out.println("Error: createTerrainXMLFiles() : " + (String)object);
        }
        String string = null;
        object = null;
        ArrayList<myx> arrayList = lcn.emv();
        String[] stringArray = lcw.qQy;
        String[] stringArray2 = lcw.qQz;
        int n2 = 100;
        for (int i = 0; i < this.EUQ; ++i) {
            for (int j = 0; j < this.EUQ; ++j) {
                string = stringArray[j] + stringArray2[i];
                string = string.toLowerCase();
                object = lcw.zh((String)string);
                ((ljq)object).x += 512.0f;
                ((ljq)object).rlV += 512.0f;
                string = string + ".xml";
                myx myx2 = new myx();
                myx2.setName(string);
                myx2.c((ljq)object);
                myx2.afU(n2);
                arrayList.add(myx2);
                ++n2;
            }
        }
        myxArray = arrayList.toArray(new myx[arrayList.size()]);
        return myxArray;
    }

    private void eTp() {
        String string;
        int n2;
        boolean bl;
        this.EUP = new jrw(lcw.qLb + "xml-files/objectspace/" + "border_tiles" + "/");
        if (!this.EUP.exists() && !(bl = this.EUP.mkdir())) {
            String string2 = "Destination Dir [" + this.EUP + "] does not exist!";
            assert (false) : string2;
            System.out.println("Error: createTerrainXMLFiles() : " + string2);
        }
        ArrayList<myx> arrayList = lcn.emv();
        int n3 = 1124;
        String string3 = null;
        string3 = "a01";
        ljq ljq2 = lcw.zh((String)string3);
        ljq2.x -= 512.0f;
        ljq2.rlV += 1536.0f;
        myx myx2 = new myx();
        myx2.setName("end_of_world_tile_nw_01.xml");
        myx2.Ef(myx2.getName());
        myx2.c(ljq2);
        myx2.afU(n3);
        arrayList.add(myx2);
        ++n3;
        string3 = "ff01";
        ljq2 = lcw.zh((String)string3);
        ljq2.x += 1536.0f;
        ljq2.rlV += 1536.0f;
        myx2 = new myx();
        myx2.setName("end_of_world_tile_ne_01.xml");
        myx2.Ef(myx2.getName());
        myx2.c(ljq2);
        myx2.afU(n3);
        arrayList.add(myx2);
        ++n3;
        string3 = "ff32";
        ljq2 = lcw.zh((String)string3);
        ljq2.x += 1536.0f;
        ljq2.rlV -= 512.0f;
        myx2 = new myx();
        myx2.setName("end_of_world_tile_se_01.xml");
        myx2.Ef(myx2.getName());
        myx2.c(ljq2);
        myx2.afU(n3);
        arrayList.add(myx2);
        ++n3;
        string3 = "a32";
        ljq2 = lcw.zh((String)string3);
        ljq2.x -= 512.0f;
        ljq2.rlV -= 512.0f;
        myx2 = new myx();
        myx2.setName("end_of_world_tile_sw_01.xml");
        myx2.Ef(myx2.getName());
        myx2.c(ljq2);
        myx2.afU(n3);
        arrayList.add(myx2);
        ++n3;
        string3 = "a01";
        ljq2 = lcw.zh((String)string3);
        ljq2.rlV += 1536.0f;
        ljq2.x += 512.0f;
        int n4 = 32;
        for (n2 = 1; n2 <= n4; ++n2) {
            string = Integer.toString(n2);
            if (n2 < 10) {
                string = "0" + n2;
            }
            myx2 = new myx();
            myx2.setName("end_of_world_tile_n_" + string);
            myx2.c(ljq2);
            myx2.afU(n3);
            myx2.Ef("end_of_world_tile_n_01.xml");
            arrayList.add(myx2);
            ++n3;
            ljq2 = new ljq(ljq2);
            ljq2.x += 1024.0f;
        }
        string3 = "a32";
        ljq2 = lcw.zh((String)string3);
        ljq2.rlV -= 512.0f;
        ljq2.x += 512.0f;
        n4 = 32;
        for (n2 = 1; n2 <= n4; ++n2) {
            string = Integer.toString(n2);
            if (n2 < 10) {
                string = "0" + n2;
            }
            myx2 = new myx();
            myx2.setName("end_of_world_tile_s_" + string);
            myx2.c(ljq2);
            myx2.afU(n3);
            myx2.Ef("end_of_world_tile_s_01.xml");
            arrayList.add(myx2);
            ++n3;
            ljq2 = new ljq(ljq2);
            ljq2.x += 1024.0f;
        }
        string3 = "ff01";
        ljq2 = lcw.zh((String)string3);
        ljq2.rlV += 512.0f;
        ljq2.x += 1536.0f;
        n4 = 32;
        for (n2 = 1; n2 <= n4; ++n2) {
            string = Integer.toString(n2);
            if (n2 < 10) {
                string = "0" + n2;
            }
            myx2 = new myx();
            myx2.setName("end_of_world_tile_e_" + string);
            myx2.c(ljq2);
            myx2.afU(n3);
            myx2.Ef("end_of_world_tile_e_01.xml");
            arrayList.add(myx2);
            ++n3;
            ljq2 = new ljq(ljq2);
            ljq2.rlV -= 1024.0f;
        }
        string3 = "a01";
        ljq2 = lcw.zh((String)string3);
        ljq2.rlV += 512.0f;
        ljq2.x -= 512.0f;
        n4 = 32;
        for (n2 = 1; n2 <= n4; ++n2) {
            string = Integer.toString(n2);
            if (n2 < 10) {
                string = "0" + n2;
            }
            myx2 = new myx();
            myx2.setName("end_of_world_tile_w_" + string);
            myx2.c(ljq2);
            myx2.afU(n3);
            myx2.Ef("end_of_world_tile_w_01.xml");
            arrayList.add(myx2);
            ++n3;
            ljq2 = new ljq(ljq2);
            ljq2.rlV -= 1024.0f;
        }
        this.a(arrayList.toArray(new myx[arrayList.size()]), true);
    }

    private void a(myx[] myxArray) {
        this.a(myxArray, false);
    }

    private void a(myx[] myxArray, boolean bl) {
        for (int i = 0; i < myxArray.length; ++i) {
            Object object;
            myx myx2 = myxArray[i];
            lfn.b(0, this.getClass().getName(), "writeTerrainFiles() : Name is =" + myx2.getName());
            jrw jrw2 = null;
            jrw2 = new jrw(this.EUP + "/" + myx2.getName());
            if (bl) {
                boolean bl2;
                object = new jrw(this.EUP + "/" + jry.tu(myx2.getName()));
                if (!((File)object).exists() && !(bl2 = ((File)object).mkdir())) {
                    lfn.b(0, this.getClass().getSimpleName(), "writeGenericSeaTerrainFiles() : Could not create dir ->" + object);
                }
                jrw2 = new jrw(((File)object).getAbsolutePath() + "/" + myx2.getName());
            }
            object = null;
            object = myx2.eTm() == null ? this.a("terrain_" + myx2.getName(), myx2.av(), myx2.eTl()) : this.a(myx2.eTm(), myx2.av(), myx2.eTl());
            Document document = jsy.tL((String)object);
            jsz.a(document, jrw2);
        }
    }

    private void a(myx[] myxArray, List<String> list) {
        int n2 = 100;
        for (int i = 0; i < myxArray.length; ++i) {
            boolean bl;
            myx myx2 = myxArray[i];
            if (!list.contains(myx2.getName())) continue;
            lfn.b(0, this.getClass().getName(), "writeTerrainFiles() : Name is =" + myx2.getName());
            jrw jrw2 = new jrw(this.EUP + "/" + jry.tu(myx2.getName()));
            if (!jrw2.exists() && !(bl = jrw2.mkdir())) {
                lfn.b(0, this.getClass().getSimpleName(), "writeGenericSeaTerrainFiles() : Could not create dir ->" + jrw2);
            }
            jrw jrw3 = new jrw(jrw2.getAbsolutePath() + "/" + myx2.getName());
            String string = this.a(jrw3, myx2.av(), n2);
            Document document = jsy.tL(string);
            jsz.a(document, jrw3);
        }
    }

    public int Eg(String string) {
        string = string + ".xml";
        if (this.EUR == null) {
            this.EUR = this.eTo();
        }
        for (myx myx2 : this.EUR) {
            if (!myx2.getName().equals(string)) continue;
            return myx2.eTl();
        }
        assert (false);
        return -1;
    }

    private String a(String string, ljq ljq2, int n2) {
        String string2 = "";
        string2 = string2 + "<SFObjectSpace>\n";
        string2 = string2 + "<ObjectSpaceGuid>\n";
        string2 = string2 + "<SFInteger Value=\"" + Integer.toString(n2) + "\"/>\n";
        string2 = string2 + "</ObjectSpaceGuid>\n";
        string2 = string2 + "<VersionInformation Major=\"0\" Minor=\"1\"/>\n";
        string2 = string2 + "<ObjectSpaceName>\n";
        string2 = string2 + "<SFString Value=\"" + string + "\"/>\n";
        string2 = string2 + "</ObjectSpaceName>\n";
        string2 = string2 + "<ObjectSpaceType>\n";
        string2 = string2 + "<SFInteger Value=\"1\"/>\n";
        string2 = string2 + "</ObjectSpaceType>\n";
        string2 = string2 + "<SFWorldMeshObject>\n";
        string2 = string2 + "<Guid>\n";
        string2 = string2 + "<SFInteger Value=\"1\"/>\n";
        string2 = string2 + "</Guid>\n";
        string2 = string2 + "    <ResourceType>\n";
        string2 = string2 + "        <SFInteger Value=\"24\"/>\n";
        string2 = string2 + "    </ResourceType>\n";
        string2 = string2 + "<Position>\n";
        string2 = string2 + "<SFVector3 X=\"" + ljq2.x + "\" Y=\"" + ljq2.y + "\" Z=\"" + ljq2.rlV + "\"/>\n";
        string2 = string2 + "</Position>\n";
        string2 = string2 + "<Rotation>\n";
        string2 = string2 + "<SFVector3 X=\"0.0\" Y=\"0.0\" Z=\"0.0\"/>\n";
        string2 = string2 + "</Rotation>\n";
        string2 = string2 + "<Scale>\n";
        string2 = string2 + "<SFFloat Value=\"1.0\"/>\n";
        string2 = string2 + "</Scale>\n";
        string2 = string2 + "<DescriptionFilename>\n";
        string2 = string2 + "<SFString Value=\"" + "terrain/" + string + "\"/>\n";
        string2 = string2 + "</DescriptionFilename>\n";
        string2 = string2 + "</SFWorldMeshObject>\n";
        string2 = string2 + "</SFObjectSpace>\n";
        return string2;
    }

    private String a(jrw jrw2, ljq ljq2, int n2) {
        String string = "";
        String string2 = jrw2.getName().substring(0, jrw2.getName().lastIndexOf("."));
        string = string + "<SFObjectSpace>\n";
        string = string + "<ObjectSpaceGuid>\n";
        string = string + "<SFInteger Value=\"" + Integer.toString(n2) + "\"/>\n";
        string = string + "</ObjectSpaceGuid>\n";
        string = string + "<VersionInformation Major=\"0\" Minor=\"1\"/>\n";
        string = string + "<ObjectSpaceName>\n";
        string = string + "<SFString Value=\"" + string2 + "(SEA)\"/>\n";
        string = string + "</ObjectSpaceName>\n";
        string = string + "<ObjectSpaceType>\n";
        string = string + "<SFInteger Value=\"1\"/>\n";
        string = string + "</ObjectSpaceType>\n";
        string = string + "<SFWorldMeshObject>\n";
        string = string + "<Guid>\n";
        string = string + "<SFInteger Value=\"1\"/>\n";
        string = string + "</Guid>\n";
        string = string + "    <ResourceType>\n";
        string = string + "        <SFInteger Value=\"24\"/>\n";
        string = string + "    </ResourceType>\n";
        string = string + "<Position>\n";
        string = string + "<SFVector3 X=\"" + ljq2.x + "\" Y=\"" + ljq2.y + "\" Z=\"" + ljq2.rlV + "\"/>\n";
        string = string + "</Position>\n";
        string = string + "<Rotation>\n";
        string = string + "<SFVector3 X=\"0.0\" Y=\"0.0\" Z=\"0.0\"/>\n";
        string = string + "</Rotation>\n";
        string = string + "<Scale>\n";
        string = string + "<SFFloat Value=\"1.0\"/>\n";
        string = string + "</Scale>\n";
        string = string + "<DescriptionFilename>\n";
        string = string + "<SFString Value=\"" + "terrain\\underwater_tile_01.xml\"/>\n";
        string = string + "</DescriptionFilename>\n";
        string = string + "</SFWorldMeshObject>\n";
        string = string + "<SFWorldMeshObject>\n";
        string = string + "<Guid>\n";
        string = string + "<SFInteger Value=\"2\"/>\n";
        string = string + "</Guid>\n";
        string = string + "    <ResourceType>\n";
        string = string + "        <SFInteger Value=\"5\"/>\n";
        string = string + "    </ResourceType>\n";
        string = string + "<Position>\n";
        string = string + "<SFVector3 X=\"" + ljq2.x + "\" Y=\"" + ljq2.y + "\" Z=\"" + ljq2.rlV + "\"/>\n";
        string = string + "</Position>\n";
        string = string + "<Rotation>\n";
        string = string + "<SFVector3 X=\"0.0\" Y=\"0.0\" Z=\"0.0\"/>\n";
        string = string + "</Rotation>\n";
        string = string + "<Scale>\n";
        string = string + "<SFFloat Value=\"1.0\"/>\n";
        string = string + "</Scale>\n";
        string = string + "<DescriptionFilename>\n";
        string = string + "<SFString Value=\"" + "terrain\\water_level_textured.xml\"/>\n";
        string = string + "</DescriptionFilename>\n";
        string = string + "</SFWorldMeshObject>\n";
        string = string + "</SFObjectSpace>\n";
        return string;
    }
}

