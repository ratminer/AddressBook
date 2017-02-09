package webApp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;

/**
 * Created by robertfernandes on 2/2/2017.
 */
@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long>{
    List<BuddyInfo> findByName(@Param("name") String name);
}
