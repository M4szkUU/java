import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		String imie;
		String imie2="alan";
		int i=0;

		      do{
		          i++;
           if(i==10){
               System.out.println("Koniec Prób");
               break;
           }
          System.out.println("Próba:"+i);
           System.out.println("Podaj imię");
           imie = scan.nextLine();
          if(imie.equalsIgnoreCase("alan")){
              System.out.println("");
		    System.out.println("Wygrałeś!");
	    }else {
	        
	        System.out.println("Nie udało ci sie zgadnąć imienia");
	        System.out.println("Spróbój ponownie");
	    }
		         }while (!imie.equalsIgnoreCase("alan"));
             
           
	}
}