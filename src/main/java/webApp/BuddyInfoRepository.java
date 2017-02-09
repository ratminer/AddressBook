package webApp;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by robertfernandes on 2/9/2017.
 */
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {
    BuddyInfo findByBuddyId(int id);
}
