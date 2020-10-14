public class Fish{
	//Attribute or data member or fields
	private String color = "blue ";//default value

	//Method
	public void Swim(){
		System.out.println(color + "fish swim");

	}
	public void SetColor(String warna){

   color = warna;
	}

  public String GetColor(){
  	return color;
  }
	
}