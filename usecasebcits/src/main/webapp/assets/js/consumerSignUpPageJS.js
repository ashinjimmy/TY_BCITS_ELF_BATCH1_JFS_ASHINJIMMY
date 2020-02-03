var fName = document.getElementById("fname");
var fError = document.getElementById("ferror");

var lName = document.getElementById("lname");
var lError = document.getElementById("lerror");

var pName = document.getElementById("pname");
var pError = document.getElementById("perror");

var mName = document.getElementById("mname");
var mError = document.getElementById("merror");

var cName = document.getElementById("cname");
var cError = document.getElementById("cerror");

var uCheck = document.getElementById("checkbox");
var savebox = document.getElementById("savebox");

var pTag2 = document.getElementById("eele");
var success = document.getElementById("success");
var uPassword = document.getElementById("password");
var pTag = document.getElementById("pele");
function passwordValidation(password) {

    let valid = true;
    console.log(password);
    let upperV = password.match(/[A-Z]/)
    let lowerV = password.match(/[a-z]/)
    let numberV = password.match(/[0-9]/)
    let special = password.match(/[!-=]/) //'!@#$%^&*()_+~`|}{[]\:;?><,./-=';
    console.log(special);
    if (numberV !== null && upperV !== null && lowerV !== null && special !== null) {
        valid = false
    }

    return valid
}

function validateForm() {
    let valid = true

    if (fName.value.match(/[0-9]/) !== null) {
        fError.style.display = "block";
        fName.style.border = "2px solid red";

        valid = false

    } else {
        fError.style.display = "none";
        fName.style.border = "1px solid black";
    }
    if (lName.value.match(/[0-9]/) !== null) {
        lError.style.display = "block";
        lName.style.border = "2px solid red";
        valid = false

    } else {
        lError.style.display = "none";
        lName.style.border = "1px solid black";
    }
    if (pName.value.trim().length !== 10) {
        pError.style.display = "block";
        pName.style.border = "2px solid red";
        valid = false

    } else {
        pError.style.display = "none";
        pName.style.border = "1px solid black";
    }
    if (mName.value.trim().length !== 8) {
        mError.style.display = "block";
        mName.style.border = "2px solid red";
        valid = false

    } else {
        mError.style.display = "none";
        mName.style.border = "1px solid black";
    }
    if (passwordValidation(uPassword.value)) {
        pTag.style.display = "block";
        uPassword.style.border = "2px solid red";
        valid = false
    } else {
        pTag.style.display = "none";
        uPassword.style.border = "1px solid black";  
    } if (uPassword.value!==cname.value) {
        cError.style.display = "block";
        cName.style.border = "2px solid red";
        valid = false
    } else {
        cError.style.display = "none";
        cName.style.border = "1px solid black";  
    }
    return valid;

}
function clearData() {

    pTag2.style.display = "none";
    pTag.style.display = "none";
    uName.style.border = "1px solid black";
    uPassword.style.border = "1px solid black";


}
function checkBox() {

    console.log(uCheck.checked);
    if (uCheck.checked) {
        uPassword.type = "text";
    } else {
        uPassword.type = "password";
    }

}


