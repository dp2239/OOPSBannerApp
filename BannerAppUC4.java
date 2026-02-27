public class BannerAppUC4 {

    public static void main(String[] args) {
        BannerAppUC4 app = new BannerAppUC4();
        app.displayBanner();
    }

    public void displayBanner() {

        String starLine = String.join("", 
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*","*","*","*","*","*","*"
        );

        String emptyLine = String.join("", 
                "*", "                            ", "*"
        );

        String messageLine = String.join("", 
                "*", "        WELCOME TO UC4 APP     ", "*"
        );

        String[] bannerLines = {
                starLine,
                emptyLine,
                messageLine,
                emptyLine,
                starLine
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}