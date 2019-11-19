$(document).ready(function() {
    $("#check_password").keyup(checkPassword);
})

function checkPassword() {

    var inputText = $("#check_password").val();

    if (inputText.length < 6) {
        $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="error">password is too short</div></div>' );
    }else if (inputText.length > 30) {
        $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="error">password is too long</div></div>' );
    }else {
        $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="appropriate">appropriate</div></div>' );
    };





}