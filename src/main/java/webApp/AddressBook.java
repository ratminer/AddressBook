package webApp;

import lombok.Data;

import java.util.List;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@Data
public class AddressBook {

    private int addressBookId;
    private List<BuddyInfo> buddyInfoList;


}
