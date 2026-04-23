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

    System.out.println("Programa executado!");
  }
}