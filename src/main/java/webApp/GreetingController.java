package webApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by robertfernandes on 2/2/2017.
 */

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public BuddyInfo greetingSubmit(@RequestParam(value="name") String name,
                                    @RequestParam(value="phoneNumber") String phoneNumber, Model model) {
        BuddyInfo buddyInfo = new BuddyInfo();
        buddyInfo.setName(name);
        buddyInfo.setPhoneNumber(phoneNumber);
        return buddyInfo;
    }

}
