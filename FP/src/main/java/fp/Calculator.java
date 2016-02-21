package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
		throw  new NotImplementedException();
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		int length=0;
		int n=number;
		if(number>0 && step>0){
				length=(number-1)/step;
			int pasos[] = new int[length];
			for(int i=0; i<pasos.length; i++){
				number-=step;
				pasos[i]=number;
			}
			return pasos;
		}else
			return new int[0];
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int length=0;
		int divisores[];
			if(n>0 && n<=20){
				for(int i=1; i<=n; i++)
					if(n%i==0)
						length++;
				divisores = new int[length];
				for(int i=n,j=0; i>0; i--){
					if(n%i==0){
						divisores[j]=i;
						j++;
					}
				}
				return divisores;
			
			}else
				return divisores=null;
			
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		String formateada="";
		String tildes = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
	    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	    String reverse="";
		try{
	    	if(cadena!=null){
				for(int i=0; i<cadena.length(); i++)
					if(Character.isLetter(cadena.charAt(i)))
						formateada+=cadena.charAt(i);
				formateada=formateada.toLowerCase();
				for(int i=0; i<tildes.length(); i++)
					formateada=formateada.replace(tildes.charAt(i), ascii.charAt(i));
				for(int i=formateada.length()-1; i>=0; i--)
					reverse+=formateada.charAt(i);
				if(formateada.equals(reverse))
					return true;
				else
					return false;
			}
		}catch(IndexOutOfBoundsException e){}
	    	return false;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		try{
			int anyo = Integer.parseInt(fecha.substring(6));
			if(anyo>0){	
				if((anyo % 4 == 0) && (anyo % 100 != 0))
					return true;
				else if(anyo % 400 == 0)
					return true;
				else
					return false;
			}
		}catch(IndexOutOfBoundsException e){}
		return false;
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
