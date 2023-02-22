package cn.labzen.hikvision.jna.definition;

import java.util.EnumSet;
import java.util.Optional;

public interface HikvisionEnum {

  int getCode();

  String getDescription();

  static <E extends Enum<E>> Optional<HikvisionEnum> byCode(Class<E> enumClass, int code) {
    if (!HikvisionEnum.class.isAssignableFrom(enumClass)) {
      return Optional.empty();
    }

    EnumSet<E> enumSet = EnumSet.allOf(enumClass);
    return enumSet.stream().map(in -> (HikvisionEnum) in).filter(in -> in.getCode() == code).findFirst();
  }
}
