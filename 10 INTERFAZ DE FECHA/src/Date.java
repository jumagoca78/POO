/*
 *  
 * 
 * 
 */

public final class Date{

    int dia;
    int mes;
    int año;

    //Constructores

    public Date(){
        setDate(1, 1, 1900);
    }

    public Date (int d){
        setDate (d, 1, 1900); 
    }

    public Date (int d, int m){
        setDate(d, m, 1900);
    }

    public Date (Date d){
        setDate(d.dia, d.mes, d.dia);
    }


    public Date (int d, int m, int a){
        setDate(d, m, a);
    }

    //FUNCIONES SETTERS
    public void setDia(int d){
        //revisar que el día este en un rango adecuado
        //debe ser mayor o igual a 1
        //y menor o giaul a los dias del mes

        if(d >= 1 && d <= diasEnElMes(mes, año)){
            dia = d;
        }
        else{
            System.out.println("Error en el día");
            dia=1;
        }
    }

    public void setMes(int m){
        //revisar que sea mayor o igual a uno y menor o igual a doce
        if(m >= 1 && m <= 12){
            mes = m;
        }
        else{
            System.out.println("Error en el mes");
            mes = 1;
        }
        setDia(dia);
    }

    private int diasEnElMes(int m, int a){
        //arreglo con los días de cada mes
        int diasMEs [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (esBisiesto(a) && m == 2){
            return 29;
        }
        else{
        return diasMEs[m];
        }
    }

    /*
     * Función que determina si un año es bisiesto
     * @param a año
     * 
     * 
     */

    private boolean esBisiesto(int a){
        if ((a %4 ==0 && a%100!=0) || (a%400==0)){
            return true;
        }
        else{
            return false;
        }
    }

    /*
     * Función que asigna un año a un objeto de la clase Date
     * @param a año
     * 
     * 
     */

    public void setAño(int a){
        //cualquier año debe ser mayor o igual a 1900
        //menor a igual a 2025
        if(a >= 1900 && a <= 2025){
            año = a;
        }
        else{
            System.out.println("Error en el año " + a);
            año = 1900;
        }
        setDia(dia);

    }
/*
 *  Función que asigna una fecha a un objeto de la clase Date
 * @param d día
 * @param m mes
 * @param a año
 *  
 * */
    public void setDate(int d, int m, int a){
        setAño(a);
        setMes(m);
        setDia(d);
    }
    
/*
 * Función que asigna una fecha a un objeto de la clase Date
 * @param d objeto de la clase Date
 * 
 * 
 */

    //funcion que imprime el valor de la fecha
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + año;
    }

    //getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAño(){
        return año;
    }


    public void siguienteDia() {
        if (dia < diasEnElMes(mes, año)) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                año++;
            }
        }
    }

    public void anteriorDia() {
        if (dia > 1) {
            dia--;
        } else {
            if (mes > 1) {
                mes--;
                dia = diasEnElMes(mes, año);
            } else {
                año--;
                mes = 12;
                dia = 31;
            }
        }
    }

     // Formato numérico "DD/MM/YYYY"
     public String toNumericString() {
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }

    // Formato textual "Día de Mes de Año"
    public String toTextualString() {
        String[] months = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        return dia + " de " + months[mes - 1] + " de " + año;
    }

}