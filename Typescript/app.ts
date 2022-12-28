enum role {Intern , Analyst , IT = 4 , Manager};
const person={
    name: "mayank",
    age:   23,
    Hobbies:['Sports', 'cooking','dance'],
    role : role
};
console.log(person);

if(person.role === role)
{
    console.log(role.IT)
}

let favoratieactivity: String[];
favoratieactivity=['Exercise','Running','Swim','Aerobics'];


console.log(favoratieactivity)      

for(const Hobby of person.Hobbies){
    console.log(Hobby)
}