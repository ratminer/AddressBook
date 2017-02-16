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
    public String newBuddy(@ModelAttribute BuddyInfo buddyInfo, Model model) {
        model.addAttribute("id", buddyInfo.getBuddyId());
        repository.save(buddyInfo);
        return "buddyresult";
    }

    @RequestMapping("/buddyInfo/{id}")
    public @ResponseBody BuddyInfo buddy(@PathVariable int id) {
        return repository.findByBuddyId(id);
    }
}
