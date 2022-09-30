package com.example.numad22fa_danielyang;

public class Link {

    private final String name;

    private final String Url;

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
}
