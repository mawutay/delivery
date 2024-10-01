package com.interview.distribution.application.search;

import java.util.List;

public class SearchResponse {

    public SearchResponse(List<DeliveryResponse> trips) {
        this.trips = trips;
    }

    public List<DeliveryResponse> trips;

    public static class DeliveryResponse {

        private String id;
        private String connectionType;
        private String destinationPath;
        private String fileId;

        public DeliveryResponse(String id, String connectionType, String destinationPath, String fileId) {
            this.id = id;
            this.connectionType = connectionType;
            this.destinationPath = destinationPath;
            this.fileId = fileId;
        }
    }
}
