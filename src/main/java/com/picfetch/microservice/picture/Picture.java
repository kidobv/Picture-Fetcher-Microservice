package com.picfetch.microservice.picture;
import javax.persistence.*;

@Entity
@Table(name="picture")
public class Picture {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "picture_id")
    private int pictureId;
    @Column (name = "source_url")
    private String sourceUrl;
    private String title;
    private String description;
    @Column (name = "geo_location")
    private String geoLocation;
    private String category;

    public Picture(String sourceUrl, String title, String description, String geoLocation, String category){

    }
    public Picture(){
    }

   //Getters and Setters

    public String getTitle() {
        return title;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
