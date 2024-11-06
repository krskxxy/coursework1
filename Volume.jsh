
    public static double sphere(double d) {
        double radius = d / 2.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter data in the form sphere(n), e.g. sphere(20.24).");
        String input = scanner.nextLine();
        if (input.startsWith("sphere(") && input.endsWith(")")) {
            try {
                String numberStr = input.substring(7, input.length() - 1);
                double diameter = Double.parseDouble(numberStr);
                double volume = sphere(diameter);
                System.out.println("The volume of the ball is: " + volume);
            } catch (NumberFormatException e) {
                System.out.println("The input is not in the correct format, please enter a valid floating point number.");
            }
        } else {
            System.out.println("The input is not in the correct format, make sure you enter it in sphere(n) format");
        }
        scanner.close();
    }
