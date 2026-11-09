/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.Map;

public class del {
    public static final float fOl = -2.0f;
    public static final int gft = 1;
    public static final int gfu = 2;
    public static final int gfv = 3;
    public static final int gfw = 4;
    public static final int gfx = 5;
    public static final int gfy = 6;
    public static final int gfz = 7;
    public static final int gfA = 8;
    public static final int gfB = 9;
    public static final int gfC = 10;
    public static final int gfD = 11;
    public static final int gfE = 12;
    public static final int gfF = 13;
    public static final int gfG = 14;
    public static final int gfH = 15;
    public static final int gfI = 16;
    public static final int gfJ = 17;
    public static final int gfK = 18;
    public static final int gfL = 19;
    public static final int gfM = 20;
    public static final int gfN = 21;
    public static final int gfO = 22;
    public static final int gfP = 23;
    public static final int gfQ = 24;
    public static final int gfR = 25;
    public static final int gfS = 26;
    public static final int gfT = 27;
    public static final int gfU = 28;
    public static final int gfV = 29;
    public static final int gfW = 30;
    public static final int gfX = 31;
    public static final int gfY = 32;
    public static final int gfZ = 33;
    public static final int gga = 34;
    public static final int ggb = 35;
    public static final int ggc = 36;
    public static final int ggd = 37;
    public static final int gge = 38;
    public static final int ggf = 39;
    public static final int ggg = 40;
    public static final int ggh = 41;
    public static final int ggi = 42;
    public static final int ggj = 43;
    public static final int ggk = 44;
    public static final int ggl = 45;
    public static final int ggm = 46;
    public static final int ggn = 47;
    public static final int ggo = 48;
    public static final int ggp = 49;
    public static final int ggq = 50;
    public static final int ggr = 51;
    public static final int ggs = 52;
    public static final int ggt = 53;
    public static final int ggu = 54;
    public static final int ggv = 55;
    public static final int ggw = 56;
    public static final int ggx = 57;
    public static final int ggy = 58;
    public static final int ggz = 59;
    public static final int ggA = 60;
    public static final int ggB = 61;
    public static final int ggC = 62;
    public static final int ggD = 63;
    public static final int ggE = 64;
    public static final int ggF = 65;
    public static final int ggG = 66;
    public static final int ggH = 67;
    public static final int ggI = 68;
    public static final int ggJ = 69;
    public static final int ggK = 70;
    public static final int ggL = 71;
    public static final int ggM = 72;
    public static final int ggN = 73;
    public static final int ggO = 74;
    public static final int ggP = 75;
    public static final int ggQ = 76;
    public static final int ggR = 77;
    public static final int ggS = 78;
    public static final int ggT = 79;
    public static final int ggU = 80;
    public static final int ggV = 81;
    public static final int ggW = 82;
    public static final int ggX = 83;
    public static final int ggY = 84;
    public static final int ggZ = 85;
    public static final int gha = 86;
    public static final int ghb = 87;
    public static final int ghc = 88;
    public static final int ghd = 89;
    public static final int ghe = 90;
    public static final int ghf = 91;
    public static final int ghg = 92;
    public static final int ghh = 93;
    public static final int ghi = 94;
    public static final int ghj = 95;
    public static final int ghk = 96;
    public static final int ghl = 97;
    public static final int ghm = 98;
    public static final int ghn = 99;
    public static final int gho = 100;
    public static final int ghp = 101;
    public static final int ghq = 102;
    public static final int ghr = 103;
    public static final int ghs = 104;
    public static final int ght = 105;
    private static final String[] ghu = new String[]{"Undefined EffectClass", "EffectClass SpecialEffect", "EffectClass MainObject", "EffectClass ObjectParticleStream", "EffectClass ParticleMissileWithTrailAndLight", "EffectClass SingleLight", "EffectClass LightningGun", "EffectClass LightningBeam", "EffectClass MissileParticle", "EffectClass Explosion", "EffectClass Single3DAudio", "EffectClass ParticleTrail", "EffectClass Tracer", "EffectClass LightExplode", "EffectClass ParticleSphere", "EffectClass BloodSplatter", "EffectClass LightExpand", "EffectClass Object2ObjectParticleStream", "EffectClass LightningStorm", "EffectClass FlashingLight", "EffectClass LightSphereRandom", "EffectClass LightSphereOrbit", "EffectClass LightP2PRandom", "EffectClass ParticleSphereOrbit", "EffectClass ParticleSphereRandom", "EffectClass ParticleP2PRandom", "EffectClass ParticleMultiEmitter", "EffectClass 3DAudioP2PRandom", "EffectClass LightBurn", "EffectClass Point2PointParticleStream", "EffectClass Mesh", "EffectClass Particle DustBalls", "EffectClass Random 3D Audio", "EffectClass Animation Audio", "EffectClass Mesh P2P Random", "EffectClass Particle Fountain", "EffectClass Decapitate", "EffectClass Mesh Circle Orbit", "EffectClass Particle AttachPoint", "EffectClass HeadBash", "EffectClass Mesh Spell", "EffectClass Mesh AttachPoint", "EffectClass Random Single 3D Audio", "EffectClass Mesh Orient", "EffectClass Relation Particle Emitter", "EffectClass Explosion Particle System", "EffectClass Debris Particle System", "EffectClass Explosive Debris Particle System", "EffectClass Simple Mesh", "EffectClass Mesh Impale", "EffectClass Single Light Flash", "EffectClass Mesh P2P", "EffectClass Mesh Explode", "EffectClass 2D Flash", "EffectClass Mesh Simple", "EffectClass Physics Cylinder Force", "EffectClass Single Particle System", "EffectClass RenderBox", "EffectClass Infinite Camera Shaker", "EffectClass Mesh Stacker", "EffectClass Explosion OFFSET Particle System", "EffectClass Object2Position Particle Stream", "EffectClass Delayed SpecialEffect", "EffectClass Reassign Source To Target", "EffectClass Single2D Audio", "EffectClass Random Single Chance 3D Audio", "EffectClass Timed Mesh Explosion", "EffectClass Light Pulse SphereOrbit", "EffectClass Dynamic Tracer", "EffectClass Physics Source Target Force", "EffectClass Relation PositionSensor SFX Starter", "EffectClass 3DAudio Sphere PRandom", "EffectClass Mesh Grower", "EffectClass Particle Spiral", "EffectClass Light Spiral", "EffectClass Animated MissileParticle", "EffectClass Mesh Missile", "EffectClass Pulsating Light", "EffectClass Mesh BezierStacker", "EffectClass Switch Source Target Information", "EffectClass Start Effect On Cleanup", "EffectClass Random Target Position SFX Starter", "EffectClass Start Random SFX", "EffectClass Bone AttachPoint Mesh", "EffectClass Bone AttachPoint Particle", "EffectClass Bone AttachPoint Explosion Particle", "EffectClass LightningBeam Guard Towers", "EffectClass 2D Zoomer", "EffectClass Start SFX If Flag Set", "EffectClass Physics Sphere Force", "EffectClass Multi Light Burn", "EffectClass MissileParticle Trajectory ", "EffectClass Loop", "EffectClassComponent Flicker", "EffectClassComponent Offset", "EffectClassComponent Fade", "EffectClassComponent ParticleSystem ScaleY", "EffectClassComponent UV Scroller", "EffectClass Targeting Line", "EffectClass Point Light", "EffectClass Monster 3D Audio", "EffectClass Monster 2D Audio", "EffectClass Blood Splot", "EffectClass Debris Audio", "EffectClass Spawn Animated Object", "EffectClass Play Animation"};
    public static final short ghv = 0;
    public static final short ghw = 1;
    public static final short ghx = 2;
    public static final short ghy = 3;
    public static final short ghz = 4;
    public static final short ghA = 5;
    public static final String[] ghB = new String[]{"Component Bezier Float", "Component Bezier Vector", "Component Flicker Float", "Component UV Scroll", "Component Graphics State Override", "Component Flags"};
    public static final int ghC = 1;
    public static final int ghD = 2;
    public static final int ghE = 3;
    public static final int ghF = 4;
    public static final int ghG = 5;
    public static final int ghH = 6;
    public static final int ghI = 7;
    public static final int ghJ = 8;
    public static final int ghK = 9;
    public static final int ghL = 10;
    public static final int ghM = 11;
    public static final int ghN = 12;
    public static final int ghO = 13;
    public static final int ghP = 14;
    public static final int ghQ = 15;
    public static final int ghR = 16;
    public static final int ghS = 17;
    public static final int ghT = 18;
    public static final int ghU = 19;
    public static final int ghV = 20;
    public static final int ghW = 21;
    public static final int ghX = 22;
    public static final int ghY = 23;
    public static final int ghZ = 24;
    public static final int gia = 25;
    public static final int gib = 26;
    public static final int gic = 27;
    public static final int gid = 28;
    private static final String[] gie = new String[]{"Undefined AtomClass", "AtomClass 2D", "AtomClass Animation", "AtomClass Audio 2D", "AtomClass Audio 3D", "AtomClass Audio Shader", "AtomClass Camera", "AtomClass Global Environment", "AtomClass Light", "AtomClass LineMesh", "AtomClass Material", "AtomClass Mesh", "AtomClass Microphone", "AtomClass ObjectToObject ParticleStream", "AtomClass Particle", "AtomClass RenderEffect 2D", "AtomClass RenderEffect After", "AtomClass Shader", "AtomClass Texture", "AtomClass Tracer", "AtomClass WorldMesh", "AtomClass Spherical Light", "AtomClass Splatter Light", "AtomClass Render Box", "AtomClass Global Sky Object", "AtomClass Explosion Particle", "AtomClass Physics Force Field", "AtomClass 2D Text"};
    private static final Map gif = lea.eoc();
    public static final int gig = 1;
    public static final int gih = 2;
    public static final int gii = 3;
    public static final int gij = 1;
    public static final int gik = 2;
    public static final int gil = 3;
    public static final int gim = 4;
    public static final int gin = 5;
    public static final int gio = 6;
    public static final int gip = 1;
    public static final int giq = 2;
    public static final int gir = 4;
    public static final int gis = 8;
    public static final int git = 16;
    public static final int giu = 32;
    public static final float fWl = 0.25f;
    public static final float fWm = 0.5f;
    public static final float fWn = 0.75f;
    public static final float fWo = 1.0f;
    public static final String[] giv = new String[]{"", "_2", "_3", "_4", "_5"};
    public static boolean giw = true;
    public static int gix;
    public static int giy;
    public static int giz;
    public static int giA;
    public static int giB;
    public static int giC;
    public static int giD;
    public static int giE;
    public static int giF;
    public static int giG;
    public static int giH;
    public static int giI;
    public static int giJ;
    public static int giK;
    public static int giL;
    public static int giM;
    public static int giN;
    public static int giO;
    public static int giP;
    public static int giQ;
    public static int giR;
    public static int giS;
    public static int giT;
    public static int giU;
    public static int giV;
    public static int giW;
    public static int giX;
    public static int giY;
    public static int giZ;
    public static int gja;
    public static int gjb;
    public static int gjc;
    public static int gjd;
    public static int gje;
    public static int gjf;
    public static int gjg;
    public static int gjh;
    public static int gji;
    public static int gjj;
    public static int gjk;
    public static int gjl;
    public static int gjm;
    public static int gjn;
    public static int gjo;
    public static int gjp;
    public static int gjq;
    public static int gjr;
    public static int gjs;
    public static int gjt;
    public static int gju;
    public static int gjv;
    public static int gjw;
    public static int gjx;
    public static int gjy;
    public static int gjz;
    public static int gjA;
    public static int gjB;
    public static int gjC;
    public static int gjD;
    public static int gjE;
    public static int gjF;
    public static int gjG;
    public static int gjH;
    public static int gjI;
    public static int gjJ;
    public static int gjK;
    public static int gjL;
    public static int gjM;
    public static int gjN;
    public static int gjO;
    public static int gjP;
    public static int gjQ;
    public static int gjR;
    public static int gjS;
    public static int gjT;
    public static int gjU;
    public static int gjV;
    public static int gjW;
    public static int gjX;
    public static int gjY;
    public static int gjZ;
    public static int gka;
    public static int gkb;
    public static int gkc;
    public static int gkd;
    public static int gke;
    public static int gkf;
    public static int gkg;
    public static int gkh;
    public static int gki;
    public static int gkj;
    public static int gkk;
    public static int gkl;
    public static int gkm;
    public static int gkn;
    public static int gko;
    public static int gkp;
    public static int gkq;
    public static int gkr;
    public static int gks;
    public static int gkt;
    public static int gku;
    public static int gkv;
    public static int gkw;
    public static int gkx;
    public static int gky;
    public static int gkz;
    public static int gkA;
    public static int gkB;
    public static int gkC;
    public static int gkD;
    public static int gkE;
    public static int gkF;
    public static int gkG;
    public static int gkH;
    public static int gkI;
    public static int gkJ;
    public static int gkK;
    public static int gkL;
    public static int gkM;
    public static int gkN;
    public static int gkO;
    public static int gkP;
    public static int gkQ;
    public static int gkR;
    public static int gkS;
    public static int gkT;
    public static int gkU;
    public static int gkV;
    public static int gkW;
    public static int gkX;
    public static int gkY;
    public static int gkZ;
    public static int gla;
    public static int glb;
    public static int glc;
    public static int gld;
    public static int gle;
    public static int glf;
    public static int glg;
    public static int glh;
    public static int gli;
    public static int glj;
    public static int glk;
    public static int gll;
    public static int glm;
    public static int gln;
    public static int glo;
    public static int glp;
    public static int glq;
    public static int glr;
    public static int gls;
    public static int glt;
    public static int glu;
    public static int glv;
    public static int glw;
    public static int glx;
    public static final boolean gly = false;
    public static final float glz = 0.2f;
    public static final float glA = 0.1f;

