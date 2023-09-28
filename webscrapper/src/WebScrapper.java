import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebScrapper {

    public static String cargarWeb(String urlStr) {
        String html = "";

        try {
            URL url = new URL(urlStr);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            BufferedReader buffer = new BufferedReader(reader);
            String linea;
            do {
                linea = buffer.readLine();
                if (linea != null) {
                    html += linea;
                }
            } while (linea != null);
            buffer.close();
        } catch (Exception exception) {
            System.out.println("Hubo un problema al cargar la web");
        }

        return html;
    }

    public static List<String> obtenerTitulares(String html) {
        List<String> titulares = new ArrayList<>();
        /*
        Example:
        <h3 class="indicate-hover css-66vf3i">
        U.S. states are pushing to limit ties with China
         in an effort to look tough. Businesses
         are worried about the consequences.</h3>
         */
        String[] splitH3Inicial = html.split("<h3");
        for (String noticia: splitH3Inicial) {
            String[] splitH3Final = noticia.split("</h3>");
            String titularSucio = splitH3Final[0];
            String[] splitTitularSucio = titularSucio.split(">");
            String titular = splitTitularSucio[1];
            if (titular.length() > 28) {
                titulares.add(titular);
            }
        }
        return titulares;
    }

}
