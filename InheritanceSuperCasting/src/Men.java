public abstract class Men 
{
    public Men() 
    {
        System.out.println("Men.");
    }

    public Men(String name) 
    {
        System.out.println( name + " is very intelligent and a 10/10");
    }

    public void canBreathe() 
    {
        System.out.println("*gasp*");
    }
    
    public abstract void eatsHealthy();
  

    public void makesFunnyJokes() 
    {
        System.out.println("What do you call a fake noodle? IMPASTAAAAAAA!!!!!!");
    }
}