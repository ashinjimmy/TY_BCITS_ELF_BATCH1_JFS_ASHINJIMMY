var element = document.getElementById('demo');
console.log(element);
console.log(element.textContent);

element.textContent = 'Content Changed';

console.log(element.textContent);

var pElement = document.createElement('p');
pElement.textContent = 'Hi';

document.body.appendChild(pElement);
pElement.style.fontSize = '40px';
pElement.style.color='red';