class Wood{
	String type;
	int prize;
	String usedFor;
	String colour;
	char size;	
	Wood()
	{
		super();
		System.out.println("Running 2nd no argument value");
	}
	Wood(String type)
	{
		this();
		System.out.println("Running the String type");
		this.type=type;
		System.out.println(this.type);
	}
    Wood(String type,int prize)
	{
		this(type);
		System.out.println("Running the String type,int prize");
		this.prize=prize;
		System.out.println(this.prize);
	}
	Wood(String type,int prize,String usedFor)
	{
		this(type,prize);
		System.out.println("Running the String type,int prize String usedFor");
		this.usedFor=usedFor;
		System.out.println(this.usedFor);
	}
	Wood(String type,int prize,String usedFor,String colour)
	{
		this(type,prize,usedFor);
		System.out.println("Running the String type,int prize String usedFor String colour");
		this.colour=colour;
		System.out.println(this.colour);
	}
	Wood(String type,int prize,String usedFor,String colour,char size)
	{
		this(type,prize,usedFor,colour);
		System.out.println("Running the String type,int prize String usedFor String colour char size");
		this.size=size;
		System.out.println(this.size);
	}
}
class Mall{
	String item;
	int size;
	int prizeOfMaterials;
	String timing;
	int people;
	String event;
	int floor;
	Mall()
	{
		System.out.println("Running the no-argument value");
	}
	Mall(String item)
	{
		this();
		System.out.println("materials present");
		this.item=item;
		System.out.println(this.item);
	}
	Mall(String item,int size)
	{
		this(item);
		System.out.println("Size of the mall");
		this.size=size;
		System.out.println(this.size);
	}
	Mall(String item,int size,int prizeOfMaterials)
	{
		this(item,size);
		System.out.println("prize of the materials");
		this.prizeOfMaterials=prizeOfMaterials;
		System.out.println(this.prizeOfMaterials);
	}
	Mall(String item,int size,int prizeOfMaterials,String timing)
	{
		this(item,size);
		System.out.println("Mall timing");
		this.timing=timing;
		System.out.println(this.timing);
	}
	Mall(String item,int size,int prizeOfMaterials,String timing,int people)
	{
		this(item,size);
		System.out.println("people can fit in mall");
		this.people=people;
		System.out.println(this.people);
	}
	Mall(String item,int size,int prizeOfMaterials,String timing,int people,String event)
	{
		this(item,size);
		System.out.println("what event is going on");
		this.event=event;
		System.out.println(this.event);
	}
	Mall(String item,int size,int prizeOfMaterials,String timing,int people,String event,int floor)
	{
		this(item,size);
		System.out.println("How many floors are present");
		this.floor=floor;
		System.out.println(this.floor);
	}
}
class Park{
	String openingTime;
	int walkingMembers;
	String timming;
	String playing;
	int entrancePrize;
	int members;
	String whatWeCanPlay;
	String tree;
	char size;
	Park()
	{
		System.out.println("Running the no argument value");
	}
	Park(String openingTime)
	{
		this();
		System.out.println("park opening time");
		this.openingTime=openingTime;
		System.out.println(this.openingTime);
	}
	Park(String openingTime,int walkingMembers)
	{
		this(openingTime);
		System.out.println("how many people can walk");
		this.walkingMembers=walkingMembers;
		System.out.println(this.walkingMembers);
	}
	Park(String openingTime,int walkingMembers,String timming)
	{
		this(openingTime,walkingMembers);
		System.out.println("opening and closing time");
	this.timming=timming;
	System.out.println(this.timming);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing)
	{
		this(openingTime,walkingMembers,timming);
		System.out.println("What are games we can play");
		this.playing=playing;
		System.out.println(this.playing);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing,int entrancePrize )
	{
		this(openingTime,walkingMembers,timming,playing);
		System.out.println("Prize for entry");
		this.entrancePrize=entrancePrize;
		System.out.println(this.entrancePrize);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing,int entrancePrize ,int members)
	{
		this(openingTime,walkingMembers,timming,playing,entrancePrize);
		System.out.println("How many people can fit inside");
		this.members=members;
		System.out.println(this.members);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing,int entrancePrize ,int members,String whatWeCanPlay)
	{
		this(openingTime,walkingMembers,timming,playing,entrancePrize,members);
		System.out.println("We can  play");
		this.whatWeCanPlay=whatWeCanPlay;
		System.out.println(this.whatWeCanPlay);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing,int entrancePrize ,int members,String whatWeCanPlay,String tree)
	{
		this(openingTime,walkingMembers,timming,playing,entrancePrize,members,whatWeCanPlay);
		System.out.println("There are tree present");
		this.tree=tree;
		System.out.println(this.tree);
	}
	Park(String openingTime,int walkingMembers,String timming,String playing,int entrancePrize ,int members,String whatWeCanPlay,String tree,char size)
	{
		this(openingTime,walkingMembers,timming,playing,entrancePrize,members,whatWeCanPlay,tree);
		System.out.println("Size of the park");
		this.size=size;
		System.out.println(this.size);
	}
}