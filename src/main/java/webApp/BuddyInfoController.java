package webApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@Controller
public class BuddyInfoController {

    @Autowired
    private BuddyInfoRepository repository;

    @GetMapping("/addBuddy")
    public String addNewBuddy(Model model) {
        model.addAttribute("buddyinfo", new BuddyInfo());
        return "buddyform";
    }

    @PostMapping("/addBuddy")
    public @ResponseBody String newBuddy(@ModelAttribute BuddyInfo buddyInfo) {
        repository.save(buddyInfo);
        return buddyInfo.toString();
    }

    @RequestMapping("/buddyInfo/{id}")
    public @ResponseBody String buddy(@PathVariable int id) {
        return repository.findByBuddyId(id).toString();
    }
}
