    public void save(ChannelStats stats) {
        sqlTemplate.update(getSql("insertChannelStatsSql"), new Object[] { stats.getNodeId(), stats.getHostName(), stats.getChannelId(), stats.getStartTime(), stats.getEndTime(), stats.getDataRouted(), stats.getDataUnRouted(), stats.getDataEventInserted(), stats.getDataExtracted(), stats.getDataBytesExtracted(), stats.getDataExtractedErrors(), stats.getDataSent(), stats.getDataBytesSent(), stats.getDataSentErrors(), stats.getDataLoaded(), stats.getDataBytesLoaded(), stats.getDataLoadedErrors() }, new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT, Types.BIGINT });
    }