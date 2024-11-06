import java.util.Scanner;

public static void main(String[] args) {
    String studentNumber = "803942"; 
    int strawberryPrice = Integer.parseInt(studentNumber.substring(0, 2)); 
    int chocolatePrice = Integer.parseInt(studentNumber.substring(2, 4)); 
    int vanillaPrice = Integer.parseInt(studentNumber.substring(4, 6));  

    int coneBasePrice = 100; 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
    String flavour = scanner.nextLine();

    int flavourPrice = 0;
    switch (flavour.toLowerCase()) {
        case "v":
            flavourPrice = vanillaPrice;
            break;
        case "c":
            flavourPrice = chocolatePrice;
            break;
        case "s":
            flavourPrice = strawberryPrice;
            break;
        default:
            System.out.println("We don't have that flavour.");
            scanner.close();
            return; 
    }

    System.out.print("How many scoops would you like? ");
    int scoopCount = scanner.nextInt();

    // Consume the remaining newline character
    scanner.nextLine();

    if (scoopCount < 1) {
        System.out.println("We don't sell just a cone.");
    } else if (scoopCount > 3) {
        System.out.println("That's too many scoops to fit in a cone.");
    } else {
        int totalPrice = coneBasePrice + (flavourPrice * scoopCount);
        int pounds = totalPrice / 100;
        int pence = totalPrice % 100;
        System.out.printf("That will be £%d.%02d please.%n", pounds, pence);
    }

    scanner.close();
}
