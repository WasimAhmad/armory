package com.electronicarmory.armory.repository.search;

import com.electronicarmory.armory.domain.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Location entity.
 */
public interface LocationSearchRepository extends ElasticsearchRepository<Location, Long> {
}
