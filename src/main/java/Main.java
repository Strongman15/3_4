import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


    System.out.println("Podaj znak z jakiego zrobić kwadrat");
    char znak = scanner.next().charAt(0);

    System.out.print("Podaj rozmiar kwadratu: ");
    int wiersz = scanner.nextInt();


    for(int i = 1; i <= wiersz; i++)
      {
            for(int j=1; j<=wiersz; j++)
              {
              if(i==1 || i==wiersz || j==1 || j==wiersz)
              { System.out.print(znak+" ");
              }
              else
              {
                System.out.print("  ");
                  }
              }
      

System.out.println();
      }
  }
}

      
  
