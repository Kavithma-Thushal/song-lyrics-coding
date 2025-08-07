public class MageWela {
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
        printSlow(GREEN + "මගේ වෙලා ලග උන්නු ඔයා ....." + RESET);
        Thread.sleep(100);
        printSlow(BLUE + "මටත් හොරෙන් වෙනකෙකුගෙ වෙලා ....." + RESET);
        printSlow(ORANGE + "හිත හඩනව තුන්යම නොනිදා....." + RESET);
        Thread.sleep(100);
        printSlow(PURPLE + "මගෙ පණ තාමත් ඔයා නිසා ....." + RESET);

        System.out.println();

        Thread.sleep(100);
        printSlow(GREEN + "හුස්මෙ පවා ඉන්නේ ඔයා ....." + RESET);
        Thread.sleep(100);
        printSlow(CYAN + "නිතරම මට සිහිවෙනවා ....." + RESET);
        Thread.sleep(130);
        printSlow(RED + "මැව්වේ ඔයා මටම කියා ....." + RESET);
        Thread.sleep(200);
        printSlow(YELLOW + "හදවත තව පවසනවා ....." + RESET);
        Thread.sleep(2000);
    }

    public static void printSlow(String text) throws InterruptedException {
        for (char charactor : text.toCharArray()) {
            System.out.print(charactor);
            Thread.sleep(110);
        }
        System.out.println();
    }
}