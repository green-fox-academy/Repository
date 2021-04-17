let user = {
    name: "Roland",
    age: 27,
    children: [{ name: "Pisti"}, { name: "Jani"}],
    greeting: function () {
        console.log("Hello");
    }
};

console.log(user.name);

user["sex"] = "Male";

console.log(user["sex"]);

delete user["name"];

console.log(Object.keys(user));
console.log(Object.values(user));
console.log(user.hasOwnProperty("age"));
console.log(user.hasOwnProperty("school"));
console.log(user.children[0].name);
user.greeting();