/*
 *  
 * 
 * 
 */

public class Date{

    int day; //
    int month; //
    int year;  //

    //setters
    public void setDay(int d){
        //hay que validar que el dia sea correcto
        //necesito saber el mes y año
        this.day = d;
    }

    public void setMonth(int m){
        //hay que validar que el mes sea correcto
        this.month = ((m<1&&m>12)?m%12:1);
    }

    public void setYear(int y){
        //hay que validar que el año sea correcto
        this.year = y;
    }
    //getters

    public String toString (){
        String moths [] = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

        return day + " of " + moths[month] + " of " + year;
    }


}