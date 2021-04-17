function throwError () {
    throw new ReferenceError('Hiba');
}

try {
    throwError();
}

catch(err) {
    console.log(err.name);
    console.log('Caught - ', err.message);
    console.log(err.stack);
}
