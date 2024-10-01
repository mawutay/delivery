package com.interview.distribution.application.delivery;

import com.interview.distribution.domain.DeliveryService;
import com.interview.distribution.dto.DeliveryType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryEndpoint {

  private final DeliveryService deliveryService;

  // Spring is in charge of injecting the dependencies through the constructor

  DeliveryEndpoint(DeliveryService deliveryService) {
    this.deliveryService = deliveryService;
  }

  @PostMapping("{deliveryType}/{deliveryId}")
  public void deliveryService(@PathVariable("deliveryType") DeliveryType deliveryType, @PathVariable("deliveryId") Long deliveryId) {
    deliveryService.trigger(deliveryType, deliveryId);
  }
}