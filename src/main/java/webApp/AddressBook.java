package webApp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by robertfernandes on 2/9/2017.
 */
public class AddressBook {

    @Getter@Setter
    private int addressBookId;
    @Getter@Setter
    private List<BuddyInfo> buddyInfoList;

    public void addBuddy(BuddyInfo buddyInfo) {
        buddyInfoList.add(buddyInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (BuddyInfo bi : buddyInfoList) {
            sb.append(bi.toString());
            sb.append("/n");
        }

        return sb.toString();
    }

}
