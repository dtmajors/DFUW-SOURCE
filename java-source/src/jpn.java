/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public enum jpn {
    nLv,
    nLw,
    nLx,
    nLy,
    nLz,
    nLA,
    nLB,
    nLC,
    nLD,
    nLE,
    nLF,
    nLG;

    public static final Set<jpn> nLm;
    public static final Set<jpn> nLH;
    public static final Set<jpn> nLI;
    public static final Set<jpn> nLJ;
    public static final Set<jpn> nLK;
    public static final Set<jpn> nLL;
    public static final Set<jpn> nLM;
    public static final Set<jpn> nLN;
    public static final Set<jpn> nLO;
    public static final Set<jpn> nLP;
    public static final List<jpn> ListOfValue;

    static {
        nLm = Collections.unmodifiableSet(EnumSet.noneOf(jpn.class));
        nLH = Collections.unmodifiableSet(EnumSet.of(nLv));
        nLI = Collections.unmodifiableSet(EnumSet.of(nLw));
        nLJ = Collections.unmodifiableSet(EnumSet.of(nLx));
        nLK = Collections.unmodifiableSet(EnumSet.of(nLy));
        nLL = Collections.unmodifiableSet(EnumSet.of(nLv, nLw));
        nLM = Collections.unmodifiableSet(EnumSet.of(nLv, nLx));
        nLN = Collections.unmodifiableSet(EnumSet.of(nLw, nLx));
        nLO = Collections.unmodifiableSet(EnumSet.of(nLv, nLw, nLx));
        nLP = Collections.unmodifiableSet(EnumSet.of(nLz, new jpn[]{nLD, nLA, nLE, nLB, nLF}));
        ListOfValue = Collections.unmodifiableList(Arrays.asList(jpn.class.getEnumConstants()));
    }
}

