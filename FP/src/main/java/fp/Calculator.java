package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> sucesion = new ArrayList<Integer>();
		if (n<1)
			return sucesion;
		sucesion.add(1);
		if (n==1)
			return sucesion;
		sucesion.add(1);
		for (int i=2; i<n; i++){
			sucesion.add(sucesion.get(i - 2) + sucesion.get(i - 1));
		}
		return sucesion;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		int length=0;
		int n=number;
		if(number>0 && step>0){
			length=(number-1)/step;
			int leaps[] = new int[length];
			for(int i=0; i<leaps.length; i++){
				number-=step;
				leaps[i]=number;
			}
			return leaps;
		}else{
			return new int[0];
		}
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		if(n < 1)
			return null;
		int length = 0;
		for(int i=1; i<=n; i++)
			if(n%i==0)
				length++;
		int divisores[] = new int[length];
			for(int i=n,j=0; i>0; i--){
				if(n%i==0){
					divisores[j]=i;
					j++;
				}
			}
		return divisores;			
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		String formateada="";
		String tildes = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
	    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	    String reverse="";
    	if(cadena!=null){
			formateada = formatString(cadena, formateada);
			formateada=formateada.toLowerCase();
			formateada = replaceTildes(formateada, tildes, ascii);
			reverse = reverseString(formateada, reverse);
			if(formateada.equals(reverse))
				return true;
			else
				return false;
		}else{
			return false;
		}
	}


	private static String reverseString(String formateada, String reverse) {
		for(int i=formateada.length()-1; i>=0; i--)
			reverse+=formateada.charAt(i);
		return reverse;
	}


	private static String replaceTildes(String formateada, String tildes, String ascii) {
		for(int i=0; i<tildes.length(); i++)
			formateada=formateada.replace(tildes.charAt(i), ascii.charAt(i));
		return formateada;
	}


	private static String formatString(String cadena, String formateada) {
		for(int i=0; i<cadena.length(); i++)
			if(Character.isLetter(cadena.charAt(i)))
				formateada+=cadena.charAt(i);
		return formateada;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		  String[] decenas = {"Cero","Diez","Veinte","Treinta","Cuarenta","Cincuenta",
				  "Sesenta","Setenta","Ochenta","Noventa"};

		  String[] unidades = {"","uno","dos","tres","cuatro","cinco","seis","siete",
				  "ocho","nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis",
				  "Diecisiete","Dieciocho","Diecinueve"};
	  
		  String numescrito="";
		  
		  if(n==0){
			  numescrito="";
			  numescrito=decenas[0];
			  return numescrito;
		  }
		  else if(n<20){
			  numescrito="";
			  numescrito=unidades[n];
			  return numescrito;
		  }
		  else if((n%10)==0){
			  numescrito="";
			  numescrito=decenas[n/10];
			  return numescrito;
		  }
		  else{
			  numescrito="";
			  numescrito=decenas[n/10]+" y "+unidades[n%10];
			  return numescrito;
		  }
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		if(!isValidDate(fecha))
			return false;
		int anyo = Integer.parseInt(fecha.substring(6));
		boolean isboolean = false;
		if(anyo>0){	
			if((anyo % 4 == 0) && (anyo % 100 != 0)){
				isboolean = true;
				return isboolean;
			}
			else if(anyo % 400 == 0){
				isboolean = true;
				return isboolean;
			}
		}
		return false;
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(date.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }
}
