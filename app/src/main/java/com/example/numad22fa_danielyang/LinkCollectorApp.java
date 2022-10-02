package com.example.numad22fa_danielyang;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    This is the standalone Application for Link Collector. This is needed to instantiate the
    linkList to other parts of the app.
 */
public class LinkCollectorApp extends Application {
    //Instantiate the arraylist
    private static List<Link> linkList = new ArrayList<>();

    public LinkCollectorApp() {
        // just to instantiate
    }

    public static List<Link> getLinkList() {
        return linkList;
    }

    public static void setLinkList(List<Link> linkList) {
        LinkCollectorApp.linkList = linkList;
    }

}
