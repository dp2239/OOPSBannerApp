public class BannerAppUC5 {

    public static void main(String[] args) {

        String[] bannerLines = {
                String.join("", "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*"),

                String.join("", "*", "                            ", "*"),

                String.join("", "*", "        WELCOME TO UC5 APP     ", "*"),

                String.join("", "*", "                            ", "*"),

                String.join("", "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}