package webApp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    @Getter@Setter
    private int addressBookId;

    @OneToMany
    @Getter@Setter
    private List<BuddyInfo> buddyInfoList = new ArrayList<>();

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
