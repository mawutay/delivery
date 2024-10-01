package com.interview.distribution.data;

import java.util.Map;

import static java.util.Map.entry;

final class DistributionConnection implements ConnectionRepository {
    static Map<String, Map<String, String>> connections = Map.ofEntries(
        entry("SPOTIFY", Map.of(
            "FTP", "spotify.ftp.com:8080",
            "SFTP", "spotify.sftp.com:8080",
            "CLOUD", "spotify.cloud.com:8080"
        )),

        entry("DEEZER", Map.of(
            "FTP", "deezer.ftp.com:8080",
            "SFTP", "deezer.sftp.com:8080",
            "CLOUD", "deezer.cloud.com:8080"
        )),

        entry("APPLE", Map.of(
            "FTP", "apple.ftp.com:8080",
            "SFTP", "apple.sftp.com:8080",
            "CLOUD", "apple.cloud.com:8080"
        )),

        entry("YOUTUBE", Map.of(
            "FTP", "youtube.ftp.com:8080",
            "SFTP", "youtube.sftp.com:8080",
            "CLOUD", "youtube.cloud.com:8080"
        )),

        entry("NAPSTER", Map.of(
            "FTP", "napster.ftp.com:8080",
            "SFTP", "napster.sftp.com:8080",
            "CLOUD", "napster.cloud.com:8080"
        ))
    );

    @Override
    public Map<String, Map<String, String>> getConnections() {
        return connections;
    }
}