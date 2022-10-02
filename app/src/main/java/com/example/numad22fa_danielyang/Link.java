package com.example.numad22fa_danielyang;

public class Link {

    private String name;

    private String Url;

    /**
     * Constructs a link object with the specified name and Url.
     *
     * @param name - name to be given to the link.
     * @param Url -  url of the link.
     */
    public Link(String name, String Url) {
        this.name = name;
        this.Url = Url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return Url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.Url= url;
    }
}
