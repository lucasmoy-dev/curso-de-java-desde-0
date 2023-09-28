import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.nytimes.com/";
        String html = WebScrapper.cargarWeb(url);
        //System.out.println(html);
        List<String> noticias = WebScrapper.obtenerTitulares(html);

        noticias.forEach(noticia -> {
            System.out.println(noticia);
        });
    }
}
