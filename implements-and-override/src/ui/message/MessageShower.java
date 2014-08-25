package ui.message;

public abstract class MessageShower {
    private final IOnStringInput onStringInput;
    private final String message;   //accept this field through constructor, because final

    public MessageShower (String message, IOnStringInput onStringInput){
        this.message = message;
        this.onStringInput = onStringInput;
    }

//    public void show(){
//        System.out.println(message);
//    }

    public String getMessage(){
        return message;
    }

    public IOnStringInput getOnStringInput() {
        return onStringInput;
    }

    public abstract void show(); //cannot create instance


}
