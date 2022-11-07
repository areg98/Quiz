
    import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;
    import java.util.Scanner;

    public class download {

        public static void DownloadWebPage(String webpage)
        {
            try {

                // Create URL object
                URL url = new URL(webpage);
                BufferedReader readr =
                        new BufferedReader(new InputStreamReader(url.openStream()));

                // Enter filename in which you want to download
                BufferedWriter writer =
                        new BufferedWriter(new FileWriter("Download.html"));

                // read each line from stream till end
                String line;
                while ((line = readr.readLine()) != null) {
                    writer.write(line);
                    System.out.println(line);
                }

                readr.close();
                writer.close();
                System.out.println("Successfully Downloaded.");
            }

            // Exceptions
            catch (MalformedURLException mue) {
                System.out.println("Malformed URL Exception raised");
            }
            catch (IOException ie) {
                System.out.println("IOException raised");
            }
        }
        public static void main(String args[])
                throws IOException
        {
            Scanner scanner = new Scanner(System.in);
            String url = "https://www.geeksforgeeks.org/";
            System.out.println("pls enter site url");
            String url1 = scanner.nextLine();
            DownloadWebPage(url1);
        }
    }

