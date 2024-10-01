package com.interview.distribution.infra.repository;

public class InsertModel {
    private Long id;
    private long fileId;
    private String destinationPath;
    private String connectionType;

    public InsertModel(Long id, long fileId, String destinationPath, String connectionType) {
        this.id = id;
        this.fileId = fileId;
        this.destinationPath = destinationPath;
        this.connectionType = connectionType;
    }

    public Long getId() {
        return this.id;
    }

    public long getFileId() {
        return this.fileId;
    }

    public String getDestinationPath() {
        return this.destinationPath;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

}
