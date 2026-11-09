/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

@XStreamAlias(value="SFGlobalEventSFX")
public class bfz
extends bfw {
    private long Duration = 120000L;
    private long Frequency = 3000L;
    private int SpecialEffectType;
    private lgl Rotation = new lgl(0.0f, 0.0f, 0.0f, 1.0f);

    public bfz(bga bga2) {
        super(bga2);
    }

    @Override
    public boolean canConvert(Class clazz) {
        return clazz.equals(bfz.class);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void doTick(ldz ldz2) {
        void var8_10;
        long l = this.MessageDelegator.bzy().getTimeInMillis();
        if (this.EndingDate > 0L && this.EndingDate < l) {
            this.aoo();
        }
        if (this.NextActivationTime > l) {
            return;
        }
        if (l > this.NextActivationTime + this.Duration) {
            this.NextActivationTime += this.Interval;
            return;
        }
        if (l < this.ActualEventTime) {
            return;
        }
        double d2 = this.OneOff ? (double)this.Frequency : (double)this.Frequency + Math.random() * (double)this.Frequency;
        this.ActualEventTime = (long)((double)l + d2);
        boolean bl = false;
        ldz.a a2 = ldz2.enQ();
        for (ldz.a a3 : this.InGameEventTimes) {
            if (a2 != a3) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return;
        }
        Object var8_7 = null;
        if (lcw.enb()) {
            ldv ldv2 = lcr.qEb;
        } else {
            int n = this.GlobalEventManager.aop();
            ldv ldv3 = lcr.ak((ldv)lcr.qEb, (int)n);
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, (ldv)var8_10);
        glh2.aZD = this.Position;
        glh2.akX = null;
        glh2.aZG = null;
        glh2.SpecialEffectType = this.SpecialEffectType;
        glh2.gfq = this.Rotation;
        glh2.jkS |= 4;
        this.MessageDelegator.F(glh2);
    }

    public long getDuration() {
        return this.Duration;
    }

    public void L(long l) {
        this.Duration = l;
    }

    public long aos() {
        return this.Frequency;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void M(long l) {
        this.Frequency = l;
    }

    public int getSpecialEffectType() {
        return this.SpecialEffectType;
    }

    public void setSpecialEffectType(int n) {
        this.SpecialEffectType = n;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.OneOff) {
            this.Duration = 1000L;
            this.Frequency = this.Interval;
        }
        if (this.Duration > this.Interval) {
            this.aoo();
            return;
        }
    }

    @Override
    public void marshal(Object object, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        bfz bfz2 = (bfz)object;
        hierarchicalStreamWriter.addAttribute("VersionGlobalEventSFX", "0");
        super.marshal(bfz2, hierarchicalStreamWriter, marshallingContext);
        String string = del.zU(bfz2.SpecialEffectType);
        this.a("SFXName", string, hierarchicalStreamWriter, marshallingContext);
        this.a("Rotation", bfz2.Rotation, hierarchicalStreamWriter, marshallingContext);
        this.a("Duration", bfz2.Duration, hierarchicalStreamWriter, marshallingContext);
        this.a("Frequency", bfz2.Frequency, hierarchicalStreamWriter, marshallingContext);
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        bfz bfz2 = (bfz)super.unmarshal(hierarchicalStreamReader, unmarshallingContext);
        if (bfz2 == null) {
            return null;
        }
        int n = Integer.valueOf(hierarchicalStreamReader.getAttribute("VersionGlobalEventSFX"));
        hierarchicalStreamReader.moveDown();
        String string = (String)unmarshallingContext.convertAnother(bfz2, String.class);
        bfz2.SpecialEffectType = del.dr(string);
        if (bfz2.SpecialEffectType == -1) {
            lfn.b(5, this.getClass().getName(), "unmarshal() :speciale effect" + string + " not found!");
        }
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfz2.Rotation = (lgl)unmarshallingContext.convertAnother(bfz2, lgl.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfz2.Duration = (Long)unmarshallingContext.convertAnother(bfz2, Long.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfz2.Frequency = (Long)unmarshallingContext.convertAnother(bfz2, Long.class);
        hierarchicalStreamReader.moveUp();
        if (n >= 1) {
            // empty if block
        }
        if (n >= 2) {
            // empty if block
        }
        return bfz2;
    }

    @Override
    protected void aoo() {
        this.selfDestruct();
        this.GlobalEventManager.a(this);
        this.MessageDelegator.oa(this.GUID);
    }
}

