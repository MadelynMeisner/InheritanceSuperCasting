public class InheritanceSuperCasting 
{
    public static void main(String[] args) 
    {
    	
        Men c = new MyBoyfriend("AHHHHH");
        c.canBreathe(); 
        c.makesFunnyJokes(); 
        
       
    	Men z = new MyBoyfriend();
        z.makesFunnyJokes(); 
        z.canBreathe();
        
        
    	MyBoyfriend d = new MyBoyfriend();
        d.makesFunnyJokes(); 
        d.canBreathe();
        
    	MyBoyfriend a = new MyBoyfriend("AHHHHH");
        a.makesFunnyJokes();
        a.canBreathe();
        
      
       ((MyBoyfriend) c).isSuperHot();
   
        
   
        
     

    
    }
}
		