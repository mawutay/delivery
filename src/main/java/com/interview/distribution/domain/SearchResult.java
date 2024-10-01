package com.interview.distribution.domain;

public class SearchResult {

    private Long id;
    private String connectionType;
    private String destinationPath;
    private long fileId;

    public SearchResult(Long id, String connectionType, String destinationPath, long fileId) {
        this.id = id;
        this.connectionType = connectionType;
        this.destinationPath = destinationPath;
        this.fileId = fileId;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for connectionType
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    // Getter and Setter for destinationPath
    public String getDestinationPath() {
        return destinationPath;
    }

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    // Getter and Setter for fileId
    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }
}
