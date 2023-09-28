import java.util.Scanner;

public class ExtrarImagenesDeYoutube {
    public static void main(String[] args) {
        System.out.println("Ingrese el link del video:");
        Scanner teclado = new Scanner(System.in);
        String url = teclado.nextLine();

        String[] splitUrl = url.split("v=");
        String idVideo = splitUrl[1];
        String[] splitInfoExtra = idVideo.split("&");
        idVideo = splitInfoExtra[0];

        String imgUrl = "https://i3.ytimg.com/vi/"
                + idVideo + "/maxresdefault.jpg";

        String imgUrlCalidadBaja = "https://i3.ytimg.com/vi/"
                + idVideo + "/hqdefault.jpg";

        System.out.println("Baja calidad: " + imgUrlCalidadBaja);
        System.out.println("Maxima calidad: " + imgUrl);

        /*
        https://www.youtube.com/watch?v=IWV72IyHbF0&t=23s
        https://i3.ytimg.com/vi/Z8zAKYLZBqc/hqdefault.jpg
        https://i3.ytimg.com/vi/Z8zAKYLZBqc/maxresdefault.jpg
         */
    }
}
