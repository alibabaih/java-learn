public abstract class MessageShower {

    private final String message;   //accept this field through constructor, because final

    public MessageShower (String message){
        this.message = message;
    }

//    public void show(){
//        System.out.println(message);
//    }

    public String getMessage(){
        return message;
    }

    public abstract void show(); //cannot create instance

}
