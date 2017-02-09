package webApp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@Entity
@Data
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int buddyId;

    private String name;

    private String phoneNumber;

    public BuddyInfo() {

    }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
