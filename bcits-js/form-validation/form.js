function validateForm() {
    var loginForm = document.forms['loginForm']
    var userMail = loginForm['userEmail'].value;
    var pwd = loginForm['userPwd'].value;

    console.log(loginForm)
    console.log('User mail ', userMail)
    console.log('User password ', pwd)

    if (userMail.trim().length>10) {
        document.getElementById('emailErr').style.display = 'none'
        console.log('User mail is valid')
    } else {
        document.getElementById('emailErr').style.display = 'block'
        console.log('User mail is invalid')
    }

    if (pwd.trim().length > 5) {
        console.log('Password is valid')
    } else {
        console.log('Password is invalid')
    }
}