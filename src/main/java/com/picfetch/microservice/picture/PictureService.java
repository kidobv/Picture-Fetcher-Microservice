package com.picfetch.microservice.picture;

import com.picfetch.microservice.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PictureService {

    @Autowired
    private PictureRepository pictureRepository;

    public List<Picture> getPicturesByLocation (String pictureLocation){
        List<Picture> pictures = new ArrayList<>();
        try{
            //pictureRepository.findAll().forEach(pictures::add);
            //System.out.println(Arrays.toString(pictureRepository.findByGeoLocation(pictureLocation).toArray()));
            pictures.addAll(pictureRepository.findByGeoLocation(pictureLocation));
            if(pictures.size()==0){
                throw new ResourceNotFoundException("Unable to find pictures for the given location: " + pictureLocation);
            }
        }
        catch (Exception e){
           throw new ResourceNotFoundException("Unable to find pictures for the given location: " + pictureLocation);
        }
        return pictures;
    }
}
