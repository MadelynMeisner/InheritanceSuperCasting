public class InheritanceSuperCasting 
{
    public static void main(String[] args) 
    {
//    	Men a = new Men("Poop");
//        a.canBreathe(); 
//        
//        Men b = new Men();
//        b.canBreathe();   
//        b.makesFunnyJokes(); 
        
        Men c = new MyBoyfriend("Poop");
        c.canBreathe(); 
        c.makesFunnyJokes(); 
        
        MyBoyfriend d = new MyBoyfriend();
        d.makesFunnyJokes(); 
        
        MyBoyfriend e = new MyBoyfriend("Poop");
        e.canBreathe();
        
        ((MyBoyfriend) c).isSuperHot(); 
        
     

    
    }
}
		