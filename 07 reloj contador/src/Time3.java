/*
 * La clase Time3 encapsula las variables hour, minute y second utilizando modificadores (set) y accesores (get).
 * Múltiples constructores permiten inicializar un objeto con:
 * Sin parámetros (00:00:00 por defecto).
 * Solo hora, hora y minuto, o hora, minuto y segundo.
 * Otro objeto Time3, copiando sus valores.
 * Métodos setTime(), setHour(), setMinute() y setSecond() validan los valores ingresados.
 * Métodos toUniversalString() y toStandardString() convierten el tiempo a:
 * Formato universal (24 horas)
 * Formato estándar (12 horas con AM/PM)
 */

import java.text.DecimalFormat;

public class Time3 {
    private int hour;    // 0 - 23
    private int minute;  // 0 - 59
    private int second;  // 0 - 59

    // Time3 constructor inicializa a cero
    public Time3() {
        this(0, 0, 0);  // llama al constructor con tres argumentos
    }

    // Time3 constructor con solo horas
    public Time3(int h) {
        this(h, 0, 0);  // llama al constructor con tres argumentos
    }

    // Time3 constructor con horas y minutos
    public Time3(int h, int m) {
        this(h, m, 0);  // llama al constructor con tres argumentos
    }

    // Time3 constructor con horas, minutos y segundos
    public Time3(int h, int m, int s) {
        setTime(h, m, s);  // usa el método setTime para validación
    }

    // Time3 constructor que recibe otro objeto Time3
    public Time3(Time3 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods (Modificadores)
    public void setTime(int h, int m, int s) {
        setHour(h);     // set la hora
        setMinute(m);   // set los minutos
        setSecond(s);   // set los segundos
    }

    public void setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public void setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
    }

    public void setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
    }

    // Get Methods (Accesores)
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Convierte a String el formato universal de tiempo
    public String toUniversalString() {
        DecimalFormat twoDigits = new DecimalFormat("00");

        return twoDigits.format(getHour()) + ":" +
               twoDigits.format(getMinute()) + ":" +
               twoDigits.format(getSecond());
    }

    // Convierte a String el formato estándar de tiempo (12 horas)
    public String toStandardString() {
        DecimalFormat twoDigits = new DecimalFormat("00");

        return ((getHour() == 12 || getHour() == 0) ? 12 : getHour() % 12) + ":" +
               twoDigits.format(getMinute()) + ":" +
               twoDigits.format(getSecond()) +
               (getHour() < 12 ? " AM" : " PM");
    }
} // end class Time3
