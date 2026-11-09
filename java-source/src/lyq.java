/*
 * Decompiled with CFR.
 */
public class lyq
extends lyk {
    private static final lyq tIO = new lyq();
    @lok(value="Select Member")
    @lpl(value="Default tooltip for the selector button displayed next to each selectable member in the clan member selector list")
    public static final lox tIP = tIO.BC("DefaultSelectTitle");
    @lok(value="Select member to become the leader of the clan")
    @lpl(value="Tooltip for the selector button, displayed next to each selectable member in the clan member selector list, when selecting a new clan leader")
    public static final lox tIQ = tIO.BC("LeaderSelectDescription");
    @lok(value="Select member to become the mayor of the holding")
    @lpl(value="Tooltip for the selector button, displayed next to each selectable member in the clan member selector list, when selecting a mayor for a holding")
    public static final lox tIR = tIO.BC("MayorSelectDescription");

    protected lyq(String string) {
        super("MemberSelector." + string);
    }

    private lyq() {
        super("MemberSelector");
    }
}

