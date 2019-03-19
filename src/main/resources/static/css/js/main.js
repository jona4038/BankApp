

$().ready(function () {
    $("#form1").validate({
        rules:{
            username:{
                required : true,
                minLength : 3
            },
            password : {
                required : true
            }
        },
        messages : {
            password: "venligst indtast dit password",
            username : "husk det nu"
        }
    });
});
