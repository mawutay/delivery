package com.interview.distribution.application.search;


import com.interview.distribution.application.search.SearchResponse.DeliveryResponse;
import com.interview.distribution.domain.SearchResult;
import com.interview.distribution.domain.SearchResults;
import java.util.ArrayList;
import java.util.List;

final class SearchResultMapper {

    static SearchResponse map(SearchResults results) {
        List<DeliveryResponse> list = new ArrayList<>();
        for (int i = 0; i < results.getCount(); i++) {
            SearchResult searchResult = results.getResults().get(i);
            DeliveryResponse map = map(searchResult);
            list.add(map);
        }
        return new SearchResponse(list);
    }

    static DeliveryResponse map(SearchResult result) {
        return new DeliveryResponse(
                result.getId().toString(),
                result.getConnectionType(),
                result.getDestinationPath(),
                String.valueOf(result.getFileId())
        );
    }
}
