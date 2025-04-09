public class Animal extends dog
{
    public void display()
    {
        System.out.println("Animal Kingdom");
    }

    public static void main(String[] args) {
        Animal obj1=new Animal();

        obj1.display();
        obj1.bark();
        
    }
}

class dog 
{
 protected void bark()
    {
        System.out.println("barking");
    }
}