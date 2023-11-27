package builderpattern.src.designpatterns;

public class UrlBuilder {
    @Override
    public String toString() {
        return "UrlBuilder{" +
                "protocol='" + protocol + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
    public String printUrl() {
        return this.protocol + this.host  + this.port;
    }
    public static class Builder {
        String protocol;
        String host;
        String port;


        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        UrlBuilder build() {
            return new UrlBuilder(this);
        }
    }

    private final String protocol;
    private final String host;
    private final String port;


    private UrlBuilder (Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
    }
}
