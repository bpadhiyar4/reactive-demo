package com.demoreactive.modals;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class Movie {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String url;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String language;

    @Getter
    @Setter
    private List<String> genres;

    @Getter
    @Setter
    private String premiered;

    @Getter
    @Setter
    private String officialSite;

    @Getter
    @Setter
    private String summary;
}