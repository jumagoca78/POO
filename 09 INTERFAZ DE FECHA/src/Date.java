/*
 *  
 * 
 * 
 */

public class Date{

    int day; //
    int month; //
    int year;  //

    //Constructor
    public Date(int d, int m, int y){
        //hay que validar que la fecha sea correcta
        //vamos a usar la función setDate para validar
        setDate(d, m, y);
    }

    //constructor por default
    public Date(){
        //por default inicia en 1 de enero de 0
        setDate(1,1,0);
    }

    //constructor que recibe un objeto de tipo Date
    public Date(Date d){
        //vamos a usar la función setDate para validar
        //la fecha que recibe el objeto
        setDate(d.day, d.month, d.year);
    }

    //constructor que recibe un VALOR QUE CORRESPONDE AL AÑO
    public Date(int y){
        //por default inicia en 1 de enero del año que recibe
        setDate(1,1,y);
    }

    //constructor que recibe un VALOR QUE CORRESPONDE AL MES Y AÑO
    public Date(int m, int y){
        //por default inicia en 1 del mes que recibe y del año que recibe
        setDate(1,m,y);
    }


    //setters
    public void setDay(int d){
        //hay que validar que el dia sea correcto
        //necesito saber el mes y año
        //para saber si el día es correcto
        //por default inicia en 1 y no puede ser mayor a 31
        //vamos a usar un arreglo con los dias de un mes
        //para validar si el día es correcto
        int daysOfMonth [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        //Si es año  no biciesto y el mes es febrero
        //el día no puede ser mayor a 28
        if (year%4!=0 && month==2){
            this.day = ((d>0&&d<29)?d:1);
        }
        //Si es año biciesto y el mes es febrero
        //el día no puede ser mayor a 29
        else if (year%4==0 && month==2){
            this.day = ((d>0&&d<30)?d:1);
            }
            //Si el mes es diferente de febrero
            //el día no puede ser mayor al número de días del mes
            else{
                this.day = ((d>0&&d<daysOfMonth[month])?d:1);
            }
    }

    public void setMonth(int m){
        //hay que validar que el mes sea correcto
        this.month = ((m<1&&m>12)?m%12:1);
        //Cambiar el mes podría afectar el día si es mayor al número de días del mes
        //tenemos que mandar a llamar a setDate para validar
        //si el día es correcto
        setDate (day, month, year);
    }

    public void setYear(int y){
        //hay que validar que el año sea correcto
        //por default inicia en 0 y no puede ser mayor a 2025
        this.year = ((y>-1&&y<2026)?y:0);
        //Cambiar el año podría afectar el mes y el día si es bicisto o no
        //si es bisiesto y el mes es febrero y el día es 29
        //tenemos que mandar a llamar a setDate para validar
        //si el día es correcto 
        setDate (day, month, year);
    }

    //Función setDate que recibe el dia mes y año
    //y a traves de los setters de cada variable valida que la fecha sea correcta
    public void setDate(int d, int m, int y){
        setYear(y);
        setMonth(m);
        setDay(d);
    }

    //getters
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }



    public String toString1 (){
        String moths [] = {"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        return day + " de " + moths[month] + " de " + year;
    }


}