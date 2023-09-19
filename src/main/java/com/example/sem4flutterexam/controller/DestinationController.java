package com.example.sem4flutterexam.controller;

import com.example.sem4flutterexam.Entity.DestinationEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @GetMapping
    public List<DestinationEntity> getAllPlaceEntity() {
        List<DestinationEntity> placeEntities = new ArrayList<>();
        DestinationEntity placeEntity1 = new DestinationEntity("HoiAn","https://lalunahoian.com/wp-content/uploads/2022/07/Dia-diem-du-lich-phai-den-khi-du-lich-Hoi-An.jpg",4.6);
        DestinationEntity placeEntity2 = new DestinationEntity("HaNoi","https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1b/33/f7/12/caption.jpg?w=700&h=-1&s=1",5);
        DestinationEntity placeEntity3 = new DestinationEntity("HCM","https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/DJI_0550-HDR-Pano.jpg/640px-DJI_0550-HDR-Pano.jpg", 6);
        DestinationEntity placeEntity4 = new DestinationEntity("BatTrang","https://www.vietnamonline.com/media/uploads/froala_editor/images/VNO%20gombattrang2.jpg",8);

        placeEntities.add(placeEntity1);
        placeEntities.add(placeEntity2);
        placeEntities.add(placeEntity3);
        placeEntities.add(placeEntity4);

        return placeEntities;
    }

}
