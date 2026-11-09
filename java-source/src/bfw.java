/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.sql.Timestamp;
import java.util.Arrays;

@XStreamAlias(value="SFGlobalEvent")
public abstract class bfw
extends btk
implements bto,
Converter {
    private boolean TimersValidated;
    protected long ActualEventTime;
    protected long EndingDate;
    protected bfy GlobalEventManager;
    protected long Interval;
    protected long NextActivationTime;
    protected ljq Position = new ljq();
    protected long StartingDate;
    protected final bga Type;
    protected boolean OneOff;
    protected ldz.a[] InGameEventTimes = ldz.a.values();

    public bfw(bga bga2) {
        this.Type = bga2;
    }

    public boolean aoi() {
        return this.OneOff;
    }

    public void dd(boolean bl) {
        this.OneOff = bl;
    }

    public void b(ldz.a ... aArray) {
        this.InGameEventTimes = Arrays.copyOf(aArray, aArray.length);
    }

    public ldz.a[] aoj() {
        return this.InGameEventTimes;
    }

    public long aok() {
        return this.EndingDate;
    }

    public long getInterval() {
        return this.Interval;
    }

    public ljq av() {
        return this.Position;
    }

    public long aol() {
        return this.StartingDate;
    }

    public bga aom() {
        return this.Type;
    }

    @Deprecated
    public boolean a(long l, long l2, long l3) {
        this.StartingDate = l;
        this.EndingDate = l2;
        this.Interval = l3;
        return this.aon();
    }

    @Override
    public void initialize() {
        super.initialize();
        if (!this.aon()) {
            this.aoo();
            return;
        }
        long l = this.MessageDelegator.bzy().getTimeInMillis();
        this.NextActivationTime = l <= this.StartingDate || this.Interval == 0L ? this.StartingDate : this.StartingDate + (long)(Math.floor((l - this.StartingDate) / this.Interval) * (double)this.Interval);
    }

    @Override
    public void marshal(Object object, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        bfw bfw2 = (bfw)object;
        hierarchicalStreamWriter.addAttribute("VersionGlobalEvent", "0");
        this.a("EventType", (Object)bfw2.Type, hierarchicalStreamWriter, marshallingContext);
        this.a("Position", bfw2.Position, hierarchicalStreamWriter, marshallingContext);
        this.a("StartingDate", bfw2.StartingDate, hierarchicalStreamWriter, marshallingContext);
        this.a("OneOff", bfw2.OneOff, hierarchicalStreamWriter, marshallingContext);
        this.a("EndingDate", bfw2.EndingDate, hierarchicalStreamWriter, marshallingContext);
        this.a("Interval", bfw2.Interval, hierarchicalStreamWriter, marshallingContext);
        this.a("InGameTimes", bfw2.InGameEventTimes, hierarchicalStreamWriter, marshallingContext);
    }

    public void J(long l) {
        this.EndingDate = l;
    }

    public void a(bfy bfy2) {
        this.GlobalEventManager = bfy2;
    }

    public void setInterval(long l) {
        this.Interval = l;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public void K(long l) {
        this.StartingDate = l;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append((Object)this.Type);
        stringBuffer.append(',');
        stringBuffer.append(new Timestamp(this.StartingDate).toString());
        stringBuffer.append(',');
        stringBuffer.append(new Timestamp(this.EndingDate).toString());
        stringBuffer.append(',');
        stringBuffer.append(this.Position.toString());
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        int n = Integer.valueOf(hierarchicalStreamReader.getAttribute("VersionGlobalEvent"));
        hierarchicalStreamReader.moveDown();
        bga bga2 = bga.valueOf(hierarchicalStreamReader.getValue());
        hierarchicalStreamReader.moveUp();
        if (bga2 == null) {
            return null;
        }
        bfw bfw2 = bfx.a(bga2);
        hierarchicalStreamReader.moveDown();
        bfw2.Position = (ljq)unmarshallingContext.convertAnother(bfw2, ljq.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfw2.StartingDate = (Long)unmarshallingContext.convertAnother(bfw2, Long.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfw2.OneOff = (Boolean)unmarshallingContext.convertAnother(bfw2, Boolean.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfw2.EndingDate = (Long)unmarshallingContext.convertAnother(bfw2, Long.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfw2.Interval = (Long)unmarshallingContext.convertAnother(bfw2, Long.class);
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        bfw2.InGameEventTimes = (ldz.a[])unmarshallingContext.convertAnother(bfw2, ldz.a[].class);
        hierarchicalStreamReader.moveUp();
        if (n >= 1) {
            // empty if block
        }
        if (n >= 2) {
            // empty if block
        }
        return bfw2;
    }

    private boolean aon() {
        if (this.TimersValidated) {
            return true;
        }
        if (this.EndingDate > 0L) {
            if (this.StartingDate > this.EndingDate) {
                return false;
            }
            if (this.StartingDate + this.Interval > this.EndingDate) {
                return false;
            }
        }
        this.TimersValidated = true;
        return true;
    }

    protected abstract void aoo();

    protected void a(String string, Object object, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        hierarchicalStreamWriter.startNode(string);
        marshallingContext.convertAnother(object);
        hierarchicalStreamWriter.endNode();
    }
}

