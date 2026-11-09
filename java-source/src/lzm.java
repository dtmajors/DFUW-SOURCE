/*
 * Decompiled with CFR.
 */
public class lzm
extends lzk {
    private static final lzm tWR = new lzm();
    @lok(value="The invulnerability timer for the sea-fortress $(SeaFortressName) has been adjusted and will now become vulnerable in $(CountDown)")
    @lpl(value="Displayed to an admin/GM when they adjust the invulnerability timer of a sea-fortress")
    public static final lox tWS = tWR.a("TimerAdjusted", lzm.Bk("SeaFortressName"), lzm.Bi("CountDown"));
    @lok(value="Failed to set invulnerability timer for sea-fortress $(SeaFortressName)... the sea-fortress is currently rubble")
    @lpl(value="Displayed to an admin/GM when they attempt to set the invulnerability timer of a sea-fortress, but the sea-fortress is currently rubble (destroyed)")
    public static final lox tWT = tWR.a("TimerSetFailedSeaFortressIsRubble", lzm.Bk("SeaFortressName"));
    @lok(value="Failed to set invulnerability timer for sea-fortress $(SeaFortressName)... the sea-fortress is currently vulnerable")
    @lpl(value="Displayed to an admin/GM when they attempt to set the invulnerability timer of a sea-fortress, but the sea-fortress is currently vulnerable")
    public static final lox tWU = tWR.a("TimerSetFailedSeaFortressIsVulnerable", lzm.Bk("SeaFortressName"));
    @lok(value="Failed to set invulnerability timer for sea-fortress $(SeaFortressName)... result = $(Result)")
    @lpl(value="Displayed to an admin/GM when they attempt to set the invulnerability timer of a sea-fortress, but the request fails for a non-specific reason")
    public static final lox tWV = tWR.a("TimerSetFailedUnhandledReason", lzm.Bk("SeaFortressName"), lzm.Bh("Result"));
    @lok(value="No sea fortresses have been loaded")
    @lpl(value="Displayed to an admin/GM when they issue a sea-fortress-specific command, but no sea fortresses exist on the servers")
    public static final lox tWW = tWR.BC("NotLoaded");
    @lok(value="No sea fortress found with the name $(SeaFortressName)")
    @lpl(value="Displayed to an admin/GM when they issue a sea-fortress-specific command, but no sea fortress can be found with the entered name")
    public static final lox tWX = tWR.a("NotFound", lzm.Bk("SeaFortressName"));

    protected lzm(String string) {
        super("SeaFortresses." + string);
    }

    private lzm() {
        super("SeaFortresses");
    }
}

