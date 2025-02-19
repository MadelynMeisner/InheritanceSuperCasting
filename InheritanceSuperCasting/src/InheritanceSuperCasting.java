public class InheritanceSuperCasting 
{
    public static void main(String[] args) 
    {
        Men x = new  Men("poop");
        x.canBreathe();
        Men x = new  Men("poop");
        x.makesFunnyJokes();
        Men x = new MyBoyfriend("poop");
        x.canBreathe();
        Men x = new MyBoyfriend("poop");
        x.makesFunnyJokes();
        MyBoyfriend x = new MyBoyfriend("poop");
        x.canBreathe();
        MyBoyfriend x = new MyBoyfriend("poop");
        x.makesFunnyJokes();
        
     

    
    }
}
		