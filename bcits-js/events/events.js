function showAlert() {
    alert("Hi Wlecome to Cinema Hall !!!");
}
//var pElement = document.createElement('p'); // If the function invoked with this code, then it displays only one time
pElement.textContent = 'Element Created';
function createEle() {
    var pElement = document.createElement('p'); // If the function invoked with this code then it displays multiple time
    pElement.textContent = 'Element Created';
    document.body.appendChild(pElement);

    // alert("This is to notify that I have created another element"

}

// function dispalyElement() {
//     var dispalyElement = document.getElementById('disp');
//     dispalyElement.style.display = 'block';

// }

function dispalyElement() {

    var dispalyElement = document.getElementById('disp');
    var myBtn = document.getElementById('myBtn');
    if (dispalyElement.style.display === ' ' ||
        dispalyElement.style.display === 'none') {

        dispalyElement.style.display = 'block';
        myBtn.textContent = 'Click here to hide h1 Element';

    } else {

        dispalyElement.style.display = 'none';
        myBtn.textContent = 'Clicke here to show h1 Elements';
    }


}


function changeTheColourToBlue() {
    var  cg = document.getElementById('cg');
    cg.style.backgroundColor = 'blue';
    cg.style.fontSize = '29px';
    
}
function changeTheColourToBack() {
    var cg = document.getElementById('cg');
    cg.style.backgroundColor ='White';
    cg.style.fontSize = '19px';
}

function showData() {
    console.log("Working !!!");
}


function showDeatil() {
    console.log("onkey down executed !!!");
}


function getInputValue() {
    var inpElement = document.getElementById('inp');
    console.log(inpElement.value);

    var showElement = document.getElementById('show')
    showElement.textContent = inpElement.value;
}