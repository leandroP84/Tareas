import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Escriba el dia");
        dia = input.nextInt();
        System.out.println("Escriba el mes");
        mes = input.nextInt();
        System.out.println("Escriba el anio");
        anio = input.nextInt();
        Date fechaConvertida = Principal.getFechaDate(dia, mes, anio);
        System.out.println(fechaConvertida);
    }
    public static Date getFechaDate (int dia, int mes, int anio){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.MONTH, mes - 1);  // Los meses en Calendar empiezan desde 0
        cal.set(Calendar.YEAR, anio);
        return cal.getTime();
    }
}