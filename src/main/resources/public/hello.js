/**
 * Created by robertfernandes on 2/16/2017.
 */
$(document).ready(function() {
    $.ajax({
        url: "/buddies"
    }).then(function(data) {
        alert("hello");
        var names = [];
        for (var prop in family) {
            names.push(prop.name);
            alert(prop.name);
        }
        $('.buddy-container').innerHTML = names.join(' ');
    });
});