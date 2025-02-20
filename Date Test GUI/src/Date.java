import java.text.DecimalFormat;

public class Date {
    //Cuales atributos necesitamos
    private int dia;
    private int mes;
    private int año;

    //Definir el constructor
    public Date(){
        dia=1;
        mes=1;
        año=1900;
    }

    //Definir mis funciones getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAño(){
        return año;
    }

    public String toFechaAbreviadaString(){
        DecimalFormat formateador = new DecimalFormat("00");
        return formateador.format(dia)+"/"+
               formateador.format(mes)+"/"+año;
    }

    //definir mis funciones setters
    public void setDia(int d){
        /*La función dia mes regresa el limite de dias del mes
         * Comparamos si el dia es mayor a 0 y menor o igual a los dias del mes 
         */
        int diasMes=diasMes(mes, año);
        if (d > 0 && d <= diasMes){
            dia=d;
        }
        else{
            System.out.println(d+" no es un dia valido");
            dia=1;
        }
    }

    public void setMes(int m){
        if (m>0 && m<13){
            mes=m;
        }
        else{
            System.out.println(m+" no es un mes valido");
            mes=1;
        }
        setDia(dia);
    }

    public void setAño(int a){
        if (a>1899&&a<2026){
            año=a;
        }
        else{
            System.out.println(a+" no es un año valido");
            año=1900;
        }

        setDia(dia);
    }
    
    //función que identifica los dias del mes
    private int diasMes(int m, int a){
        int diasDelMes []={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (m==2 && bisiesto(a)){
            return 29;
        }
        return diasDelMes[m];
    }

    //función que identifica si un año es bisiesto
    private boolean bisiesto(int a){
        return a%4==0 && (a%100!=0 || a%400==0);
    }

    public void siguienteDia(){
        if (dia>0 && dia<diasMes(mes, año)){
            dia++;
        }
        else{
            dia=1;
            if (mes<12){
                mes++;
            }
            else{
                mes=1;
                año++;
            }
        }

    }

    public void diaAnterior(){
        if (dia>1){
            dia--;
        }
        else{
            if (mes>1){
                mes--;
                dia=diasMes(mes, año);
            }
            else{
                mes=12;
                dia=31;
                año--;
            }
        }
    }


}
