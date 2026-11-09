/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFGameOptionsDTO")
public class SFGameOptionsDTO
extends SFXMLSerializable {
    public boolean displayFPS = false;
    public boolean displayPing = false;
    public float targetOpacity = 1.0f;
    public float partyOpacity = 0.1f;
    public boolean displayName = true;
    public boolean hitSounds = true;
    public boolean hideHelmet = false;
    public boolean forceShowHelmet = false;
    public boolean selfClanMemberIndicators = true;
    public boolean alliedClanMemberIndicators = true;
    public boolean enemyClanMemberIndicators = true;
    public boolean enemyNationIndicators = true;
    public boolean vendorMarkers = true;
    public int selectedLanguage = 0;
    public boolean compactActionBar = false;
    public boolean showBubbles = true;
    public boolean queueActions = true;
    public boolean autoCloseWindows = false;
    public boolean onlyUseLeftAction = true;
    public boolean showFloatingDamage = true;
    public boolean EnableSprintFOV = false;
    public boolean showAdvisory = true;
    public boolean showActionBarShortcuts = true;
}

