/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Method;
import org.w3c.dom.Node;

public class jzm {
    protected final void a(Node node, duf duf2, Object object) {
        assert (node != null);
        assert (duf2 != null);
        assert (object != null);
        duj[] dujArray = duf2.bBa();
        int n = dujArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            Object object2 = this.a(node, dujArray[i2]);
            try {
                String string = "set" + dujArray[i2].getName();
                Method method = object.getClass().getMethod(string, dujArray[i2].bBg());
                method.invoke(object, object2);
                continue;
            }
            catch (Exception exception) {
                throw new bg("Failed to set value of field '" + dujArray[i2].getName() + "' to " + object2, exception);
            }
        }
    }

    private Object a(Node node, duj duj2) {
        assert (node != null);
        assert (duj2 != null);
        String string = "SF" + duj2.getName();
        Node node2 = jsy.d(string, node);
        Object object = this.b(node2, duj2);
        return object;
    }

    private Object b(Node node, duj duj2) {
        assert (node != null);
        assert (duj2 != null);
        block0 : switch (duj2.bBb()) {
            case 1: 
            case 4: {
                int n = jsy.r(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return new Integer(n);
                    }
                    case 2: {
                        if (n < 0) break block0;
                        return new Integer(n);
                    }
                    case 3: {
                        if (n <= 0) break block0;
                        return new Integer(n);
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 2: {
                boolean bl = jsy.t(node);
                return bl;
            }
            case 3: {
                double d2 = jsy.q(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return new Double(d2);
                    }
                    case 2: {
                        if (!(d2 >= 0.0)) break block0;
                        return new Double(d2);
                    }
                    case 3: {
                        if (!(d2 > 0.0)) break block0;
                        return new Double(d2);
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 5: {
                float f = jsy.o(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return new Float(f);
                    }
                    case 2: {
                        if (!(f >= 0.0f)) break block0;
                        return new Float(f);
                    }
                    case 3: {
                        if (!(f > 0.0f)) break block0;
                        return new Float(f);
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 6: {
                int n = jsy.r(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return new Integer(n);
                    }
                    case 2: {
                        if (n < 0) break block0;
                        return new Integer(n);
                    }
                    case 3: {
                        if (n <= 0) break block0;
                        return new Integer(n);
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 7: {
                long l2 = jsy.s(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return new Long(l2);
                    }
                    case 2: {
                        if (l2 < 0L) break block0;
                        return new Long(l2);
                    }
                    case 3: {
                        if (l2 <= 0L) break block0;
                        return new Long(l2);
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 8: {
                lcq lcq2 = jsy.A(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return lcq2;
                    }
                    case 4: {
                        if (lcq2 == null) break block0;
                        return lcq2;
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 9: {
                ljq ljq2 = jsy.w(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return ljq2;
                    }
                    case 4: {
                        if (ljq2 == null) break block0;
                        return ljq2;
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 11: {
                ljp ljp2 = jsy.u(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return ljp2;
                    }
                    case 4: {
                        if (ljp2 == null) break block0;
                        return ljp2;
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            case 10: {
                String string = jsy.m(node);
                switch (duj2.bBf()) {
                    case 1: {
                        return string;
                    }
                    case 4: {
                        if (string == null) break block0;
                        return string;
                    }
                    default: {
                        throw new bj("Node '" + node.getNodeName() + "' has invalid ConstraintType.");
                    }
                }
            }
            default: {
                throw new bj("Node '" + node.getNodeName() + "' has invalid ValueType: " + duj2.bBb());
            }
        }
        throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
    }
}

