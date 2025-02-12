/*
 * La clase Time2 sobrecarga los constructores para permitir 
 * múltiples formas de inicialización.
* Se usa this() para reutilizar constructores y evitar 
* la repetición de código.
* El método setTime() valida las horas, minutos y segundos, 
* asignando 0 a valores inválidos.
* toUniversalString() y toStandardString() convierten el 
* tiempo a formato 24 horas 
* y 12 horas con AM/PM, respectivamente.
 */

 import java.text.DecimalFormat;

 public class Time2 {
     private int hour;    // 0 - 23
     private int minute;  // 0 - 59
     private int second;  // 0 - 59
 
     // Time2 constructor sin argumentos, inicializa los valores a 0
     public Time2() {
         this(0, 0, 0);
     }
 
     // Time2 constructor con solo horas
     public Time2(int h) {
         this(h, 0, 0);  // llama al constructor de tres argumentos
     }
 
     // Time2 constructor con horas y minutos
     public Time2(int h, int m) {
         this(h, m, 0);
     }
 
     // Time2 constructor con horas, minutos y segundos
     public Time2(int h, int m, int s) {
         setTime(h, m, s);  // importa setTime para validación
     }
 
     // Time2 constructor que recibe otro objeto Time2
     public Time2(Time2 time) {
         this(time.hour, time.minute, time.second);
     }
 
     // Establece un nuevo valor de tiempo con validaciones
     public void setTime(int h, int m, int s) {
         hour = (h >= 0 && h < 24) ? h : 0;
         minute = (m >= 0 && m < 60) ? m : 0;
         second = (s >= 0 && s < 60) ? s : 0;
     }
 
     // Convierte a String el formato universal de tiempo
     public String toUniversalString() {
         DecimalFormat twoDigits = new DecimalFormat("00");
 
         return twoDigits.format(hour) + ":" +
                twoDigits.format(minute) + ":" +
                twoDigits.format(second);
     }
 
     // Convierte a String el formato estándar de tiempo (12 horas)
     public String toStandardString() {
         DecimalFormat twoDigits = new DecimalFormat("00");
 
         return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" +
                twoDigits.format(minute) + ":" +
                twoDigits.format(second) +
                (hour < 12 ? " AM" : " PM");
     }
 } // end class Time2
 
