var emailpattern = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
var pwdpattern= /^[A-Za-z]{6,14}$/;
var mobilepattern = /^[0-9]{10}$/;
function validateData(){
    console.log("in function");
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let email = document.getElementById("email").value;
    let mobileno = document.getElementById("mobileno").value;

    if((username==null)||(username=="")){
        alert("username cannot be null or blank");
    }else if((password==null)||(password=="")||(!pwdpattern.test(password))){
        alert("password cannot be null or blank or not valid");
    }else if((email==null)||(email=="")||(!emailpattern.test(email))){
        alert("email is not valid or blank");
    }else if((email==null)||(email=="")||(!mobilepattern.test(mobileno))){
        alert("mobileno is not valid or blank");
    }else{
        alert ("Details = " + username + password + email + mobileno);
    }
}