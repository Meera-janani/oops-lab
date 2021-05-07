class Classroom {
	private int roomno;
	private String roomtype;
	private int roomarea;
	Classroom(){
		roomno=4;
		roomtype="hall";
		roomarea=1000;
		}
	Classroom(int n1,String type,int n2)
	{
		roomno=n1;
		roomtype=type;
		roomarea=n2;
	}
 public int getroomno() {
       return roomno;
   }
   public void setroomno(int roomno) {
       this.roomno= roomno;
   }
   public String getroomtype() {
       return roomtype;
   }
   public void setroomtype(String roomtype) {
       this.roomtype= roomtype;
   }
   public int getroomarea() {
       return roomarea;
   }
   public void setroomarea(int roomarea) {
       this.roomarea = roomarea;
   }

   public static void main(String args[])
   {
       Classroom myobj = new Classroom();
       System.out.println("Room No is: "+myobj.getroomno());
       System.out.println("Room Type is: "+myobj.getroomtype());
       System.out.println("Room Area is: "+myobj.getroomarea());

       Classroom myobj2 = new Classroom(555, "Chaitanya", 25);
	System.out.println("Room No is: "+myobj2.getroomno());
       System.out.println("Room Type is: "+myobj2.getroomtype());
       System.out.println("Room Area is: "+myobj2.getroomarea());
      
  }
}			