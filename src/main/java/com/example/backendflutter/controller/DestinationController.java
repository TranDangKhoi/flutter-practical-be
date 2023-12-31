package com.example.backendflutter.controller;

import com.example.backendflutter.entity.DestinationEntity;
import com.example.backendflutter.response.BaseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    @GetMapping
    public BaseEntity getAllPlaceEntity() {
        List<DestinationEntity> destinationEntities = new ArrayList<>();
        DestinationEntity destinationEntity4 = new DestinationEntity("Bát Tràng","https://static.vinwonders.com/production/Bat-Trang-Pottery-Village-thumb-1.jpg",8);
        DestinationEntity destinationEntity1 = new DestinationEntity("Hội An","https://www.goexplorevietnam.com/wp-content/uploads/2020/12/Hoi-An-in-rainy-season.jpg",4.6);
        DestinationEntity destinationEntity2 = new DestinationEntity("Hà Nội","https://cdn.thaibinhtv.vn/upload/news/2_2023/quang_ba_hinh_anh_ha_noi_tren_truyen_thong_quoc_te_15530801022023.PNG",5);
        DestinationEntity destinationEntity3 = new DestinationEntity("Hồ Chí Minh","https://www.itourvn.com/images/easyblog_images/2019/april/take_photos/best-places-to-take-photos-in-ho-chi-minh-city-tan-dinh-church-1.jpg", 6);

        destinationEntities.add(destinationEntity1);
        destinationEntities.add(destinationEntity2);
        destinationEntities.add(destinationEntity3);
        destinationEntities.add(destinationEntity4);

        return new BaseEntity(destinationEntities);
    }

}
