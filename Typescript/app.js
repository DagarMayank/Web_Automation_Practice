var role;
(function (role) {
    role[role["Intern"] = 0] = "Intern";
    role[role["Analyst"] = 1] = "Analyst";
    role[role["IT"] = 4] = "IT";
    role[role["Manager"] = 5] = "Manager";
})(role || (role = {}));
;
var person = {
    name: "mayank",
    age: 23,
    Hobbies: ['Sports', 'cooking', 'dance'],
    role: role
};
console.log(person);
if (person.role === role) {
    console.log(role.IT);
}
var favoratieactivity;
favoratieactivity = ['Exercise', 'Running', 'Swim', 'Aerobics'];
console.log(favoratieactivity);
for (var _i = 0, _a = person.Hobbies; _i < _a.length; _i++) {
    var Hobby = _a[_i];
    console.log(Hobby);
}
