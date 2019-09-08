package com.picfetch.microservice.picture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PictureRepository extends CrudRepository<Picture, Integer> {
    //getAllPictures()
    //getPicture(String id)
    //updatePicture(Course t)
    //deletePicture(String id)
    //these are standard methods that will be needed for every entity therefore Spring doesn't need them explicitly created they do it for us
    //To use the methods created by Spring we can usa an interface that extends Crud repository, then we can declare specific methods such as getting a picture by location
    //We need to specify the generic type<> for the CrudRepository, in this case we use picture which is the entity we want to interface with and Integer since that is the type of the pkey column (picture_id) for the entity.

    List<Picture> findByGeoLocation(String geoLocation);
}
