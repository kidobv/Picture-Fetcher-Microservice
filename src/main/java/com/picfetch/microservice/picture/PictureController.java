package com.picfetch.microservice.picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Passes Json response by default
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(method = RequestMethod.GET, value = "pictures/vacation/{location}")
    public List<Picture> getPicturesByLocation(@PathVariable String location){
        String sanitizedLocation = location.toUpperCase().replaceAll("\\s", "");
        return pictureService.getPicturesByLocation(sanitizedLocation);
    }
}
