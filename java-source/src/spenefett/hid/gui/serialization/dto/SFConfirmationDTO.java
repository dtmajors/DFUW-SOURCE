/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConfirmationWindowInformationDTO")
public class SFConfirmationDTO
extends SFXMLSerializable {
    public String notificationID = null;
    public String notificationText = null;
    public boolean important = false;
    public boolean showIgnoreButton = false;
    public boolean changed = false;
    public double progress = -1.0;
}

