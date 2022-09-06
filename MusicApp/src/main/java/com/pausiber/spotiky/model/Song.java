package com.pausiber.spotiky.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    private Long id;
    private String songName;
    private String singer;
    private Integer year;
    private String category;


}
