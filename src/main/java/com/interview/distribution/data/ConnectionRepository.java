package com.interview.distribution.data;

import java.util.Map;

interface ConnectionRepository {
    Map<String, Map<String, String>> getConnections();
}