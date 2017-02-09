package webApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

            AddressBook addressBook = new AddressBook();
            BuddyInfo b1 = new BuddyInfo("Robert", "100887093");
            BuddyInfo b2 = new BuddyInfo("asdf", "98098");
            addressBook.addBuddy(b1);
            addressBook.addBuddy(b2);
            buddyInfoRepository.save(b1);
            buddyInfoRepository.save(b2);
            addressBookRepository.save(addressBook);

        };
    }
}
