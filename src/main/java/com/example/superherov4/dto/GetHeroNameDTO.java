package com.example.superherov4.dto;

public class GetHeroNameDTO {
    private String heroName;
    private String realName;
    private int creationYear;

    public GetHeroNameDTO(String heroName, String realName, int creationYear){
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }
}
