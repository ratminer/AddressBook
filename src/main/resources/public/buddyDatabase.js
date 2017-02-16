/**
 * Created by robertfernandes on 2/16/2017.
 */
$(document).ready(function() {
    $.ajax({
        url: "/buddyInfo/2"
    }).then(function(data) {
        $('.buddy-id').append(data.buddyId);
        $('.buddy-name').append(data.name);
        $('.buddy-phonenumber').append(data.phoneNumber);
    });
});