public class UserOfSpeakers{
  public static void main(String[] commandLine){
    Animal doggy = new Retriever();
    System.out.println(doggy.speak());

    Animal puppy = new Retriever();
    System.out.println(puppy.speak());
  }
}
