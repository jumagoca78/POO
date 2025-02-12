/*
 * Este código define una clase Time1 que maneja tiempos en formato de 24 horas 
 * y puede convertirlos a formato estándar de 12 horas con AM/PM. 
 * También asegura que los valores inválidos se asignen a 0.
 */

 import java.text.DecimalFormat;

 /*
  * La clase Time1 mantiene la hora en formato de 24 horas.
    * La clase Time1 proporciona métodos para establecer la hora y convertirla a formato de 24 horas y 12 horas.

  */
 public class Time1 extends Object {
     private int hour;    // 0 - 23
     private int minute;  // 0 - 59
     private int second;  // 0 - 59
 
     // Time1 constructor inicializa cada variable de instancia a cero;
     // asegura que cada objeto en Time1 inicie en un estado constante
     public Time1() {
         setTime(0, 0, 0);
     }
 
     // establece un nuevo valor de tiempo con la hora universal; realiza
     // comprobaciones de validez sobre los datos; Valores inválidos a cero

     //operador ternario (condicion) ? valor1 : valor2
        //si la condicion es verdadera se asigna valor1, si es falsa se asigna valor2

     public void setTime(int h, int m, int s) {
         hour = ( (h >= 0 && h < 24) ? h : 0 );
         minute = ( (m >= 0 && m < 60) ? m : 0 );
         second = ( (s >= 0 && s < 60) ? s : 0 );
     }

     public void setTime (int h){
            hour = ( (h >= 0 && h < 24) ? h : 0 );        
     }

     public void setTime (int h, int m){
            hour = ( (h >= 0 && h < 24) ? h : 0 );
            minute = ( (m >= 0 && m < 60) ? m : 0 );
     }  
 
     // convertir a String el formato universal de tiempo
     // (HH:MM:SS)
     // HH: horas en formato de 24 horas (00 - 23)
     // MM: minutos en formato de 24 horas (00 - 59)
     // SS: segundos en formato de 24 horas (00 - 59)
     // DecimalFormat: clase que formatea números en cadenas
     // dos dígitos en longitud
     // format: método de la clase DecimalFormat que devuelve una cadena
     // que representa un número formateado

     public String buildString (){
        return this.toStandardString()+ toUniversalString();
     }

     public String toUniversalString() {
         DecimalFormat twoDigits = new DecimalFormat("00");
 
         return twoDigits.format(hour) + ":" +
                twoDigits.format(minute) + ":" +
                twoDigits.format(second);
     }
 
     // Convertir a String el formato estándar del tiempo
     public String toStandardString() {
         DecimalFormat twoDigits = new DecimalFormat("00");
 
         return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" +
                twoDigits.format(minute) + ":" +
                twoDigits.format(second) +
                (hour < 12 ? " AM" : " PM");
     }
 } // fin class Time1