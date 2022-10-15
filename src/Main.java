public class Main {
    public static void main(String[] args) {





        Human me = new Human(1888);
        System.out.println(me.yearOfBirth);
        Human sister = new Human(1990);
        System.out.println(sister.yearOfBirth);

        me.pet = new Animal("canis");
        System.out.println(me.pet.species);

        me.pet = new Animal("felis");
        System.out.println(me.pet.species);




        System.out.println(me.pet.name);

        Car fiat1 = new Car("fiat","bravo");
        Car fiat2 = fiat1;

        if(dog.weight == 10.4){
            System.out.println("pies waży 10.4");
        }
    }
}