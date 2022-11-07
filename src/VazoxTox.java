import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VazoxTox {
    public static void main(String[] args) throws IOException, InterruptedException {
        String tox = "                                                                                                   " +
                "We make every effort to cover every country’s laws" +
                " by adopting the strictest data privacy guidelines implemented " +
                "in each country. We also regularly monitor all major global privacy " +
                "laws (including the GDPR, the US's CCPA & CalOPPA, the ePrivacy and " +
                "Australia's APPs) to ensure that our solutions continue to meet necessary requirements." +
                "          ";
        int count = 0;
        List<Character> ar = new ArrayList<>();

        for (int i = 0, j = 100; i < tox.length()-j; i++, j++) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(tox.substring(i,j));
            TimeUnit.MILLISECONDS.sleep(10);
            count++;
        }
        System.out.println(count);
    }
}