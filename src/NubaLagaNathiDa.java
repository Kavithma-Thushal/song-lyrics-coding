public class NubaLagaNathiDa {
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
        Thread.sleep(4600);
        printSlow(GREEN + "බැලු බැලු අතේ....." + RESET);
        Thread.sleep(100);
        printSlow(BLUE + "නුබෙ රුව වගේ....." + RESET);
//        Thread.sleep(100);
        printSlow(ORANGE + "ඇයි මේ පෙනෙන්නේ ....." + RESET);
        Thread.sleep(100);
        printSlow(PURPLE + "මට ඒ වගේ....." + RESET);

        System.out.println();

        Thread.sleep(400);
        printSlow(YELLOW + "නුඹ ලඟ නැති දා ......." + RESET);
        Thread.sleep(12000);
    }

    public static void printSlow(String text) throws InterruptedException {
        for (char charactor : text.toCharArray()) {
            System.out.print(charactor);
            Thread.sleep(150);
        }
        System.out.println();
    }
}