/*
 * Decompiled with CFR.
 */
public class lzz
extends lzh {
    private static final lzz tZq = new lzz();
    @lok(value="You can not retract the fishing nets of this boat if its health is below $(percent)%")
    @lpl(value="Displayed to the player if he tries to retract fishnets when the health of the ship is below a percentage.")
    public static final lox tZr = tZq.a("CannotRetractFishingNets", lzz.Bh("percent"));
    @lok(value="$(ShipResource.NamePlural) can only be spawned at harbours!")
    @lpl(value="Displayed to a player if they try to spawn a restricted ship outside the allowed areas")
    public static final lox tZs = tZq.a("CannotSpawnAtLocation", lzz.Bl("ShipResource"));
    @lok(value="$(ShipResource.NamePlural) can only be un-spawned near harbours!")
    @lpl(value="Displayed to a player if they try to spawn a restricted ship outside the allowed areas")
    public static final lox tZt = tZq.a("CannotUnspawnAtLocation", lzz.Bl("ShipResource"));

    protected lzz(String string) {
        super("Boats." + string);
    }

    private lzz() {
        super("Boats");
    }
}

