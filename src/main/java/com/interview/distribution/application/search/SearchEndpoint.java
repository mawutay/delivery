package com.interview.distribution.application.search;

import com.interview.distribution.domain.DeliveryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchEndpoint {

    private final DeliveryService deliveryService;

    public SearchEndpoint(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    SearchResponse search() {
        var searchResults = deliveryService.getDeliveries();
        return SearchResultMapper.map(searchResults);
    }
}
