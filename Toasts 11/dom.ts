document.body.style.backgroundColor = "red";

console.log(document.getElementById('welcome'));

console.log(document.getElementsByClassName('content'));

document.getElementById('welcome').textContent = 'Welcome from textContent';

const newContent: HTMLElement = document.createElement('p');

newContent.textContent = 'Im newP';

document.querySelector('div.divContent').appendChild(newContent);

document.querySelector('div:nth-child(1)').setAttribute('data-id', '101');

console.log(document.querySelector('div:nth-child(1)').getAttribute('data-id'));

(document.querySelector('.content') as HTMLElement).style.backgroundColor = "blue";

(document.querySelector('#welcome') as HTMLElement).style.backgroundColor = "white";

function listener (event: Event): void {
    console.log('Listener Called')
}

document.querySelector('.divContent').addEventListener('click', listener);