/*
 * Decompiled with CFR.
 */
public class lyp
extends lyk {
    private static final lyp tIJ = new lyp();
    @lok(value="Member Overview")
    @lpl(value="Tooltip for the clan member overview button displayed next to each member in the member roster")
    public static final lox tIK = tIJ.BC("MemberOverviewTitle");
    @lok(value="Displays more information about the clan member")
    @lpl(value="Tooltip for the clan member overview button displayed next to each member in the member roster")
    public static final lox tIL = tIJ.BC("MemberOverviewDescription");
    @lok(value="Summon Clan Member")
    @lpl(value="Tooltip for the summon clan member button displayed next to each member in the member roster")
    public static final lox tIM = tIJ.BC("SummonClanMemberTitle");
    @lok(value="Issues a request to the clan member to summon them to your current location")
    @lpl(value="Tooltip for the summon clan member button displayed next to each member in the member roster")
    public static final lox tIN = tIJ.BC("SummonClanMemberDescription");

    protected lyp(String string) {
        super("MemberRoster." + string);
    }

    private lyp() {
        super("MemberRoster");
    }
}

