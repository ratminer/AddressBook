package webApp;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by robertfernandes on 2/9/2017.
 */

public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {

    AddressBook findByAddressBookId(int id);

}
