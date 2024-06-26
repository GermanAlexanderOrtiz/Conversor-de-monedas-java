import java.util.Scanner;

public class ConversorDeMonedas {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ConversorClient conversion = new ConversorClient();
        String menu = """
                *** Eliga el tipo de moneda a convertir ***
                1 - USD => Peso argentino.
                2 - Peso argentino => USD.
                3 - USD => Real brasileño.
                4 - Real brasileño => USD.
                5 - USD => Peso colombiano.
                6 - Peso colombiano => USD.
                7 - Salir
                ********************************************
                """;
        
        Scanner sc = new Scanner(System.in);
        Scanner scAmount = new Scanner(System.in);
        double amount;
        int option = 0;
        while (option != 7) {
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                Coin coin = conversion.transCoin("USD", "ARS", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;
                
                case 2:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                coin = conversion.transCoin("ARS", "USD", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;

                case 3:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                coin = conversion.transCoin("USD", "BRL", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;

                case 4:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                coin = conversion.transCoin("BRL", "USD", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;

                case 5:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                coin = conversion.transCoin("USD", "COP", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;

                case 6:
                System.out.println("\nEscriba el monto a convertir\n");
                amount = scAmount.nextDouble();
                coin = conversion.transCoin("COP", "USD", amount);
                System.out.println("\n" + amount + " " + coin.base_code() + " son " + coin.conversion_result() +
                 " en " + coin.target_code()+ "\n");
                break;
            }
        }
    }
}
