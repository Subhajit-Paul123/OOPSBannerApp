public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Store banner lines in array
        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Loop through array and print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}