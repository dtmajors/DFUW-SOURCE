/*
 * Decompiled with CFR.
 */
public class lyo
extends lyk {
    private static final lyo tIE = new lyo();
    @lok(value="Kick Member")
    @lpl(value="Title to display in the tooltip of the kick member button")
    public static final lox tIF = tIE.BC("KickMemberTitle");
    @lok(value="Kicks the member from the clan")
    @lpl(value="Description to display in the tooltip of the kick member button")
    public static final lox tIG = tIE.BC("KickMemberDescription");
    @lok(value="Ban Member")
    @lpl(value="Title to display in the tooltip of the ban member button")
    public static final lox tIH = tIE.BC("BanMemberTitle");
    @lok(value="Kicks the member from the clan and adds them to the banned players list")
    @lpl(value="Description to display in the tooltip of the ban member button")
    public static final lox tII = tIE.BC("BanMemberDescription");

    protected lyo(String string) {
        super("MemberOverview." + string);
    }

    private lyo() {
        super("MemberOverview");
    }
}

