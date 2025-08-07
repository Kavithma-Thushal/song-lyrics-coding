public class PamaUAthithe {
    public static final String GREEN = "\u001B[92m";
    public static final String RED = "\u001B[91m";
    public static final String ORANGE = "\u001B[38;5;208m";
    public static final String YELLOW = "\u001B[38;5;220m";
    public static final String BLUE = "\u001B[94m";
    public static final String CYAN = "\u001B[96m";
    public static final String PURPLE = "\u001B[95m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[97m";

    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        printSlow(GREEN + "කවදාවත් හිමි නොවේවී....." + RESET);
        Thread.sleep(700);
        printSlow(BLUE + "මේ දුකටත් නිම් නොවේවී....." + RESET);
        printSlow(ORANGE + "බොල් හුලගත් ඔබ සිඹිද්දී ....." + RESET);
        Thread.sleep(10);
        printSlow(PURPLE + "මා මියගිය බව කියාවී ....." + RESET);

        System.out.println();

        Thread.sleep(80);
        printSlow(YELLOW + "ඔබට දුක්ගිනි නොලබාදී....." + RESET);
        printSlow(YELLOW + "මම සමුගන්නම් සිනාසී ....." + RESET);
        Thread.sleep(6000);
    }

    public static void printSlow(String text) throws InterruptedException {
        for (char charactor : text.toCharArray()) {
            System.out.print(charactor);
            Thread.sleep(120);
        }
        System.out.println();
    }
}