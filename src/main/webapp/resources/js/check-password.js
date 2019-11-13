$(document).ready(function() {
    $("#check_password").keyup(checkPassword);
})

function checkPassword() {

    var inputText = $("#check_password").val();

    $.ajax({
     url : 'registration/checkPassword',
     type: 'GET',
     dataType: 'json',
     data : {
                 text: inputText
            },

     success: function (response) {
      var result = response.input;
      if (result=='invalid_short') {
              $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="error">password is too short</div></div>' );
            }else if (result=='invalid_long') {
              $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="error">password is too long</div></div>' );
            }else if (result=='valid') {
              $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"><div class="appropriate">appropriate</div></div>' );
            }else {
              $( 'div.password_error_message' ).replaceWith( '<div class="password_error_message"> </div>' );
            };
     }
    });
}