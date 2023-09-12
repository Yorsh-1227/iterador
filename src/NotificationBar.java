public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(){
        this.notifications = new NotificationCollection();
    }
    
    public void printNotifications(){
        Iterador iterador = notifications.createIterador();
        System.out.println("............NOTIFICATION BAR..............");
        while (iterador.hasNext()){
            Notification n = (Notification)iterador.next();
            System.out.println(n.getNotification()); 
        }

    }
}
