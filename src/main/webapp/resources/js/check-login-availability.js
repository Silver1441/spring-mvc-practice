$(document).ready(function() {
    $("#check_login").keyup(checkAvailability);
})

function checkAvailability() {

    var inputText = $("#check_login").val();

    $.ajax({
     url : 'registration/checkLogin',
     type: 'GET',
     dataType: 'json',
     data : {
                 text: inputText
            },

     success: function (response) {
      var result = response.input;
      if (result=='taken') {
              $( 'div.login_taken_error_message' ).replaceWith( '<div class="login_taken_error_message">this login is already taken</div>' );
            } else if (result=='free') {
              $( 'div.login_taken_error_message' ).replaceWith( '<div class="login_taken_error_message">this login is available</div>' );
            }else {
              $( 'div.login_taken_error_message' ).replaceWith( '<div class="login_taken_error_message"> </div>' );
            };
     }
    });
}