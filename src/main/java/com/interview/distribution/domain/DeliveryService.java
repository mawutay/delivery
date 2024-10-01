package com.interview.distribution.domain;

import com.interview.distribution.dto.DeliveryType;
import com.interview.distribution.infra.repository.InsertModel;
import com.interview.distribution.infra.repository.InsertRepository;
import com.interview.distribution.infra.repository.TakedownModel;
import com.interview.distribution.infra.repository.TakedownRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class DeliveryService {

    private final TakedownRepository takedownRepository;
    private final InsertRepository insertRepository;

    // Spring is in charge of injecting the dependencies through the constructor
    public DeliveryService(
            TakedownRepository takedownRepository,
            InsertRepository insertRepository
    ) {
        this.takedownRepository = takedownRepository;
        this.insertRepository = insertRepository;
    }

    public SearchResults getDeliveries() {
        var carpoolResults = takedownRepository.getAll()
                .stream()
                .map(model -> new SearchResult(
                        model.getId(),
                        model.getConnectionType(),
                        model.getDestinationPath(),
                        model.getFileId()
                ))
                .collect(Collectors.toUnmodifiableList());
        var busResults = insertRepository.getAll()
                .stream()
                .map(model -> new SearchResult(
                    model.getId(),
                    model.getConnectionType(),
                    model.getDestinationPath(),
                    model.getFileId()
                ))
                .collect(Collectors.toUnmodifiableList());

        var searchResults = new SearchResults();
        searchResults.setResults(new ArrayList<>());
        searchResults.getResults().addAll(carpoolResults);
        searchResults.getResults().addAll(busResults);
        return searchResults;
    }

    public void trigger(DeliveryType deliveryType, Long deliveryId) {
        // TODO implement Takedown method
        var insertModel = new InsertModel(
            null,
            deliveryId,
            "/tmp", //TO DO get destinationPath and connectionType
            "USB");
        if (DeliveryType.INSERT.equals(deliveryType)) {
            insertRepository.create(insertModel);
        }
        return;
    }
}
