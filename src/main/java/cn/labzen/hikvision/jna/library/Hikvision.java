package cn.labzen.hikvision.jna.library;

import cn.labzen.hikvision.jna.library.internal.*;
import com.sun.jna.Native;

@SuppressWarnings("unused")
public interface Hikvision extends SdkInit,
                                   SdkLocal,
                                   UserLogin,
                                   Preview,
                                   PtzControl,
                                   RemotePlayback,
                                   Voice,
                                   Configuration,
                                   Storage,
                                   Alarm,
                                   Ability,
                                   Maintenance,
                                   ZeroChannel,
                                   Serial,
                                   Record,
                                   Sparing,
                                   RemotePanelControl,
                                   RemoteControl,
                                   ServerTest,
                                   FileOperate,
                                   Sms,
                                   ProductAccessControl,
                                   ProductAlarm,
                                   More {

  static Hikvision loadWindows(String libraryName) {
    if (libraryName == null) {
      libraryName = HikvisionOnWindows.LIBRARY_NAME;
    }
    return Native.load(libraryName, HikvisionOnWindows.class);
  }

  static Hikvision loadLinux(String libraryName) {
    return Native.load(libraryName, HikvisionOnLinux.class);
  }

  // TODO 考虑只兼顾windows

}
