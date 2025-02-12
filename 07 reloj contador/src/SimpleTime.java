// La clase SimpleTime demuestra la referencia "this"

import java.text.DecimalFormat;

class SimpleTime {
    private int hour;
    private int minute;
    private int second;

    // El constructor usa parámetros con el mismo nombre que las variables de instancia.
    // "this" es requerido para distinguir entre ambos.
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;    // Asigna "this" hora del objeto
        this.minute = minute; // Asigna "this" minuto del objeto
        this.second = second; // Asigna "this" segundo del objeto
    }

    // Usa explícito e implícito "this" para llamar a toStandardString
    public String buildString() {
        return "this.toStandardString(): " + this.toStandardString() +
               "\n\ntoStandardString(): " + toStandardString();
    }

    // Regresa una representación en String del tiempo
    public String toStandardString() {
        DecimalFormat twoDigits = new DecimalFormat("00");

        // "this" no es necesario aquí porque el método no tiene
        // variables locales con el mismo nombre que las variables de instancia
        return twoDigits.format(this.hour) + ":" +
               twoDigits.format(this.minute) + ":" +
               twoDigits.format(this.second);
    }
} // end class SimpleTime