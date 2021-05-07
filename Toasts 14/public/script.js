const apiUrl = 'http://localhost:3000';

function getAllPersons () {
    const httpRequest = new XMLHttpRequest();

    httpRequest.onload = () => {
        const students = JSON.parse(httpRequest.response);
        const tbody = document.querySelector('tbody');
        tbody.innerHTML ='';

        students.forEach(student => {
            const tr = document.createElement('tr');
            
            const tdId = document.createElement('td');
            const idLink = document.createElement('a');
            idLink.textContent = student.id;
            idLink.setAttribute('onclick', `showStudentDetails(${student.id})`);
            tdId.appendChild(idLink);
            tr.appendChild(tdId);

            const tdName = document.createElement('td');
            tdName.textContent = student.name;
            tr.appendChild(tdName);

            const tdCard_Number = document.createElement('td');
            tdCard_Number.textContent = student.card_number;
            tr.appendChild(tdCard_Number);

            tbody.appendChild(tr)

        });
    };
    httpRequest.open('GET', `${apiUrl}/student`, true);
    httpRequest.send();
}

function addNewPerson(name, cardNumber) {
    const httpRequest = new XMLHttpRequest;
    const body = {
        name,
        card_number: cardNumber
    };

    httpRequest.onload = () => {
        const students = JSON.parse(httpRequest.response);
    };

    httpRequest.open('POST', `${apiUrl}/student`);
    httpRequest.setRequestHeader("Content-Type", "application/json");
    httpRequest.send(JSON.stringify(body));
    console.log(body);
}

document.querySelector('form').addEventListener('submit', (event) => {
    
    event.preventDefault();

    const form = event.currentTarget;
    const name = form.elements.name;
    const cardNumber = form.elements.card_number;

    addNewPerson(name.value, cardNumber.value);
    getAllPersons();
});

window.onload = () => {
    getAllPersons();
}