package messages;

import gateways.Gateway;
import users.Person;

public class Message {

    DailyNewsMessage dailyNewsMessage;
    GradesAnnouncementMessage gradesAnnouncementMessage;
    TaskAddedMessage taskAddedMessage;
    Gateway gateway;


//    public Message(){
//        dailyNewsMessage = new DailyNewsEmailMessage();
//        gradesAnnouncementMessage = new GradesAnnouncementEmailMessage();
//        taskAddedMessage = new TaskAddedEmailMessage();
//    }


    public void setGradesAnnouncementMessage(GradesAnnouncementMessage gradesAnnouncementMessage) {
        this.gradesAnnouncementMessage = gradesAnnouncementMessage;
    }

    public void setTaskAddedMessage(TaskAddedMessage taskAddedMessage) {
        this.taskAddedMessage = taskAddedMessage;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setDailyNewsMessage(DailyNewsMessage dailyNewsMessage) {
        this.dailyNewsMessage = dailyNewsMessage;
    }

    public DailyNewsMessage getDailyNewsMessage() {
        return dailyNewsMessage;
    }

    public GradesAnnouncementMessage getGradesAnnouncementMessage() {
        return gradesAnnouncementMessage;
    }

    public TaskAddedMessage getTaskAddedMessage() {
        return taskAddedMessage;
    }

    public Gateway getGateway() {
        return gateway;
    }
}
