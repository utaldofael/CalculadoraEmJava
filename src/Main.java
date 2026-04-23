import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws RuntimeException {
    try {
      if (args[0].equals("-help")) {
        System.out.println("-----AJUDA-----");
        System.out.println("Não tem ajuda, hahahaha!");
      } else if (args[0].equals("-version")) {
        System.out.println("Version: 1.0");
      }
    } catch (Exception ignored){}

    Scanner scan = new Scanner(System.in);
    ArrayList<String> resultado = new ArrayList<>();
    int i = 0;
    int num;
    int res = 0;
    String sair;
    String opp;

    System.out.println("=====Calculadora Em Java=====");
    System.out.println("Operadores: +, -, *, /\n");
    while (true) {
      if (i == 0){
        System.out.print("Informe um valor: ");
        if (scan.hasNextInt()){
          res = scan.nextInt();
          resultado.add(String.valueOf(res));
          i = 1;
        } else {
          System.out.println("Você digitou um valor inválido.");
          scan.next();
          continue;
        }

      }
      System.out.print("Informe o operador: ");
      opp = scan.next();

      System.out.print("Informe um valor: ");
      if (scan.hasNextInt()){
        num = scan.nextInt();
      } else {
        System.out.println("Você digitou um valor inválido.");
        scan.next();
        continue;
      }

      switch (opp){
        case "+":
          res += num;
          break;
        case "-":
          res -= num;
          break;
        case "*":
          res *= num;
          break;
        case "/":
          res /= num;
          break;
        default:
          System.out.println("Operador desconhecido...");
          continue;
      }
      resultado.add(opp);
      resultado.add(String.valueOf(num));

      for (String valor : resultado){
        System.out.print(valor+" ");

      }
      System.out.println("= "+res);
      System.out.print("Aperte ENTER para continuar ou digite \"0\" para sair");
      sair = scan.nextLine();
      sair = scan.nextLine();
      if (sair.equals("0")){
        System.out.println("Encerrando o programa...");
        break;
      }
    }

  }
}