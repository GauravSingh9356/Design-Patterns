package builderpattern.src.designpatterns;

public class Main {
    public static void main(String[] args) {
        UrlBuilder.Builder builder = new UrlBuilder.Builder();
        UrlBuilder urlBuilder = builder.protocol("https://").host("netlify.com").port(":8081").build();
        System.out.println(urlBuilder.printUrl());
        System.out.println();


    }
}
