
Console.WriteLine("What kind of pet do you have?");
var petString = Console.ReadLine();
Pet myPet = new Pet();
if (petString.ToLower().Contains("cat")) {
    myPet = new Cat();
} else if (petString.ToLower().Contains("dog")) {
    myPet = new Dog();
} else if (petString.ToLower().Contains("laptop") || petString.ToLower().Contains("computer")) {
    myPet = new Laptop();
}

Console.WriteLine(myPet.greetMe());