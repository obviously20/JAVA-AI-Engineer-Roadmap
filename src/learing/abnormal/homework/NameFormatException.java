package learing.abnormal.homework;

public class NameFormatException extends RuntimeException {
    //取名（异常类名：异常描述）-->NameFormatException见名知意
   //NameFormat:姓名格式
   //Exception:异常

   //Alt+Insert-->构造方法：无参+有参(前两个)

   //继承：
   //RuntimeException:运行时异常
   //Exception:编译异常


   public NameFormatException() {
   }

   public NameFormatException(String message) {
      super(message);
   }
}
