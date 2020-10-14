public class Driver{
	public static void main(String [] arg){
            //Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();//nemo adalah object,Fish adalah class
        

        nemo.Swim();
      //  nemo.color = "red "; //tukar value
      nemo.SetColor("red");//change here

        nemo.Swim();
        //nemo.Eat();//superclass call subclass method

        Shark fiery = new Shark();
        fiery.Eat();
        fiery.Swim();
        fiery.SetSharpTeeth(2000);
         fiery.Eat();


       // Fish dory = new Fish();//another object
      //  dory.Swim();
      //  dory.color = "yellow ";
     //   dory.SetColor("yellow");
     //   dory.Swim();

     //   Aquarium fancyAquarium = new Aquarium();
      //  fancyAquarium.fillFish();
	}
}