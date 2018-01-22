package com.electronicarmory.armory.repository.search;

import com.electronicarmory.armory.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Country entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}
