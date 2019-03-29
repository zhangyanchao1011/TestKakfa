
package com.yq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Simple to Introduction
 * className: PropsConfig
 *
 * @author EricYang
 * @version 2018/5/12 18:39
 */

@Configuration
public class PropsConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String broker;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Value("${spring.kafka.consumer.auto-offset-reset}")
    private String autoOffsetReset;

    @Value("${spring.kafka.consumer.enable-auto-commit}")
    private String enableAutoCommit;

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getAutoOffsetReset() {
		return autoOffsetReset;
	}

	public void setAutoOffsetReset(String autoOffsetReset) {
		this.autoOffsetReset = autoOffsetReset;
	}

	public String getEnableAutoCommit() {
		return enableAutoCommit;
	}

	public void setEnableAutoCommit(String enableAutoCommit) {
		this.enableAutoCommit = enableAutoCommit;
	}
    
    

}
