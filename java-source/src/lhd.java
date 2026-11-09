/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class lhd {
    private DataOutput rnr = null;
    private DataInput rns = null;
    private int rnt = 0;

    public lhd(DataOutput dataOutput) {
        this.rnr = dataOutput;
    }

    public lhd(DataInput dataInput) {
        this.rns = dataInput;
    }

    public void acN(int n) {
        try {
            if (this.rnr != null) {
                this.rnr.writeInt(n);
            }
            if (this.rns != null) {
                this.rnt = this.rns.readInt();
            }
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    public <T> T c(T object, int n) {
        try {
            Object object2;
            Class<?> clazz = object.getClass();
            if (this.rnr != null) {
                if (clazz.equals(Integer.class)) {
                    this.rnr.writeInt((Integer)object);
                } else if (clazz.equals(Float.class)) {
                    this.rnr.writeFloat(((Float)object).floatValue());
                } else if (clazz.equals(ljq.class)) {
                    object2 = (ljq)object;
                    this.rnr.writeFloat(((ljq)object2).x);
                    this.rnr.writeFloat(((ljq)object2).y);
                    this.rnr.writeFloat(((ljq)object2).rlV);
                } else if (clazz.equals(ljr.class)) {
                    object2 = (ljr)object;
                    this.rnr.writeFloat(((ljr)object2).x);
                    this.rnr.writeFloat(((ljr)object2).y);
                    this.rnr.writeFloat(((ljr)object2).rlV);
                    this.rnr.writeFloat(((ljr)object2).rlW);
                } else if (clazz.equals(lco.class)) {
                    object2 = (lco)object;
                    this.rnr.writeInt(((lco)object2).emK().getRGB());
                } else if (clazz.equals(String.class)) {
                    this.rnr.writeUTF((String)object);
                } else if (clazz.equals(Boolean.class)) {
                    this.rnr.writeBoolean((Boolean)object);
                } else if (clazz.equals(Long.class)) {
                    this.rnr.writeLong((Long)object);
                } else {
                    lfn.b(5, "SFSerializer", "serialize() : variable of type " + clazz.getCanonicalName() + " can not be serialized. Add implementation here if you desire");
                }
            }
            if (this.rns != null && n <= this.rnt) {
                if (clazz.equals(Integer.class)) {
                    object2 = this.rns.readInt();
                    object = object2;
                } else if (clazz.equals(Float.class)) {
                    object2 = Float.valueOf(this.rns.readFloat());
                    object = object2;
                } else if (clazz.equals(ljq.class)) {
                    object2 = (ljq)object;
                    ((ljq)object2).x = this.rns.readFloat();
                    ((ljq)object2).y = this.rns.readFloat();
                    ((ljq)object2).rlV = this.rns.readFloat();
                } else if (clazz.equals(ljr.class)) {
                    object2 = (ljr)object;
                    ((ljr)object2).x = this.rns.readFloat();
                    ((ljr)object2).y = this.rns.readFloat();
                    ((ljr)object2).rlV = this.rns.readFloat();
                    ((ljr)object2).rlW = this.rns.readFloat();
                } else if (clazz.equals(lco.class)) {
                    object2 = (lco)object;
                    Color color = new Color(this.rns.readInt());
                    ((lco)object2).qwk = (float)color.getRed() / 255.0f;
                    ((lco)object2).qwl = (float)color.getGreen() / 255.0f;
                    ((lco)object2).qwm = (float)color.getBlue() / 255.0f;
                } else if (clazz.equals(String.class)) {
                    object2 = this.rns.readUTF();
                    object = object2;
                } else if (clazz.equals(Boolean.class)) {
                    object2 = this.rns.readBoolean();
                    object = object2;
                } else if (clazz.equals(Long.class)) {
                    object2 = this.rns.readLong();
                    object = object2;
                } else {
                    lfn.b(5, "SFSerializer", "serialize() : variable of type " + clazz.getCanonicalName() + " can not be serialized. Add implementation here if you desire");
                }
            }
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
        return object;
    }

    public boolean eqA() {
        return this.rns != null;
    }

    private void a(IOException iOException) {
        if (iOException != null) {
            if (iOException.getMessage() != null) {
                lfn.print(iOException.getMessage());
            }
            if (iOException.getStackTrace() != null) {
                lfn.print(iOException.getStackTrace().toString());
            }
        }
    }
}

