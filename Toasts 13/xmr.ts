const http = new XMLHttpRequest();

http.open('GET', 'localhost', true);

http.send();

http.onreadystatechange = function() { //ugyanaz
    if (this.readyState === 4) {

    }
}

http.onreadystatechange = () => { //ugyanaz
    if (http.readyState === 4) {

    }
}

http.onload = function () {
    const result: string= JSON.parse(http.responseText);
}