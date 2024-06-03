public class ConstructorRevise {
    public static void main(String[] args) {
    //     NonParameterizedConstructor np=new NonParameterizedConstructor();
    //     System.out.println("After Object");
    //     System.out.println(np.salary);
    //     System.out.println(np.age);
    //    // System.out.println(np.name); 
    //    ParameterizedConstructor pc=new ParameterizedConstructor("Ram", 100, 18);
    //    System.out.println(pc.salary);
    //    System.out.println(pc.age);
    //    System.out.println(pc.getName());
    //    pc.setName("Shyam");
    //    System.out.println(pc.getName());

       Song s1=new Song("Title 1", 19);
       Song s2=new Song("Title 2", 10);
       s1.setId(1);
       s1.description = "desccription 1";
       s2.description="description 2";
       s2.setId(2);
       s1.setArtists("adele");
       s2.setArtists("test2");
       s1.setAlbum("new");
       s2.setAlbum("new2");

       System.out.println(s1.getId()+" " +s1.getTitle()+" "+s1.getDuration()+" "+s1.description+" "+s1.getArtist()+" "+s1.getAlbum());
       System.out.println(s2.getId()+" " +s2.getTitle()+" "+s2.getDuration()+" "+s2.description+" "+s2.getArtist()+" "+s2.getAlbum());


    }
    
}
// class ParameterizedConstructor{
//     private String name;

//     public int salary;
//     int age;
//     void setName(String name){
//         this.name=name;
//     }
    
//     String getName(){
//         return this.name;

//     }
//     ParameterizedConstructor(String name,int salary, int age){
//         this.name=name;
//         this.salary=salary;
//         this.age=age;

//     }

// }

// class NonParameterizedConstructor{
//     private String name;
//     public int salary;
//     int age;


   
//     NonParameterizedConstructor(){
//         name="Unknown";
//         salary=10;
//         age=18;

//         System.out.println("I run in object creation");
//     }   
// }
//Task
//Make a class Song
//Mae 4 private property: id ,title, duration and artists
//make 2 public property, album and description
//make constructor to set title and duration only 
//make setter for id, duration and artists
//make getter for id, title, duration and artists
//make 2 object of Song
//fill all the attributes
//change the artists of 2nd object
//First the following for both object
//output
//song 1
//title:ABC
//Duration:18
//Artists:XYZ
//Album:xx
//Description: lorem ipsum 
//song 2


class Song{
    private int id;
    private String title;
    private int duration;
    private String artist;
    public String album;
    public String description;

    void setId(int id ){
        this.id=id;


    }

    void setDuration(int duration){
        this.duration=duration;


    }
    void setAlbum(String album){
        this.album=album;
    }

    void setArtists(String artist){
        this.artist=artist;
    }

    int getId(){
        return this.id;
    }

    int getDuration(){
        return this.duration;

    }

    String getTitle(){
        return this.title;

    }

    String getArtist(){
        return this.artist;
    }

    String getAlbum(){
        return this.album;
    }
    Song(String title, int duration){
        this.title = title;
        this.duration  = duration;
    }

}

