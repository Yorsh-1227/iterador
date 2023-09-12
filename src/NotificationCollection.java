public class NotificationCollection implements Collection{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;
    
    public NotificationCollection(){
        notificationList = new Notification[MAX_ITEMS];

        addItem("Nuevo Mensaje de Whatsapp");
        addItem("Tienes una nueva Solicitud en Facebook");
        addItem("Un Nuevo me Gusta Instagram");
    }

    public void addItem(String srt){
        Notification notification = new Notification(srt);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Full");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }

    }
    @Override
    public Iterador createIterador() {
       return new NotificationIterador(notificationList);
    }
}
