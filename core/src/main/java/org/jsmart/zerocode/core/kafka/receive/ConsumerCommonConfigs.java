package org.jsmart.zerocode.core.kafka.receive;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class ConsumerCommonConfigs {

    @Inject(optional = true)
    @Named("consumer.commitSync")
    private Boolean commitSync;

    @Inject(optional = true)
    @Named("consumer.commitAsync")
    private Boolean commitAsync;

    @Inject(optional = true)
    @Named("consumer.fileDumpTo")
    private String fileDumpTo;

    @Inject(optional = true)
    @Named("consumer.recordType")
    private String recordType;
    
    @Inject(optional = true)
    @Named("consumer.protoClassType")
    private String protoClassType;

    @Inject(optional = true)
    @Named("consumer.showRecordsConsumed")
    private Boolean showRecordsConsumed;

    @Inject(optional = true)
    @Named("consumer.maxNoOfRetryPollsOrTimeouts")
    private Integer maxNoOfRetryPollsOrTimeouts;

    @Inject(optional = true)
    @Named("consumer.pollingTime")
    private Long pollingTime;

    @Inject(optional = true)
    @Named("consumer.filterByJsonPath")
    private String filterByJsonPath;

    // TODO- Remove this from Global properties, as it doesn't make sense
    @Inject(optional = true)
    @Named("consumer.seek")
    private String seek;

    public ConsumerCommonConfigs() {
    }

    public ConsumerCommonConfigs(Boolean commitSync,
                                 Boolean commitAsync,
                                 String fileDumpTo,
                                 String recordType,
                                 String protoClassType,
                                 Boolean showRecordsConsumed,
                                 Integer maxNoOfRetryPollsOrTimeouts,
                                 Long pollingTime,
                                 String filterByJsonPath,
                                 String seek

    ) {
        this.commitSync = commitSync;
        this.commitAsync = commitAsync;
		this.protoClassType = protoClassType;
        this.fileDumpTo = fileDumpTo;
        this.recordType = recordType;
        this.showRecordsConsumed = showRecordsConsumed;
        this.maxNoOfRetryPollsOrTimeouts = maxNoOfRetryPollsOrTimeouts;
        this.pollingTime = pollingTime;
        this.filterByJsonPath = filterByJsonPath;
        this.seek = seek;
    }
    
    public ConsumerCommonConfigs(Boolean commitSync,
            Boolean commitAsync,
            String fileDumpTo,
            String recordType,
            Boolean showRecordsConsumed,
            Integer maxNoOfRetryPollsOrTimeouts,
            Long pollingTime,
            String filterByJsonPath,
            String seek

    ) {
		this(commitSync,
                commitAsync,
                fileDumpTo,
                recordType,
                null,
                showRecordsConsumed,
                maxNoOfRetryPollsOrTimeouts,
				pollingTime,
                filterByJsonPath,
                seek);
	}

    public Boolean getCommitSync() {
        return commitSync;
    }

    public Boolean getCommitAsync() {
        return commitAsync;
    }

    public String getFileDumpTo() {
        return fileDumpTo;
    }

    public Boolean getShowRecordsConsumed() {
        return showRecordsConsumed;
    }

    public Integer getMaxNoOfRetryPollsOrTimeouts() {
        return maxNoOfRetryPollsOrTimeouts;
    }

    public Long getPollingTime() {
        return pollingTime;
    }

    public String getRecordType() {
        return recordType;
    }

    public String getSeek() {
        return seek;
    }
	public String getProtoClassType() {
		return protoClassType;
	}


    public String getFilterByJsonPath() {
        return filterByJsonPath;
    }

    @Override
    public String toString() {
        return "ConsumerCommonConfigs{" +
                "commitSync=" + commitSync +
                ", commitAsync=" + commitAsync +
                ", fileDumpTo='" + fileDumpTo + '\'' +
                ", recordType='" + recordType + '\'' +
                ", protobufMessageClassType='" + protoClassType + '\'' +
                ", showRecordsConsumed=" + showRecordsConsumed +
                ", maxNoOfRetryPollsOrTimeouts=" + maxNoOfRetryPollsOrTimeouts +
                ", pollingTime=" + pollingTime +
                ", filterByJsonPath=" + filterByJsonPath +
                ", seek=" + seek +
                '}';
    }
}
