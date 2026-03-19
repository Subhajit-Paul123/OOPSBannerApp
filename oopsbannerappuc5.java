public class BannerAppUC5 {
    public static void main(String[] args) {

        // Array declaration + initialization using String.join()
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}