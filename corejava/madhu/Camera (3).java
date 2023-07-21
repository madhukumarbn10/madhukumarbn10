class Camera{
static void click(String location,String date,int howManyPeople,int resolution,String clarity,String cameraMan)
{
if(location!=null)
{
	System.out.println("The LOcation where photo as been clicked="+location);
}
else{
	System.out.println("These sentence is in valid");
	
}
if(date!=null)
{
	System.out.println("The LOcation where photo as been clicked in the date="+date);
}
if(howManyPeople<10)
{
	System.out.println("Members="+howManyPeople);
	
}
if(resolution<200)
{
System.out.println("it as the resolution of ="+resolution);	
}
if(clarity!=null)
{
	System.out.println("The clarity of the image is="+clarity);
}
if(cameraMan!=null)
{
	System.out.println("The camera man who took the photo is ="+cameraMan);
}
}
}