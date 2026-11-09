/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFAudioOptionsDTO")
public class SFAudioOptionsDTO
extends SFXMLSerializable {
    public float MasterVolume = 0.8f;
    public float MusicVolume = 0.8f;
    public float EnvironmentalVolume = 1.0f;
    public boolean Whisper = true;
    public boolean FriendOnline = true;
    public boolean FriendOffline = true;
}