    public static short iE(String string) {
        short s2 = (short)ghB.length;
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            if (!string.equals(ghB[s3])) continue;
            return s3;
        }
        return -1;
    }

    public static int iF(String string) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "getEffectClassType() EffectClassName is null.");
            return -1;
        }
        int n2 = ghu.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!ghu[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        lfn.b(5, "SFSpecialEffectConstants", "getEffectClassType() EffectClassName '" + string + "' is invalid.");
        return -1;
    }

    public static String zR(int n2) {
        if (n2 <= 0 || n2 >= ghu.length) {
            lfn.b(5, "SFSpecialEffectConstants", "getEffectClassName() EffectClassType " + n2 + " is invalid.");
            return null;
        }
        return ghu[n2];
    }

    public static String[] bkJ() {
        return ghB;
    }

    public static String[] bkK() {
        String[] stringArray = new String[ghu.length - 1];
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringArray[i2] = ghu[i2 + 1];
        }
        return stringArray;
    }

    public static String c(short s2) {
        return ghB[s2];
    }

    public static int iG(String string) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "getAtomClassType() AtomClassName is null.");
            return -1;
        }
        int n2 = gie.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!gie[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        lfn.b(5, "SFSpecialEffectConstants", "getAtomClassType() AtomClassName '" + string + "' is invalid.");
        return -1;
    }

    public static String zS(int n2) {
        if (n2 <= 0 || n2 >= gie.length) {
            lfn.b(5, "SFSpecialEffectConstants", "getAtomClassName() AtomClassType " + n2 + " is invalid.");
            return null;
        }
        return gie[n2];
    }

    public static String[] bkL() {
        String[] stringArray = new String[gie.length - 1];
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringArray[i2] = gie[i2 + 1];
        }
        return stringArray;
    }

    public static int iH(String string) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "addSpecialEffectNameMapping() SpecialEffectName is null.");
            return -1;
        }
        if (del.iI(string)) {
            lfn.b(5, "SFSpecialEffectConstants", "addSpecialEffectNameMapping() There already exists a specialeffect called '" + string + "'");
            return -1;
        }
        int n2 = string.hashCode();
        n2 = Math.abs(n2);
        Integer n3 = new Integer(n2);
        gif.put(n3, string);
        gif.put(string.toLowerCase(), n3);
        return n2;
    }

    public static boolean t(int n2, String string) {
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "SFSpecialEffectConstants() SpecialEffectType " + n2 + " is invalid.");
            return false;
        }
        Integer n3 = new Integer(n2);
        String string2 = (String)gif.get(n3);
        if (string2 == null) {
            lfn.b(5, "SFSpecialEffectConstants", "changeSpecialEffectName() SpecialEffectType " + n2 + " is invalid.");
            return false;
        }
        if (del.iI(string)) {
            lfn.b(5, "SFSpecialEffectConstants", "changeSpecialEffectName() There already exists a specialeffect called '" + string + "'");
            return false;
        }
        gif.remove(n3);
        gif.put(n3, string);
        gif.put(string.toLowerCase(), n3);
        return true;
    }

    public static boolean iI(String string) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "existsSpecialEffect() SpecialEffectName is null.");
            return false;
        }
        return gif.get(string.toLowerCase()) != null;
    }

    public static boolean zT(int n2) {
        return gif.get(new Integer(n2)) != null;
    }

    public static int bkM() {
        Iterator iterator = gif.values().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Integer n3;
            Object v2 = iterator.next();
            if (!(v2 instanceof Integer) || (n3 = (Integer)v2) <= n2) continue;
            n2 = n3;
        }
        assert (!gif.containsKey(new Integer(++n2)));
        return n2;
    }

    public static int B(int n2, float f2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "getEffectiveSpecialEffectType() SpecialEffectType is invalid.");
            return -1;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            lfn.b(5, "SFSpecialEffectConstants", "getEffectiveSpecialEffectType() Power is invalid.");
            return -1;
        }
        String string = f2 < 0.25f ? giv[0] : (f2 < 0.5f ? giv[1] : (f2 < 0.75f ? giv[2] : (f2 < 1.0f ? giv[3] : giv[4])));
        if (string.equals("")) {
            return n2;
        }
        String string2 = del.zU(n2) + string;
        int n3 = del.dr(string2);
        if (n3 <= 0) {
            return n2;
        }
        return n3;
    }

    public static String zU(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "getSpecialEffectName() SpecialEffectType " + n2 + " is invalid.");
            return null;
        }
        String string = (String)gif.get(new Integer(n2));
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "getSpecialEffectName() SpecialEffectType " + n2 + " is invalid.");
            return null;
        }
        return string;
    }

    public static int dr(String string) {
        if (string == null) {
            return -1;
        }
        Integer n2 = (Integer)gif.get(string.toLowerCase());
        if (n2 == null) {
            return -1;
        }
        return n2;
    }

    public static boolean zV(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "hasInfiniteDuration() SpecialEffectType " + n2 + " is invalid.");
            return false;
        }
        dgj dgj2 = dep.bkO().get(n2);
        if (dgj2 == null) {
            lfn.b(5, "SFSpecialEffectConstants", "hasInfiniteDuration() SpecialEffectType " + n2 + " is invalid.");
            return false;
        }
        return dgj2.hasInfiniteDuration();
    }

    public static void n(String string, int n2) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectConstants", "removeSpecialEffectNameMapping() SpecialEffectName is null.");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "removeSpecialEffectNameMapping() SpecialEffectType is invalid.");
            return;
        }
        if (!del.iI(string)) {
            lfn.b(5, "SFSpecialEffectConstants", "removeSpecialEffectNameMapping() There does not exist a specialeffectname '" + string + "' in the map.");
            return;
        }
        Integer n3 = new Integer(n2);
        if (!del.zT(n2)) {
            lfn.b(5, "SFSpecialEffectConstants", "removeSpecialEffectNameMapping() There does not exist a specialeffecttype " + n2 + " in the map.");
            return;
        }
        gif.remove(n3);
        gif.remove(string.toLowerCase());
    }

    private del() {
    }

    public static final void anZ() {
        gix = del.getType("se_Decapitate");
        giy = del.getType("se_Headbash");
        giz = del.getType("se_hum_f_die");
        giA = del.getType("se_hum_f_gank");
        giB = del.getType("se_hum_m_die");
        giC = del.getType("se_hum_m_gank");
        giD = del.getType("se_crafting_success");
        giE = del.getType("se_HealingChant01");
        giF = del.getType("se_party_waypoint");
        giG = del.getType("se_party_waypoint_blue");
        giH = del.getType("se_party_waypoint_red");
        giI = del.getType("se_party_waypoint_green");
        gki = del.getType("se_clan_waypoint_blue");
        gkj = del.getType("se_clan_waypoint_red");
        gkk = del.getType("se_clan_waypoint_green");
        gkl = del.getType("se_personal_waypoint_blue");
        gkm = del.getType("se_personal_waypoint_red");
        gkn = del.getType("se_personal_waypoint_green");
        gko = del.getType("se_vendor_effect_marker");
        giJ = del.getType("se_pe_invulnerability");
        giK = del.getType("se_player_on_fire");
        giL = del.getType("se_pe_skillup");
        giM = del.getType("se_pe_skillmax");
        giN = del.getType("se_clancity_initiate_deactivation");
        giO = del.getType("se_clancity_initiate_activation");
        giP = del.getType("se_clancity_deactivated");
        giQ = del.getType("se_pe_parry_shield");
        giR = del.getType("se_pe_parry_1_hand");
        giS = del.getType("se_pe_parry_2_hand");
        giT = del.getType("se_pe_parry_daggers");
        giU = del.getType("se_pe_parry_halberd");
        giV = del.getType("se_pe_parry_magic_staff");
        giW = del.getType("se_pe_parry_bow");
        giX = del.getType("se_pe_hit_in_back");
        giY = del.getType("se_pe_admin_01");
        giZ = del.getType("se_pe_gm_01");
        gja = del.getType("se_uw_clan_member");
        gjb = del.getType("se_uw_alliance_member");
        gjc = del.getType("se_uw_war_member");
        gjd = del.getType("se_uw_party_member");
        gje = del.getType("se_clancity_entrance_door_move");
        gjf = del.getType("se_player_house_door_open");
        gjg = del.getType("se_player_house_door_close");
        gji = del.getType("se_teleporter_placement");
        gjj = del.getType("se_teleporter_destruction");
        gjh = del.getType("se_player_house_extension_placement");
        gjm = del.getType("se_pe_backpack_small");
        gjn = del.getType("se_pe_backpack_big");
        gjo = del.getType("se_gm_chest_01_small");
        gjp = del.getType("se_relic_back_01");
        gjq = del.getType("se_relic_destroyer");
        gjk = del.getType("se_uw_shield_korea");
        gjl = del.getType("se_uw_shield_japan");
        gjr = del.getType("se_gmbl_slotmachine_start");
        gjs = del.getType("se_gmbl_slotmachine_win");
        gjt = del.getType("se_gmbl_slotmachine_ding_1");
        gju = del.getType("se_gmbl_slotmachine_ding_2");
        gjv = del.getType("se_gmbl_slotmachine_ding_3");
        gjw = del.getType("se_fs_explode");
        gjx = del.getType("se_fs_damaged_to_invuln");
        gjy = del.getType("se_fs_invuln_to_vuln");
        gjz = del.getType("se_pe_bloodcraft_01");
        gjA = del.getType("se_pe_bloodcraft_02");
        gjB = del.getType("se_pe_bloodcraft_03");
        gjC = del.getType("se_pe_bloodcraft_04");
        gjD = del.getType("se_pe_shadecraft_01");
        gjE = del.getType("se_pe_shadecraft_02");
        gjF = del.getType("se_pe_shadecraft_03");
        gjG = del.getType("se_pe_shadecraft_04");
        gjH = del.getType("se_pe_nonblock_01");
        gjI = del.getType("se_pe_nonblock_02");
        gjJ = del.getType("se_fh_pass_gate_01");
        gjK = del.getType("se_fh_start_countdown_01");
        gjL = del.getType("se_fh_winner_01");
        gjN = del.getType("se_mount_spawn_01");
        gjO = del.getType("se_mob_spawn_effect_01");
        gjP = del.getType("se_mob_teleport_effect_01");
        gjQ = del.getType("se_mob_smokebomb_02");
        gjR = del.getType("se_mob_smokebomb_01");
        gjS = del.getType("se_mob_smokebomb_03");
        gjT = del.getType("se_mob_mist_grow_01");
        gjU = del.getType("se_golem_rock_explotion_01");
        gjV = del.getType("se_mob_levelup_01");
        gjW = del.getType("se_burrow_worm_digUp_01");
        gjX = del.getType("se_water_splash_big_01");
        gjY = del.getType("se_dragon_whirpool");
        gjZ = del.getType("se_ice_column_01");
        gka = del.getType("se_ice_cage_01");
        gkb = del.getType("se_ice_cage_02");
        gjM = del.getType("se_pe_newbie_protection");
        gkc = del.getType("se_depth_charge_small");
        gkd = del.getType("se_depth_charge_medium");
        gke = del.getType("se_depth_charge_large");
        gkf = del.getType("se_monster_3daudio");
        gkg = del.getType("se_monster_2daudio");
        gkh = del.getType("se_celestial_magic_fire");
        gkp = del.getType("se_tombstone_player");
        gkq = del.getType("se_tombstone_monster");
        gkr = del.getType("se_tombstone_dragon");
        gks = del.getType("se_tombstone_wildlife");
        gkH = del.getType("se_pe_attribute_down");
        gkG = del.getType("se_pe_attribute_up");
        gkJ = del.getType("se_pe_you_killed_other");
        gkK = del.getType("se_pe_you_killed_monster");
        gkO = del.getType("se_pe_you_killed_ship");
        gkP = del.getType("se_pe_you_killed_warhulk");
        gkQ = del.getType("se_pe_you_killed_cannon");
        gkR = del.getType("se_pe_you_killed_mount");
        gkS = del.getType("se_pe_you_killed_clan_structure");
        gkT = del.getType("se_pe_you_killed_clanstone_city");
        gkU = del.getType("se_pe_you_killed_clanstone_hamlet");
        gkV = del.getType("se_pe_you_killed_other");
        gkI = del.getType("se_pe_player_killed_you");
        gkW = del.getType("se_pe_monster_killed_you");
        gkX = del.getType("se_pe_other_killed_you");
        gkY = del.getType("se_pe_you_ganked_player");
        gkZ = del.getType("se_pe_player_ganked_you");
        gla = del.getType("se_pe_you_revived_player");
        glb = del.getType("se_pe_player_revived_you");
        glc = del.getType("se_pe_alignment_positive_hit");
        gld = del.getType("se_pe_alignment_negative_hit");
        gle = del.getType("se_pe_alignment_suspicious_false");
        glf = del.getType("se_pe_alignment_suspicious_true");
        gkL = del.getType("se_pe_hitsound");
        gkM = del.getType("se_pe_player_hitsound");
        gkN = del.getType("se_pe_monster_hitsound");
        gkt = del.getType("se_clan_conquest_draw");
        gku = del.getType("se_clan_conquest_peace");
        gkv = del.getType("se_clan_conquest_vulnerable");
        gkw = del.getType("se_fs_clan_conquered");
        gkx = del.getType("se_fs_clan_conquered_global");
        gky = del.getType("se_fs_clan_reward");
        gkz = del.getType("se_fs_clan_lost");
        gkA = del.getType("se_fs_vulnerable");
        gkB = del.getType("osmsg_challenge_01");
        gkC = del.getType("osmsg_vulnerable_bindstone_01");
        gkD = del.getType("osmsg_defeat_01");
        gkE = del.getType("osmsg_victory_01");
        gkF = del.getType("osmsg_vulnerable_siegestone_01");
        glg = del.getType("se_gmbl_jackpot");
        glh = del.getType("se_gmbl_jackpot_global");
        gli = del.getType("se_gmbl_normal_win");
        glj = del.getType("se_quest_sub_completed");
        glk = del.getType("se_pe_chest_opened");
        gll = del.getType("se_market_open");
        glm = del.getType("se_market_close");
        gln = del.getType("se_sea_fortress_main_protected");
        glo = del.getType("se_sea_fortress_main_destroyed");
        glp = del.getType("se_sea_fortress_main");
        glq = del.getType("se_duel_spectator_01");
        glr = del.getType("se_duel_spectator_02");
        gls = del.getType("se_levy_collector_full");
        glt = del.getType("se_levy_collector_gathering");
        glu = del.getType("audio_low_attribute_stamina_s1");
        glv = del.getType("audio_low_attribute_stamina_s2");
        glw = del.getType("audio_low_attribute_health_s1");
        glx = del.getType("audio_low_attribute_health_s2");
    }

    private static int getType(String string) {
        assert (string != null);
        int n2 = del.dr(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSpecialEffectConstants", "getType() SpecialEffectName '" + string + "' is invalid.");
            assert (false);
            return -1;
        }
        return n2;
    }

    public static int zW(int n2) {
        String string = lea.enW().getName(n2);
        int n3 = -1;
        if (string.equals("r_Requisition Gauntlet_r01")) {
            n3 = del.dr("se_requisition_gauntlet_selentine_caster");
        } else if (string.equals("r_Requisition Gauntlet_r02")) {
            n3 = del.dr("se_requisition_gauntlet_veilron_caster");
        } else if (string.equals("r_Requisition Gauntlet_r03")) {
            n3 = del.dr("se_requisition_gauntlet_neithal_caster");
        } else if (string.equals("r_Requisition Gauntlet_r04")) {
            n3 = del.dr("se_requisition_gauntlet_leenspar_caster");
        } else if (string.equals("r_Requisition Gauntlet_r05")) {
            n3 = del.dr("se_requisition_gauntlet_theyril_caster");
        }
        return n3;
    }
}

