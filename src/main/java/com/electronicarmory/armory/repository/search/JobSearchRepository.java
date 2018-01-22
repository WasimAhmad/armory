package com.electronicarmory.armory.repository.search;

import com.electronicarmory.armory.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Job entity.
 */
public interface JobSearchRepository extends ElasticsearchRepository<Job, Long> {
}
