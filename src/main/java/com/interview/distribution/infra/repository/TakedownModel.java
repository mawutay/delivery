package com.interview.distribution.infra.repository;

public class TakedownModel {
        private Long id;
        private long fileId;
        private String destinationPath;
        private String connectionType;


        private String insertId;

        public TakedownModel(Long id, long fileId, String destinationPath, String connectionType,
            String insertId) {
            this.id = id;
            this.fileId = fileId;
            this.destinationPath = destinationPath;
            this.connectionType = connectionType;
          this.insertId = insertId;
        }


    public String getInsertId() {
        return insertId;
    }

    public void setInsertId(String insertId) {
        this.insertId = insertId;
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
