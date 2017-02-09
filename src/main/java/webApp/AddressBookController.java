package webApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@Controller
public class AddressBookController {

    @Autowired
    private AddressBookRepository repository;

    @RequestMapping("/addressBook/{id}")
    public @ResponseBody String addressBook(@RequestParam int id) {
         AddressBook addressBook = repository.findByAddressBookId(id);
         return addressBook.toString();
    }
}
